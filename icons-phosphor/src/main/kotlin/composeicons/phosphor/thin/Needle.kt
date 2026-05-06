package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorThinIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.83 69.17c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83l-16 16c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l16-16c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173ZM220 72c.029 9.554-3.767 18.722-10.54 25.46l-24 24c-.59 .582-1.343 .97-2.16 1.11-21.65 3.72-52.74 21.46-89.91 51.33C65.05 196.67 43.05 218.61 42.83 218.83l-.24 .22h0c-1.633 1.423-4.102 1.288-5.57-.304-1.468-1.593-1.402-4.064 .15-5.576h0C37.39 213 59.33 191 82.1 162.61 112 125.44 129.71 94.35 133.43 72.7c.14-.817 .528-1.57 1.11-2.16l24-24c10.296-10.299 25.783-13.381 39.238-7.808C211.232 44.306 220.003 57.437 220 72ZM212 72c.001-11.326-6.821-21.536-17.285-25.871-10.463-4.334-22.507-1.938-30.515 6.071L141.08 75.32c-5.33 28-29.48 63.42-52.51 92.11 28.69-23 64.16-47.18 92.11-52.52L203.8 91.8C209.069 86.56 212.022 79.43 212 72Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
