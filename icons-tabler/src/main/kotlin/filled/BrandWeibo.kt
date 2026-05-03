package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) return _brandWeibo!!
        _brandWeibo = tablerFilledIcon(
            name = "BrandWeibo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.972 8.183 C 7.782 5.196 11.134 3.976 12.978 5.943 C 13.276 6.259 13.532 6.716 13.714 7.209 L 13.841 7.178 C 15.905 6.709 17.841 8.465 17.658 10.722 L 17.653 10.758 L 17.803 10.815 C 19.263 11.389 19.943 12.170 19.996 13.896 L 20.000 14.127 C 20.000 17.903 15.893 21.000 11.000 21.000 C 6.146 21.000 2.000 18.280 2.000 14.435 C 2.000 12.395 3.068 10.213 4.972 8.183"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 3.000 C 19.314 3.000 22.000 5.686 22.000 9.000 L 22.000 10.000 C 22.000 10.552 21.552 11.000 21.000 11.000 C 20.448 11.000 20.000 10.552 20.000 10.000 L 20.000 9.000 C 20.000 6.791 18.209 5.000 16.000 5.000 L 15.000 5.000 C 14.448 5.000 14.000 4.552 14.000 4.000 C 14.000 3.448 14.448 3.000 15.000 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
