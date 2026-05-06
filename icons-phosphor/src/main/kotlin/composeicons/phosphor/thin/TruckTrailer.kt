package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TruckTrailer: ImageVector
    get() {
        if (_truckTrailer != null) return _truckTrailer!!
        _truckTrailer = phosphorThinIcon(
            name = "TruckTrailer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 100.22v-4.22C219.967 67.295 196.705 44.033 168 44h-8c-6.627 0-12 5.373-12 12v124h-24v-108c0-2.209-1.791-4-4-4h-104C9.373 68 4 73.373 4 80v104c.005 12.58 8.4 23.611 20.523 26.971C36.645 214.33 49.52 209.193 56 198.41c6.098 10.147 17.919 15.362 29.525 13.026C97.131 209.099 106.013 199.716 107.71 188h88.58c2.107 14.526 15.075 24.96 29.715 23.909C240.646 210.857 251.99 198.678 252 184v-48c-.026-18.325-13.791-33.717-32-35.78ZM12 80c0-2.209 1.791-4 4-4h100v104h-8.29C106.013 168.284 97.131 158.901 85.525 156.564 73.919 154.228 62.098 159.443 56 169.59 51.532 162.161 43.876 157.221 35.266 156.211 26.657 155.202 18.065 158.237 12 164.43ZM32 204C20.954 204 12 195.046 12 184c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM80 204C68.954 204 60 195.046 60 184c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM224 204c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM224 156c-13.918 .001-25.722 10.225-27.71 24h-40.29v-124c0-2.209 1.791-4 4-4h8c24.289 .028 43.972 19.711 44 44v8c0 2.209 1.791 4 4 4 15.464 0 28 12.536 28 28v28.43c-5.256-5.394-12.469-8.435-20-8.43Z"),
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
        return _truckTrailer!!
    }

private var _truckTrailer: ImageVector? = null
