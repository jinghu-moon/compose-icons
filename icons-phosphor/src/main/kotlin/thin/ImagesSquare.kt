package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorThinIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 80.000 36.000 C 73.373 36.000 68.000 41.373 68.000 48.000 L 68.000 68.000 L 48.000 68.000 C 41.373 68.000 36.000 73.373 36.000 80.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 176.000 220.000 C 182.627 220.000 188.000 214.627 188.000 208.000 L 188.000 188.000 L 208.000 188.000 C 214.627 188.000 220.000 182.627 220.000 176.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 76.000 48.000 C 76.000 45.791 77.791 44.000 80.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 127.000 L 188.490 103.480 C 186.238 101.221 183.180 99.951 179.990 99.951 C 176.800 99.951 173.742 101.221 171.490 103.480 L 95.000 180.000 L 80.000 180.000 C 77.791 180.000 76.000 178.209 76.000 176.000 ZM 180.000 208.000 C 180.000 210.209 178.209 212.000 176.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 80.000 C 44.000 77.791 45.791 76.000 48.000 76.000 L 68.000 76.000 L 68.000 176.000 C 68.000 182.627 73.373 188.000 80.000 188.000 L 180.000 188.000 ZM 208.000 180.000 L 106.340 180.000 L 177.170 109.170 C 177.920 108.419 178.938 107.997 180.000 107.997 C 181.062 107.997 182.080 108.419 182.830 109.170 L 212.000 138.340 L 212.000 176.000 C 212.000 178.209 210.209 180.000 208.000 180.000 ZM 120.000 108.000 C 131.046 108.000 140.000 99.046 140.000 88.000 C 140.000 76.954 131.046 68.000 120.000 68.000 C 108.954 68.000 100.000 76.954 100.000 88.000 C 100.000 99.046 108.954 108.000 120.000 108.000 ZM 120.000 76.000 C 126.627 76.000 132.000 81.373 132.000 88.000 C 132.000 94.627 126.627 100.000 120.000 100.000 C 113.373 100.000 108.000 94.627 108.000 88.000 C 108.000 81.373 113.373 76.000 120.000 76.000 Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
