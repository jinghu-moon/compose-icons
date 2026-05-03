package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorLightIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.000 124.670 L 199.370 56.230 C 196.772 52.336 192.401 49.999 187.720 50.000 L 40.000 50.000 C 32.268 50.000 26.000 56.268 26.000 64.000 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 187.720 206.000 C 192.401 206.001 196.772 203.664 199.370 199.770 L 245.000 131.330 C 246.345 129.314 246.345 126.686 245.000 124.670 ZM 189.390 193.110 C 189.020 193.665 188.397 193.999 187.730 194.000 L 40.000 194.000 C 38.895 194.000 38.000 193.105 38.000 192.000 L 38.000 64.000 C 38.000 62.895 38.895 62.000 40.000 62.000 L 187.720 62.000 C 188.387 62.001 189.010 62.335 189.380 62.890 L 232.790 128.000 Z"),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
