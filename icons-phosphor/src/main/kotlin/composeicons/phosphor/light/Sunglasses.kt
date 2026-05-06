package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorLightIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 9.941 0 18 8.059 18 18v58h-180v-58C38 62.059 46.059 54 56 54c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6C39.431 42 26 55.431 26 72v92c0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42v-22h36v22c0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42v-92C230 55.431 216.569 42 200 42ZM38 164v-21.52L84.53 189c-9.208 6.08-21.009 6.614-30.729 1.392C44.081 185.17 38.013 175.034 38 164ZM98 164c-0 5.882-1.74 11.634-5 16.53L54.48 142h43.52ZM158 164v-21.52L204.53 189c-9.208 6.08-21.009 6.614-30.729 1.392C164.081 185.17 158.013 175.034 158 164ZM213 180.53 174.48 142h43.52v22c-0 5.882-1.74 11.634-5 16.53Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
