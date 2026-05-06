package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorBoldIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84 224c0 6.627-5.373 12-12 12h-16C44.954 236 36 227.046 36 216v-32c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v28h12c6.627 0 12 5.373 12 12ZM220 88v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32h-48c-6.627 0-12-5.373-12-12v-48h-16c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c3.184-.003 6.238 1.26 8.49 3.51l56 56c2.25 2.252 3.512 5.306 3.51 8.49ZM160 80h23L160 57ZM80 20h-24C44.954 20 36 28.954 36 40v24c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12C92 25.373 86.627 20 80 20ZM208 164c-6.627 0-12 5.373-12 12v36h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8c11.046 0 20-8.954 20-20v-40c0-6.627-5.373-12-12-12ZM48 156c6.627 0 12-5.373 12-12v-40C60 97.373 54.627 92 48 92c-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12ZM152 212h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
