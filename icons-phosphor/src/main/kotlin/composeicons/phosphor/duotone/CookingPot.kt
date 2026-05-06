package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorDuotoneIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 80v104c0 13.255-10.745 24-24 24h-128C50.745 208 40 197.255 40 184v-104Z"),
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
                pathData = parseSvgPathData("M88 48v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 56c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM160 56c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM252.8 102.4 224 124v60c0 17.673-14.327 32-32 32h-128C46.327 216 32 201.673 32 184v-60L3.2 102.4C-.335 99.749-1.051 94.735 1.6 91.2 4.251 87.665 9.265 86.949 12.8 89.6L32 104v-24c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8v24L243.2 89.6c3.535-2.651 8.549-1.935 11.2 1.6 2.651 3.535 1.935 8.549-1.6 11.2ZM208 88h-160v96c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16Z"),
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
