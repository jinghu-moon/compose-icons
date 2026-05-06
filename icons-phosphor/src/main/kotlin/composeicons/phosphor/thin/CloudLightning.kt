package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorThinIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 20C124.918 20.002 97.327 39.899 87.51 69.39 69.516 64.963 50.581 71.289 38.862 85.642 27.142 99.996 24.731 119.813 32.668 136.558 40.604 153.303 57.47 163.984 76 164h44.94l-20.37 33.94c-.742 1.236-.762 2.776-.052 4.03 .71 1.255 2.041 2.03 3.482 2.03h32.94l-20.37 33.94c-1.138 1.894-.524 4.352 1.37 5.49 1.894 1.138 4.352 .524 5.49-1.37l24-40c.742-1.236 .762-2.776 .052-4.03-.71-1.255-2.041-2.03-3.482-2.03h-32.94l19.2-32h25.74c39.764 0 72-32.236 72-72C228 52.235 195.764 20 156 20ZM156 156h-80C60.577 155.988 46.535 147.11 39.91 133.183 33.284 119.255 35.256 102.76 44.978 90.787 54.7 78.813 70.439 73.496 85.43 77.12 84.687 80.629 84.209 84.189 84 87.77c-.127 2.209 1.561 4.103 3.77 4.23 2.209 .127 4.103-1.561 4.23-3.77C94.021 53.398 123.546 26.588 158.411 27.927c34.865 1.339 62.247 30.334 61.59 65.218C219.344 128.03 190.891 155.974 156 156Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
