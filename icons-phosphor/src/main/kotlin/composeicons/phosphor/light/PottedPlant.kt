package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorLightIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124.24 140.24h0l21.09-21.09c8.163 4.342 17.245 6.67 26.49 6.79 8.765 .021 17.365-2.381 24.85-6.94 23.07-14 35.42-46.53 33-87.09-.177-3.038-2.602-5.463-5.64-5.64-40.56-2.38-73.12 10-87.09 33-9.22 15.22-9.2 33.71-.14 51.35L120 127.51 105.36 112.88c6.32-13 6.15-26.6-.67-37.86C94.21 57.72 70 48.44 39.85 50.21c-3.038 .177-5.463 2.602-5.64 5.64C32.44 86 41.72 110.2 59 120.69c5.72 3.493 12.297 5.332 19 5.31 6.577-.079 13.05-1.652 18.93-4.6L111.51 136l-10 10h-45.51c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h11.18l13.57 61c1.378 6.441 7.084 11.032 13.67 11h67.17c6.583 .027 12.283-4.563 13.66-11l13.57-61h11.18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-81.52l5.76-5.76ZM147.24 65.54c11-18.22 37.24-28.33 70.72-27.5 .83 33.47-9.28 59.68-27.5 70.72-12.3 7.44-27.09 6.92-41.79-1.43C140.31 92.63 139.79 77.84 147.24 65.54ZM93.58 109.54c-10 5.56-20 5.87-28.34 .84C52.78 102.87 45.75 85 46 62c23-.29 40.88 6.78 48.42 19.24 5.03 8.3 4.72 18.32-.84 28.34ZM176.52 158l-13 58.43c-.202 .916-1.012 1.568-1.95 1.57h-67.15c-.956 .022-1.795-.636-2-1.57L79.48 158Z"),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
