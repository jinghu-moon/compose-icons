package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorLightIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 162h-56c-3.314 0-6 2.686-6 6v12c0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34v-12c0-3.314-2.686-6-6-6ZM98 180c0 12.15-9.85 22-22 22C63.85 202 54 192.15 54 180v-6h44ZM76 18C65.2 18 54.56 27.91 46 45.9c-13.66 28.82-18.29 71.53 0 93.9 1.141 1.394 2.848 2.202 4.65 2.2h50.53c1.802 .002 3.509-.806 4.65-2.2 18.32-22.37 13.69-65.08 0-93.9C97.41 27.91 86.77 18 76 18ZM98.23 130h-44.49C43.65 114.82 42.05 82.35 56.88 51 64.24 35.51 71.77 30 76 30c4.23 0 11.75 5.51 19.1 21 14.82 31.35 13.22 63.82 3.13 79ZM208 186h-56c-3.314 0-6 2.686-6 6v12c0 18.778 15.222 34 34 34 18.778 0 34-15.222 34-34v-12c0-3.314-2.686-6-6-6ZM202 204c0 12.15-9.85 22-22 22-12.15 0-22-9.85-22-22v-6h44ZM154.73 166h50.53c1.802 .002 3.509-.806 4.65-2.2 18.32-22.37 13.69-65.08 0-93.9C201.44 51.91 190.8 42 180 42c-10.8 0-21.43 9.91-30 27.9-13.66 28.82-18.29 71.53 0 93.9 1.163 1.422 2.913 2.232 4.75 2.2ZM160.9 75C168.25 59.47 175.78 54 180 54c4.22 0 11.74 5.51 19.1 21 14.83 31.31 13.23 63.78 3.14 79h-44.47c-10.09-15.18-11.69-47.65 3.15-79Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
