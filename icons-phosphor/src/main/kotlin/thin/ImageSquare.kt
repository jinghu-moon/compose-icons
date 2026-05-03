package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorThinIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 41.373 36.000 36.000 41.373 36.000 48.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 ZM 44.000 208.000 L 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 135.000 L 180.490 103.480 C 178.238 101.221 175.180 99.951 171.990 99.951 C 168.800 99.951 165.742 101.221 163.490 103.480 L 55.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 ZM 208.000 212.000 L 66.340 212.000 L 169.170 109.170 C 169.920 108.419 170.938 107.997 172.000 107.997 C 173.062 107.997 174.080 108.419 174.830 109.170 L 212.000 146.340 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 ZM 96.000 116.000 C 107.046 116.000 116.000 107.046 116.000 96.000 C 116.000 84.954 107.046 76.000 96.000 76.000 C 84.954 76.000 76.000 84.954 76.000 96.000 C 76.000 107.046 84.954 116.000 96.000 116.000 ZM 96.000 84.000 C 102.627 84.000 108.000 89.373 108.000 96.000 C 108.000 102.627 102.627 108.000 96.000 108.000 C 89.373 108.000 84.000 102.627 84.000 96.000 C 84.000 89.373 89.373 84.000 96.000 84.000 Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
