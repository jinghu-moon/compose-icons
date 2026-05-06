package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorThinIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 180c0 13.23 9 24 20 24 4.996-.078 9.738-2.213 13.11-5.9 1.53-1.596 4.064-1.65 5.66-.12 1.596 1.53 1.65 4.064 .12 5.66C78.01 208.905 71.178 211.929 64 212 48.56 212 36 197.64 36 180c0-17.64 12.56-32 28-32 7.178 .071 14.01 3.095 18.89 8.36 1.53 1.596 1.476 4.13-.12 5.66-1.596 1.53-4.13 1.476-5.66-.12C73.738 158.213 68.996 156.078 64 156c-11 0-20 10.77-20 24ZM212 88v128c0 6.627-5.373 12-12 12h-80c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h80c2.209 0 4-1.791 4-4v-124h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83ZM156 84h42.34L156 41.65Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
