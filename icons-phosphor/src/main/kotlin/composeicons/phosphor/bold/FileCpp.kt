package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCpp: ImageVector
    get() {
        if (_fileCpp != null) return _fileCpp!!
        _fileCpp = phosphorBoldIcon(
            name = "FileCpp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 180c0 8.67 5.5 16 12 16 2.811-.087 5.462-1.328 7.33-3.43 4.584-4.788 12.182-4.954 16.97-.37 4.788 4.584 4.954 12.182 .37 16.97C78.289 216.023 69.364 219.941 60 220 40.15 220 24 202.06 24 180c0-22.06 16.15-40 36-40 9.364 .059 18.289 3.977 24.67 10.83 4.584 4.788 4.418 12.386-.37 16.97-4.788 4.584-12.386 4.418-16.97-.37C65.459 165.332 62.81 164.092 60 164c-6.5 0-12 7.33-12 16ZM36 108v-68C36 28.954 44.954 20 56 20h96c3.184-.003 6.238 1.26 8.49 3.51l56 56c2.25 2.252 3.512 5.306 3.51 8.49v20c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM160 57v23h23ZM148 168h-8v-8c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-8h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM220 168h-8v-8c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v8c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-8h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _fileCpp!!
    }

private var _fileCpp: ImageVector? = null
