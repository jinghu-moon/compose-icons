package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorFillIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 156.000 C 200.000 162.500 192.670 168.000 184.000 168.000 C 175.330 168.000 168.000 162.500 168.000 156.000 C 168.000 149.500 175.330 144.000 184.000 144.000 C 192.670 144.000 200.000 149.500 200.000 156.000 ZM 232.000 56.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 143.370 172.880 L 99.370 68.880 C 98.119 65.917 95.216 63.992 92.000 63.992 C 88.784 63.992 85.881 65.917 84.630 68.880 L 40.630 172.880 C 38.907 176.950 40.810 181.647 44.880 183.370 C 48.950 185.093 53.647 183.190 55.370 179.120 L 66.840 152.000 L 117.160 152.000 L 128.630 179.120 C 130.353 183.190 135.050 185.093 139.120 183.370 C 143.190 181.647 145.093 176.950 143.370 172.880 ZM 216.000 124.000 C 216.000 108.560 201.640 96.000 184.000 96.000 C 176.537 95.945 169.253 98.286 163.220 102.680 C 159.677 105.320 158.945 110.332 161.585 113.875 C 164.225 117.418 169.237 118.150 172.780 115.510 C 176.050 113.173 179.981 111.943 184.000 112.000 C 192.560 112.000 199.800 117.360 200.000 123.760 L 200.000 131.760 C 195.038 129.263 189.555 127.975 184.000 128.000 C 166.360 128.000 152.000 140.560 152.000 156.000 C 152.000 171.440 166.360 184.000 184.000 184.000 C 189.912 184.027 195.735 182.562 200.930 179.740 C 202.650 182.988 206.360 184.646 209.927 183.761 C 213.493 182.876 215.998 179.675 216.000 176.000 ZM 73.610 136.000 L 110.390 136.000 L 92.000 92.530 Z"),
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
