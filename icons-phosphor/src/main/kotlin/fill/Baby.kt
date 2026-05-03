package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorFillIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.160 24.100 C 132.735 24.025 131.379 24.715 130.600 25.910 C 120.300 41.480 120.000 55.790 120.000 56.000 C 120.010 58.411 121.106 60.689 122.984 62.201 C 124.863 63.713 127.323 64.296 129.680 63.790 C 133.422 62.894 136.045 59.527 136.000 55.680 C 136.077 53.468 137.067 51.387 138.735 49.932 C 140.402 48.477 142.598 47.777 144.800 48.000 C 148.960 48.483 152.074 52.043 152.000 56.230 C 151.925 69.485 141.120 80.170 127.865 80.095 C 114.610 80.020 103.925 69.215 104.000 55.960 C 104.000 55.330 104.090 45.180 109.440 31.960 C 109.992 30.581 109.735 29.010 108.772 27.879 C 107.809 26.749 106.299 26.244 104.850 26.570 C 56.233 37.738 22.358 81.806 24.070 131.660 C 26.000 186.720 71.230 231.000 126.320 231.900 C 182.844 232.766 229.708 188.323 231.839 131.833 C 233.970 75.343 190.588 27.496 134.160 24.100 ZM 80.000 127.910 C 80.000 121.283 85.373 115.910 92.000 115.910 C 98.627 115.910 104.000 121.283 104.000 127.910 C 104.000 134.537 98.627 139.910 92.000 139.910 C 85.373 139.910 80.000 134.537 80.000 127.910 ZM 160.270 182.680 C 140.518 194.993 115.482 194.993 95.730 182.680 C 91.991 180.322 90.872 175.379 93.230 171.640 C 95.588 167.901 100.531 166.782 104.270 169.140 C 118.804 178.160 137.196 178.160 151.730 169.140 C 155.469 166.782 160.412 167.901 162.770 171.640 C 165.128 175.379 164.009 180.322 160.270 182.680 ZM 164.000 139.910 C 157.373 139.910 152.000 134.537 152.000 127.910 C 152.000 121.283 157.373 115.910 164.000 115.910 C 170.627 115.910 176.000 121.283 176.000 127.910 C 176.000 134.537 170.627 139.910 164.000 139.910 Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
