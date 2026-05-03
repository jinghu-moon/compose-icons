package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorFillIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 216.000 L 183.360 216.000 C 227.177 188.394 243.990 132.744 222.789 85.494 C 201.587 38.244 148.839 13.808 99.087 28.187 C 49.334 42.567 17.755 91.375 25.029 142.650 C 32.303 193.926 76.211 232.026 128.000 232.000 L 232.000 232.000 C 236.418 232.000 240.000 228.418 240.000 224.000 C 240.000 219.582 236.418 216.000 232.000 216.000 ZM 80.000 148.000 C 68.954 148.000 60.000 139.046 60.000 128.000 C 60.000 116.954 68.954 108.000 80.000 108.000 C 91.046 108.000 100.000 116.954 100.000 128.000 C 100.000 139.046 91.046 148.000 80.000 148.000 ZM 128.000 196.000 C 116.954 196.000 108.000 187.046 108.000 176.000 C 108.000 164.954 116.954 156.000 128.000 156.000 C 139.046 156.000 148.000 164.954 148.000 176.000 C 148.000 187.046 139.046 196.000 128.000 196.000 ZM 128.000 100.000 C 116.954 100.000 108.000 91.046 108.000 80.000 C 108.000 68.954 116.954 60.000 128.000 60.000 C 139.046 60.000 148.000 68.954 148.000 80.000 C 148.000 91.046 139.046 100.000 128.000 100.000 ZM 156.000 128.000 C 156.000 116.954 164.954 108.000 176.000 108.000 C 187.046 108.000 196.000 116.954 196.000 128.000 C 196.000 139.046 187.046 148.000 176.000 148.000 C 164.954 148.000 156.000 139.046 156.000 128.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
