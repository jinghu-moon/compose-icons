package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorDuotoneIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 112.000 C 192.000 156.183 156.183 192.000 112.000 192.000 C 67.817 192.000 32.000 156.183 32.000 112.000 C 32.000 67.817 67.817 32.000 112.000 32.000 C 156.183 32.000 192.000 67.817 192.000 112.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 229.660 218.340 L 179.600 168.280 C 209.801 132.059 206.170 78.490 171.357 46.676 C 136.545 14.862 82.866 16.057 49.504 49.389 C 16.143 82.722 14.900 136.399 46.683 171.240 C 78.467 206.081 132.032 209.759 168.280 179.590 L 218.340 229.660 C 221.466 232.786 226.534 232.786 229.660 229.660 C 232.786 226.534 232.786 221.466 229.660 218.340 ZM 40.000 112.000 C 40.000 72.235 72.235 40.000 112.000 40.000 C 151.764 40.000 184.000 72.235 184.000 112.000 C 184.000 151.764 151.764 184.000 112.000 184.000 C 72.254 183.956 40.044 151.746 40.000 112.000 ZM 152.000 112.000 C 152.000 116.418 148.418 120.000 144.000 120.000 L 80.000 120.000 C 75.582 120.000 72.000 116.418 72.000 112.000 C 72.000 107.582 75.582 104.000 80.000 104.000 L 144.000 104.000 C 148.418 104.000 152.000 107.582 152.000 112.000 Z"),
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
