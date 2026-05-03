package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorRegularIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.900 200.100 L 141.850 32.180 C 139.016 27.142 133.685 24.025 127.905 24.025 C 122.125 24.025 116.794 27.142 113.960 32.180 L 18.070 200.180 C 14.815 205.986 15.494 213.202 19.777 218.298 C 24.059 223.394 31.050 225.307 37.330 223.100 L 128.000 192.450 L 218.670 223.080 C 220.383 223.683 222.184 223.994 224.000 224.000 C 229.686 223.981 234.935 220.946 237.787 216.027 C 240.640 211.108 240.668 205.045 237.860 200.100 ZM 223.850 207.940 L 136.000 178.260 L 136.000 120.000 C 136.000 115.582 132.418 112.000 128.000 112.000 C 123.582 112.000 120.000 115.582 120.000 120.000 L 120.000 178.260 L 32.160 207.940 L 32.000 208.000 L 127.860 40.000 L 224.000 208.000 Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
