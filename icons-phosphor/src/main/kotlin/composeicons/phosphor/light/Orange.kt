package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorLightIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161.15 72.65C183.536 62.693 197.972 40.501 198 16c0-3.314-2.686-6-6-6h-8c-23.934 .025-45.722 13.806-56 35.42C117.722 23.806 95.934 10.025 72 10h-8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8c25.38 .032 46.72 19.051 49.66 44.26C78.207 69.501 44.055 104.745 42.182 148.278c-1.873 43.533 29.127 81.58 72.141 88.54 43.014 6.96 84.431-19.369 96.383-61.271C222.658 133.645 201.363 89.429 161.15 72.65ZM184 22h1.64C182.575 47.096 161.282 65.969 136 66h-1.64C137.425 40.904 158.718 22.031 184 22ZM128 226C87.131 226 54 192.869 54 152 54 111.131 87.131 78 128 78c40.869 0 74 33.131 74 74-.05 40.849-33.151 73.95-74 74ZM181.92 161c-4.071 22.912-22.008 40.849-44.92 44.92-.331 .051-.665 .078-1 .08-3.128 .012-5.741-2.381-6.003-5.498-.262-3.117 1.916-5.913 5.003-6.422 17.898-3.169 31.911-17.182 35.08-35.08 .552-3.27 3.65-5.472 6.92-4.92 3.27 .552 5.472 3.65 4.92 6.92Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
