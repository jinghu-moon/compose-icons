package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileSql: ImageVector
    get() {
        if (_fileSql != null) return _fileSql!!
        _fileSql = phosphorFillIcon(
            name = "FileSql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM228 208.53c-.371 4.265-3.969 7.523-8.25 7.47h-27.75c-4.418 0-8-3.582-8-8v-55.73c-.053-4.281 3.205-7.879 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v48h20c2.213-.005 4.329 .908 5.845 2.52 1.516 1.612 2.296 3.781 2.155 5.99ZM91.82 196.31c-.631 6.196-4.003 11.783-9.19 15.23C77.44 215 71 216 65.14 216 60.029 215.973 54.942 215.301 50 214c-4.202-1.231-6.634-5.61-5.457-9.828 1.177-4.217 5.525-6.705 9.757-5.582 4.38 1.2 14.95 2.7 19.55-.36 .89-.59 1.83-1.52 2.14-3.93 .35-2.67-.71-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.11 .63-6.073 3.928-11.551 9-14.95 11.84-8 30.72-3.31 32.83-2.76 4.275 1.127 6.827 5.505 5.7 9.78-1.127 4.275-5.505 6.827-9.78 5.7-4.49-1.17-15.22-2.56-19.82 .56-1.224 .825-1.97 2.194-2 3.67-.12 .9-.14 1.08 1.12 1.9 2.31 1.49 6.44 2.68 10.45 3.84 9.79 2.83 26.35 7.66 24.11 24.97ZM162.82 199.54c3.412-5.946 5.198-12.685 5.18-19.54 0-19.85-14.35-36-32-36-17.65 0-32 16.15-32 36 0 19.85 14.35 36 32 36 5.651-.02 11.175-1.681 15.9-4.78l2.44 2.44c1.572 1.571 3.727 2.418 5.949 2.336 2.221-.082 4.309-1.084 5.761-2.766 2.722-3.289 2.456-8.119-.61-11.09ZM136 200c-8.82 0-16-9-16-20 0-11 7.18-20 16-20 8.82 0 16 9 16 20 .001 2.55-.397 5.084-1.18 7.51l-.93-.93c-3.068-3.161-8.082-3.342-11.37-.41-1.579 1.482-2.489 3.541-2.523 5.707-.034 2.165 .812 4.252 2.343 5.783l1.68 1.67c-1.296 .434-2.653 .661-4.02 .67Z"),
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
        return _fileSql!!
    }

private var _fileSql: ImageVector? = null
