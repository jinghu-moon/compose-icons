package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorDuotoneIcon(
            name = "BellSimple",
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
                pathData = parseSvgPathData("M 168.000 224.000 C 168.000 228.418 164.418 232.000 160.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 228.418 88.000 224.000 C 88.000 219.582 91.582 216.000 96.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 219.582 168.000 224.000 ZM 221.850 192.000 C 219.024 196.979 213.725 200.040 208.000 200.000 L 48.000 200.000 C 42.275 199.992 36.991 196.927 34.142 191.961 C 31.294 186.995 31.316 180.885 34.200 175.940 C 39.750 166.380 48.000 139.340 48.000 104.000 C 48.000 59.817 83.817 24.000 128.000 24.000 C 172.183 24.000 208.000 59.817 208.000 104.000 C 208.000 139.330 216.260 166.380 221.810 175.940 C 224.724 180.894 224.735 187.035 221.840 192.000 ZM 208.000 184.000 C 200.270 170.730 192.000 140.050 192.000 104.000 C 192.000 68.654 163.346 40.000 128.000 40.000 C 92.654 40.000 64.000 68.654 64.000 104.000 C 64.000 140.060 55.720 170.740 48.000 184.000 Z"),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
