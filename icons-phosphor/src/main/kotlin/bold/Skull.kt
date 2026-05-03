package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorBoldIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 132.000 C 116.000 145.255 105.255 156.000 92.000 156.000 C 78.745 156.000 68.000 145.255 68.000 132.000 C 68.000 118.745 78.745 108.000 92.000 108.000 C 105.255 108.000 116.000 118.745 116.000 132.000 ZM 164.000 108.000 C 150.745 108.000 140.000 118.745 140.000 132.000 C 140.000 145.255 150.745 156.000 164.000 156.000 C 177.255 156.000 188.000 145.255 188.000 132.000 C 188.000 118.745 177.255 108.000 164.000 108.000 ZM 236.000 116.000 C 236.000 145.850 222.950 173.780 200.000 193.520 L 200.000 216.000 C 200.000 227.046 191.046 236.000 180.000 236.000 L 76.000 236.000 C 64.954 236.000 56.000 227.046 56.000 216.000 L 56.000 193.520 C 33.000 173.780 20.000 145.850 20.000 116.000 C 20.000 58.650 68.450 12.000 128.000 12.000 C 187.550 12.000 236.000 58.650 236.000 116.000 ZM 212.000 116.000 C 212.000 71.890 174.320 36.000 128.000 36.000 C 81.680 36.000 44.000 71.890 44.000 116.000 C 44.000 140.310 55.410 163.000 75.310 178.300 C 78.268 180.572 80.001 184.090 80.000 187.820 L 80.000 212.000 L 96.000 212.000 L 96.000 192.000 C 96.000 185.373 101.373 180.000 108.000 180.000 C 114.627 180.000 120.000 185.373 120.000 192.000 L 120.000 212.000 L 136.000 212.000 L 136.000 192.000 C 136.000 185.373 141.373 180.000 148.000 180.000 C 154.627 180.000 160.000 185.373 160.000 192.000 L 160.000 212.000 L 176.000 212.000 L 176.000 187.820 C 176.002 184.094 177.735 180.580 180.690 178.310 C 200.590 163.000 212.000 140.310 212.000 116.000 Z"),
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
        return _skull!!
    }

private var _skull: ImageVector? = null
