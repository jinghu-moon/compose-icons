package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorBoldIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.860 50.890 C 88.882 46.682 84.650 43.995 80.000 43.995 C 75.350 43.995 71.118 46.682 69.140 50.890 L 5.140 186.890 C 2.475 192.856 5.073 199.858 10.986 202.641 C 16.898 205.425 23.950 202.966 26.850 197.110 L 42.440 164.000 L 117.560 164.000 L 133.140 197.110 C 135.962 203.108 143.112 205.682 149.110 202.860 C 155.108 200.038 157.682 192.888 154.860 186.890 ZM 53.740 140.000 L 80.000 84.180 L 106.270 140.000 ZM 200.000 84.000 C 186.150 84.000 175.230 87.860 167.550 95.480 C 164.260 98.444 162.870 102.978 163.933 107.277 C 164.996 111.575 168.340 114.939 172.632 116.027 C 176.924 117.116 181.467 115.752 184.450 112.480 C 187.450 109.480 192.710 107.960 200.000 107.960 C 211.000 107.960 220.000 115.140 220.000 123.960 L 220.000 128.350 C 213.731 125.457 206.904 123.972 200.000 124.000 C 175.740 124.000 156.000 141.940 156.000 164.000 C 156.000 186.060 175.740 204.000 200.000 204.000 C 207.661 204.020 215.212 202.173 222.000 198.620 C 224.925 203.029 230.391 205.002 235.458 203.478 C 240.524 201.953 243.994 197.291 244.000 192.000 L 244.000 124.000 C 244.000 101.940 224.260 84.000 200.000 84.000 ZM 200.000 180.000 C 189.000 180.000 180.000 172.820 180.000 164.000 C 180.000 155.180 189.000 148.000 200.000 148.000 C 211.000 148.000 220.000 155.180 220.000 164.000 C 220.000 172.820 211.000 180.000 200.000 180.000 Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
