package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorLightIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 146h-22v-36h22c18.778 0 34-15.222 34-34C214 57.222 198.778 42 180 42c-18.778 0-34 15.222-34 34v22h-36v-22C110 57.222 94.778 42 76 42 57.222 42 42 57.222 42 76c0 18.778 15.222 34 34 34h22v36h-22c-18.778 0-34 15.222-34 34 0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34v-22h36v22c0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34 0-18.778-15.222-34-34-34ZM158 76c0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22h-22ZM54 76C54 63.85 63.85 54 76 54c12.15 0 22 9.85 22 22v22h-22C63.85 98 54 88.15 54 76ZM98 180c0 12.15-9.85 22-22 22C63.85 202 54 192.15 54 180c0-12.15 9.85-22 22-22h22ZM110 110h36v36h-36ZM180 202c-12.15 0-22-9.85-22-22v-22h22c12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
