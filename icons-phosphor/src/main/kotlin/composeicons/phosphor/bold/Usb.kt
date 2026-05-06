package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Usb: ImageVector
    get() {
        if (_usb != null) return _usb!!
        _usb = phosphorBoldIcon(
            name = "Usb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.2 118.4l-48-36c-3.636-2.727-8.501-3.166-12.567-1.133C186.568 83.3 184 87.455 184 92v24h-108v-40h22.06c5.844 16.531 22.748 26.446 40.029 23.482C155.37 96.517 168.001 81.533 168.001 64c0-17.533-12.632-32.517-29.912-35.482C120.808 25.554 103.904 35.469 98.06 52h-26.06C60.954 52 52 60.954 52 72v44h-40C5.373 116 0 121.373 0 128c0 6.627 5.373 12 12 12h40v44c0 11.046 8.954 20 20 20h24v4c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20h-32c-11.046 0-20 8.954-20 20v4h-20v-40h108v24c0 4.545 2.568 8.7 6.633 10.733 4.065 2.033 8.93 1.594 12.567-1.133l48-36C254.222 135.334 256 131.777 256 128c0-3.777-1.778-7.334-4.8-9.6ZM132 52c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM120 180h24v24h-24ZM208 140v-24l16 12Z"),
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
        return _usb!!
    }

private var _usb: ImageVector? = null
