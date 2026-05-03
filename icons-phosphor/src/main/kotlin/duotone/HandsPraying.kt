package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorDuotoneIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 229.660 197.000 L 197.000 229.660 C 193.876 232.782 188.814 232.782 185.690 229.660 L 167.340 211.310 L 211.340 167.310 L 229.690 185.660 C 231.194 187.165 232.037 189.208 232.031 191.336 C 232.026 193.464 231.172 195.503 229.660 197.000 ZM 26.340 185.660 C 23.218 188.784 23.218 193.846 26.340 196.970 L 59.000 229.660 C 62.124 232.782 67.186 232.782 70.310 229.660 L 88.660 211.310 L 44.660 167.310 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 235.320 180.000 L 199.080 143.750 L 162.620 23.460 C 160.516 16.504 155.077 11.057 148.124 8.942 C 141.171 6.828 133.621 8.324 128.000 12.930 C 122.379 8.324 114.829 6.828 107.876 8.942 C 100.923 11.057 95.484 16.504 93.380 23.460 L 56.920 143.760 L 20.680 180.000 C 14.437 186.248 14.437 196.372 20.680 202.620 L 53.370 235.310 C 56.371 238.311 60.441 239.998 64.685 239.998 C 68.929 239.998 72.999 238.311 76.000 235.310 L 124.280 187.000 C 125.618 185.658 126.861 184.225 128.000 182.710 C 129.139 184.225 130.382 185.658 131.720 187.000 L 180.000 235.320 C 183.001 238.321 187.071 240.008 191.315 240.008 C 195.559 240.008 199.629 238.321 202.630 235.320 L 235.320 202.630 C 238.321 199.629 240.008 195.559 240.008 191.315 C 240.008 187.071 238.321 183.001 235.320 180.000 ZM 64.680 224.000 L 32.000 191.320 L 44.690 178.630 L 77.380 211.320 ZM 120.000 158.750 C 120.032 165.124 117.511 171.246 113.000 175.750 L 88.680 200.000 L 56.000 167.320 L 69.650 153.660 C 70.582 152.728 71.269 151.581 71.650 150.320 L 108.650 28.100 C 109.427 25.286 112.180 23.492 115.068 23.920 C 117.956 24.347 120.072 26.861 120.000 29.780 ZM 143.000 175.750 C 138.489 171.246 135.968 165.124 136.000 158.750 L 136.000 29.750 C 136.001 26.886 138.098 24.455 140.931 24.034 C 143.763 23.613 146.477 25.330 147.310 28.070 L 184.310 150.290 C 184.691 151.551 185.378 152.698 186.310 153.630 L 200.800 168.120 L 167.400 200.120 ZM 191.320 224.000 L 178.760 211.430 L 212.150 179.430 L 224.000 191.320 Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
