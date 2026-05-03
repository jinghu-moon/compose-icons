package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = phosphorBoldIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 100.000 L 225.000 100.000 L 190.830 65.860 C 187.089 62.096 181.997 59.986 176.690 60.000 L 144.000 60.000 L 144.000 44.000 L 164.000 44.000 C 170.627 44.000 176.000 38.627 176.000 32.000 C 176.000 25.373 170.627 20.000 164.000 20.000 L 100.000 20.000 C 93.373 20.000 88.000 25.373 88.000 32.000 C 88.000 38.627 93.373 44.000 100.000 44.000 L 120.000 44.000 L 120.000 60.000 L 64.000 60.000 C 52.954 60.000 44.000 68.954 44.000 80.000 L 44.000 128.000 L 28.000 128.000 L 28.000 108.000 C 28.000 101.373 22.627 96.000 16.000 96.000 C 9.373 96.000 4.000 101.373 4.000 108.000 L 4.000 172.000 C 4.000 178.627 9.373 184.000 16.000 184.000 C 22.627 184.000 28.000 178.627 28.000 172.000 L 28.000 152.000 L 44.000 152.000 L 44.000 168.690 C 43.986 173.997 46.096 179.089 49.860 182.830 L 89.170 222.140 C 92.911 225.904 98.003 228.014 103.310 228.000 L 176.690 228.000 C 181.997 228.014 187.089 225.904 190.830 222.140 L 225.000 188.000 L 236.000 188.000 C 247.046 188.000 256.000 179.046 256.000 168.000 L 256.000 120.000 C 256.000 108.954 247.046 100.000 236.000 100.000 ZM 232.000 164.000 L 220.000 164.000 C 216.816 163.997 213.762 165.260 211.510 167.510 L 175.000 204.000 L 105.000 204.000 L 68.000 167.000 L 68.000 84.000 L 175.000 84.000 L 211.480 120.490 C 213.740 122.747 216.806 124.010 220.000 124.000 L 232.000 124.000 Z"),
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
        return _engine!!
    }

private var _engine: ImageVector? = null
