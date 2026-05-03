package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorDuotoneIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 128.000 C 176.000 154.510 154.510 176.000 128.000 176.000 C 101.490 176.000 80.000 154.510 80.000 128.000 C 80.000 101.490 101.490 80.000 128.000 80.000 C 154.510 80.000 176.000 101.490 176.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 221.870 83.160 C 244.863 131.249 227.816 188.938 182.377 216.805 C 136.939 244.672 77.791 233.714 45.351 191.419 C 12.911 149.123 17.662 89.157 56.356 52.496 C 95.050 15.835 155.186 14.326 195.670 49.000 L 218.340 26.320 C 221.466 23.194 226.534 23.194 229.660 26.320 C 232.786 29.446 232.786 34.514 229.660 37.640 L 133.660 133.640 C 130.534 136.766 125.466 136.766 122.340 133.640 C 119.214 130.514 119.214 125.446 122.340 122.320 L 150.060 94.600 C 134.594 84.371 114.126 86.113 100.610 98.807 C 87.094 111.502 84.075 131.821 93.315 147.897 C 102.555 163.973 121.633 171.591 139.405 166.302 C 157.177 161.012 168.984 144.202 167.930 125.690 C 167.681 121.272 171.062 117.489 175.480 117.240 C 179.898 116.991 183.681 120.372 183.930 124.790 C 185.432 151.010 168.512 174.752 143.237 181.887 C 117.962 189.023 91.123 177.635 78.692 154.500 C 66.261 131.366 71.577 102.700 91.477 85.561 C 111.377 68.423 140.514 67.416 161.550 83.140 L 184.300 60.390 C 149.775 31.726 99.200 33.676 66.986 64.915 C 34.771 96.153 31.266 146.644 58.856 182.034 C 86.445 217.424 136.265 226.344 174.419 202.725 C 212.574 179.106 226.805 130.535 207.430 90.060 C 205.525 86.073 207.213 81.295 211.200 79.390 C 215.188 77.485 219.965 79.173 221.870 83.160 Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
