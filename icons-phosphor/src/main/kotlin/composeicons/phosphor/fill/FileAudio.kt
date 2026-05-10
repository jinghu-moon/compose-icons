package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorFillIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 180c-.017 14.357-7.623 27.634-20 34.91-3.781 1.882-8.373 .502-10.489-3.154-2.116-3.655-1.026-8.325 2.489-10.666 7.462-4.405 12.041-12.425 12.041-21.09 0-8.665-4.579-16.685-12.041-21.09-3.515-2.341-4.605-7.011-2.489-10.666 2.116-3.655 6.709-5.036 10.489-3.154 12.377 7.276 19.983 20.553 20 34.91ZM99.06 128.61c-2.989-1.24-6.431-.557-8.72 1.73L68.69 152h-20.69c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h20.69l21.65 21.66c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-88c-.001-3.236-1.95-6.152-4.94-7.39ZM216 88v128c0 8.837-7.163 16-16 16h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-120h-48c-4.418 0-8-3.582-8-8v-48h-88v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM160 80h28.69L160 51.31Z"),
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
