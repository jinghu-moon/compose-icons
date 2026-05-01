package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = tablerFilledIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(16.970562f, 2.0f, 21.0f, 6.029437f, 21.0f, 11.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.000599f, 18.330744f, 20.124474f, 19.502844f, 18.848f, 19.879f),
                    PathNode.CurveTo(18.17f, 21.78f, 15.31f, 23.0f, 12.0f, 23.0f),
                    PathNode.CurveTo(11.447715f, 23.0f, 11.0f, 22.552284f, 11.0f, 22.0f),
                    PathNode.CurveTo(11.0f, 21.447716f, 11.447715f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(13.889f, 21.0f, 15.482f, 20.518f, 16.334f, 19.925f),
                    PathNode.CurveTo(14.968732f, 19.614153f, 14.000066f, 18.400208f, 14.0f, 17.0f),
                    PathNode.LineTo(14.001f, 13.949f),
                    PathNode.LineTo(14.005f, 13.898f),
                    PathNode.CurveTo(14.057368f, 12.281907f, 15.38306f, 10.999152f, 17.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.351f, 11.0f, 18.688f, 11.06f, 19.0f, 11.171f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.001863f, 7.179467f, 15.939989f, 4.063118f, 12.120017f, 3.997614f),
                    PathNode.CurveTo(8.300046f, 3.93211f, 5.133126f, 6.94165f, 5.004f, 10.76f),
                    PathNode.LineTo(5.0f, 11.17f),
                    PathNode.CurveTo(5.313f, 11.06f, 5.65f, 11.0f, 6.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(8.656855f, 11.0f, 10.0f, 12.343145f, 10.0f, 14.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 18.656855f, 8.656855f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.343146f, 20.0f, 3.0f, 18.656855f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 6.029437f, 7.029437f, 2.0f, 12.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _headset!!
    }

private var _headset: ImageVector? = null
