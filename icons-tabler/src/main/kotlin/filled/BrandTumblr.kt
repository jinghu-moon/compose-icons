package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTumblr: ImageVector
    get() {
        if (_brandTumblr != null) return _brandTumblr!!
        _brandTumblr = tablerFilledIcon(
            name = "BrandTumblr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 6.000 L 18.000 6.000 C 18.507 6.000 18.934 6.380 18.993 6.883 L 19.000 7.000 L 19.000 11.000 C 19.000 11.552 18.552 12.000 18.000 12.000 L 15.000 12.000 L 15.000 16.000 L 18.000 16.000 C 18.507 16.000 18.934 16.380 18.993 16.883 L 19.000 17.000 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 14.000 22.000 C 11.239 22.000 9.000 19.761 9.000 17.000 L 9.000 12.000 L 6.000 12.000 C 5.493 12.000 5.066 11.620 5.007 11.117 L 5.000 11.000 L 5.000 7.000 C 5.000 6.448 5.448 6.000 6.000 6.000 L 7.000 6.000 C 8.105 6.000 9.000 5.105 9.000 4.000 L 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _brandTumblr!!
    }

private var _brandTumblr: ImageVector? = null
