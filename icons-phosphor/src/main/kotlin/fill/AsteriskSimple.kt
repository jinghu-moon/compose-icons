package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorFillIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 191.340 115.830 L 140.940 132.210 L 172.090 175.080 C 173.865 177.387 174.248 180.476 173.088 183.146 C 171.928 185.816 169.410 187.646 166.512 187.923 C 163.615 188.200 160.795 186.882 159.150 184.480 L 128.000 141.610 L 96.850 184.480 C 94.208 187.913 89.313 188.619 85.808 186.073 C 82.304 183.527 81.462 178.654 83.910 175.080 L 115.060 132.210 L 64.660 115.830 C 60.457 114.466 58.156 109.953 59.520 105.750 C 60.884 101.547 65.397 99.246 69.600 100.610 L 120.000 117.000 L 120.000 64.000 C 120.000 59.582 123.582 56.000 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 L 136.000 117.000 L 186.400 100.620 C 190.603 99.256 195.116 101.557 196.480 105.760 C 197.844 109.963 195.543 114.476 191.340 115.840 Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
