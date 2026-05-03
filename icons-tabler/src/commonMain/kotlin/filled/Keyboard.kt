package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = tablerFilledIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 5.0f),
                    PathNode.CurveTo(21.656855f, 5.0f, 23.0f, 6.343146f, 23.0f, 8.0f),
                    PathNode.LineTo(23.0f, 16.0f),
                    PathNode.CurveTo(23.0f, 17.656855f, 21.656855f, 19.0f, 20.0f, 19.0f),
                    PathNode.LineTo(4.0f, 19.0f),
                    PathNode.CurveTo(2.343146f, 19.0f, 1.0f, 17.656855f, 1.0f, 16.0f),
                    PathNode.LineTo(1.0f, 8.0f),
                    PathNode.CurveTo(1.0f, 6.343146f, 2.343146f, 5.0f, 4.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.CurveTo(5.447716f, 13.0f, 5.0f, 13.447715f, 5.0f, 14.0f),
                    PathNode.LineTo(5.0f, 14.01f),
                    PathNode.CurveTo(5.0f, 14.562284f, 5.447716f, 15.01f, 6.0f, 15.01f),
                    PathNode.CurveTo(6.552285f, 15.01f, 7.0f, 14.562284f, 7.0f, 14.01f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.CurveTo(7.0f, 13.447715f, 6.552285f, 13.0f, 6.0f, 13.0f),
                    PathNode.MoveTo(18.0f, 13.0f),
                    PathNode.CurveTo(17.447716f, 13.0f, 17.0f, 13.447715f, 17.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.01f),
                    PathNode.CurveTo(17.0f, 14.562284f, 17.447716f, 15.01f, 18.0f, 15.01f),
                    PathNode.CurveTo(18.552284f, 15.01f, 19.0f, 14.562284f, 19.0f, 14.01f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 13.447715f, 18.552284f, 13.0f, 18.0f, 13.0f),
                    PathNode.MoveTo(10.002f, 13.0f),
                    PathNode.CurveTo(9.449716f, 12.998896f, 9.001104f, 13.445715f, 9.0f, 13.998f),
                    PathNode.CurveTo(8.998896f, 14.550284f, 9.445715f, 14.998896f, 9.998f, 15.0f),
                    PathNode.LineTo(13.998f, 15.01f),
                    PathNode.CurveTo(14.550284f, 15.011381f, 14.999119f, 14.564785f, 15.0005f, 14.0125f),
                    PathNode.CurveTo(15.001881f, 13.460216f, 14.555285f, 13.011381f, 14.003f, 13.01f),
                    PathNode.Close,
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.CurveTo(5.447716f, 9.0f, 5.0f, 9.447715f, 5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 10.01f),
                    PathNode.CurveTo(5.0f, 10.562284f, 5.447716f, 11.01f, 6.0f, 11.01f),
                    PathNode.CurveTo(6.552285f, 11.01f, 7.0f, 10.562284f, 7.0f, 10.01f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.CurveTo(7.0f, 9.447715f, 6.552285f, 9.0f, 6.0f, 9.0f),
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.CurveTo(9.447715f, 9.0f, 9.0f, 9.447715f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 10.01f),
                    PathNode.CurveTo(9.0f, 10.562284f, 9.447715f, 11.01f, 10.0f, 11.01f),
                    PathNode.CurveTo(10.552285f, 11.01f, 11.0f, 10.562284f, 11.0f, 10.01f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 9.447715f, 10.552285f, 9.0f, 10.0f, 9.0f),
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.CurveTo(13.447715f, 9.0f, 13.0f, 9.447715f, 13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.01f),
                    PathNode.CurveTo(13.0f, 10.562284f, 13.447715f, 11.01f, 14.0f, 11.01f),
                    PathNode.CurveTo(14.552285f, 11.01f, 15.0f, 10.562284f, 15.0f, 10.01f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 9.447715f, 14.552285f, 9.0f, 14.0f, 9.0f),
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.CurveTo(17.447716f, 9.0f, 17.0f, 9.447715f, 17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 10.01f),
                    PathNode.CurveTo(17.0f, 10.562284f, 17.447716f, 11.01f, 18.0f, 11.01f),
                    PathNode.CurveTo(18.552284f, 11.01f, 19.0f, 10.562284f, 19.0f, 10.01f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.0f, 9.447715f, 18.552284f, 9.0f, 18.0f, 9.0f)
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
