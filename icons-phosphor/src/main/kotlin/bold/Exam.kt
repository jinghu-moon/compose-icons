package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorBoldIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 216.000 C 20.000 220.159 22.155 224.022 25.693 226.208 C 29.232 228.394 33.650 228.591 37.370 226.730 L 64.000 213.420 L 90.630 226.730 C 94.010 228.421 97.990 228.421 101.370 226.730 L 128.000 213.420 L 154.630 226.730 C 158.010 228.421 161.990 228.421 165.370 226.730 L 192.000 213.420 L 218.630 226.730 C 222.350 228.591 226.768 228.394 230.307 226.208 C 233.845 224.022 236.000 220.159 236.000 216.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.580 L 197.370 189.270 C 193.990 187.579 190.010 187.579 186.630 189.270 L 160.000 202.580 L 133.370 189.270 C 129.990 187.579 126.010 187.579 122.630 189.270 L 96.000 202.580 L 69.370 189.270 C 65.990 187.579 62.010 187.579 58.630 189.270 L 44.000 196.580 L 44.000 60.000 L 212.000 60.000 ZM 62.630 170.730 C 68.556 173.695 75.764 171.295 78.730 165.370 L 81.420 160.000 L 118.580 160.000 L 121.270 165.370 C 123.151 169.269 126.986 171.852 131.305 172.131 C 135.625 172.409 139.760 170.340 142.126 166.715 C 144.492 163.090 144.723 158.472 142.730 154.630 L 110.730 90.630 C 108.696 86.568 104.543 84.003 100.000 84.003 C 95.457 84.003 91.304 86.568 89.270 90.630 L 57.270 154.630 C 54.305 160.556 56.705 167.764 62.630 170.730 ZM 106.580 136.000 L 93.420 136.000 L 100.000 122.830 ZM 144.000 128.000 C 144.000 121.373 149.373 116.000 156.000 116.000 L 160.000 116.000 L 160.000 112.000 C 160.000 105.373 165.373 100.000 172.000 100.000 C 178.627 100.000 184.000 105.373 184.000 112.000 L 184.000 116.000 L 188.000 116.000 C 194.627 116.000 200.000 121.373 200.000 128.000 C 200.000 134.627 194.627 140.000 188.000 140.000 L 184.000 140.000 L 184.000 144.000 C 184.000 150.627 178.627 156.000 172.000 156.000 C 165.373 156.000 160.000 150.627 160.000 144.000 L 160.000 140.000 L 156.000 140.000 C 149.373 140.000 144.000 134.627 144.000 128.000 Z"),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
