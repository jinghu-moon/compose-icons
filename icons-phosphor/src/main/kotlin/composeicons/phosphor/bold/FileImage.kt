package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorBoldIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M114 145.34c-2.223-3.352-5.978-5.367-10-5.367-4.022 0-7.777 2.015-10 5.367L79 167.82 72.3 157.73c-2.246-3.364-6.036-5.369-10.081-5.335-4.045 .034-7.8 2.104-9.989 5.505L13.91 217.51c-2.374 3.692-2.543 8.385-.44 12.238 2.103 3.853 6.141 6.25 10.53 6.252h128c4.43 .007 8.502-2.428 10.595-6.332 2.092-3.904 1.864-8.644-.595-12.328ZM46 212 62.5 186.3l6.55 9.81c2.223 3.352 5.978 5.367 10 5.367 4.022 0 7.777-2.015 10-5.367l15-22.48L129.58 212ZM216.49 79.51l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v84c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-80h76v48c0 6.627 5.373 12 12 12h48v108c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4c11.046 0 20-8.954 20-20v-128c.003-3.184-1.26-6.238-3.51-8.49ZM160 57l23 23h-23Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
