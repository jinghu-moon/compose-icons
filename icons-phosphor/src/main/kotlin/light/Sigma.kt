package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorLightIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 186.000 72.000 L 186.000 54.000 L 76.480 54.000 L 132.690 124.250 C 134.445 126.442 134.445 129.558 132.690 131.750 L 76.480 202.000 L 186.000 202.000 L 186.000 184.000 C 186.000 180.686 188.686 178.000 192.000 178.000 C 195.314 178.000 198.000 180.686 198.000 184.000 L 198.000 208.000 C 198.000 211.314 195.314 214.000 192.000 214.000 L 64.000 214.000 C 61.692 214.002 59.587 212.681 58.587 210.601 C 57.586 208.521 57.868 206.052 59.310 204.250 L 120.310 128.000 L 59.310 51.750 C 57.868 49.948 57.586 47.479 58.587 45.399 C 59.587 43.319 61.692 41.998 64.000 42.000 L 192.000 42.000 C 195.314 42.000 198.000 44.686 198.000 48.000 L 198.000 72.000 C 198.000 75.314 195.314 78.000 192.000 78.000 C 188.686 78.000 186.000 75.314 186.000 72.000 Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
