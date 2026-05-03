package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorFillIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 148.000 C 176.000 154.627 170.627 160.000 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 C 170.627 136.000 176.000 141.373 176.000 148.000 ZM 92.000 136.000 C 85.373 136.000 80.000 141.373 80.000 148.000 C 80.000 154.627 85.373 160.000 92.000 160.000 C 98.627 160.000 104.000 154.627 104.000 148.000 C 104.000 141.373 98.627 136.000 92.000 136.000 ZM 240.000 72.000 L 240.000 152.000 C 239.956 191.746 207.746 223.956 168.000 224.000 L 88.000 224.000 C 48.254 223.956 16.044 191.746 16.000 152.000 L 16.000 72.000 C 15.968 55.861 27.959 42.225 43.969 40.192 C 59.979 38.159 74.997 48.366 79.000 64.000 L 177.000 64.000 C 181.003 48.366 196.021 38.159 212.031 40.192 C 228.041 42.225 240.032 55.861 240.000 72.000 ZM 200.000 144.000 C 200.000 126.327 185.673 112.000 168.000 112.000 L 88.000 112.000 C 70.327 112.000 56.000 126.327 56.000 144.000 L 56.000 152.000 C 56.000 169.673 70.327 184.000 88.000 184.000 L 168.000 184.000 C 185.673 184.000 200.000 169.673 200.000 152.000 Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
