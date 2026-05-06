package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorBoldIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 220h-39.27c5.18-5 10.75-10.71 16.33-17.13C205.15 170.57 220 136.37 220 104 220 53.19 178.81 12 128 12 77.19 12 36 53.19 36 104c0 50 34.12 91.94 59.18 116h-39.18c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM60 104C60 66.445 90.445 36 128 36c37.555 0 68 30.445 68 68 0 33.31-20 63.37-36.7 82.71-9.535 10.952-20.008 21.051-31.3 30.18C116.708 207.761 106.235 197.662 96.7 186.71 80 167.37 60 137.31 60 104ZM128 148c24.301 0 44-19.699 44-44C172 79.699 152.301 60 128 60 103.699 60 84 79.699 84 104c.028 24.289 19.711 43.972 44 44ZM128 84c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
