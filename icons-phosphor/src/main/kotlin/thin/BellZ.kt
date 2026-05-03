package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorThinIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 144.000 C 148.000 146.209 146.209 148.000 144.000 148.000 L 112.000 148.000 C 110.524 148.001 109.168 147.189 108.471 145.888 C 107.774 144.587 107.851 143.008 108.670 141.780 L 136.530 100.000 L 112.000 100.000 C 109.791 100.000 108.000 98.209 108.000 96.000 C 108.000 93.791 109.791 92.000 112.000 92.000 L 144.000 92.000 C 145.476 91.999 146.832 92.811 147.529 94.112 C 148.226 95.413 148.149 96.992 147.330 98.220 L 119.470 140.000 L 144.000 140.000 C 146.209 140.000 148.000 141.791 148.000 144.000 ZM 218.380 190.000 C 216.263 193.733 212.292 196.029 208.000 196.000 L 163.770 196.000 C 161.704 214.193 146.310 227.937 128.000 227.937 C 109.690 227.937 94.296 214.193 92.230 196.000 L 48.000 196.000 C 43.720 195.985 39.773 193.692 37.639 189.982 C 35.506 186.272 35.510 181.706 37.650 178.000 C 43.420 168.000 52.000 140.130 52.000 104.000 C 52.000 62.026 86.026 28.000 128.000 28.000 C 169.974 28.000 204.000 62.026 204.000 104.000 C 204.000 140.130 212.590 168.000 218.360 177.950 C 220.546 181.667 220.554 186.275 218.380 190.000 ZM 155.710 196.000 L 100.290 196.000 C 102.287 209.767 114.089 219.981 128.000 219.981 C 141.911 219.981 153.713 209.767 155.710 196.000 ZM 211.430 182.000 C 204.000 169.170 196.000 139.310 196.000 104.000 C 196.000 66.445 165.555 36.000 128.000 36.000 C 90.445 36.000 60.000 66.445 60.000 104.000 C 60.000 139.320 52.000 169.170 44.560 182.000 C 43.845 183.238 43.845 184.762 44.560 186.000 C 45.256 187.244 46.574 188.010 48.000 188.000 L 208.000 188.000 C 209.426 188.010 210.744 187.244 211.440 186.000 C 212.151 184.761 212.148 183.236 211.430 182.000 Z"),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
