package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorDuotoneIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 64.000 C 80.000 77.255 69.255 88.000 56.000 88.000 C 42.745 88.000 32.000 77.255 32.000 64.000 C 32.000 50.745 42.745 40.000 56.000 40.000 C 69.255 40.000 80.000 50.745 80.000 64.000 ZM 200.000 168.000 C 186.745 168.000 176.000 178.745 176.000 192.000 C 176.000 205.255 186.745 216.000 200.000 216.000 C 213.255 216.000 224.000 205.255 224.000 192.000 C 224.000 178.745 213.255 168.000 200.000 168.000 Z"),
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
                pathData = parseSvgPathData("M 112.000 152.000 C 107.582 152.000 104.000 155.582 104.000 160.000 L 104.000 188.690 L 66.340 151.000 C 64.847 149.506 64.006 147.482 64.000 145.370 L 64.000 95.000 C 79.602 90.971 89.775 75.970 87.745 59.984 C 85.715 43.998 72.114 32.016 56.000 32.016 C 39.886 32.016 26.286 43.998 24.255 59.984 C 22.225 75.970 32.398 90.971 48.000 95.000 L 48.000 145.380 C 47.968 151.754 50.489 157.876 55.000 162.380 L 92.690 200.000 L 64.000 200.000 C 59.582 200.000 56.000 203.582 56.000 208.000 C 56.000 212.418 59.582 216.000 64.000 216.000 L 112.000 216.000 C 116.418 216.000 120.000 212.418 120.000 208.000 L 120.000 160.000 C 120.000 155.582 116.418 152.000 112.000 152.000 ZM 40.000 64.000 C 40.000 55.163 47.163 48.000 56.000 48.000 C 64.837 48.000 72.000 55.163 72.000 64.000 C 72.000 72.837 64.837 80.000 56.000 80.000 C 47.163 80.000 40.000 72.837 40.000 64.000 ZM 208.000 161.000 L 208.000 110.630 C 208.032 104.256 205.511 98.133 201.000 93.630 L 163.310 56.000 L 192.000 56.000 C 196.418 56.000 200.000 52.418 200.000 48.000 C 200.000 43.582 196.418 40.000 192.000 40.000 L 144.000 40.000 C 139.582 40.000 136.000 43.582 136.000 48.000 L 136.000 96.000 C 136.000 100.418 139.582 104.000 144.000 104.000 C 148.418 104.000 152.000 100.418 152.000 96.000 L 152.000 67.310 L 189.660 105.000 C 191.160 106.502 192.002 108.538 192.000 110.660 L 192.000 161.000 C 176.398 165.029 166.225 180.030 168.255 196.016 C 170.286 212.002 183.886 223.984 200.000 223.984 C 216.114 223.984 229.714 212.002 231.745 196.016 C 233.775 180.030 223.602 165.029 208.000 161.000 ZM 200.000 208.000 C 191.163 208.000 184.000 200.837 184.000 192.000 C 184.000 183.163 191.163 176.000 200.000 176.000 C 208.837 176.000 216.000 183.163 216.000 192.000 C 216.000 200.837 208.837 208.000 200.000 208.000 Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
