package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) return _brandTinder!!
        _brandTinder = tablerFilledIcon(
            name = "BrandTinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.595 2.13c-.048-.37 .113-.736 .419-.95 .306-.214 .705-.239 1.036-.066 3.11 1.625 5.41 3.797 6.77 6.627l-.013-.024 .01 .019 .115 .232c2.751 5.7 .088 12.587-5.913 13.76l-.267 .049C5.033 23.687-.703 13.037 5.782 6.859 6.248 6.399 7.062 5.663 7.418 5.409c.305-.218 .706-.248 1.039-.076 .333 .171 .543 .515 .543 .889 0 .311 .086 1.117 .205 1.694q.046 .215 .093 .383l.017 .058 .1-.02c1.562-.396 2.522-3.021 2.21-5.955Z"),
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
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
