package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorDuotoneIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 40.000 L 80.000 136.000 L 32.000 88.000 Z"),
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
                pathData = parseSvgPathData("M 168.000 80.000 L 88.000 80.000 L 88.000 40.000 C 88.003 36.762 86.053 33.842 83.062 32.603 C 80.071 31.364 76.628 32.049 74.340 34.340 L 26.340 82.340 C 24.838 83.841 23.994 85.877 23.994 88.000 C 23.994 90.123 24.838 92.159 26.340 93.660 L 74.340 141.660 C 76.628 143.951 80.071 144.636 83.062 143.397 C 86.053 142.158 88.003 139.238 88.000 136.000 L 88.000 96.000 L 168.000 96.000 C 194.510 96.000 216.000 117.490 216.000 144.000 C 216.000 170.510 194.510 192.000 168.000 192.000 L 80.000 192.000 C 75.582 192.000 72.000 195.582 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 168.000 208.000 C 203.346 208.000 232.000 179.346 232.000 144.000 C 232.000 108.654 203.346 80.000 168.000 80.000 ZM 72.000 116.690 L 43.310 88.000 L 72.000 59.310 Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
