package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) return _shootingStar!!
        _shootingStar = phosphorBoldIcon(
            name = "ShootingStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.16 68.85c-2.175-6.73-8.207-11.473-15.26-12L193.38 54.13 180.12 22.66C177.369 16.197 171.024 12.003 164 12.003c-7.024 0-13.369 4.195-16.12 10.657L134.62 54.09l-34.51 2.72c-7.041 .527-13.065 5.26-15.243 11.977-2.178 6.717-.079 14.084 5.313 18.643l26.17 22.1-8 33c-1.631 6.842 1.004 13.995 6.683 18.145 5.679 4.15 13.294 4.487 19.317 .855L164 143.66l29.59 17.81c6.024 3.632 13.638 3.295 19.317-.855 5.679-4.15 8.313-11.303 6.683-18.145l-8-33L237.76 87.37c5.394-4.504 7.528-11.823 5.4-18.52ZM190.5 96c-3.475 2.934-4.993 7.58-3.92 12l6 24.91L170.17 119.41c-3.812-2.28-8.568-2.28-12.38 0l-22.41 13.5 6-24.91c1.071-4.422-.451-9.068-3.93-12L118 79.48l25.83-2c4.469-.354 8.368-3.169 10.11-7.3L164 46.2l10.11 23.94c1.742 4.131 5.641 6.946 10.11 7.3l25.82 2ZM32.5 184.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L67.26 115.77c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM96.09 175.95c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5L48.5 240.55c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L79.1 175.96c2.246-2.259 5.297-3.532 8.482-3.539 3.185-.008 6.242 1.251 8.498 3.499ZM158.53 185.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-38 38c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l38-38c2.247-2.26 5.301-3.534 8.489-3.539 3.187-.006 6.246 1.257 8.501 3.509Z"),
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
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
