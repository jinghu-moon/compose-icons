package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileTsx: ImageVector
    get() {
        if (_fileTsx != null) return _fileTsx!!
        _fileTsx = phosphorFillIcon(
            name = "FileTsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM214.51 156.65 197.83 180l16.68 23.35c2.332 3.588 1.427 8.376-2.053 10.866-3.48 2.49-8.304 1.8-10.947-1.566L188 193.76l-13.49 18.89c-1.604 2.468-4.434 3.856-7.367 3.613-2.933-.243-5.497-2.076-6.673-4.774-1.177-2.698-.777-5.824 1.04-8.139L178.17 180 161.49 156.65c-1.289-1.802-1.773-4.057-1.337-6.229 .436-2.172 1.753-4.066 3.637-5.231 3.691-2.174 8.434-1.137 10.88 2.38L188 166.24l13.49-18.89c2.643-3.366 7.466-4.056 10.947-1.566 3.48 2.49 4.385 7.278 2.053 10.866ZM147.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C133.43 215 127 216 121.13 216c-5.108-.025-10.191-.697-15.13-2-2.786-.739-4.959-2.92-5.688-5.709-.729-2.789 .098-5.754 2.166-7.762 2.068-2.008 5.056-2.749 7.822-1.939 4.38 1.21 15 2.71 19.55-.35 .88-.6 1.83-1.52 2.14-3.93 .34-2.67-.72-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.12 .637-6.068 3.934-11.54 9-14.94 11.85-8 30.72-3.31 32.84-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.224 .825-1.97 2.194-2 3.67-.12 .9-.14 1.08 1.11 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.78 2.82 26.29 7.65 24.1 24.96ZM88 152.53c-.372 4.273-3.981 7.533-8.27 7.47h-11.73v47.72c.069 4.293-3.193 7.908-7.47 8.28-2.212 .147-4.386-.631-6.003-2.147C52.91 212.336 51.995 210.217 52 208v-48h-11.73c-4.289 .063-7.898-3.197-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C35.664 144.91 37.783 143.995 40 144h40c2.217-.005 4.336 .91 5.853 2.527 1.517 1.617 2.294 3.791 2.147 6.003Z"),
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
        return _fileTsx!!
    }

private var _fileTsx: ImageVector? = null
