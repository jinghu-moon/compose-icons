package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorBoldIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 68.000 100.000 C 68.000 93.373 73.373 88.000 80.000 88.000 L 176.000 88.000 C 182.627 88.000 188.000 93.373 188.000 100.000 C 188.000 106.627 182.627 112.000 176.000 112.000 L 80.000 112.000 C 73.373 112.000 68.000 106.627 68.000 100.000 ZM 80.000 152.000 L 176.000 152.000 C 182.627 152.000 188.000 146.627 188.000 140.000 C 188.000 133.373 182.627 128.000 176.000 128.000 L 80.000 128.000 C 73.373 128.000 68.000 133.373 68.000 140.000 C 68.000 146.627 73.373 152.000 80.000 152.000 ZM 236.000 56.000 L 236.000 208.000 C 236.000 212.159 233.845 216.022 230.307 218.208 C 226.768 220.394 222.350 220.591 218.630 218.730 L 192.000 205.420 L 165.370 218.730 C 161.990 220.421 158.010 220.421 154.630 218.730 L 128.000 205.420 L 101.370 218.730 C 97.990 220.421 94.010 220.421 90.630 218.730 L 64.000 205.420 L 37.370 218.730 C 33.650 220.591 29.232 220.394 25.693 218.208 C 22.155 216.022 20.000 212.159 20.000 208.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 188.580 L 58.630 181.270 C 62.010 179.579 65.990 179.579 69.370 181.270 L 96.000 194.580 L 122.630 181.270 C 126.010 179.579 129.990 179.579 133.370 181.270 L 160.000 194.580 L 186.630 181.270 C 190.010 179.579 193.990 179.579 197.370 181.270 L 212.000 188.580 Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
