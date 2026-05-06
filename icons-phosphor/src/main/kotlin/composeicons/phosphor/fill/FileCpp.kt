package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCpp: ImageVector
    get() {
        if (_fileCpp != null) return _fileCpp!!
        _fileCpp = phosphorFillIcon(
            name = "FileCpp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM48 180c0 11 7.18 20 16 20 3.831-.07 7.467-1.698 10.07-4.51 2.869-3.026 7.553-3.413 10.88-.9 1.77 1.396 2.869 3.473 3.027 5.721 .158 2.248-.64 4.459-2.197 6.089C80.15 212.46 72.272 215.933 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.078 .062 15.789 3.379 21.39 9.2 3.069 2.95 3.385 7.753 .73 11.08-1.463 1.738-3.595 2.772-5.865 2.844-2.27 .072-4.464-.823-6.035-2.464C71.6 161.766 67.903 160.08 64 160c-8.82 0-16 9-16 20ZM156 180.53c-.371 4.265-3.969 7.523-8.25 7.47h-11.75v11.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-11.98h-11.73c-4.281 .053-7.879-3.205-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h12v-11.73c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v12h12c2.21 .001 4.32 .916 5.832 2.528 1.511 1.612 2.289 3.777 2.148 5.982ZM224 180.53c-.371 4.265-3.969 7.523-8.25 7.47h-11.75v11.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-11.98h-11.73c-4.281 .053-7.879-3.205-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h12v-11.73c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v12h12c2.21 .001 4.32 .916 5.832 2.528 1.511 1.612 2.289 3.777 2.148 5.982Z"),
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
        return _fileCpp!!
    }

private var _fileCpp: ImageVector? = null
