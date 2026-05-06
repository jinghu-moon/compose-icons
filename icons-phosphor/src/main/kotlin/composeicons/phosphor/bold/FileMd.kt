package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorBoldIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 152v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-17.93l-6.17 8.81c-2.246 3.207-5.915 5.117-9.83 5.117-3.915 0-7.584-1.91-9.83-5.117L44 190.07v17.93c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c.001-5.237 3.398-9.868 8.393-11.442 4.995-1.574 10.433 .272 13.437 4.562L60 171.07 78.17 145.12c3.004-4.29 8.442-6.137 13.437-4.562 4.995 1.574 8.392 6.205 8.393 11.442ZM184 180c0 22.091-17.909 40-40 40h-16c-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12h16c22.091 0 40 17.909 40 40ZM160 180c0-8.837-7.163-16-16-16h-4v32h4c8.837 0 16-7.163 16-16ZM220 88v136c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-120h-48c-6.627 0-12-5.373-12-12v-48h-76v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68C36 28.954 44.954 20 56 20h96c3.185 0 6.239 1.266 8.49 3.52l56 56c2.247 2.25 3.51 5.3 3.51 8.48ZM160 80h23L160 57Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
