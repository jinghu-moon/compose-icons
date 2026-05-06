package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCSharp: ImageVector
    get() {
        if (_fileCSharp != null) return _fileCSharp!!
        _fileCSharp = phosphorFillIcon(
            name = "FileCSharp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.831-.07 7.467-1.698 10.07-4.51 2.869-3.026 7.553-3.413 10.88-.9 1.77 1.396 2.869 3.473 3.027 5.721 .158 2.248-.64 4.459-2.197 6.089C80.15 212.46 72.272 215.933 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.073 .062 15.78 3.375 21.38 9.19 3.073 2.951 3.394 7.757 .74 11.09-1.463 1.738-3.595 2.772-5.865 2.844-2.27 .072-4.464-.823-6.035-2.464C71.596 161.772 67.901 160.087 64 160c-8.82 0-16 9-16 20ZM216 88v135.75c.06 4.03-2.835 7.498-6.81 8.16-2.303 .346-4.643-.328-6.409-1.848C201.016 228.543 200 226.329 200 224v-100c0-2.209-1.791-4-4-4h-152c-2.209 0-4-1.791-4-4v-76C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM196 88 152 44v44ZM168 168v16h7.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-8v7.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-8h-15.98v7.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.516-2.532-3.636-2.527-5.853v-8h-7.73c-4.283 .058-7.883-3.202-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h8v-15.96h-7.73c-4.283 .058-7.883-3.202-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h8v-7.73c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v8h16v-7.73c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.516 2.532 3.636 2.527 5.853v8h7.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.516 1.617-3.636 2.532-5.853 2.527ZM152 168h-16v16h16Z"),
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
        return _fileCSharp!!
    }

private var _fileCSharp: ImageVector? = null
