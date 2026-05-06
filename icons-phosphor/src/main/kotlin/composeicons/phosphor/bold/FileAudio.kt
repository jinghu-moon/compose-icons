package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorBoldIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96.59 124.91c-4.485-1.859-9.647-.833-13.08 2.6L63 148h-19c-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12h19l20.48 20.48c3.428 3.456 8.604 4.499 13.103 2.64 4.499-1.859 7.429-6.252 7.417-11.12v-88c.001-4.855-2.924-9.233-7.41-11.09ZM80 195l-3.51-3.52C74.233 189.241 71.179 187.99 68 188h-12v-16h12c3.184 .003 6.238-1.26 8.49-3.51L80 165ZM160 180c-.011 15.77-8.359 30.36-21.95 38.36-3.714 2.42-8.459 2.595-12.341 .456-3.882-2.139-6.269-6.243-6.208-10.675 .061-4.432 2.56-8.469 6.5-10.501 6.228-3.694 10.046-10.399 10.046-17.64 0-7.241-3.818-13.946-10.046-17.64-3.803-2.111-6.165-6.115-6.175-10.464-.01-4.349 2.334-8.364 6.127-10.492 3.793-2.129 8.441-2.038 12.148 .236 13.571 8.013 21.899 22.6 21.9 38.36ZM216.49 79.51l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-68h76v48c0 6.627 5.373 12 12 12h48v108h-16c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20c11.046 0 20-8.954 20-20v-128c.003-3.184-1.26-6.238-3.51-8.49ZM160 57l23 23h-23Z"),
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
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
