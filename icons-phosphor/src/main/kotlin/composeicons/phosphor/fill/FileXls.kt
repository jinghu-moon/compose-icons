package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileXls: ImageVector
    get() {
        if (_fileXls != null) return _fileXls!!
        _fileXls = phosphorFillIcon(
            name = "FileXls",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM156 208.53c-.371 4.265-3.969 7.523-8.25 7.47h-27.75c-4.418 0-8-3.582-8-8v-55.73c-.053-4.281 3.205-7.879 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v48h20c2.213-.005 4.329 .908 5.845 2.52 1.516 1.612 2.296 3.781 2.155 5.99ZM94.51 156.65 77.83 180l16.68 23.35c2.332 3.588 1.427 8.376-2.053 10.866-3.48 2.49-8.304 1.8-10.947-1.566L68 193.76 54.51 212.65c-1.604 2.468-4.434 3.856-7.367 3.613-2.933-.243-5.497-2.076-6.673-4.774-1.177-2.698-.777-5.824 1.04-8.139L58.17 180 41.49 156.65c-1.289-1.802-1.773-4.057-1.337-6.229 .436-2.172 1.753-4.066 3.637-5.231 3.691-2.174 8.434-1.137 10.88 2.38L68 166.24 81.49 147.35c2.643-3.366 7.466-4.056 10.947-1.566 3.48 2.49 4.385 7.278 2.053 10.866ZM215.79 196.31c-.628 6.194-3.996 11.782-9.18 15.23C201.42 215 194.94 216 189.12 216c-5.128-.022-10.232-.694-15.19-2-4.255-1.19-6.74-5.605-5.55-9.86 1.19-4.255 5.605-6.74 9.86-5.55 4.38 1.21 14.94 2.71 19.54-.35 .89-.6 1.84-1.52 2.15-3.93 .34-2.67-.72-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.12 .625-6.059 3.903-11.53 8.95-14.94 11.84-8 30.72-3.31 32.83-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.48-1.17-15.22-2.56-19.82 .56-1.224 .825-1.97 2.194-2 3.67-.11 .9-.13 1.08 1.12 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.87 2.82 26.39 7.65 24.18 24.96Z"),
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
        return _fileXls!!
    }

private var _fileXls: ImageVector? = null
