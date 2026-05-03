package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorThinIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 192.000 C 140.000 194.209 138.209 196.000 136.000 196.000 L 120.000 196.000 C 117.791 196.000 116.000 194.209 116.000 192.000 C 116.000 189.791 117.791 188.000 120.000 188.000 L 136.000 188.000 C 138.209 188.000 140.000 189.791 140.000 192.000 ZM 120.000 68.000 L 136.000 68.000 C 138.209 68.000 140.000 66.209 140.000 64.000 C 140.000 61.791 138.209 60.000 136.000 60.000 L 120.000 60.000 C 117.791 60.000 116.000 61.791 116.000 64.000 C 116.000 66.209 117.791 68.000 120.000 68.000 ZM 136.000 124.000 L 120.000 124.000 C 117.791 124.000 116.000 125.791 116.000 128.000 C 116.000 130.209 117.791 132.000 120.000 132.000 L 136.000 132.000 C 138.209 132.000 140.000 130.209 140.000 128.000 C 140.000 125.791 138.209 124.000 136.000 124.000 ZM 212.000 40.000 L 212.000 216.000 C 212.000 222.627 206.627 228.000 200.000 228.000 L 56.000 228.000 C 49.373 228.000 44.000 222.627 44.000 216.000 L 44.000 40.000 C 44.000 33.373 49.373 28.000 56.000 28.000 L 200.000 28.000 C 206.627 28.000 212.000 33.373 212.000 40.000 ZM 52.000 156.000 L 204.000 156.000 L 204.000 100.000 L 52.000 100.000 ZM 52.000 40.000 L 52.000 92.000 L 204.000 92.000 L 204.000 40.000 C 204.000 37.791 202.209 36.000 200.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 ZM 204.000 216.000 L 204.000 164.000 L 52.000 164.000 L 52.000 216.000 C 52.000 218.209 53.791 220.000 56.000 220.000 L 200.000 220.000 C 202.209 220.000 204.000 218.209 204.000 216.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _dresser!!
    }

private var _dresser: ImageVector? = null
