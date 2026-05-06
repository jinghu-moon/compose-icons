package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorThinIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.07 161.88C222 156.72 228 142.63 228 120 228 97.37 222 83.28 210.07 78.12c-12.59-5.45-30.83-.39-54.22 15l-3 2q1-1.5 2-3c15.41-23.39 20.47-41.63 15-54.22C164.72 26 150.63 20 128 20 105.37 20 91.28 26 86.12 37.93c-5.45 12.59-.39 30.83 15 54.22q1 1.53 2 3l-3-2C76.73 77.74 58.49 72.68 45.9 78.15 34 83.28 28 97.37 28 120c0 22.63 6 36.72 17.93 41.88 3.482 1.455 7.227 2.176 11 2.12 11.46 0 26-5.73 43.26-17.14l3-2q-1 1.5-2 3c-15.41 23.39-20.47 41.63-15 54.21C91.28 214 105.37 220 128 220c22.63 0 36.72-6 41.88-17.94 3.81-8.8 2.47-20.39-3.95-34.56C181.58 188 197.34 213.86 204.12 241c.457 1.769 2.053 3.003 3.88 3 .337 .001 .673-.039 1-.12 2.143-.536 3.445-2.707 2.91-4.85-8.41-33.65-29.45-64.78-48-87.2 13.82 8.09 25.62 12.17 35.26 12.17 3.74 .043 7.449-.679 10.9-2.12ZM93.47 41.11C97.24 32.41 108.86 28 128 28c19.14 0 30.76 4.41 34.53 13.11 8.21 18.94-19.86 56.41-34.53 73C113.33 97.52 85.26 60.05 93.47 41.11ZM49.11 154.53C40.41 150.76 36 139.14 36 120 36 100.86 40.41 89.24 49.11 85.47 51.581 84.448 54.236 83.947 56.91 84c20.08 0 50.66 23.15 65.15 36-16.54 14.67-54.01 42.74-72.95 34.53ZM162.53 198.89C158.76 207.59 147.14 212 128 212c-19.14 0-30.76-4.41-34.53-13.11C85.26 180 113.33 142.48 128 125.94c14.67 16.54 42.74 54.06 34.53 72.95ZM134.11 120.15 134 120c16.54-14.68 54-42.75 72.94-34.53C215.59 89.24 220 100.86 220 120c0 19.14-4.41 30.76-13.11 34.53C188 162.71 150.73 134.86 134.11 120.15Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
