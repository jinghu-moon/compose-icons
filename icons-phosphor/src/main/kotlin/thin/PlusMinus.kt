package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorThinIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.830 58.830 L 58.830 202.830 C 57.267 204.393 54.733 204.393 53.170 202.830 C 51.607 201.267 51.607 198.733 53.170 197.170 L 197.170 53.170 C 198.733 51.607 201.267 51.607 202.830 53.170 C 204.393 54.733 204.393 57.267 202.830 58.830 ZM 68.000 112.000 C 68.000 114.209 69.791 116.000 72.000 116.000 C 74.209 116.000 76.000 114.209 76.000 112.000 L 76.000 76.000 L 112.000 76.000 C 114.209 76.000 116.000 74.209 116.000 72.000 C 116.000 69.791 114.209 68.000 112.000 68.000 L 76.000 68.000 L 76.000 32.000 C 76.000 29.791 74.209 28.000 72.000 28.000 C 69.791 28.000 68.000 29.791 68.000 32.000 L 68.000 68.000 L 32.000 68.000 C 29.791 68.000 28.000 69.791 28.000 72.000 C 28.000 74.209 29.791 76.000 32.000 76.000 L 68.000 76.000 ZM 224.000 180.000 L 144.000 180.000 C 141.791 180.000 140.000 181.791 140.000 184.000 C 140.000 186.209 141.791 188.000 144.000 188.000 L 224.000 188.000 C 226.209 188.000 228.000 186.209 228.000 184.000 C 228.000 181.791 226.209 180.000 224.000 180.000 Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
