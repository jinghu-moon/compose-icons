package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorThinIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.330 125.780 L 197.700 57.340 C 195.471 53.998 191.717 51.994 187.700 52.000 L 32.000 52.000 C 30.524 51.999 29.168 52.811 28.471 54.112 C 27.774 55.413 27.851 56.992 28.670 58.220 L 75.190 128.000 L 28.670 197.780 C 27.851 199.008 27.774 200.587 28.471 201.888 C 29.168 203.189 30.524 204.001 32.000 204.000 L 187.720 204.000 C 191.737 204.006 195.491 202.002 197.720 198.660 L 243.350 130.220 C 244.241 128.872 244.233 127.120 243.330 125.780 ZM 191.050 194.220 C 190.308 195.333 189.058 196.001 187.720 196.000 L 39.470 196.000 L 83.330 130.220 C 84.227 128.876 84.227 127.124 83.330 125.780 L 39.470 60.000 L 187.720 60.000 C 189.058 59.999 190.308 60.667 191.050 61.780 L 235.190 128.000 Z"),
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
