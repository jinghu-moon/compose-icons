package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorBoldIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 128c0-22.09 7.16-40 16-40 8.84 0 16 17.91 16 40 0 22.09-7.16 40-16 40-8.84 0-16-17.91-16-40ZM244 224c0 6.627-5.373 12-12 12h-140C73.5 236 56.7 223.78 44.68 201.6 33.92 181.74 28 155.6 28 128 28 100.4 33.92 74.26 44.68 54.4 56.7 32.22 73.5 20 92 20h72c18.5 0 35.3 12.22 47.32 34.4C222.08 74.26 228 100.4 228 128c0 27.6-5.92 53.74-16.68 73.6-1.944 3.603-4.118 7.077-6.51 10.4h27.19c6.627 0 12 5.373 12 12ZM164 44c-18.92 0-40 34.5-40 84 0 49.5 21.08 84 40 84 18.92 0 40-34.5 40-84C204 78.5 182.92 44 164 44ZM54.33 155.59 73 142.24c4.17-2.976 9.77-2.976 13.94 0l14.66 10.46C100.521 144.511 99.987 136.26 100 128c0-3.61 .11-7.2 .31-10.75L80 102.75 52.09 122.68C52 124.44 52 126.21 52 128c-.022 9.247 .758 18.478 2.33 27.59ZM56.54 90 73 78.24c4.17-2.976 9.77-2.976 13.94 0l16.91 12.07c2.544-12.516 6.854-24.607 12.8-35.91 1.953-3.604 4.138-7.078 6.54-10.4h-31.19C78.44 44 63.77 61.73 56.54 90ZM92 212h31.19c-2.392-3.323-4.566-6.797-6.51-10.4-2.263-4.176-4.267-8.488-6-12.91L80 166.75 61.14 180.22C69 200.08 80.88 212 92 212Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
