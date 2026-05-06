package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorRegularIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 112C239.967 81.086 214.914 56.033 184 56c-1.77 0-3.54 .1-5.29 .26C169.492 36.586 149.726 24.019 128 24.019c-21.726 0-41.492 12.567-50.71 32.241C75.54 56.1 73.77 56 72 56 45.817 56.006 23.133 74.155 17.381 99.699c-5.751 25.544 6.965 51.663 30.619 62.891v45.41c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-45.41c19.526-9.286 31.976-28.969 32-50.59ZM192 208h-128v-40.58c2.649 .386 5.323 .58 8 .58h112c2.677-0 5.351-.194 8-.58ZM184 152h-13.75l5.51-22.06c.986-4.252-1.618-8.509-5.853-9.568-4.234-1.059-8.536 1.472-9.667 5.688L153.75 152h-17.75v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24h-17.75L95.76 126.06c-.653-2.816-2.774-5.061-5.549-5.872-2.775-.811-5.771-.062-7.838 1.959-2.067 2.021-2.882 5-2.133 7.792L85.75 152h-13.75C49.909 152 32 134.091 32 112 32 89.909 49.909 72 72 72h.58c-.387 2.649-.581 5.323-.58 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C88 57.909 105.909 40 128 40c22.091 0 40 17.909 40 40 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .001-2.677-.193-5.351-.58-8h.58c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
