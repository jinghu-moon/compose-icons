package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCSharp: ImageVector
    get() {
        if (_fileCSharp != null) return _fileCSharp!!
        _fileCSharp = phosphorBoldIcon(
            name = "FileCSharp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.51l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v120c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-136c.003-3.184-1.26-6.238-3.51-8.49ZM160 57l23 23h-23ZM40 180c0 8.67 5.5 16 12 16 2.81-.092 5.459-1.332 7.33-3.43 4.584-4.788 12.182-4.954 16.97-.37 4.788 4.584 4.954 12.182 .37 16.97C70.289 216.023 61.364 219.941 52 220 32.15 220 16 202.06 16 180c0-22.06 16.15-40 36-40 9.364 .059 18.289 3.977 24.67 10.83 4.584 4.788 4.418 12.386-.37 16.97-4.788 4.584-12.386 4.418-16.97-.37C57.459 165.332 54.81 164.092 52 164c-6.5 0-12 7.33-12 16ZM172 172c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-12v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4v12h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h12v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-12ZM144 184h-12v-12h12Z"),
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
        return _fileCSharp!!
    }

private var _fileCSharp: ImageVector? = null
