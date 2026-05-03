package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorDuotoneIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 144.000 L 128.000 216.000 L 56.000 144.000 Z"),
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
                pathData = parseSvgPathData("M 207.390 140.940 C 206.152 137.950 203.236 136.001 200.000 136.000 L 136.000 136.000 L 136.000 40.000 C 136.000 35.582 132.418 32.000 128.000 32.000 C 123.582 32.000 120.000 35.582 120.000 40.000 L 120.000 136.000 L 56.000 136.000 C 52.762 135.997 49.842 137.947 48.603 140.938 C 47.364 143.929 48.049 147.372 50.340 149.660 L 122.340 221.660 C 123.841 223.162 125.877 224.006 128.000 224.006 C 130.123 224.006 132.159 223.162 133.660 221.660 L 205.660 149.660 C 207.947 147.371 208.630 143.929 207.390 140.940 ZM 128.000 204.690 L 75.310 152.000 L 180.690 152.000 Z"),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
