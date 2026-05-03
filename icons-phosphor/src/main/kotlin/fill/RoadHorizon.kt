package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorFillIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 239.000 188.080 L 173.680 72.000 L 231.680 72.000 C 235.990 72.095 239.632 68.825 240.000 64.530 C 240.147 62.318 239.369 60.144 237.853 58.527 C 236.336 56.910 234.217 55.995 232.000 56.000 L 24.270 56.000 C 19.979 55.932 16.367 59.195 16.000 63.470 C 15.853 65.682 16.631 67.856 18.147 69.473 C 19.664 71.090 21.783 72.005 24.000 72.000 L 82.320 72.000 L 17.000 188.080 C 15.279 191.140 15.753 194.964 18.170 197.510 C 19.745 199.127 21.913 200.027 24.170 200.000 L 116.000 200.000 C 118.209 200.000 120.000 198.209 120.000 196.000 L 120.000 176.270 C 119.942 171.987 123.202 168.387 127.470 168.020 C 129.682 167.873 131.856 168.651 133.473 170.167 C 135.090 171.684 136.005 173.803 136.000 176.020 L 136.000 196.020 C 136.000 198.229 137.791 200.020 140.000 200.020 L 231.770 200.020 C 234.027 200.047 236.195 199.147 237.770 197.530 C 240.216 194.994 240.716 191.157 239.000 188.080 ZM 136.000 140.000 C 136.000 144.418 132.418 148.000 128.000 148.000 C 123.582 148.000 120.000 144.418 120.000 140.000 L 120.000 124.000 C 120.000 119.582 123.582 116.000 128.000 116.000 C 132.418 116.000 136.000 119.582 136.000 124.000 ZM 136.000 88.000 C 136.000 92.418 132.418 96.000 128.000 96.000 C 123.582 96.000 120.000 92.418 120.000 88.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
