package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorDuotoneIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 96.000 240.000 L 112.000 160.000 L 48.000 136.000 L 160.000 16.000 L 144.000 96.000 L 208.000 120.000 Z"),
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
                pathData = parseSvgPathData("M 215.790 118.170 C 215.175 115.566 213.298 113.442 210.790 112.510 L 153.180 90.900 L 167.840 17.570 C 168.522 14.070 166.805 10.541 163.630 8.917 C 160.455 7.294 156.588 7.968 154.150 10.570 L 42.150 130.570 C 40.302 132.517 39.554 135.261 40.158 137.876 C 40.761 140.491 42.636 142.630 45.150 143.570 L 102.780 165.180 L 88.160 238.430 C 87.478 241.930 89.195 245.459 92.370 247.083 C 95.545 248.706 99.412 248.032 101.850 245.430 L 213.850 125.430 C 215.664 123.483 216.391 120.762 215.790 118.170 ZM 109.370 214.000 L 119.840 161.620 C 120.614 157.784 118.498 153.950 114.840 152.560 L 62.000 132.710 L 146.620 42.050 L 136.160 94.430 C 135.386 98.266 137.502 102.100 141.160 103.490 L 193.960 123.290 Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
