package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BellZ: ImageVector
    get() {
        if (_bellZ != null) return _bellZ!!
        _bellZ = phosphorDuotoneIcon(
            name = "BellZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 192.000 L 48.000 192.000 C 45.150 191.983 42.525 190.451 41.108 187.979 C 39.691 185.507 39.695 182.468 41.120 180.000 C 47.710 168.600 56.000 139.810 56.000 104.000 C 56.000 64.235 88.235 32.000 128.000 32.000 C 167.764 32.000 200.000 64.235 200.000 104.000 C 200.000 139.820 208.300 168.600 214.900 180.000 C 216.327 182.471 216.329 185.514 214.907 187.988 C 213.485 190.461 210.853 191.990 208.000 192.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 152.000 144.000 C 152.000 148.418 148.418 152.000 144.000 152.000 L 112.000 152.000 C 109.050 151.998 106.340 150.373 104.950 147.771 C 103.559 145.170 103.713 142.014 105.350 139.560 L 129.050 104.000 L 112.000 104.000 C 107.582 104.000 104.000 100.418 104.000 96.000 C 104.000 91.582 107.582 88.000 112.000 88.000 L 144.000 88.000 C 146.950 88.002 149.660 89.627 151.050 92.229 C 152.441 94.830 152.287 97.986 150.650 100.440 L 127.000 136.000 L 144.000 136.000 C 148.418 136.000 152.000 139.582 152.000 144.000 ZM 221.840 192.000 C 219.015 196.976 213.722 200.036 208.000 200.000 L 167.190 200.000 C 163.385 218.619 147.004 231.991 128.000 231.991 C 108.996 231.991 92.615 218.619 88.810 200.000 L 48.000 200.000 C 42.275 199.992 36.991 196.927 34.142 191.961 C 31.294 186.995 31.316 180.885 34.200 175.940 C 39.750 166.380 48.000 139.340 48.000 104.000 C 48.000 59.817 83.817 24.000 128.000 24.000 C 172.183 24.000 208.000 59.817 208.000 104.000 C 208.000 139.330 216.260 166.380 221.810 175.940 C 224.724 180.894 224.735 187.035 221.840 192.000 ZM 150.620 200.000 L 105.380 200.000 C 108.776 209.578 117.837 215.979 128.000 215.979 C 138.163 215.979 147.224 209.578 150.620 200.000 ZM 208.000 184.000 C 200.270 170.730 192.000 140.050 192.000 104.000 C 192.000 68.654 163.346 40.000 128.000 40.000 C 92.654 40.000 64.000 68.654 64.000 104.000 C 64.000 140.060 55.720 170.740 48.000 184.000 Z"),
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
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
