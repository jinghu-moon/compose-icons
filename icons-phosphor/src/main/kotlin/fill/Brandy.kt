package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Brandy: ImageVector
    get() {
        if (_brandy != null) return _brandy!!
        _brandy = phosphorFillIcon(
            name = "Brandy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 88.000 L 224.000 88.000 C 224.025 69.405 218.628 51.205 208.470 35.630 C 206.993 33.366 204.473 32.000 201.770 32.000 L 54.230 32.000 C 51.527 32.000 49.007 33.366 47.530 35.630 C 37.372 51.205 31.975 69.405 32.000 88.000 L 32.000 88.000 C 32.060 137.893 70.285 179.445 120.000 183.660 L 120.000 216.000 L 88.000 216.000 C 83.582 216.000 80.000 219.582 80.000 224.000 C 80.000 228.418 83.582 232.000 88.000 232.000 L 168.000 232.000 C 172.418 232.000 176.000 228.418 176.000 224.000 C 176.000 219.582 172.418 216.000 168.000 216.000 L 136.000 216.000 L 136.000 183.660 C 185.715 179.445 223.940 137.893 224.000 88.000 ZM 58.700 48.000 L 197.300 48.000 C 202.975 57.811 206.486 68.721 207.600 80.000 L 48.400 80.000 C 49.514 68.721 53.025 57.811 58.700 48.000 Z"),
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
        return _brandy!!
    }

private var _brandy: ImageVector? = null
