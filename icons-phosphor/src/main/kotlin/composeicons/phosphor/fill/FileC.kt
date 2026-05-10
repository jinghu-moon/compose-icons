package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorFillIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.831-.07 7.467-1.698 10.07-4.51 2.869-3.026 7.553-3.413 10.88-.9 1.77 1.396 2.869 3.473 3.027 5.721 .158 2.248-.64 4.459-2.197 6.089C80.15 212.46 72.272 215.933 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.076 .059 15.788 3.372 21.39 9.19 3.066 2.956 3.382 7.758 .73 11.09-1.463 1.738-3.595 2.772-5.865 2.844-2.27 .072-4.464-.823-6.035-2.464C71.596 161.772 67.901 160.087 64 160c-8.82 0-16 9-16 20ZM216 88v128c0 8.837-7.163 16-16 16h-84c-2.209 0-4-1.791-4-4v-104c0-2.209-1.791-4-4-4h-64c-2.209 0-4-1.791-4-4v-76C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM196 88 152 44v44Z"),
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
