package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Message2: ImageVector
    get() {
        if (_message2 != null) return _message2!!
        _message2 = tablerFilledIcon(
            name = "Message2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(20.209139f, 3.0f, 22.0f, 4.790861f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 17.209139f, 20.209139f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(15.414f, 19.0f),
                    PathNode.LineTo(12.707f, 21.707f),
                    PathNode.CurveTo(12.350732f, 22.063234f, 11.785086f, 22.098803f, 11.387f, 21.79f),
                    PathNode.LineTo(11.293f, 21.707f),
                    PathNode.LineTo(8.585f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(3.868599f, 19.000002f, 2.11157f, 17.328735f, 2.005f, 15.2f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 4.790861f, 3.790861f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.447716f, 12.0f, 7.0f, 12.447715f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 13.552285f, 7.447716f, 14.0f, 8.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.552285f, 14.0f, 15.0f, 13.552285f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 12.447715f, 14.552285f, 12.0f, 14.0f, 12.0f),
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(7.447716f, 8.0f, 7.0f, 8.447715f, 7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 9.552285f, 7.447716f, 10.0f, 8.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.552284f, 10.0f, 17.0f, 9.552285f, 17.0f, 9.0f),
                    PathNode.CurveTo(17.0f, 8.447715f, 16.552284f, 8.0f, 16.0f, 8.0f)
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
        return _message2!!
    }

private var _message2: ImageVector? = null
