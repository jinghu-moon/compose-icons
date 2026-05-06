package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorDuotoneIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 64v13.33c0 1.731-.561 3.415-1.6 4.8l-20.8 27.74c-1.039 1.385-1.6 3.069-1.6 4.8v109.33c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8v-109.33c0-1.731-.561-3.415-1.6-4.8L65.6 82.13C64.561 80.745 64 79.061 64 77.33v-13.33Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M184 16h-112C63.163 16 56 23.163 56 32v45.33c.009 3.461 1.131 6.826 3.2 9.6L80 114.67v109.33c0 8.837 7.163 16 16 16h64c8.837 0 16-7.163 16-16v-109.33L196.8 86.93c2.069-2.774 3.191-6.139 3.2-9.6v-45.33c0-8.837-7.163-16-16-16ZM72 32h112v24h-112v-24ZM163.2 105.07c-2.069 2.774-3.191 6.139-3.2 9.6v109.33h-64v-109.33c-.009-3.461-1.131-6.826-3.2-9.6L72 77.33v-5.33h112v5.33ZM136 120v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
