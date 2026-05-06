package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorLightIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 112C237.967 82.19 213.81 58.033 184 58c-2.179 .003-4.357 .137-6.52 .4C168.896 38.711 149.459 25.981 127.98 25.981c-21.479 0-40.916 12.73-49.5 32.419C76.33 58.138 74.166 58.005 72 58 46.524 58.016 24.525 75.835 19.219 100.752c-5.307 24.917 7.523 50.153 30.781 60.548v46.7c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-46.7c19.447-8.695 31.976-27.998 32-49.3ZM194 208c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-42.94c3.297 .623 6.645 .938 10 .94h112c3.355-.002 6.703-.317 10-.94ZM184 154h-16.31l6.13-24.54c.806-3.214-1.146-6.474-4.36-7.28-3.214-.806-6.474 1.146-7.28 4.36L155.31 154h-21.31v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26h-21.31L93.82 126.54c-.806-3.214-4.066-5.166-7.28-4.36-3.214 .806-5.166 4.066-4.36 7.28L88.31 154h-16.31C48.804 154 30 135.196 30 112 30 88.804 48.804 70 72 70c1 0 2 0 2.92 .11C74.314 73.372 74.006 76.682 74 80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C86 56.804 104.804 38 128 38c23.196 0 42 18.804 42 42 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6-.006-3.318-.314-6.628-.92-9.89 1-.06 1.94-.11 2.92-.11 23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42Z"),
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
