package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorDuotoneIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 104.000 180.000 C 104.000 195.464 91.464 208.000 76.000 208.000 C 60.536 208.000 48.000 195.464 48.000 180.000 C 48.000 164.536 60.536 152.000 76.000 152.000 C 91.464 152.000 104.000 164.536 104.000 180.000 ZM 180.000 152.000 C 164.536 152.000 152.000 164.536 152.000 180.000 C 152.000 195.464 164.536 208.000 180.000 208.000 C 195.464 208.000 208.000 195.464 208.000 180.000 C 208.000 164.536 195.464 152.000 180.000 152.000 ZM 166.110 51.290 C 164.642 49.279 162.321 48.066 159.832 48.010 C 157.342 47.953 154.969 49.058 153.410 51.000 L 140.470 66.000 C 137.433 69.778 132.847 71.975 128.000 71.975 C 123.153 71.975 118.567 69.778 115.530 66.000 L 102.590 51.000 C 101.031 49.058 98.658 47.953 96.168 48.010 C 93.679 48.066 91.358 49.279 89.890 51.290 L 40.000 120.000 L 216.000 120.000 Z"),
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
                pathData = parseSvgPathData("M 248.000 112.000 L 220.080 112.000 L 172.580 46.590 C 169.663 42.585 165.055 40.157 160.102 40.016 C 155.149 39.875 150.410 42.037 147.270 45.870 L 134.420 60.770 L 134.220 61.000 C 132.712 62.895 130.422 63.999 128.000 63.999 C 125.578 63.999 123.288 62.895 121.780 61.000 L 121.580 60.770 L 108.730 45.870 C 105.590 42.037 100.851 39.875 95.898 40.016 C 90.945 40.157 86.337 42.585 83.420 46.590 L 35.920 112.000 L 8.000 112.000 C 3.582 112.000 0.000 115.582 0.000 120.000 C 0.000 124.418 3.582 128.000 8.000 128.000 L 248.000 128.000 C 252.418 128.000 256.000 124.418 256.000 120.000 C 256.000 115.582 252.418 112.000 248.000 112.000 ZM 96.340 56.000 L 96.530 56.240 L 109.380 71.130 C 113.937 76.734 120.777 79.987 128.000 79.987 C 135.223 79.987 142.063 76.734 146.620 71.130 L 159.470 56.240 C 159.530 56.160 159.570 56.080 159.640 56.000 L 200.300 112.000 L 55.690 112.000 ZM 180.000 144.000 C 161.668 144.004 146.267 157.782 144.230 176.000 L 111.770 176.000 C 109.729 157.800 94.348 144.033 76.034 144.013 C 57.719 143.993 42.309 157.726 40.228 175.922 C 38.146 194.118 50.058 210.976 67.904 215.092 C 85.750 219.208 103.842 209.269 109.940 192.000 L 146.060 192.000 C 152.163 209.261 170.248 219.193 188.088 215.080 C 205.928 210.967 217.840 194.120 215.770 175.930 C 213.700 157.739 198.308 143.999 180.000 144.000 ZM 76.000 200.000 C 64.954 200.000 56.000 191.046 56.000 180.000 C 56.000 168.954 64.954 160.000 76.000 160.000 C 87.046 160.000 96.000 168.954 96.000 180.000 C 96.000 191.046 87.046 200.000 76.000 200.000 ZM 180.000 200.000 C 168.954 200.000 160.000 191.046 160.000 180.000 C 160.000 168.954 168.954 160.000 180.000 160.000 C 191.046 160.000 200.000 168.954 200.000 180.000 C 200.000 191.046 191.046 200.000 180.000 200.000 Z"),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
