package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorDuotoneIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 160.000 C 240.000 177.673 225.673 192.000 208.000 192.000 C 190.327 192.000 176.000 177.673 176.000 160.000 C 176.000 142.327 190.327 128.000 208.000 128.000 C 225.673 128.000 240.000 142.327 240.000 160.000 Z"),
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
                pathData = parseSvgPathData("M 220.000 160.000 C 220.000 166.627 214.627 172.000 208.000 172.000 C 201.373 172.000 196.000 166.627 196.000 160.000 C 196.000 153.373 201.373 148.000 208.000 148.000 C 214.627 148.000 220.000 153.373 220.000 160.000 ZM 215.450 199.290 C 211.819 222.695 191.685 239.970 168.000 240.000 L 144.000 240.000 C 117.502 239.972 96.028 218.498 96.000 192.000 L 96.000 151.490 C 64.003 147.459 40.004 120.250 40.000 88.000 L 40.000 40.000 C 40.000 35.582 43.582 32.000 48.000 32.000 L 72.000 32.000 C 76.418 32.000 80.000 35.582 80.000 40.000 C 80.000 44.418 76.418 48.000 72.000 48.000 L 56.000 48.000 L 56.000 88.000 C 55.999 100.842 61.144 113.149 70.284 122.169 C 79.425 131.190 91.799 136.171 104.640 136.000 C 130.750 135.660 152.000 113.750 152.000 87.170 L 152.000 48.000 L 136.000 48.000 C 131.582 48.000 128.000 44.418 128.000 40.000 C 128.000 35.582 131.582 32.000 136.000 32.000 L 160.000 32.000 C 164.418 32.000 168.000 35.582 168.000 40.000 L 168.000 87.170 C 168.000 120.010 143.470 147.460 112.000 151.480 L 112.000 192.000 C 112.000 209.673 126.327 224.000 144.000 224.000 L 168.000 224.000 C 182.966 223.975 195.924 213.599 199.220 199.000 C 179.207 194.505 165.837 175.599 168.268 155.232 C 170.699 134.864 188.143 119.637 208.652 119.978 C 229.161 120.319 246.088 136.119 247.840 156.556 C 249.592 176.993 235.602 195.443 215.450 199.270 ZM 232.000 160.000 C 232.000 146.745 221.255 136.000 208.000 136.000 C 194.745 136.000 184.000 146.745 184.000 160.000 C 184.000 173.255 194.745 184.000 208.000 184.000 C 221.255 184.000 232.000 173.255 232.000 160.000 Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
