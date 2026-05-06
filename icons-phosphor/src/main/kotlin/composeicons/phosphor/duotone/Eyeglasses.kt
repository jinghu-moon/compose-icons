package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorDuotoneIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 164c0 19.882-16.118 36-36 36C48.118 200 32 183.882 32 164c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36ZM188 128c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 8.837 0 16 7.163 16 16v58.08c-11.458-9.45-26.91-12.481-41.089-8.061-14.179 4.42-25.172 15.695-29.231 29.981h-35.36C106.261 137.713 95.268 126.439 81.089 122.019 66.91 117.599 51.458 120.63 40 130.08v-58.08C40 63.163 47.163 56 56 56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C38.327 40 24 54.327 24 72v92c.045 23.49 18.532 42.802 41.998 43.871 23.465 1.069 43.632-16.482 45.812-39.871h32.38c2.18 23.388 22.347 40.94 45.812 39.871C213.468 206.802 231.955 187.49 232 164v-92C232 54.327 217.673 40 200 40ZM68 192C52.536 192 40 179.464 40 164c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM188 192c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
