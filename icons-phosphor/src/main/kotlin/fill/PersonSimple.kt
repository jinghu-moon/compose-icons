package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorFillIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 95.890 48.000 C 95.890 30.327 110.217 16.000 127.890 16.000 C 145.563 16.000 159.890 30.327 159.890 48.000 C 159.890 65.673 145.563 80.000 127.890 80.000 C 110.217 80.000 95.890 65.673 95.890 48.000 ZM 228.120 121.140 C 226.400 120.110 185.550 96.000 128.000 96.000 C 70.450 96.000 29.600 120.110 27.880 121.140 C 24.091 123.415 22.865 128.331 25.140 132.120 C 27.415 135.909 32.331 137.135 36.120 134.860 C 36.480 134.640 71.030 114.260 120.000 112.180 L 120.000 149.000 L 58.000 218.690 C 55.067 222.004 55.376 227.067 58.690 230.000 C 62.004 232.933 67.067 232.624 70.000 229.310 L 128.000 164.000 L 186.000 229.270 C 188.933 232.584 193.996 232.893 197.310 229.960 C 200.624 227.027 200.933 221.964 198.000 218.650 L 136.000 149.000 L 136.000 112.190 C 184.770 114.270 219.530 134.650 219.880 134.860 C 223.669 137.135 228.585 135.909 230.860 132.120 C 233.135 128.331 231.909 123.415 228.120 121.140 Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
