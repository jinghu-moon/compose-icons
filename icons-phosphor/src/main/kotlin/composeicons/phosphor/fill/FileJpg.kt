package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) return _fileJpg!!
        _fileJpg = phosphorFillIcon(
            name = "FileJpg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM120 144h-16c-4.418 0-8 3.582-8 8v55.73c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-8h7.4c15.24 0 28.13-11.92 28.59-27.15 .224-7.567-2.625-14.903-7.898-20.334C134.818 147.064 127.57 143.999 120 144ZM119.65 184h-7.65v-24h8c3.384 .001 6.61 1.431 8.883 3.937 2.274 2.506 3.384 5.855 3.057 9.223-.712 6.23-6.02 10.911-12.29 10.84ZM216 200.87c-.001 2.08-.811 4.078-2.26 5.57-5.623 6.041-13.487 9.499-21.74 9.56-17.64 0-32-16.15-32-36 0-19.85 14.36-36 32-36 5.722 .017 11.315 1.707 16.09 4.86 3.596 2.241 4.895 6.851 3 10.64-1.064 2.006-2.93 3.466-5.133 4.016-2.203 .549-4.536 .137-6.417-1.135C197.329 160.835 194.697 160.005 192 160c-8.82 0-16 9-16 20 0 11 7.18 20 16 20 2.886-.033 5.688-.982 8-2.71v-5.29c-2.217 .005-4.336-.91-5.853-2.527-1.516-1.617-2.294-3.791-2.147-6.003 .367-4.268 3.967-7.528 8.25-7.47h7.75c4.418 0 8 3.582 8 8ZM80 152v37.41c0 14.22-11.18 26.26-25.41 26.58-6.932 .158-13.64-2.459-18.633-7.27C30.964 203.909 28.1 197.303 28 190.37c-.128-4.273 3.059-7.922 7.31-8.37 2.277-.198 4.531 .587 6.191 2.158 1.661 1.571 2.57 3.777 2.499 6.062-.203 3.192 1.325 6.247 4 8 7.85 4.82 16-.75 16-8.2v-37.75c-.068-4.291 3.195-7.903 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853Z"),
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
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
