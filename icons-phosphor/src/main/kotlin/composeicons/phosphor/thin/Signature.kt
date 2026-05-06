package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorThinIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 172h-174.68c4-7.83 8.18-16.11 12.21-24.56 15.14 3.55 34.13-8.06 56.54-34.59 3.67 12.5 12.53 34.83 29.08 35.15h.35c8.71 0 17.64-6.25 27.16-19.06C187.17 137.14 199.31 148 232 148c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-42.88 0-44-19.24-44-20-.003-1.769-1.167-3.326-2.863-3.829-1.696-.503-3.521 .168-4.487 1.649C168.74 136.1 160.42 140 155.48 140h-.18c-13-.25-21.29-26.52-23.38-36.61-.325-1.499-1.479-2.68-2.97-3.04-1.491-.36-3.056 .164-4.03 1.35-20.94 26.27-39.06 39.55-51.8 38.2C97.31 87.5 105.19 53.16 96.49 37.77 94 33.31 88.7 28 77.91 28 64.09 28 52.54 42.41 47 66.54 43.531 81.787 43.008 97.557 45.46 113c2.64 15.29 8.39 26.05 16.69 31.35-4.58 9.6-9.3 19-13.84 27.68h-24.31c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20.1C31.23 204.2 20.73 221.71 20.57 221.97c-.547 .91-.709 1.999-.452 3.029 .257 1.03 .913 1.915 1.822 2.461 .624 .366 1.337 .553 2.06 .54 1.405 0 2.707-.736 3.43-1.94 .16-.27 11.85-19.75 25.72-46.06h178.85c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM53.34 111.61C51.085 97.216 51.591 82.525 54.83 68.32 58.4 52.7 66.34 36 77.91 36c7.52 0 10.23 3.26 11.61 5.7C99 58.4 79.92 106 65.6 137 59.76 132.69 55.46 123.83 53.34 111.61Z"),
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
        return _signature!!
    }

private var _signature: ImageVector? = null
