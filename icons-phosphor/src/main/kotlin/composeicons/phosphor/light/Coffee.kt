package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coffee: ImageVector
    get() {
        if (_coffee != null) return _coffee!!
        _coffee = phosphorLightIcon(
            name = "Coffee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M82 56v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM120 62c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM152 62c3.314 0 6-2.686 6-6v-32c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v32c0 3.314 2.686 6 6 6ZM246 120v8c.008 20.58-16.368 37.426-36.94 38-5.888 17.376-16.704 32.664-31.13 44h30.07c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h30.07C39.351 192.157 26.059 164.888 26 136v-48c0-3.314 2.686-6 6-6h176c20.987 0 38 17.013 38 38ZM202 136v-42h-164v42c.065 31.579 18.2 60.335 46.67 74h70.66C183.8 196.335 201.935 167.579 202 136ZM234 120c-.004-12.045-8.28-22.51-20-25.29v41.29c-.002 5.92-.568 11.827-1.69 17.64C224.83 151.535 234 140.696 234 128Z"),
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
        return _coffee!!
    }

private var _coffee: ImageVector? = null
