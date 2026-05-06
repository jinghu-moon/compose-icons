package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorFillIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 144h-16c-4.418 0-8 3.582-8 8v55.73c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-8h7.4c15.24 0 28.14-11.92 28.59-27.15 .224-7.567-2.625-14.903-7.898-20.334C198.818 147.064 191.57 143.999 184 144ZM183.65 184h-7.65v-24h8c3.394-.016 6.636 1.406 8.923 3.914 2.287 2.508 3.405 5.867 3.077 9.246-.723 6.248-6.061 10.933-12.35 10.84ZM136 152v55.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-55.71c-.058-4.283 3.202-7.883 7.47-8.25 2.208-.147 4.379 .628 5.995 2.14 1.616 1.512 2.534 3.626 2.535 5.84ZM96 208.53c-.367 4.275-3.979 7.538-8.27 7.47h-31.5c-2.257 .021-4.425-.883-6-2.5C47.776 210.944 47.296 207.079 49.05 204L74.21 160h-17.94c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C51.664 144.91 53.783 143.995 56 144h31.77c2.257-.021 4.425 .883 6 2.5 2.47 2.544 2.971 6.411 1.23 9.5L69.79 200h18.21c2.217-.005 4.336 .91 5.853 2.527 1.517 1.617 2.294 3.791 2.147 6.003ZM213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
