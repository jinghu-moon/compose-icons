package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileRs: ImageVector
    get() {
        if (_fileRs != null) return _fileRs!!
        _fileRs = phosphorBoldIcon(
            name = "FileRs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.51l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v108h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12c11.046 0 20-8.954 20-20v-128c.003-3.184-1.26-6.238-3.51-8.49ZM160 57l23 23h-23ZM64 140h-16c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h4c1.22-.004 2.438-.074 3.65-.21l6 10.26c3.489 5.355 10.562 7.036 16.087 3.823 5.525-3.213 7.562-10.192 4.633-15.873l-5.64-9.66c7.874-9.563 9.521-22.811 4.229-34.01C87.667 147.13 76.387 139.99 64 140ZM60 164h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-4ZM163.78 196.82c-.769 7.353-4.786 13.978-10.95 18.06-6 4-13.27 5.15-19.73 5.15-5.483-.036-10.938-.778-16.23-2.21-6.384-1.784-10.114-8.406-8.33-14.79 1.784-6.384 8.406-10.114 14.79-8.33 6.81 1.86 15 1.61 16.39 .06 .105-.225 .176-.464 .21-.71-1.94-1.23-6.83-2.64-9.88-3.52-5.39-1.56-11-3.18-15.75-6.27-7.62-4.92-11.21-12.45-10.11-21.2 .756-7.209 4.672-13.71 10.69-17.75 6.06-4.09 14.17-5.83 24.1-5.18 4.054 .266 8.077 .892 12.02 1.87 6.334 1.748 10.084 8.264 8.414 14.618-1.67 6.354-8.14 10.184-14.514 8.592-6.36-1.63-13.62-1.51-16.07-.33 2.59 1.001 5.23 1.865 7.91 2.59 5.48 1.58 11.68 3.37 16.8 6.82 7.79 5.26 11.46 13.26 10.24 22.53Z"),
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
        return _fileRs!!
    }

private var _fileRs: ImageVector? = null
