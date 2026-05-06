package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorBoldIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 32c0-6.627-5.373-12-12-12-44.78 0-90 48.54-115.9 82C88.929 97.05 68.546 101.252 52.895 113.381 37.245 125.51 28.09 144.2 28.1 164c0 12-3.1 22.71-9.23 31.76-2.574 3.924-5.773 7.4-9.47 10.29-4.427 2.874-6.427 8.324-4.91 13.38 1.549 5.114 6.277 8.6 11.62 8.57h76c19.781-.024 38.439-9.193 50.543-24.839C154.756 187.516 158.945 167.153 154 148 187.49 122.05 236 76.8 236 32ZM209.62 46.39c-4 12.92-13.15 27.49-26.92 42.91-3 3.39-6.16 6.7-9.35 9.89C168.485 93.087 162.95 87.549 156.85 82.68c3.19-3.19 6.49-6.32 9.88-9.35C182.15 59.55 196.71 50.43 209.62 46.39ZM92.07 204h-50.07c6.812-12.22 10.308-26.01 10.14-40 0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40ZM130.25 112.68c3.12-3.93 6.55-8.09 10.23-12.35 5.736 4.375 10.859 9.501 15.23 15.24-4.26 3.68-8.42 7.11-12.35 10.23-3.714-4.983-8.13-9.402-13.11-13.12Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
