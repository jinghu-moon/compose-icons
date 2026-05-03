package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorThinIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.750 125.660 C 218.723 125.594 218.689 125.530 218.650 125.470 L 188.000 70.940 L 188.000 32.000 C 188.000 25.373 182.627 20.000 176.000 20.000 L 80.000 20.000 C 73.373 20.000 68.000 25.373 68.000 32.000 L 68.000 71.000 L 37.340 125.470 L 37.240 125.660 C 35.240 129.711 35.684 134.542 38.390 138.160 L 124.830 250.440 C 125.587 251.424 126.758 252.001 128.000 252.001 C 129.242 252.001 130.413 251.424 131.170 250.440 L 217.660 138.090 C 220.318 134.476 220.739 129.681 218.750 125.660 ZM 80.000 28.000 L 176.000 28.000 C 178.209 28.000 180.000 29.791 180.000 32.000 L 180.000 68.000 L 76.000 68.000 L 76.000 32.000 C 76.000 29.791 77.791 28.000 80.000 28.000 ZM 128.000 148.000 C 119.163 148.000 112.000 140.837 112.000 132.000 C 112.000 123.163 119.163 116.000 128.000 116.000 C 136.837 116.000 144.000 123.163 144.000 132.000 C 144.000 140.837 136.837 148.000 128.000 148.000 ZM 211.270 133.280 L 132.000 236.250 L 132.000 155.660 C 144.302 153.581 152.959 142.422 151.916 129.989 C 150.873 117.556 140.477 107.996 128.000 107.996 C 115.523 107.996 105.127 117.556 104.084 129.989 C 103.041 142.422 111.698 153.581 124.000 155.660 L 124.000 236.240 L 44.780 133.340 C 43.915 132.161 43.761 130.605 44.380 129.280 L 74.350 76.000 L 181.660 76.000 L 211.660 129.280 C 212.258 130.587 212.109 132.113 211.270 133.280 Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
