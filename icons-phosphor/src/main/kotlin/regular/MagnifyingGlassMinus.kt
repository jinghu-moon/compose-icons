package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorRegularIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 112.000 C 152.000 116.418 148.418 120.000 144.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 107.582 152.000 112.000 ZM 229.660 229.660 C 228.159 231.162 226.123 232.006 224.000 232.006 C 221.877 232.006 219.841 231.162 218.340 229.660 L 168.280 179.590 C 132.086 209.738 78.581 206.085 46.820 171.297 C 15.059 136.510 16.277 82.894 49.586 49.586 C 82.894 16.277 136.510 15.059 171.297 46.820 C 206.085 78.581 209.738 132.086 179.590 168.280 L 229.660 218.340 C 231.162 219.841 232.006 221.877 232.006 224.000 C 232.006 226.123 231.162 228.159 229.660 229.660 ZM 112.000 184.000 C 151.764 184.000 184.000 151.764 184.000 112.000 C 184.000 72.235 151.764 40.000 112.000 40.000 C 72.235 40.000 40.000 72.235 40.000 112.000 C 40.044 151.746 72.254 183.956 112.000 184.000 Z"),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
