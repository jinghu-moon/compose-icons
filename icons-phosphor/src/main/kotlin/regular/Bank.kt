package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorRegularIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 24.000 104.000 L 48.000 104.000 L 48.000 168.000 L 32.000 168.000 C 27.582 168.000 24.000 171.582 24.000 176.000 C 24.000 180.418 27.582 184.000 32.000 184.000 L 224.000 184.000 C 228.418 184.000 232.000 180.418 232.000 176.000 C 232.000 171.582 228.418 168.000 224.000 168.000 L 208.000 168.000 L 208.000 104.000 L 232.000 104.000 C 235.577 103.996 238.716 101.619 239.690 98.178 C 240.663 94.736 239.235 91.067 236.190 89.190 L 132.190 25.190 C 129.620 23.610 126.380 23.610 123.810 25.190 L 19.810 89.190 C 16.765 91.067 15.337 94.736 16.310 98.178 C 17.284 101.619 20.423 103.996 24.000 104.000 ZM 64.000 104.000 L 96.000 104.000 L 96.000 168.000 L 64.000 168.000 ZM 144.000 104.000 L 144.000 168.000 L 112.000 168.000 L 112.000 104.000 ZM 192.000 168.000 L 160.000 168.000 L 160.000 104.000 L 192.000 104.000 ZM 128.000 41.390 L 203.740 88.000 L 52.260 88.000 ZM 248.000 208.000 C 248.000 212.418 244.418 216.000 240.000 216.000 L 16.000 216.000 C 11.582 216.000 8.000 212.418 8.000 208.000 C 8.000 203.582 11.582 200.000 16.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 203.582 248.000 208.000 Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
