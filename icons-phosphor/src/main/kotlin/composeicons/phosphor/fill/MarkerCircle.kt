package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorFillIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM168 206.37c-25.121 12.84-54.879 12.84-80 0v-30.37h80ZM104 160v-16h48v16ZM184 195.83v-19.83c0-8.837-7.163-16-16-16v-16c-.01-7.906-5.793-14.619-13.61-15.8L143.66 76.74C142.107 69.329 135.572 64.021 128 64.021c-7.572 0-14.107 5.308-15.66 12.719l-10.73 51.46C93.793 129.381 88.01 136.094 88 144v16c-8.837 0-16 7.163-16 16v19.83C43.358 172.202 32.629 133.139 45.182 98.196 57.735 63.252 90.87 39.948 128 39.948c37.13 0 70.265 23.305 82.818 58.248 12.553 34.943 1.824 74.006-26.818 97.634Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
