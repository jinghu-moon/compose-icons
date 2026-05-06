package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorLightIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 18h-48C90.19 18.033 66.033 42.19 66 72v2h-10C39.431 74 26 87.431 26 104v29.19c-0 3.181 1.082 6.267 3.07 8.75 .146 .183 .303 .357 .47 .52l36.46 36v37.54c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-39.16l15.46-54.11c.359-1.252 .541-2.548 .54-3.85v-46.88C221.967 42.19 197.81 18.033 168 18ZM210 118.88c-.001 .186-.028 .371-.08 .55l-15.69 54.92c-.151 .537-.229 1.092-.23 1.65v40c0 1.105-.895 2-2 2h-112c-1.105 0-2-.895-2-2v-40c.001-1.604-.64-3.142-1.78-4.27L38.3 134.25c-.197-.318-.301-.686-.3-1.06v-29.19C38 94.059 46.059 86 56 86h10v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32C78 48.804 96.804 30 120 30h48c23.196 0 42 18.804 42 42ZM170.68 165.37 149.42 176l21.26 10.63c2.966 1.48 4.17 5.084 2.69 8.05-1.48 2.966-5.084 4.17-8.05 2.69L136 182.71l-29.32 14.66c-2.966 1.48-6.57 .276-8.05-2.69-1.48-2.966-.276-6.57 2.69-8.05L122.58 176 101.32 165.37c-2.966-1.48-4.17-5.084-2.69-8.05 1.48-2.966 5.084-4.17 8.05-2.69L136 169.29l29.32-14.66c2.966-1.48 6.57-.276 8.05 2.69 1.48 2.966 .276 6.57-2.69 8.05Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
