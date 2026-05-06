package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorThinIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 148h-76v-56.23c18.986-2.123 33.007-18.706 31.944-37.78C162.881 34.915 147.104 19.993 128 19.993c-19.104 0-34.881 14.922-35.944 33.997C90.993 73.064 105.014 89.647 124 91.77v56.23h-76c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM100 56c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 84 100 71.464 100 56ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-48c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM164 120c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4Z"),
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
        return _joystick!!
    }

private var _joystick: ImageVector? = null
