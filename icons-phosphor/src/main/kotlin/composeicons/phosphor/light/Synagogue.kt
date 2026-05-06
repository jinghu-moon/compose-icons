package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorLightIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 58.84v-26.84c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26.84C184.536 61.523 178.003 70.163 178 80v45.66L134 100.52v-28.52c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v28.52L78 125.66v-45.66C77.997 70.163 71.464 61.523 62 58.84v-26.84c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v26.84C40.536 61.523 34.003 70.163 34 80v136c0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6v-40c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10v40c0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6v-136c-.003-9.837-6.536-18.477-16-21.16ZM200 70c5.523 0 10 4.477 10 10v26h-20v-26c0-5.523 4.477-10 10-10ZM56 70c5.523 0 10 4.477 10 10v26h-20v-26C46 74.477 50.477 70 56 70ZM46 118h20v92h-20ZM128 154c-12.15 0-22 9.85-22 22v34h-28v-70.52l50-28.57 50 28.57v70.52h-28v-34c0-12.15-9.85-22-22-22ZM190 210v-92h20v92Z"),
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
