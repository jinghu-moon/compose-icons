package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorFillIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154.31 156.92 137.83 180l16.53 23.14c2.512 3.427 1.982 8.207-1.22 11-1.708 1.432-3.937 2.087-6.148 1.806-2.212-.281-4.206-1.472-5.502-3.286L128 193.76l-13.49 18.89c-1.294 1.812-3.286 3.003-5.495 3.286-2.209 .283-4.436-.368-6.145-1.796-3.21-2.788-3.745-7.572-1.23-11L118.17 180 101.69 156.92c-2.613-3.544-1.969-8.518 1.46-11.28 1.721-1.313 3.901-1.872 6.042-1.55 2.141 .322 4.059 1.498 5.318 3.26L128 166.24l13.49-18.89c1.259-1.761 3.177-2.937 5.318-3.26 2.141-.322 4.321 .237 6.042 1.55 3.429 2.762 4.073 7.736 1.46 11.28ZM84 144h-39.73c-4.289-.063-7.898 3.197-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h12v47.73c-.068 4.291 3.195 7.903 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C71.09 212.336 72.005 210.217 72 208v-48h11.73c4.289 .063 7.898-3.197 8.27-7.47 .147-2.212-.631-4.386-2.147-6.003C88.336 144.91 86.217 143.995 84 144ZM212 144h-39.73c-4.281-.053-7.879 3.205-8.25 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h12v47.73c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-47.98h11.73c4.281 .053 7.879-3.205 8.25-7.47 .147-2.212-.631-4.386-2.147-6.003C216.336 144.91 214.217 143.995 212 144ZM40 116v-76C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66v28c0 2.209-1.791 4-4 4h-168c-2.209 0-4-1.791-4-4ZM152 88h44L152 44Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
