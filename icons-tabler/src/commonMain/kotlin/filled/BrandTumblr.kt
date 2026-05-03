package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTumblr: ImageVector
    get() {
        if (_brandTumblr != null) return _brandTumblr!!
        _brandTumblr = tablerFilledIcon(
            name = "BrandTumblr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(14.552285f, 2.0f, 15.0f, 2.447715f, 15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(18.506975f, 6.000067f, 18.933683f, 6.379507f, 18.993f, 6.883f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.CurveTo(19.0f, 11.552285f, 18.552284f, 12.0f, 18.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(18.506975f, 16.000067f, 18.933683f, 16.379507f, 18.993f, 16.883f),
                    PathNode.LineTo(19.0f, 17.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(19.0f, 21.552284f, 18.552284f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(14.0f, 22.0f),
                    PathNode.CurveTo(11.238576f, 22.0f, 9.0f, 19.761423f, 9.0f, 17.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(5.493026f, 11.999933f, 5.066316f, 11.620493f, 5.007f, 11.117f),
                    PathNode.LineTo(5.0f, 11.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 6.447716f, 5.447716f, 6.0f, 6.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.CurveTo(8.10457f, 6.0f, 9.0f, 5.10457f, 9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.0f, 2.447715f, 9.447715f, 2.0f, 10.0f, 2.0f),
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
        return _brandTumblr!!
    }

private var _brandTumblr: ImageVector? = null
