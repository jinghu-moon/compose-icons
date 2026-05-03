package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorFillIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 224.000 C 152.000 228.418 148.418 232.000 144.000 232.000 L 112.000 232.000 C 107.582 232.000 104.000 228.418 104.000 224.000 C 104.000 219.582 107.582 216.000 112.000 216.000 L 144.000 216.000 C 148.418 216.000 152.000 219.582 152.000 224.000 ZM 223.620 155.830 L 211.260 211.460 C 210.068 216.830 206.201 221.211 201.021 223.061 C 195.841 224.911 190.074 223.970 185.750 220.570 L 158.510 200.000 L 97.510 200.000 L 70.250 220.570 C 65.926 223.970 60.159 224.911 54.979 223.061 C 49.799 221.211 45.932 216.830 44.740 211.460 L 32.380 155.830 C 31.318 150.993 32.542 145.935 35.700 142.120 L 64.260 107.860 C 65.219 95.269 68.109 82.901 72.830 71.190 C 85.730 38.850 108.830 18.560 118.200 11.340 C 123.969 6.870 132.031 6.870 137.800 11.340 C 147.140 18.560 170.270 38.850 183.170 71.190 C 187.891 82.901 190.781 95.269 191.740 107.860 L 220.300 142.120 C 223.458 145.935 224.682 150.993 223.620 155.830 ZM 84.390 189.830 Q 68.280 160.500 64.830 132.160 L 48.000 152.360 L 60.360 208.000 L 60.540 207.870 ZM 140.000 100.000 C 140.000 93.373 134.627 88.000 128.000 88.000 C 121.373 88.000 116.000 93.373 116.000 100.000 C 116.000 106.627 121.373 112.000 128.000 112.000 C 134.627 112.000 140.000 106.627 140.000 100.000 ZM 208.000 152.360 L 191.170 132.160 Q 187.750 160.440 171.610 189.850 L 195.460 207.850 L 195.640 207.980 Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
