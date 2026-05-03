package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorDuotoneIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 217.360 133.360 L 128.000 224.000 L 38.640 133.360 C 19.111 113.831 19.111 82.169 38.640 62.640 C 58.169 43.111 89.831 43.111 109.360 62.640 L 128.000 80.000 L 146.640 62.640 C 166.169 43.111 197.831 43.111 217.360 62.640 C 236.889 82.169 236.889 113.831 217.360 133.360 Z"),
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
        pathData = parseSvgPathData("M 223.000 57.000 C 200.346 34.404 163.687 34.377 141.000 56.940 L 128.000 69.470 L 115.000 56.910 C 92.343 34.266 55.619 34.278 32.975 56.935 C 10.331 79.592 10.343 116.316 33.000 138.960 L 122.370 229.620 C 123.874 231.147 125.927 232.007 128.070 232.007 C 130.213 232.007 132.266 231.147 133.770 229.620 L 223.000 139.000 C 245.585 116.332 245.585 79.668 223.000 57.000 ZM 211.640 127.760 L 128.000 212.600 L 44.290 127.680 C 27.887 111.274 27.889 84.678 44.295 68.275 C 60.701 51.872 87.297 51.874 103.700 68.280 L 103.800 68.380 L 116.470 80.570 L 106.470 90.220 C 104.922 91.710 104.039 93.759 104.018 95.907 C 103.997 98.055 104.841 100.121 106.360 101.640 L 132.690 128.000 L 122.340 138.350 C 119.214 141.476 119.214 146.544 122.340 149.670 C 125.466 152.796 130.534 152.796 133.660 149.670 L 149.660 133.670 C 152.782 130.546 152.782 125.484 149.660 122.360 L 123.420 96.090 L 152.200 68.380 L 152.310 68.280 C 168.724 51.885 195.320 51.901 211.715 68.315 C 228.110 84.729 228.094 111.325 211.680 127.720 Z"),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
