package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePng: ImageVector
    get() {
        if (_filePng != null) return _filePng!!
        _filePng = phosphorFillIcon(
            name = "FilePng",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM60 144h-16c-4.418 0-8 3.582-8 8v55.72c-.074 4.294 3.191 7.913 7.47 8.28 2.212 .147 4.386-.631 6.003-2.147C51.09 212.336 52.005 210.217 52 208v-8h7.4c15.24 0 28.14-11.92 28.59-27.15 .23-7.57-2.617-14.911-7.891-20.347C74.825 147.067 67.574 143.999 60 144ZM59.65 184h-7.65v-24h8c3.394-.016 6.636 1.406 8.923 3.914 2.287 2.508 3.405 5.867 3.077 9.246-.723 6.248-6.061 10.933-12.35 10.84ZM224 200.87c-.001 2.08-.811 4.078-2.26 5.57-5.628 6.035-13.489 9.491-21.74 9.56-17.64 0-32-16.15-32-36 0-19.85 14.36-36 32-36 5.722 .017 11.315 1.707 16.09 4.86 3.596 2.241 4.895 6.851 3 10.64-1.064 2.006-2.93 3.466-5.133 4.016-2.203 .549-4.536 .137-6.417-1.135C205.329 160.835 202.697 160.005 200 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 2.888-.032 5.691-.985 8-2.72v-5.28c-2.217 .005-4.336-.91-5.853-2.527-1.516-1.617-2.294-3.791-2.147-6.003 .367-4.268 3.967-7.528 8.25-7.47h7.75c4.418 0 8 3.582 8 8ZM156 152v55.76c.042 2.982-1.535 5.753-4.12 7.24-3.557 1.972-8.028 .96-10.39-2.35L116 177v30.76c.063 4.287-3.198 7.893-7.47 8.26-2.212 .147-4.386-.631-6.003-2.147-1.617-1.516-2.532-3.636-2.527-5.853v-55.71c-.055-3.167 1.704-6.088 4.53-7.52 3.512-1.699 7.737-.617 10 2.56L140 183v-30.73c-.058-4.283 3.202-7.883 7.47-8.25 2.208-.147 4.379 .628 5.995 2.14 1.616 1.512 2.534 3.626 2.535 5.84Z"),
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
        return _filePng!!
    }

private var _filePng: ImageVector? = null
