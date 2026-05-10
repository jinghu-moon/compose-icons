package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorFillIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 48v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 56c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM160 56c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM254.4 91.2c-2.651-3.535-7.665-4.251-11.2-1.6L224 104v-24c0-4.418-3.582-8-8-8h-176c-4.418 0-8 3.582-8 8v24L12.8 89.6C9.265 86.949 4.251 87.665 1.6 91.2c-2.651 3.535-1.935 8.549 1.6 11.2L32 124v60c0 17.673 14.327 32 32 32h128c17.673 0 32-14.327 32-32v-60l28.8-21.6c3.535-2.651 4.251-7.665 1.6-11.2Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
