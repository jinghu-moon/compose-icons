package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorFillIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.800 175.940 C 216.250 166.380 208.000 139.330 208.000 104.000 C 208.000 59.817 172.183 24.000 128.000 24.000 C 83.817 24.000 48.000 59.817 48.000 104.000 C 48.000 139.340 39.740 166.380 34.190 175.940 C 31.305 180.887 31.284 186.998 34.135 191.965 C 36.986 196.932 42.273 199.996 48.000 200.000 L 88.810 200.000 C 92.615 218.619 108.996 231.991 128.000 231.991 C 147.004 231.991 163.385 218.619 167.190 200.000 L 208.000 200.000 C 213.725 199.992 219.009 196.927 221.858 191.961 C 224.706 186.995 224.684 180.885 221.800 175.940 ZM 128.000 216.000 C 117.832 215.997 108.769 209.587 105.380 200.000 L 150.620 200.000 C 147.231 209.587 138.168 215.997 128.000 216.000 ZM 144.000 152.000 L 112.000 152.000 C 109.050 151.998 106.340 150.373 104.950 147.771 C 103.559 145.170 103.713 142.014 105.350 139.560 L 129.050 104.000 L 112.000 104.000 C 107.582 104.000 104.000 100.418 104.000 96.000 C 104.000 91.582 107.582 88.000 112.000 88.000 L 144.000 88.000 C 146.950 88.002 149.660 89.627 151.050 92.229 C 152.441 94.830 152.287 97.986 150.650 100.440 L 127.000 136.000 L 144.000 136.000 C 148.418 136.000 152.000 139.582 152.000 144.000 C 152.000 148.418 148.418 152.000 144.000 152.000 Z"),
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
