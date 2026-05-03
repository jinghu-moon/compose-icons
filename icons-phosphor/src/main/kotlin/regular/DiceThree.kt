package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiceThree: ImageVector
    get() {
        if (_diceThree != null) return _diceThree!!
        _diceThree = phosphorRegularIcon(
            name = "DiceThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 32.000 L 64.000 32.000 C 46.327 32.000 32.000 46.327 32.000 64.000 L 32.000 192.000 C 32.000 209.673 46.327 224.000 64.000 224.000 L 192.000 224.000 C 209.673 224.000 224.000 209.673 224.000 192.000 L 224.000 64.000 C 224.000 46.327 209.673 32.000 192.000 32.000 ZM 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 L 64.000 208.000 C 55.163 208.000 48.000 200.837 48.000 192.000 L 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 L 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 ZM 104.000 92.000 C 104.000 98.627 98.627 104.000 92.000 104.000 C 85.373 104.000 80.000 98.627 80.000 92.000 C 80.000 85.373 85.373 80.000 92.000 80.000 C 98.627 80.000 104.000 85.373 104.000 92.000 ZM 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 ZM 176.000 164.000 C 176.000 170.627 170.627 176.000 164.000 176.000 C 157.373 176.000 152.000 170.627 152.000 164.000 C 152.000 157.373 157.373 152.000 164.000 152.000 C 170.627 152.000 176.000 157.373 176.000 164.000 Z"),
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
        return _diceThree!!
    }

private var _diceThree: ImageVector? = null
