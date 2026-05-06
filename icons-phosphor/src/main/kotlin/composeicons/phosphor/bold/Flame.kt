package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorBoldIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176.69 48.72C164.003 35.356 149.723 23.602 134.17 13.72c-3.798-2.277-8.542-2.277-12.34 0C106.277 23.602 91.997 35.356 79.31 48.72 51 78.47 36 111.42 36 144c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92C220 111.42 205 78.47 176.69 48.72ZM100 184c0-13.33 5.53-26.26 16.45-38.45 3.535-3.932 7.399-7.555 11.55-10.83 4.151 3.275 8.015 6.898 11.55 10.83C150.47 157.74 156 170.67 156 184c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM179.84 187.94c.09-1.3 .16-2.61 .16-3.94 0-46.26-44-73.17-45.83-74.29-3.798-2.277-8.542-2.277-12.34 0C120 110.83 76 137.74 76 184c0 1.33 .07 2.64 .16 3.94C65.718 175.682 59.988 160.103 60 144 60 117.48 72.21 91.14 96.28 65.7 105.931 55.578 116.556 46.43 128 38.39 145.82 50.86 196 90.71 196 144c.012 16.103-5.718 31.682-16.16 43.94Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
