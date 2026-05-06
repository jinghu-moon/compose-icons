package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorLightIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 144c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C233.939 89.901 190.099 46.061 136 46 86.317 46.055 46.055 86.317 46 136c.055 45.265 36.735 81.945 82 82 40.849-.05 73.95-33.151 74-74C201.956 107.567 172.433 78.044 136 78c-32.017 .039-57.961 25.983-58 58 .033 27.601 22.399 49.967 50 50 23.196 0 42-18.804 42-42 0-18.778-15.222-34-34-34-14.359 0-26 11.641-26 26 0 9.941 8.059 18 18 18 5.523 0 10-4.477 10-10 0-1.105-.895-2-2-2-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 7.732 0 14 6.268 14 14 0 12.15-9.85 22-22 22C111.431 166 98 152.569 98 136c0-20.987 17.013-38 38-38 25.391 .033 45.967 20.609 46 46-.033 29.81-24.19 53.967-54 54C93.774 197.961 66.039 170.226 66 136 66.044 97.358 97.358 66.044 136 66c43.058 .05 77.95 34.942 78 78-.055 47.474-38.526 85.945-86 86C76.11 229.939 34.061 187.89 34 136 34.066 79.694 79.694 34.066 136 34c60.722 .072 109.928 49.278 110 110Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
