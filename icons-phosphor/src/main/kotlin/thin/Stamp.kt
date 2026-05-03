package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorThinIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 224.000 C 220.000 226.209 218.209 228.000 216.000 228.000 L 40.000 228.000 C 37.791 228.000 36.000 226.209 36.000 224.000 C 36.000 221.791 37.791 220.000 40.000 220.000 L 216.000 220.000 C 218.209 220.000 220.000 221.791 220.000 224.000 ZM 220.000 144.000 L 220.000 184.000 C 220.000 190.627 214.627 196.000 208.000 196.000 L 48.000 196.000 C 41.373 196.000 36.000 190.627 36.000 184.000 L 36.000 144.000 C 36.000 137.373 41.373 132.000 48.000 132.000 L 109.370 132.000 L 92.630 53.870 C 90.857 45.603 92.915 36.978 98.230 30.401 C 103.544 23.825 111.545 20.002 120.000 20.000 L 136.000 20.000 C 144.457 19.999 152.461 23.821 157.777 30.397 C 163.094 36.974 165.153 45.601 163.380 53.870 L 146.630 132.000 L 208.000 132.000 C 214.627 132.000 220.000 137.373 220.000 144.000 ZM 117.550 132.000 L 138.450 132.000 L 155.550 52.190 C 156.815 46.285 155.345 40.125 151.549 35.429 C 147.753 30.732 142.039 28.002 136.000 28.000 L 120.000 28.000 C 113.960 27.999 108.242 30.728 104.444 35.425 C 100.646 40.122 99.175 46.284 100.440 52.190 ZM 212.000 144.000 C 212.000 141.791 210.209 140.000 208.000 140.000 L 48.000 140.000 C 45.791 140.000 44.000 141.791 44.000 144.000 L 44.000 184.000 C 44.000 186.209 45.791 188.000 48.000 188.000 L 208.000 188.000 C 210.209 188.000 212.000 186.209 212.000 184.000 Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
