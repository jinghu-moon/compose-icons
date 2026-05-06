package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorBoldIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 80c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20ZM60 80C60 42.445 90.445 12 128 12c37.555 0 68 30.445 68 68 0 62.25-59.51 97-62.05 98.42-3.687 2.105-8.213 2.105-11.9 0C119.51 177 60 142.25 60 80ZM84 80c0 38.2 30.71 64.2 44 73.64C141.21 144.15 172 118 172 80 172 55.699 152.301 36 128 36 103.699 36 84 55.699 84 80ZM208.57 145.6c-3.974-1.686-8.548-1.108-11.978 1.515-3.429 2.623-5.185 6.886-4.598 11.163 .587 4.277 3.427 7.91 7.436 9.512C213.56 173.61 220 180.27 220 184c0 4-7.13 11.07-22.77 17.08C178.93 208.08 154.34 212 128 212c-26.34 0-50.93-3.88-69.23-10.92C43.12 195.07 36 188 36 184c0-3.73 6.44-10.39 20.57-16.21 4.009-1.602 6.849-5.234 7.436-9.512 .587-4.277-1.169-8.54-4.598-11.163-3.429-2.623-8.003-3.202-11.978-1.515C31.27 152.25 12 164.31 12 184c0 34.14 58.36 52 116 52 29.22 0 56.86-4.44 77.85-12.52C220.1 218 244 205.59 244 184c0-19.69-19.27-31.75-35.43-38.4Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
