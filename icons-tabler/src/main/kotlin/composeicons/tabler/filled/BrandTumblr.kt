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
                pathData = parseSvgPathData("M14 2c.552 0 1 .448 1 1v3h3c.507 0 .934 .38 .993 .883L19 7v4c0 .552-.448 1-1 1h-3v4h3c.507 0 .934 .38 .993 .883L19 17v4c0 .552-.448 1-1 1h-4C11.239 22 9 19.761 9 17v-5h-3c-.507-0-.934-.38-.993-.883L5 11v-4C5 6.448 5.448 6 6 6h1C8.105 6 9 5.105 9 4v-1C9 2.448 9.448 2 10 2Z"),
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
