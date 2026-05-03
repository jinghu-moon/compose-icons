package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorBoldIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 220.000 68.000 L 220.000 88.000 L 36.000 88.000 L 36.000 68.000 ZM 36.000 188.000 L 36.000 112.000 L 220.000 112.000 L 220.000 188.000 ZM 208.000 164.000 C 208.000 170.627 202.627 176.000 196.000 176.000 L 164.000 176.000 C 157.373 176.000 152.000 170.627 152.000 164.000 C 152.000 157.373 157.373 152.000 164.000 152.000 L 196.000 152.000 C 202.627 152.000 208.000 157.373 208.000 164.000 ZM 140.000 164.000 C 140.000 170.627 134.627 176.000 128.000 176.000 L 116.000 176.000 C 109.373 176.000 104.000 170.627 104.000 164.000 C 104.000 157.373 109.373 152.000 116.000 152.000 L 128.000 152.000 C 134.627 152.000 140.000 157.373 140.000 164.000 Z"),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
