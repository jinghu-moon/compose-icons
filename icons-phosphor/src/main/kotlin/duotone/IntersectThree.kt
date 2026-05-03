package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IntersectThree: ImageVector
    get() {
        if (_intersectThree != null) return _intersectThree!!
        _intersectThree = phosphorDuotoneIcon(
            name = "IntersectThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 104.640 147.280 C 85.330 139.116 71.681 121.464 68.640 100.720 C 88.314 92.422 110.914 95.194 128.000 108.000 C 115.332 117.495 106.934 131.615 104.640 147.280 ZM 104.640 147.280 C 101.443 169.039 110.407 190.803 128.000 204.000 C 145.593 190.803 154.557 169.039 151.360 147.280 C 136.422 153.573 119.578 153.573 104.640 147.280 ZM 187.360 100.720 C 167.686 92.422 145.086 95.194 128.000 108.000 C 140.668 117.495 149.066 131.615 151.360 147.280 C 170.670 139.116 184.319 121.464 187.360 100.720 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 195.880 96.000 C 195.950 94.690 196.000 93.370 196.000 92.000 C 196.000 54.445 165.555 24.000 128.000 24.000 C 90.445 24.000 60.000 54.445 60.000 92.000 C 60.000 93.330 60.000 94.650 60.120 96.000 C 37.766 107.439 23.536 130.267 23.108 155.374 C 22.679 180.481 36.122 203.781 58.073 215.976 C 80.024 228.171 106.908 227.277 128.000 213.650 C 149.092 227.277 175.976 228.171 197.927 215.976 C 219.878 203.781 233.321 180.481 232.892 155.374 C 232.464 130.267 218.234 107.439 195.880 96.000 ZM 128.000 193.470 C 118.289 184.192 112.554 171.510 112.000 158.090 C 122.481 160.637 133.419 160.637 143.900 158.090 C 143.373 171.495 137.674 184.175 128.000 193.470 ZM 128.000 144.000 C 123.239 143.998 118.502 143.342 113.920 142.050 C 116.428 133.093 121.290 124.971 128.000 118.530 C 134.710 124.971 139.572 133.093 142.080 142.050 C 137.498 143.342 132.761 143.998 128.000 144.000 ZM 99.230 135.290 C 88.858 128.384 81.299 117.994 77.920 106.000 C 90.170 102.543 103.264 103.710 114.710 109.280 C 107.666 116.680 102.376 125.570 99.230 135.290 ZM 141.290 109.230 C 152.742 103.677 165.836 102.528 178.080 106.000 C 174.712 118.013 167.152 128.421 156.770 135.340 C 153.638 125.584 148.347 116.659 141.290 109.230 ZM 128.000 40.000 C 155.910 40.008 178.847 62.024 180.000 89.910 C 162.238 85.590 143.484 88.634 128.000 98.350 C 112.530 88.647 93.796 85.604 76.050 89.910 C 77.202 62.044 100.110 40.035 128.000 40.000 ZM 40.000 156.000 C 40.009 138.591 48.728 122.342 63.230 112.710 C 68.685 129.576 80.477 143.663 96.120 152.000 C 96.050 153.310 96.000 154.630 96.000 156.000 C 95.993 173.415 102.693 190.165 114.710 202.770 C 98.596 210.593 79.590 209.572 64.408 200.067 C 49.225 190.562 40.003 173.912 40.000 156.000 ZM 164.000 208.000 C 156.130 208.010 148.363 206.221 141.290 202.770 C 153.307 190.165 160.007 173.415 160.000 156.000 C 160.000 154.670 159.950 153.350 159.880 152.000 C 175.531 143.653 187.324 129.550 192.770 112.670 C 211.885 125.353 220.431 149.063 213.803 171.024 C 207.175 192.985 186.940 208.009 164.000 208.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _intersectThree!!
    }

private var _intersectThree: ImageVector? = null
