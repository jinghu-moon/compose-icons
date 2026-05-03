package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorRegularIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.420 39.600 C 195.621 18.801 161.899 18.801 141.100 39.600 L 39.600 141.090 C 19.250 161.964 19.463 195.320 40.078 215.932 C 60.693 236.544 94.049 236.753 114.920 216.400 L 114.920 216.400 L 216.430 114.910 C 237.192 94.098 237.187 60.407 216.420 39.600 ZM 103.610 205.090 L 103.610 205.090 C 89.060 219.643 65.468 219.645 50.915 205.095 C 36.362 190.545 36.360 166.953 50.910 152.400 L 96.000 107.310 L 148.700 160.000 ZM 205.110 103.600 L 160.000 148.690 L 107.320 96.000 L 152.420 50.910 C 167.018 36.649 190.373 36.785 204.804 51.216 C 219.235 65.647 219.371 89.002 205.110 103.600 ZM 189.680 82.340 C 191.182 83.841 192.026 85.877 192.026 88.000 C 192.026 90.123 191.182 92.159 189.680 93.660 L 165.680 117.660 C 162.554 120.783 157.488 120.781 154.365 117.655 C 151.242 114.529 151.244 109.463 154.370 106.340 L 178.370 82.340 C 181.494 79.218 186.556 79.218 189.680 82.340 Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
