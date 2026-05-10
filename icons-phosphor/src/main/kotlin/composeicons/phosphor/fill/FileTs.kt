package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileTs: ImageVector
    get() {
        if (_fileTs != null) return _fileTs!!
        _fileTs = phosphorFillIcon(
            name = "FileTs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h120c2.209 0 4 1.791 4 4v104c0 2.209 1.791 4 4 4h28c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM147.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C133.43 215 127 216 121.13 216c-5.107-.032-10.19-.704-15.13-2-2.786-.739-4.959-2.92-5.688-5.709-.729-2.789 .098-5.754 2.166-7.762 2.068-2.008 5.056-2.749 7.822-1.939 4.38 1.2 15 2.7 19.55-.36 .88-.59 1.83-1.52 2.14-3.93 .35-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .632-6.072 3.929-11.55 9-14.95 11.84-8 30.71-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.12 .9-.14 1.09 1.11 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.79 2.83 26.35 7.66 24.11 24.97ZM88 152.53c-.367 4.275-3.979 7.538-8.27 7.47h-11.73v47.73c.068 4.291-3.195 7.903-7.47 8.27-2.212 .147-4.386-.631-6.003-2.147C52.91 212.336 51.995 210.217 52 208v-48h-11.73c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C35.664 144.91 37.783 143.995 40 144h40c2.217-.005 4.336 .91 5.853 2.527 1.517 1.617 2.294 3.791 2.147 6.003Z"),
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
        return _fileTs!!
    }

private var _fileTs: ImageVector? = null
