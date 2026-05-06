package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorThinIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.45 63.86C203.65 45.89 190.35 36 176 36c-14.35 0-27.65 9.89-37.45 27.86C133.78 72.83 130.232 82.399 128 92.31 125.768 82.399 122.22 72.83 117.45 63.86 107.65 45.89 94.35 36 80 36 65.65 36 52.35 45.89 42.55 63.86 33.17 81.06 28 103.84 28 128c0 24.16 5.17 46.94 14.55 64.14C52.35 210.11 65.65 220 80 220c14.35 0 27.65-9.89 37.45-27.86 4.77-8.97 8.318-18.539 10.55-28.45 2.232 9.911 5.78 19.48 10.55 28.45 9.8 18 23.1 27.86 37.45 27.86 14.35 0 27.65-9.89 37.45-27.86C222.83 174.94 228 152.14 228 128c0-24.14-5.17-46.94-14.55-64.14ZM110.45 188.31C102.1 203.59 91.29 212 80 212 68.71 212 57.9 203.59 49.57 188.31c-6-11-10.17-24.59-12.18-39.42 11.23 10.023 28.374 9.374 38.814-1.469 10.44-10.843 10.44-27.999 0-38.842C65.764 97.736 48.62 97.087 37.39 107.11c2-14.83 6.17-28.39 12.18-39.42C57.9 52.41 68.71 44 80 44c11.29 0 22.1 8.41 30.43 23.69C119.18 83.73 124 105.15 124 128c0 22.85-4.82 44.27-13.57 60.31ZM36 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C44.954 148 36 139.046 36 128ZM206.43 188.31C198.1 203.59 187.29 212 176 212c-11.29 0-22.1-8.41-30.43-23.69-6-11-10.17-24.59-12.18-39.42 11.23 10.023 28.374 9.374 38.814-1.469 10.44-10.843 10.44-27.999 0-38.842C161.764 97.736 144.62 97.087 133.39 107.11c2-14.83 6.17-28.39 12.18-39.42C153.9 52.41 164.71 44 176 44c11.29 0 22.1 8.41 30.43 23.69C215.18 83.73 220 105.15 220 128c0 22.85-4.82 44.27-13.57 60.31ZM132 128c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20Z"),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
