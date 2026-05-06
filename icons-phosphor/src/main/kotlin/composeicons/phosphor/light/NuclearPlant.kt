package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorLightIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 34h24c5.523 0 10-4.477 10-10 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 12.15-9.85 22-22 22h-24c-5.523 0-10 4.477-10 10 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-12.15 9.85-22 22-22ZM104 62c3.314 0 6-2.686 6-6 0-23.196 18.804-42 42-42h8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-8C122.19 2.033 98.033 26.19 98 56c0 3.314 2.686 6 6 6ZM246 216c0 3.314-2.686 6-6 6h-224c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h18C48 182 64.2 140.32 65.88 95.41 66.155 87.903 72.338 81.968 79.85 82h88.33c7.492-.008 13.663 5.885 14 13.37C184.32 144.45 206.92 190 218.28 210h21.72c3.314 0 6 2.686 6 6ZM168.18 94h-18.18c.06 .46 .1 .94 .12 1.41C151.82 140.32 168 182 182 210h22.55C192.11 186.9 172.23 143.1 170.15 95.89c-.058-1.05-.919-1.876-1.97-1.89ZM47.34 210h121.32C154.8 181.06 139.8 140.08 138.15 95.86c-.074-1.05-.948-1.863-2-1.86h-56.3c-1.052-.003-1.926 .81-2 1.86C76.2 140.08 61.2 181.06 47.34 210Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
