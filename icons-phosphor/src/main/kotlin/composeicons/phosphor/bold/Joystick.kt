package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Joystick: ImageVector
    get() {
        if (_joystick != null) return _joystick!!
        _joystick = phosphorBoldIcon(
            name = "Joystick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 144h-68v-45.68c21.127-5.989 34.604-26.639 31.581-48.39C168.558 28.18 149.96 11.988 128 11.988c-21.96 0-40.558 16.192-43.581 37.942C81.396 71.681 94.873 92.331 116 98.32v45.68h-68c-11.046 0-20 8.954-20 20v44c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-44c0-11.046-8.954-20-20-20ZM108 56c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 76 108 67.046 108 56ZM204 204h-152v-36h152ZM172 104h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
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
