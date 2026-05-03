package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorLightIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.000 124.670 L 199.370 56.230 C 196.772 52.336 192.401 49.999 187.720 50.000 L 32.000 50.000 C 29.785 49.997 27.749 51.214 26.703 53.166 C 25.656 55.118 25.771 57.488 27.000 59.330 L 72.790 128.000 L 27.000 196.670 C 25.771 198.512 25.656 200.882 26.703 202.834 C 27.749 204.786 29.785 206.003 32.000 206.000 L 187.720 206.000 C 192.401 206.001 196.772 203.664 199.370 199.770 L 245.000 131.330 C 246.345 129.314 246.345 126.686 245.000 124.670 ZM 189.390 193.110 C 189.020 193.665 188.397 193.999 187.730 194.000 L 43.210 194.000 L 85.000 131.330 C 86.345 129.314 86.345 126.686 85.000 124.670 L 43.210 62.000 L 187.720 62.000 C 188.387 62.001 189.010 62.335 189.380 62.890 L 232.790 128.000 Z"),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
