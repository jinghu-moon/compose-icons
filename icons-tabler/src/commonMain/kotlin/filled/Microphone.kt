package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = tablerFilledIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.552284f, 9.0f, 20.0f, 9.447715f, 20.0f, 10.0f),
                    PathNode.CurveTo(20.000439f, 14.031569f, 17.000887f, 17.43355f, 13.001f, 17.938f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.552284f, 20.0f, 17.0f, 20.447716f, 17.0f, 21.0f),
                    PathNode.CurveTo(17.0f, 21.552284f, 16.552284f, 22.0f, 16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(7.447716f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.CurveTo(7.0f, 20.447716f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.LineTo(11.0f, 17.938f),
                    PathNode.CurveTo(6.999718f, 17.434011f, 3.999624f, 14.031905f, 4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 9.447715f, 4.447716f, 9.0f, 5.0f, 9.0f),
                    PathNode.CurveTo(5.552285f, 9.0f, 6.0f, 9.447715f, 6.0f, 10.0f),
                    PathNode.CurveTo(6.0f, 13.313708f, 8.686292f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(15.313708f, 16.0f, 18.0f, 13.313708f, 18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 9.447715f, 18.447716f, 9.0f, 19.0f, 9.0f),
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(14.209139f, 1.0f, 16.0f, 2.790861f, 16.0f, 5.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.0f, 12.209139f, 14.209139f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(9.790861f, 14.0f, 8.0f, 12.209139f, 8.0f, 10.0f),
                    PathNode.LineTo(8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 2.790861f, 9.790861f, 1.0f, 12.0f, 1.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _microphone!!
    }

private var _microphone: ImageVector? = null
