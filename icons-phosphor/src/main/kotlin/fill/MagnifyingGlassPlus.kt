package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MagnifyingGlassPlus: ImageVector
    get() {
        if (_magnifyingGlassPlus != null) return _magnifyingGlassPlus!!
        _magnifyingGlassPlus = phosphorFillIcon(
            name = "MagnifyingGlassPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 218.340 L 179.600 168.280 C 209.801 132.059 206.170 78.490 171.357 46.676 C 136.545 14.862 82.866 16.057 49.504 49.389 C 16.143 82.722 14.900 136.399 46.683 171.240 C 78.467 206.081 132.032 209.759 168.280 179.590 L 218.340 229.660 C 221.466 232.786 226.534 232.786 229.660 229.660 C 232.786 226.534 232.786 221.466 229.660 218.340 ZM 144.000 120.000 L 120.000 120.000 L 120.000 144.000 C 120.000 148.418 116.418 152.000 112.000 152.000 C 107.582 152.000 104.000 148.418 104.000 144.000 L 104.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 104.000 104.000 L 104.000 80.000 C 104.000 75.582 107.582 72.000 112.000 72.000 C 116.418 72.000 120.000 75.582 120.000 80.000 L 120.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 107.582 152.000 112.000 C 152.000 116.418 148.418 120.000 144.000 120.000 Z"),
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
        return _magnifyingGlassPlus!!
    }

private var _magnifyingGlassPlus: ImageVector? = null
