package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorDuotoneIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 160 96 136v88L72 200h-24v-40ZM152 32v56h56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M99.06 128.61c-2.989-1.24-6.431-.557-8.72 1.73L68.69 152h-20.69c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h20.69l21.65 21.66c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-88c-.001-3.236-1.95-6.152-4.94-7.39ZM88 204.69 77.66 194.34C76.158 192.84 74.122 191.998 72 192h-16v-24h16c2.122 .002 4.158-.84 5.66-2.34L88 155.31ZM152 180c-.017 14.357-7.623 27.634-20 34.91-3.781 1.882-8.373 .502-10.489-3.154-2.116-3.655-1.026-8.325 2.489-10.666 7.462-4.405 12.041-12.425 12.041-21.09 0-8.665-4.579-16.685-12.041-21.09-3.515-2.341-4.605-7.011-2.489-10.666 2.116-3.655 6.709-5.036 10.489-3.154 12.377 7.276 19.983 20.553 20 34.91ZM213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v80c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-80h88v48c0 4.418 3.582 8 8 8h48v120h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM160 51.31 188.69 80h-28.69Z"),
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
