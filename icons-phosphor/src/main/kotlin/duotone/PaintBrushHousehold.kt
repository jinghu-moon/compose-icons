package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaintBrushHousehold: ImageVector
    get() {
        if (_paintBrushHousehold != null) return _paintBrushHousehold!!
        _paintBrushHousehold = phosphorDuotoneIcon(
            name = "PaintBrushHousehold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 225.000 65.000 L 156.000 124.000 L 172.690 140.690 C 178.933 146.938 178.933 157.062 172.690 163.310 L 152.000 184.000 L 72.000 104.000 L 92.690 83.310 C 98.938 77.067 109.062 77.067 115.310 83.310 L 132.000 100.000 L 191.000 31.000 C 200.389 21.611 215.611 21.611 225.000 31.000 C 234.389 40.389 234.389 55.611 225.000 65.000 Z"),
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
        pathData = parseSvgPathData("M 230.640 25.360 C 224.639 19.357 216.498 15.985 208.010 15.985 C 199.522 15.985 191.381 19.357 185.380 25.360 Q 185.170 25.570 184.960 25.810 L 131.550 88.220 L 121.000 77.640 C 116.499 73.136 110.392 70.606 104.025 70.606 C 97.658 70.606 91.551 73.136 87.050 77.640 L 10.360 154.340 C 7.238 157.464 7.238 162.526 10.360 165.650 L 90.360 245.650 C 93.484 248.772 98.546 248.772 101.670 245.650 L 178.360 169.000 C 182.864 164.499 185.394 158.392 185.394 152.025 C 185.394 145.658 182.864 139.551 178.360 135.050 L 167.780 124.480 L 230.190 71.000 C 230.340 70.860 230.500 70.720 230.640 70.570 C 243.107 58.078 243.107 37.852 230.640 25.360 ZM 96.000 228.690 L 79.320 212.000 L 101.660 189.650 C 104.648 186.505 104.585 181.551 101.517 178.483 C 98.449 175.415 93.495 175.352 90.350 178.340 L 68.000 200.680 L 55.320 188.000 L 77.660 165.650 C 80.648 162.505 80.585 157.551 77.517 154.483 C 74.449 151.415 69.495 151.352 66.350 154.340 L 44.000 176.680 L 27.310 160.000 L 72.000 115.310 L 140.690 184.000 ZM 219.520 59.100 L 150.810 117.910 C 149.114 119.359 148.100 121.450 148.012 123.679 C 147.925 125.908 148.772 128.073 150.350 129.650 L 167.000 146.340 C 170.122 149.464 170.122 154.526 167.000 157.650 L 152.000 172.650 L 83.320 104.000 L 98.320 89.000 C 101.444 85.878 106.506 85.878 109.630 89.000 L 126.320 105.690 C 127.897 107.268 130.062 108.115 132.291 108.028 C 134.520 107.940 136.611 106.926 138.060 105.230 L 196.900 36.480 C 203.191 30.504 213.098 30.630 219.234 36.766 C 225.370 42.902 225.496 52.809 219.520 59.100 Z"),
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
        return _paintBrushHousehold!!
    }

private var _paintBrushHousehold: ImageVector? = null
