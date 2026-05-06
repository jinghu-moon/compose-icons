package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorThinIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 136.33c-4.542 52.885-49.563 93.038-102.622 91.522C72.32 226.337 29.663 183.68 28.148 130.622 26.632 77.563 66.785 32.542 119.67 28c2.209-.182 4.148 1.461 4.33 3.67 .182 2.209-1.461 4.148-3.67 4.33C71.668 40.176 34.721 81.601 36.115 130.421c1.394 48.821 40.643 88.07 89.464 89.464 48.821 1.394 90.245-35.553 94.421-84.215 .182-2.209 2.121-3.852 4.33-3.67 2.209 .182 3.852 2.121 3.67 4.33ZM128 132h56c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-52v-52c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4ZM160 44c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM196 68c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM220 104c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
