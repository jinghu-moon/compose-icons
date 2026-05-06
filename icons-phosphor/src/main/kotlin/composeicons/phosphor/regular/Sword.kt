package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorRegularIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 32h-64c-2.483-0-4.825 1.152-6.34 3.12l-64 83.21L72 108.69c-3.001-3.004-7.073-4.693-11.32-4.693-4.247 0-8.319 1.688-11.32 4.693L36.67 121.39c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l20 20-28 28c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l12.69 12.68c6.248 6.243 16.372 6.243 22.62 0l28-28 20 20c3.001 3.004 7.073 4.693 11.32 4.693 4.247 0 8.319-1.688 11.32-4.693l12.69-12.7c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315l-9.64-9.64 83.21-64c1.973-1.519 3.126-3.87 3.12-6.36v-64c0-4.418-3.582-8-8-8ZM52.69 216 40 203.32l28-28L80.68 188ZM123.3 208 48 132.71 60.7 120 136 195.31ZM208 100.06l-81.74 62.88L115.32 152l50.34-50.34c3.123-3.126 3.121-8.192-.005-11.315-3.126-3.123-8.192-3.121-11.315 .005L104 140.68 93.07 129.74 155.94 48h52.06Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
