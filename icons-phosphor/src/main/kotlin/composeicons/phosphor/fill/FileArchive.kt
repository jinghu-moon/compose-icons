package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileArchive: ImageVector
    get() {
        if (_fileArchive != null) return _fileArchive!!
        _fileArchive = phosphorFillIcon(
            name = "FileArchive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h36c2.209 0 4-1.791 4-4v-20h-7.73c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C83.664 192.91 85.783 191.995 88 192h8v-16h-7.73c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C83.664 160.91 85.783 159.995 88 160h8v-16h-7.73c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C83.664 128.91 85.783 127.995 88 128h8v-7.73c-.053-4.281 3.205-7.879 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v8h7.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-8v16h7.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-8v16h7.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-8v20c0 2.209 1.791 4 4 4h84c8.837 0 16-7.163 16-16v-128.02c.018-2.114-.802-4.149-2.28-5.66ZM152 88v-44l44 44Z"),
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
        return _fileArchive!!
    }

private var _fileArchive: ImageVector? = null
