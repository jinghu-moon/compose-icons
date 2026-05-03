package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorBoldIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.650 149.140 C 229.227 155.574 225.293 162.068 218.860 163.650 L 198.190 168.730 L 203.590 188.890 C 205.308 195.291 201.511 201.872 195.110 203.590 C 188.709 205.308 182.128 201.511 180.410 195.110 L 173.120 167.910 L 140.000 148.780 L 140.000 187.000 L 160.480 207.480 C 165.174 212.174 165.174 219.786 160.480 224.480 C 155.786 229.174 148.174 229.174 143.480 224.480 L 128.000 209.000 L 112.490 224.520 C 107.796 229.214 100.184 229.214 95.490 224.520 C 90.796 219.826 90.796 212.214 95.490 207.520 L 116.000 187.000 L 116.000 148.780 L 82.880 167.910 L 75.590 195.110 C 73.872 201.511 67.291 205.308 60.890 203.590 C 54.489 201.872 50.692 195.291 52.410 188.890 L 57.810 168.730 L 37.140 163.650 C 32.878 162.721 29.456 159.552 28.203 155.375 C 26.949 151.197 28.061 146.668 31.107 143.546 C 34.152 140.424 38.653 139.200 42.860 140.350 L 70.750 147.200 L 104.000 128.000 L 70.750 108.800 L 42.860 115.650 C 41.925 115.883 40.964 116.001 40.000 116.000 C 33.938 115.986 28.838 111.454 28.113 105.436 C 27.388 99.417 31.265 93.803 37.150 92.350 L 57.820 87.270 L 52.420 67.110 C 50.702 60.709 54.499 54.128 60.900 52.410 C 67.301 50.692 73.882 54.489 75.600 60.890 L 82.890 88.090 L 116.000 107.210 L 116.000 69.000 L 95.520 48.480 C 90.826 43.786 90.826 36.174 95.520 31.480 C 100.214 26.786 107.826 26.786 112.520 31.480 L 128.000 47.000 L 143.510 31.480 C 148.204 26.786 155.816 26.786 160.510 31.480 C 165.204 36.174 165.204 43.786 160.510 48.480 L 140.000 69.000 L 140.000 107.240 L 173.120 88.120 L 180.410 60.920 C 182.128 54.519 188.709 50.722 195.110 52.440 C 201.511 54.158 205.308 60.739 203.590 67.140 L 198.190 87.300 L 218.860 92.380 C 224.689 93.881 228.503 99.468 227.780 105.443 C 227.056 111.418 222.018 115.933 216.000 116.000 C 215.033 116.001 214.069 115.884 213.130 115.650 L 185.240 108.800 L 152.000 128.000 L 185.250 147.200 L 213.140 140.350 C 219.574 138.773 226.068 142.707 227.650 149.140 Z"),
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
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
