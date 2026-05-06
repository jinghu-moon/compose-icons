package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorLightIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 100c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM132 122c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM214 96c0 47.496-38.504 86-86 86C80.504 182 42 143.496 42 96 42 48.504 80.504 10 128 10c47.474 .055 85.945 38.526 86 86ZM202 96C202 55.131 168.869 22 128 22 87.131 22 54 55.131 54 96c0 40.869 33.131 74 74 74 40.849-.05 73.95-33.151 74-74ZM165.86 194.4C152.48 199.51 140.09 202 128 202c-12.09 0-24.48-2.49-37.86-7.6-2.023-.87-4.36-.561-6.089 .804-1.728 1.365-2.57 3.567-2.192 5.737 .377 2.17 1.913 3.958 4.001 4.659 11.56 4.556 23.746 7.325 36.14 8.21v34.19c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34.19c12.394-.885 24.58-3.654 36.14-8.21 2.957-1.271 4.384-4.648 3.235-7.654-1.149-3.006-4.465-4.571-7.515-3.546Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
