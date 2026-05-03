package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorDuotoneIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 176.000 168.000 L 176.000 232.000 C 176.000 236.418 172.418 240.000 168.000 240.000 L 104.000 240.000 C 99.582 240.000 96.000 236.418 96.000 232.000 L 96.000 168.000 Z"),
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
                pathData = parseSvgPathData("M 218.300 48.340 L 157.620 30.140 L 187.620 15.140 C 191.566 13.152 193.153 8.341 191.165 4.395 C 189.177 0.449 184.366 -1.138 180.420 0.850 L 134.000 24.050 C 90.618 25.177 56.029 60.654 56.000 104.050 L 56.000 208.000 C 56.000 212.418 59.582 216.000 64.000 216.000 C 68.418 216.000 72.000 212.418 72.000 208.000 L 72.000 176.000 L 88.000 176.000 L 88.000 232.000 C 88.000 240.837 95.163 248.000 104.000 248.000 L 168.000 248.000 C 176.837 248.000 184.000 240.837 184.000 232.000 L 184.000 104.000 C 183.967 80.591 167.077 60.610 144.000 56.680 L 144.000 42.750 L 213.700 63.660 C 216.460 64.559 219.490 63.893 221.618 61.919 C 223.746 59.945 224.638 56.974 223.949 54.155 C 223.260 51.335 221.098 49.110 218.300 48.340 ZM 88.000 104.000 L 88.000 160.000 L 72.000 160.000 L 72.000 104.000 C 72.040 71.766 96.022 44.580 128.000 40.520 L 128.000 56.680 C 104.923 60.610 88.033 80.591 88.000 104.000 ZM 168.000 232.000 L 104.000 232.000 L 104.000 176.000 L 168.000 176.000 ZM 168.000 104.000 L 168.000 160.000 L 104.000 160.000 L 104.000 104.000 C 104.000 86.327 118.327 72.000 136.000 72.000 C 153.673 72.000 168.000 86.327 168.000 104.000 Z"),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
