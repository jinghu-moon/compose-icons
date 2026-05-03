package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorDuotoneIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 88.000 L 216.930 201.060 C 216.399 205.033 213.009 208.000 209.000 208.000 L 47.000 208.000 C 42.991 208.000 39.601 205.033 39.070 201.060 L 24.000 88.000 Z"),
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
                pathData = parseSvgPathData("M 136.000 120.000 L 136.000 176.000 C 136.000 180.418 132.418 184.000 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 L 120.000 120.000 C 120.000 115.582 123.582 112.000 128.000 112.000 C 132.418 112.000 136.000 115.582 136.000 120.000 ZM 172.840 119.200 L 167.240 175.200 C 167.016 177.318 167.646 179.437 168.990 181.089 C 170.334 182.740 172.281 183.788 174.400 184.000 C 174.670 184.015 174.940 184.015 175.210 184.000 C 179.315 183.995 182.750 180.884 183.160 176.800 L 188.760 120.800 C 189.202 116.404 185.996 112.482 181.600 112.040 C 177.204 111.598 173.282 114.804 172.840 119.200 ZM 83.160 119.200 C 82.718 114.804 78.796 111.598 74.400 112.040 C 70.004 112.482 66.798 116.404 67.240 120.800 L 72.840 176.800 C 73.252 180.903 76.716 184.021 80.840 184.000 C 81.110 184.015 81.380 184.015 81.650 184.000 C 83.761 183.788 85.702 182.746 87.044 181.103 C 88.387 179.460 89.022 177.351 88.810 175.240 ZM 239.930 89.060 L 224.860 202.120 C 223.773 210.054 217.008 215.974 209.000 216.000 L 47.000 216.000 C 38.992 215.974 32.227 210.054 31.140 202.120 L 16.070 89.060 C 15.764 86.774 16.460 84.467 17.980 82.731 C 19.499 80.995 21.693 80.000 24.000 80.000 L 68.370 80.000 L 122.000 18.730 C 123.519 17.008 125.704 16.022 128.000 16.022 C 130.296 16.022 132.481 17.008 134.000 18.730 L 187.630 80.000 L 232.000 80.000 C 234.307 80.000 236.501 80.995 238.020 82.731 C 239.540 84.467 240.236 86.774 239.930 89.060 ZM 89.630 80.000 L 166.370 80.000 L 128.000 36.150 ZM 222.860 96.000 L 33.140 96.000 L 47.000 200.000 L 209.000 200.000 Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
