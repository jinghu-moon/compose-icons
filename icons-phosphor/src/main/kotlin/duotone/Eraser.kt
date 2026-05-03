package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorDuotoneIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 160.000 168.000 L 112.000 216.000 L 66.750 216.000 L 36.690 185.940 C 33.689 182.939 32.002 178.869 32.002 174.625 C 32.002 170.381 33.689 166.311 36.690 163.310 L 96.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 225.000 80.400 L 183.600 39.000 C 174.228 29.628 159.032 29.628 149.660 39.000 L 31.000 157.660 C 21.628 167.032 21.628 182.228 31.000 191.600 L 61.060 221.660 C 62.566 223.165 64.611 224.007 66.740 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 C 224.000 211.582 220.418 208.000 216.000 208.000 L 131.300 208.000 L 225.000 114.340 C 234.372 104.968 234.372 89.772 225.000 80.400 ZM 108.680 208.000 L 70.050 208.000 L 42.330 180.280 C 39.208 177.156 39.208 172.094 42.330 168.970 L 96.000 115.310 L 148.690 168.000 ZM 213.680 103.000 L 160.000 156.690 L 107.310 104.000 L 161.000 50.340 C 162.501 48.838 164.537 47.994 166.660 47.994 C 168.783 47.994 170.819 48.838 172.320 50.340 L 213.700 91.720 C 216.822 94.844 216.822 99.906 213.700 103.030 Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
