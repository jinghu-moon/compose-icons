package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Student: ImageVector
    get() {
        if (_student != null) return _student!!
        _student = phosphorRegularIcon(
            name = "Student",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.530 56.410 L 130.530 24.410 C 128.888 23.863 127.112 23.863 125.470 24.410 L 29.470 56.410 C 26.203 57.499 24.000 60.556 24.000 64.000 L 24.000 144.000 C 24.000 148.418 27.582 152.000 32.000 152.000 C 36.418 152.000 40.000 148.418 40.000 144.000 L 40.000 75.100 L 73.590 86.290 C 55.007 116.311 64.248 155.711 94.240 174.340 C 76.240 181.400 60.680 194.170 49.300 211.630 C 47.689 214.024 47.492 217.100 48.785 219.680 C 50.078 222.259 52.659 223.943 55.541 224.086 C 58.423 224.229 61.158 222.809 62.700 220.370 C 77.770 197.250 101.570 184.000 128.000 184.000 C 154.430 184.000 178.230 197.250 193.300 220.370 C 195.742 223.999 200.645 224.994 204.308 222.605 C 207.971 220.215 209.037 215.327 206.700 211.630 C 195.320 194.170 179.700 181.400 161.760 174.340 C 191.722 155.712 200.959 116.351 182.410 86.340 L 226.530 71.640 C 229.798 70.552 232.002 67.494 232.002 64.050 C 232.002 60.606 229.798 57.548 226.530 56.460 ZM 176.000 120.000 C 176.006 140.835 162.571 159.294 142.743 165.693 C 122.916 172.093 101.224 164.971 89.049 148.064 C 76.874 131.157 76.995 108.326 89.350 91.550 L 125.470 103.550 C 127.112 104.097 128.888 104.097 130.530 103.550 L 166.650 91.550 C 172.728 99.790 176.005 109.761 176.000 120.000 ZM 128.000 87.570 L 57.300 64.000 L 128.000 40.430 L 198.700 64.000 Z"),
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
        return _student!!
    }

private var _student: ImageVector? = null
