package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DeviceRotate: ImageVector
    get() {
        if (_deviceRotate != null) return _deviceRotate!!
        _deviceRotate = phosphorLightIcon(
            name = "DeviceRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.24 220.24l-24 24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L185.51 222h-105.51C67.85 222 58 212.15 58 200v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v96c0 5.523 4.477 10 10 10h105.51L171.76 196.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147l24 24c2.34 2.343 2.34 6.137 0 8.48ZM80 70c2.425-.002 4.611-1.464 5.538-3.705 .928-2.241 .415-4.819-1.298-6.535L70.49 46h105.51c5.523 0 10 4.477 10 10v96c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96C198 43.85 188.15 34 176 34h-105.51L84.24 20.24c2.203-2.364 2.138-6.048-.147-8.333C81.808 9.622 78.124 9.557 75.76 11.76L51.76 35.76c-2.34 2.343-2.34 6.137 0 8.48L75.76 68.24C76.884 69.366 78.409 69.999 80 70Z"),
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
        return _deviceRotate!!
    }

private var _deviceRotate: ImageVector? = null
