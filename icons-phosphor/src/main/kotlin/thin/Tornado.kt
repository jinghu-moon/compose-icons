package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorThinIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 40.000 C 228.000 42.209 226.209 44.000 224.000 44.000 L 56.000 44.000 C 53.791 44.000 52.000 42.209 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 224.000 36.000 C 226.209 36.000 228.000 37.791 228.000 40.000 ZM 180.000 72.000 C 180.000 69.791 178.209 68.000 176.000 68.000 L 32.000 68.000 C 29.791 68.000 28.000 69.791 28.000 72.000 C 28.000 74.209 29.791 76.000 32.000 76.000 L 176.000 76.000 C 178.209 76.000 180.000 74.209 180.000 72.000 ZM 164.000 104.000 C 164.000 101.791 162.209 100.000 160.000 100.000 L 56.000 100.000 C 53.791 100.000 52.000 101.791 52.000 104.000 C 52.000 106.209 53.791 108.000 56.000 108.000 L 160.000 108.000 C 162.209 108.000 164.000 106.209 164.000 104.000 ZM 180.000 136.000 C 180.000 133.791 178.209 132.000 176.000 132.000 L 88.000 132.000 C 85.791 132.000 84.000 133.791 84.000 136.000 C 84.000 138.209 85.791 140.000 88.000 140.000 L 176.000 140.000 C 178.209 140.000 180.000 138.209 180.000 136.000 ZM 184.000 164.000 L 120.000 164.000 C 117.791 164.000 116.000 165.791 116.000 168.000 C 116.000 170.209 117.791 172.000 120.000 172.000 L 184.000 172.000 C 186.209 172.000 188.000 170.209 188.000 168.000 C 188.000 165.791 186.209 164.000 184.000 164.000 ZM 160.000 196.000 L 128.000 196.000 C 125.791 196.000 124.000 197.791 124.000 200.000 C 124.000 202.209 125.791 204.000 128.000 204.000 L 160.000 204.000 C 162.209 204.000 164.000 202.209 164.000 200.000 C 164.000 197.791 162.209 196.000 160.000 196.000 ZM 128.000 228.000 L 112.000 228.000 C 109.791 228.000 108.000 229.791 108.000 232.000 C 108.000 234.209 109.791 236.000 112.000 236.000 L 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 C 132.000 229.791 130.209 228.000 128.000 228.000 Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
