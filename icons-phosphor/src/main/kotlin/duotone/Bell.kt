package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorDuotoneIcon(
            name = "Bell",
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
                pathData = parseSvgPathData("M 221.800 175.940 C 216.250 166.380 208.000 139.330 208.000 104.000 C 208.000 59.817 172.183 24.000 128.000 24.000 C 83.817 24.000 48.000 59.817 48.000 104.000 C 48.000 139.340 39.740 166.380 34.190 175.940 C 31.305 180.887 31.284 186.998 34.135 191.965 C 36.986 196.932 42.273 199.996 48.000 200.000 L 88.810 200.000 C 92.615 218.619 108.996 231.991 128.000 231.991 C 147.004 231.991 163.385 218.619 167.190 200.000 L 208.000 200.000 C 213.725 199.992 219.009 196.927 221.858 191.961 C 224.706 186.995 224.684 180.885 221.800 175.940 ZM 128.000 216.000 C 117.832 215.997 108.769 209.587 105.380 200.000 L 150.620 200.000 C 147.231 209.587 138.168 215.997 128.000 216.000 ZM 48.000 184.000 C 55.700 170.760 64.000 140.080 64.000 104.000 C 64.000 68.654 92.654 40.000 128.000 40.000 C 163.346 40.000 192.000 68.654 192.000 104.000 C 192.000 140.050 200.280 170.730 208.000 184.000 Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
