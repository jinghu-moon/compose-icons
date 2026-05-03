package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorDuotoneIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 64.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 32.000 208.000 C 23.163 208.000 16.000 200.837 16.000 192.000 L 16.000 64.000 C 16.000 55.163 23.163 48.000 32.000 48.000 L 224.000 48.000 C 232.837 48.000 240.000 55.163 240.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 149.610 85.710 L 60.010 173.710 C 56.897 176.772 51.903 176.772 48.790 173.710 L 10.390 136.000 C 7.239 132.902 7.197 127.836 10.295 124.685 C 13.393 121.534 18.459 121.492 21.610 124.590 L 54.400 156.790 L 138.400 74.290 C 141.554 71.192 146.622 71.236 149.720 74.390 C 152.818 77.544 152.774 82.612 149.620 85.710 ZM 245.710 74.390 C 244.223 72.874 242.194 72.012 240.071 71.994 C 237.947 71.975 235.904 72.801 234.390 74.290 L 150.390 156.790 L 131.560 138.290 C 128.406 135.194 123.341 135.241 120.245 138.395 C 117.149 141.549 117.196 146.614 120.350 149.710 L 144.780 173.710 C 147.893 176.772 152.887 176.772 156.000 173.710 L 245.600 85.710 C 247.117 84.224 247.981 82.196 248.001 80.073 C 248.022 77.949 247.198 75.905 245.710 74.390 Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null
