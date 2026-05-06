package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DiceThree: ImageVector
    get() {
        if (_diceThree != null) return _diceThree!!
        _diceThree = phosphorBoldIcon(
            name = "DiceThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 28h-128C44.118 28 28 44.118 28 64v128c0 19.882 16.118 36 36 36h128c19.882 0 36-16.118 36-36v-128C228 44.118 211.882 28 192 28ZM204 192c0 6.627-5.373 12-12 12h-128c-6.627 0-12-5.373-12-12v-128C52 57.373 57.373 52 64 52h128c6.627 0 12 5.373 12 12ZM104 88c0 8.837-7.163 16-16 16C79.163 104 72 96.837 72 88 72 79.163 79.163 72 88 72c8.837 0 16 7.163 16 16ZM144 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM184 168c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
