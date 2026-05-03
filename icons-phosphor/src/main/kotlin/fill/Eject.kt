package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorFillIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 33.310 126.240 C 30.767 120.434 31.992 113.666 36.410 109.120 L 36.410 109.120 L 110.140 31.610 C 114.809 26.747 121.259 23.999 128.000 23.999 C 134.741 23.999 141.191 26.747 145.860 31.610 L 219.590 109.120 C 224.008 113.666 225.233 120.434 222.690 126.240 C 220.118 132.190 214.242 136.031 207.760 136.000 L 48.240 136.000 C 41.758 136.031 35.882 132.190 33.310 126.240 ZM 208.000 152.000 L 48.000 152.000 C 39.163 152.000 32.000 159.163 32.000 168.000 L 32.000 184.000 C 32.000 192.837 39.163 200.000 48.000 200.000 L 208.000 200.000 C 216.837 200.000 224.000 192.837 224.000 184.000 L 224.000 168.000 C 224.000 159.163 216.837 152.000 208.000 152.000 Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
