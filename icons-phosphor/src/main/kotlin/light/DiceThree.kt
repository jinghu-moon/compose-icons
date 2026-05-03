package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceThree: ImageVector
    get() {
        if (_diceThree != null) return _diceThree!!
        _diceThree = phosphorLightIcon(
            name = "DiceThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 34.000 L 64.000 34.000 C 47.431 34.000 34.000 47.431 34.000 64.000 L 34.000 192.000 C 34.000 208.569 47.431 222.000 64.000 222.000 L 192.000 222.000 C 208.569 222.000 222.000 208.569 222.000 192.000 L 222.000 64.000 C 222.000 47.431 208.569 34.000 192.000 34.000 ZM 210.000 192.000 C 210.000 201.941 201.941 210.000 192.000 210.000 L 64.000 210.000 C 54.059 210.000 46.000 201.941 46.000 192.000 L 46.000 64.000 C 46.000 54.059 54.059 46.000 64.000 46.000 L 192.000 46.000 C 201.941 46.000 210.000 54.059 210.000 64.000 ZM 102.000 92.000 C 102.000 97.523 97.523 102.000 92.000 102.000 C 86.477 102.000 82.000 97.523 82.000 92.000 C 82.000 86.477 86.477 82.000 92.000 82.000 C 97.523 82.000 102.000 86.477 102.000 92.000 ZM 138.000 128.000 C 138.000 133.523 133.523 138.000 128.000 138.000 C 122.477 138.000 118.000 133.523 118.000 128.000 C 118.000 122.477 122.477 118.000 128.000 118.000 C 133.523 118.000 138.000 122.477 138.000 128.000 ZM 174.000 164.000 C 174.000 169.523 169.523 174.000 164.000 174.000 C 158.477 174.000 154.000 169.523 154.000 164.000 C 154.000 158.477 158.477 154.000 164.000 154.000 C 169.523 154.000 174.000 158.477 174.000 164.000 Z"),
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
        return _diceThree!!
    }

private var _diceThree: ImageVector? = null
