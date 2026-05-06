package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorFillIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h64c3.444 0 6.501-2.203 7.59-5.47l14.83-44.48L163 151.43c2.03-.82 3.64-2.43 4.46-4.46l14.62-36.55L226.56 95.59C229.815 94.491 232.005 91.436 232 88v-32c0-8.837-7.163-16-16-16ZM117 152.57c-2.186 .874-3.876 2.666-4.62 4.9L98.23 200h-58.23v-39.31L86.34 114.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l32.84 32.84ZM232 121.73v78.27c0 8.837-7.163 16-16 16h-78.27c-2.572 0-4.987-1.236-6.49-3.322-1.504-2.086-1.913-4.768-1.1-7.208l7.94-23.8c.742-2.231 2.428-4.024 4.61-4.9l35.77-14.31 14.31-35.77c.876-2.182 2.669-3.868 4.9-4.61l23.8-7.94c2.44-.813 5.122-.404 7.208 1.1 2.086 1.504 3.322 3.919 3.322 6.49Z"),
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
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
