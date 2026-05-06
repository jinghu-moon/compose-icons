package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorBoldIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 54.34v-22.34c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v22.34C171.924 59.243 164.018 70.967 164 84v26.75L140 97v-25c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v25L92 110.75v-26.75C91.982 70.967 84.076 59.243 72 54.34v-22.34C72 25.373 66.627 20 60 20 53.373 20 48 25.373 48 32v22.34C35.924 59.243 28.018 70.967 28 84v132c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-132C227.982 70.967 220.076 59.243 208 54.34ZM128 160c-6.627 0-12 5.373-12 12v32h-24v-65.61l36-20.57 36 20.57v65.61h-24v-32c0-6.627-5.373-12-12-12ZM52 84c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h-16ZM188 84c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h-16ZM52 124h16v80h-16ZM188 204v-80h16v80Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
