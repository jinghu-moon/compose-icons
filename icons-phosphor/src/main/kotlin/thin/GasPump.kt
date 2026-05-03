package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorThinIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.140 72.490 L 218.830 53.170 C 217.267 51.607 214.733 51.607 213.170 53.170 C 211.607 54.733 211.607 57.267 213.170 58.830 L 232.490 78.140 C 234.740 80.392 236.003 83.446 236.000 86.630 L 236.000 168.000 C 236.000 174.627 230.627 180.000 224.000 180.000 C 217.373 180.000 212.000 174.627 212.000 168.000 L 212.000 128.000 C 212.000 116.954 203.046 108.000 192.000 108.000 L 172.000 108.000 L 172.000 56.000 C 172.000 44.954 163.046 36.000 152.000 36.000 L 72.000 36.000 C 60.954 36.000 52.000 44.954 52.000 56.000 L 52.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 213.791 28.000 216.000 C 28.000 218.209 29.791 220.000 32.000 220.000 L 192.000 220.000 C 194.209 220.000 196.000 218.209 196.000 216.000 C 196.000 213.791 194.209 212.000 192.000 212.000 L 172.000 212.000 L 172.000 116.000 L 192.000 116.000 C 198.627 116.000 204.000 121.373 204.000 128.000 L 204.000 168.000 C 204.000 179.046 212.954 188.000 224.000 188.000 C 235.046 188.000 244.000 179.046 244.000 168.000 L 244.000 86.630 C 244.015 81.323 241.905 76.230 238.140 72.490 ZM 60.000 212.000 L 60.000 56.000 C 60.000 49.373 65.373 44.000 72.000 44.000 L 152.000 44.000 C 158.627 44.000 164.000 49.373 164.000 56.000 L 164.000 212.000 ZM 140.000 112.000 C 140.000 114.209 138.209 116.000 136.000 116.000 L 88.000 116.000 C 85.791 116.000 84.000 114.209 84.000 112.000 C 84.000 109.791 85.791 108.000 88.000 108.000 L 136.000 108.000 C 138.209 108.000 140.000 109.791 140.000 112.000 Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
