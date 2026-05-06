package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorThinIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128c.052 18.184-5.848 35.885-16.8 50.4-1.325 1.767-3.833 2.125-5.6 .8-1.767-1.325-2.125-3.833-.8-5.6 19.84-26.454 20.299-62.7 1.134-89.647C202.77 57.006 168.381 45.543 136.881 55.602 105.381 65.661 84 94.933 84 128c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4-.004-9.281 1.541-18.497 4.57-27.27C61.212 97.452 41.657 105.357 30.016 121.167c-11.642 15.81-13.386 36.829-4.51 54.342C34.382 193.022 52.366 204.042 72 204h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24C49.171 211.992 28.325 199.03 18.219 178.56 8.114 158.09 10.5 133.659 24.375 115.531 38.251 97.404 61.211 88.72 83.61 93.13 100.034 57.217 139.257 37.595 177.845 45.984 216.434 54.374 243.969 88.51 244 128ZM181.17 173.17 156 198.34v-70.34c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v70.34L122.83 173.17c-1.563-1.563-4.097-1.563-5.66 0-1.563 1.563-1.563 4.097 0 5.66l32 32c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173l32-32c1.563-1.563 1.563-4.097 0-5.66-1.563-1.563-4.097-1.563-5.66 0Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
