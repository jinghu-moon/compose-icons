package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorBoldIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 88h72c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72c-6.627 0-12-5.373-12-12C80 93.373 85.373 88 92 88ZM164 128h-72c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM256 104v24c0 19.882-16.118 36-36 36h-6.15c-7.22 15.48-20.72 28.87-40.07 39.52-13.662 7.385-28.276 12.853-43.43 16.25-1.552 .307-3.148 .307-4.7 0C110.496 216.373 95.882 210.905 82.22 203.52 62.87 192.87 49.37 179.52 42.15 164h-6.15C16.118 164 0 147.882 0 128v-24C0 84.118 16.118 68 36 68h2c2.178-4.456 5.94-7.94 10.55-9.77L120.55 29.43c4.767-1.92 10.093-1.92 14.86 0l72 28.8c4.625 1.822 8.402 5.307 10.59 9.77h2c19.882 0 36 16.118 36 36ZM36.13 140C36.05 138.68 36 137.35 36 136v-44c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12ZM196 79.51 128 52.31 60 79.51v56.49c0 40.63 55.72 56.65 68 59.69 12.25-3 68-19.05 68-59.69ZM232 104c0-6.627-5.373-12-12-12v44c0 1.35-.05 2.68-.13 4h.13c6.627 0 12-5.373 12-12Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
