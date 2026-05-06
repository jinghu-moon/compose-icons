package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlugsConnected: ImageVector
    get() {
        if (_plugsConnected != null) return _plugsConnected!!
        _plugsConnected = phosphorThinIcon(
            name = "PlugsConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.83 21.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L173.94 76.4l-8.2-8.2c-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202L100 94.34 90.83 85.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66L94.34 100 68.2 126.14c-5.252 5.251-8.202 12.373-8.202 19.8 0 7.427 2.95 14.549 8.202 19.8l8.2 8.2L21.17 229.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L82.06 179.6l8.2 8.2c5.251 5.252 12.373 8.202 19.8 8.202 7.427 0 14.549-2.95 19.8-8.202L156 161.66l9.17 9.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66L161.66 156l26.14-26.14c5.252-5.251 8.202-12.373 8.202-19.8 0-7.427-2.95-14.549-8.202-19.8l-8.2-8.2L234.83 26.83c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83ZM124.2 182.17c-7.81 7.808-20.47 7.808-28.28 0L73.86 160.08c-7.808-7.81-7.808-20.47 0-28.28L100 105.66 150.34 156ZM182.14 124.23 156 150.34 105.66 100 131.8 73.86c7.81-7.808 20.47-7.808 28.28 0l22.06 22.06c7.808 7.81 7.808 20.47 0 28.28ZM92.29 33.49c-.828-2.049 .161-4.382 2.21-5.21 2.049-.828 4.382 .161 5.21 2.21l8 20c.822 2.049-.172 4.376-2.22 5.2-.472 .2-.978 .305-1.49 .31-1.633-.001-3.102-.994-3.71-2.51ZM28.29 94.49c.824-2.048 3.151-3.042 5.2-2.22l20 8c1.804 .698 2.85 2.588 2.484 4.487-.366 1.9-2.039 3.265-3.974 3.243-.511 .002-1.017-.097-1.49-.29l-20-8c-2.048-.824-3.042-3.151-2.22-5.2ZM227.71 161.49c-.608 1.516-2.077 2.509-3.71 2.51-.511 .002-1.017-.097-1.49-.29l-20-8c-2.049-.828-3.038-3.161-2.21-5.21 .828-2.049 3.161-3.038 5.21-2.21l20 8c2.04 .832 3.024 3.157 2.2 5.2ZM163.71 222.49c.822 2.049-.172 4.376-2.22 5.2-.472 .2-.978 .305-1.49 .31-1.633-.001-3.102-.994-3.71-2.51l-8-20c-.828-2.049 .161-4.382 2.21-5.21 2.049-.828 4.382 .161 5.21 2.21Z"),
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
        return _plugsConnected!!
    }

private var _plugsConnected: ImageVector? = null
