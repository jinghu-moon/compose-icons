package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorThinIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.060 20.570 C 224.855 19.847 223.360 19.809 222.120 20.470 L 103.000 84.000 L 32.000 84.000 C 25.373 84.000 20.000 89.373 20.000 96.000 L 20.000 200.000 C 20.000 206.627 25.373 212.000 32.000 212.000 L 120.000 212.000 C 126.627 212.000 132.000 206.627 132.000 200.000 L 132.000 168.000 C 131.999 167.610 131.942 167.223 131.830 166.850 L 108.770 90.000 L 220.000 30.670 L 220.000 160.000 C 220.000 162.209 218.209 164.000 216.000 164.000 L 200.000 164.000 C 197.791 164.000 196.000 162.209 196.000 160.000 L 196.000 152.000 C 196.000 149.791 194.209 148.000 192.000 148.000 C 189.791 148.000 188.000 149.791 188.000 152.000 L 188.000 160.000 C 188.000 166.627 193.373 172.000 200.000 172.000 L 216.000 172.000 C 222.627 172.000 228.000 166.627 228.000 160.000 L 228.000 24.000 C 228.000 22.595 227.264 21.293 226.060 20.570 ZM 101.000 92.000 L 122.600 164.000 L 60.000 164.000 L 60.000 92.000 ZM 32.000 92.000 L 52.000 92.000 L 52.000 164.000 L 28.000 164.000 L 28.000 96.000 C 28.000 93.791 29.791 92.000 32.000 92.000 ZM 120.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 L 28.000 172.000 L 124.000 172.000 L 124.000 200.000 C 124.000 202.209 122.209 204.000 120.000 204.000 Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
