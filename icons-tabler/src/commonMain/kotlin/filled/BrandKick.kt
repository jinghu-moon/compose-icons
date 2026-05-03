package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandKick: ImageVector
    get() {
        if (_brandKick != null) return _brandKick!!
        _brandKick = tablerFilledIcon(
            name = "BrandKick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.552285f, 3.0f, 10.0f, 3.447715f, 10.0f, 4.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(11.000067f, 5.493026f, 11.379507f, 5.066316f, 11.883f, 5.007f),
                    PathNode.LineTo(12.0f, 5.0f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.000067f, 3.493025f, 13.379507f, 3.066316f, 13.883f, 3.007f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(20.552284f, 3.0f, 21.0f, 3.447715f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 8.552285f, 20.552284f, 9.0f, 20.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(18.999933f, 10.506975f, 18.620493f, 10.933684f, 18.117f, 10.993f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(18.506975f, 13.000067f, 18.933683f, 13.379507f, 18.993f, 13.883f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.506975f, 15.000067f, 20.933683f, 15.379507f, 20.993f, 15.883f),
                    PathNode.LineTo(21.0f, 16.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(13.447715f, 21.0f, 13.0f, 20.552284f, 13.0f, 20.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.CurveTo(11.493025f, 18.999933f, 11.066316f, 18.620493f, 11.007f, 18.117f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(9.999933f, 20.506975f, 9.620493f, 20.933683f, 9.117f, 20.993f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.CurveTo(3.447715f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f),
                    PathNode.LineTo(3.0f, 4.0f),
                    PathNode.CurveTo(3.0f, 3.447715f, 3.447715f, 3.0f, 4.0f, 3.0f),
                    PathNode.Close
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
        return _brandKick!!
    }

private var _brandKick: ImageVector? = null
