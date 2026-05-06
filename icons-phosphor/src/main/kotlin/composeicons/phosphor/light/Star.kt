package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorLightIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.28 97.87C235.526 92.323 230.563 88.41 224.76 88L164.51 83.13 141.29 26.93C139.074 21.542 133.825 18.026 128 18.026c-5.825 0-11.074 3.517-13.29 8.904L91.49 83.11 31.24 88c-5.808 .413-10.773 4.335-12.52 9.89-1.82 5.536-.131 11.623 4.28 15.43l46 39.61L55 212.18c-1.343 5.671 .863 11.592 5.59 15 4.672 3.462 10.99 3.7 15.91 .6L128 196.12l51.58 31.71c4.92 3.1 11.238 2.861 15.91-.6 4.727-3.408 6.933-9.329 5.59-15l-14-59.25L233 113.32c4.419-3.811 6.109-9.908 4.28-15.45ZM225.14 104.24l-48.69 42c-1.693 1.461-2.433 3.743-1.92 5.92l14.88 62.79c.267 .972-.115 2.006-.95 2.57-.757 .585-1.801 .625-2.6 .1L131.14 184c-1.926-1.183-4.354-1.183-6.28 0L70.14 217.61c-.799 .525-1.844 .485-2.6-.1-.854-.55-1.257-1.587-1-2.57L81.42 152.15c.513-2.177-.227-4.459-1.92-5.92L30.81 104.23c-.783-.638-1.076-1.701-.73-2.65 .267-.935 1.099-1.598 2.07-1.65L96.07 94.77c2.246-.182 4.2-1.607 5.06-3.69L125.76 31.48c.351-.903 1.221-1.498 2.19-1.498 .969 0 1.839 .595 2.19 1.498l24.63 59.6c.86 2.082 2.814 3.508 5.06 3.69l63.92 5.16c.971 .052 1.803 .715 2.07 1.65 .362 .941 .089 2.008-.68 2.66Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
