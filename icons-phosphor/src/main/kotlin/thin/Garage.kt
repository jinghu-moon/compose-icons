package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorThinIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 196.000 L 228.000 196.000 L 228.000 98.670 C 228.006 94.653 226.002 90.899 222.660 88.670 L 134.660 30.000 C 130.628 27.310 125.372 27.310 121.340 30.000 L 33.340 88.670 C 29.998 90.899 27.994 94.653 28.000 98.670 L 28.000 196.000 L 16.000 196.000 C 13.791 196.000 12.000 197.791 12.000 200.000 C 12.000 202.209 13.791 204.000 16.000 204.000 L 240.000 204.000 C 242.209 204.000 244.000 202.209 244.000 200.000 C 244.000 197.791 242.209 196.000 240.000 196.000 ZM 36.000 98.670 C 35.999 97.332 36.667 96.082 37.780 95.340 L 125.780 36.680 C 127.124 35.783 128.876 35.783 130.220 36.680 L 218.220 95.340 C 219.333 96.082 220.001 97.332 220.000 98.670 L 220.000 196.000 L 188.000 196.000 L 188.000 136.000 C 188.000 133.791 186.209 132.000 184.000 132.000 L 72.000 132.000 C 69.791 132.000 68.000 133.791 68.000 136.000 L 68.000 196.000 L 36.000 196.000 ZM 180.000 140.000 L 180.000 164.000 L 132.000 164.000 L 132.000 140.000 ZM 124.000 164.000 L 76.000 164.000 L 76.000 140.000 L 124.000 140.000 ZM 76.000 172.000 L 124.000 172.000 L 124.000 196.000 L 76.000 196.000 ZM 132.000 172.000 L 180.000 172.000 L 180.000 196.000 L 132.000 196.000 Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
