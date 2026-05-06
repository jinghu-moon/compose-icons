package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorFillIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 72v92c-.045 23.49-18.532 42.802-41.998 43.871C166.537 208.94 146.37 191.388 144.19 168h-32.38c-2.18 23.388-22.347 40.94-45.812 39.871C42.532 206.802 24.045 187.49 24 164v-92C24 54.327 38.327 40 56 40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C47.163 56 40 63.163 40 72v58.08c11.458-9.45 26.91-12.481 41.089-8.061 14.179 4.42 25.172 15.695 29.231 29.981h35.36c4.059-14.287 15.052-25.561 29.231-29.981 14.179-4.42 29.631-1.388 41.089 8.061v-58.08c0-8.837-7.163-16-16-16-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 17.673 0 32 14.327 32 32Z"),
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
