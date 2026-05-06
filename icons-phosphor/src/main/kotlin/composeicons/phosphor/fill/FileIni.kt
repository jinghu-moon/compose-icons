package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileIni: ImageVector
    get() {
        if (_fileIni != null) return _fileIni!!
        _fileIni = phosphorFillIcon(
            name = "FileIni",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 152v55.73c.068 4.291-3.195 7.903-7.47 8.27-2.212 .147-4.386-.631-6.003-2.147C32.91 212.336 31.995 210.217 32 208v-55.73c-.068-4.291 3.195-7.903 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853ZM119.47 144c-4.268 .367-7.528 3.967-7.47 8.25v30.75L86.69 147.6c-1.787-2.589-4.888-3.938-8-3.48-3.855 .64-6.684 3.972-6.69 7.88v55.73c-.068 4.291 3.195 7.903 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C87.09 212.336 88.005 210.217 88 208v-31l25.49 35.69c2.374 3.291 6.835 4.284 10.38 2.31 2.59-1.488 4.171-4.263 4.13-7.25v-55.75c.005-2.217-.91-4.336-2.527-5.853-1.617-1.516-3.791-2.294-6.003-2.147ZM159.47 144c-4.268 .367-7.528 3.967-7.47 8.25v55.46c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.516 2.532-3.636 2.527-5.853v-55.96c.005-2.217-.91-4.336-2.527-5.853-1.617-1.516-3.791-2.294-6.003-2.147ZM216 88v135.75c.06 4.03-2.835 7.498-6.81 8.16-2.303 .346-4.643-.328-6.409-1.848C201.016 228.543 200 226.329 200 224v-100c0-2.209-1.791-4-4-4h-152c-2.209 0-4-1.791-4-4v-76C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM196 88 152 44v44Z"),
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
        return _fileIni!!
    }

private var _fileIni: ImageVector? = null
