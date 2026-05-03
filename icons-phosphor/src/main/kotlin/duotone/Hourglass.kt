package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hourglass: ImageVector
    get() {
        if (_hourglass != null) return _hourglass!!
        _hourglass = phosphorDuotoneIcon(
            name = "Hourglass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 188.820 82.000 L 128.000 128.000 L 67.200 82.400 C 65.186 80.889 64.000 78.518 64.000 76.000 L 64.000 40.000 C 64.000 35.582 67.582 32.000 72.000 32.000 L 184.000 32.000 C 188.418 32.000 192.000 35.582 192.000 40.000 L 192.000 75.640 C 191.992 78.140 190.816 80.493 188.820 82.000 ZM 64.000 180.000 L 64.000 216.000 C 64.000 220.418 67.582 224.000 72.000 224.000 L 184.000 224.000 C 188.418 224.000 192.000 220.418 192.000 216.000 L 192.000 180.360 C 191.998 177.852 190.821 175.491 188.820 173.980 L 128.000 128.000 L 67.200 173.600 C 65.186 175.111 64.000 177.482 64.000 180.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 200.000 75.640 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 76.000 C 56.011 81.034 58.380 85.771 62.400 88.800 L 114.670 128.000 L 62.400 167.200 C 58.380 170.229 56.011 174.966 56.000 180.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 184.000 232.000 C 192.837 232.000 200.000 224.837 200.000 216.000 L 200.000 180.360 C 199.988 175.346 197.641 170.625 193.650 167.590 L 141.270 128.000 L 193.650 88.410 C 197.641 85.375 199.988 80.654 200.000 75.640 ZM 184.000 216.000 L 72.000 216.000 L 72.000 180.000 L 128.000 138.000 L 184.000 180.350 ZM 184.000 75.640 L 128.000 118.000 L 72.000 76.000 L 72.000 40.000 L 184.000 40.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
