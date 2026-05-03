package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorThinIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 60.400 L 204.000 32.000 C 204.000 29.791 202.209 28.000 200.000 28.000 C 197.791 28.000 196.000 29.791 196.000 32.000 L 196.000 60.400 C 186.687 62.301 179.998 70.495 180.000 80.000 L 180.000 129.110 L 132.000 101.680 L 132.000 72.000 C 132.000 69.791 130.209 68.000 128.000 68.000 C 125.791 68.000 124.000 69.791 124.000 72.000 L 124.000 101.680 L 76.000 129.110 L 76.000 80.000 C 76.002 70.495 69.313 62.301 60.000 60.400 L 60.000 32.000 C 60.000 29.791 58.209 28.000 56.000 28.000 C 53.791 28.000 52.000 29.791 52.000 32.000 L 52.000 60.400 C 42.687 62.301 35.998 70.495 36.000 80.000 L 36.000 216.000 C 36.000 218.209 37.791 220.000 40.000 220.000 L 112.000 220.000 C 114.209 220.000 116.000 218.209 116.000 216.000 L 116.000 176.000 C 116.000 169.373 121.373 164.000 128.000 164.000 C 134.627 164.000 140.000 169.373 140.000 176.000 L 140.000 216.000 C 140.000 218.209 141.791 220.000 144.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 80.000 C 220.002 70.495 213.313 62.301 204.000 60.400 ZM 200.000 68.000 C 206.627 68.000 212.000 73.373 212.000 80.000 L 212.000 108.000 L 188.000 108.000 L 188.000 80.000 C 188.000 73.373 193.373 68.000 200.000 68.000 ZM 56.000 68.000 C 62.627 68.000 68.000 73.373 68.000 80.000 L 68.000 108.000 L 44.000 108.000 L 44.000 80.000 C 44.000 73.373 49.373 68.000 56.000 68.000 ZM 44.000 116.000 L 68.000 116.000 L 68.000 212.000 L 44.000 212.000 ZM 128.000 156.000 C 116.954 156.000 108.000 164.954 108.000 176.000 L 108.000 212.000 L 76.000 212.000 L 76.000 138.320 L 128.000 108.610 L 180.000 138.320 L 180.000 212.000 L 148.000 212.000 L 148.000 176.000 C 148.000 164.954 139.046 156.000 128.000 156.000 ZM 188.000 212.000 L 188.000 116.000 L 212.000 116.000 L 212.000 212.000 Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
