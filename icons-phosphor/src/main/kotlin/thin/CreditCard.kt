package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorThinIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 L 228.000 92.000 L 28.000 92.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 ZM 224.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 100.000 L 228.000 100.000 L 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 ZM 204.000 168.000 C 204.000 170.209 202.209 172.000 200.000 172.000 L 168.000 172.000 C 165.791 172.000 164.000 170.209 164.000 168.000 C 164.000 165.791 165.791 164.000 168.000 164.000 L 200.000 164.000 C 202.209 164.000 204.000 165.791 204.000 168.000 ZM 140.000 168.000 C 140.000 170.209 138.209 172.000 136.000 172.000 L 120.000 172.000 C 117.791 172.000 116.000 170.209 116.000 168.000 C 116.000 165.791 117.791 164.000 120.000 164.000 L 136.000 164.000 C 138.209 164.000 140.000 165.791 140.000 168.000 Z"),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
