package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorThinIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.330 125.780 L 197.700 57.340 C 195.471 53.998 191.717 51.994 187.700 52.000 L 40.000 52.000 C 33.373 52.000 28.000 57.373 28.000 64.000 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 187.720 204.000 C 191.737 204.006 195.491 202.002 197.720 198.660 L 243.350 130.220 C 244.241 128.872 244.233 127.120 243.330 125.780 ZM 191.050 194.220 C 190.308 195.333 189.058 196.001 187.720 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 L 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 187.720 60.000 C 189.058 59.999 190.308 60.667 191.050 61.780 L 235.190 128.000 Z"),
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
