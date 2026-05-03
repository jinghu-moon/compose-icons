package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CashRegister: ImageVector
    get() {
        if (_cashRegister != null) return _cashRegister!!
        _cashRegister = phosphorBoldIcon(
            name = "CashRegister",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.610 157.000 L 221.170 71.000 C 218.891 62.175 210.934 56.007 201.820 56.000 L 140.000 56.000 L 140.000 40.000 C 140.000 28.954 131.046 20.000 120.000 20.000 L 80.000 20.000 C 68.954 20.000 60.000 28.954 60.000 40.000 L 60.000 56.000 L 54.180 56.000 C 45.066 56.007 37.109 62.175 34.830 71.000 L 12.390 157.000 C 12.133 157.979 12.002 158.988 12.000 160.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 160.000 C 243.998 158.988 243.867 157.979 243.610 157.000 ZM 84.000 44.000 L 116.000 44.000 L 116.000 56.000 L 84.000 56.000 ZM 57.270 80.000 L 198.730 80.000 L 216.470 148.000 L 39.530 148.000 ZM 36.000 188.000 L 36.000 172.000 L 220.000 172.000 L 220.000 188.000 ZM 64.000 116.000 C 64.000 109.373 69.373 104.000 76.000 104.000 L 84.000 104.000 C 90.627 104.000 96.000 109.373 96.000 116.000 C 96.000 122.627 90.627 128.000 84.000 128.000 L 76.000 128.000 C 69.373 128.000 64.000 122.627 64.000 116.000 ZM 112.000 116.000 C 112.000 109.373 117.373 104.000 124.000 104.000 L 132.000 104.000 C 138.627 104.000 144.000 109.373 144.000 116.000 C 144.000 122.627 138.627 128.000 132.000 128.000 L 124.000 128.000 C 117.373 128.000 112.000 122.627 112.000 116.000 ZM 160.000 116.000 C 160.000 109.373 165.373 104.000 172.000 104.000 L 180.000 104.000 C 186.627 104.000 192.000 109.373 192.000 116.000 C 192.000 122.627 186.627 128.000 180.000 128.000 L 172.000 128.000 C 165.373 128.000 160.000 122.627 160.000 116.000 Z"),
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
        return _cashRegister!!
    }

private var _cashRegister: ImageVector? = null
