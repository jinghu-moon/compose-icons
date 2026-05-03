package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorRegularIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.920 199.000 C 234.065 200.046 231.869 200.309 229.820 199.731 C 227.770 199.153 226.035 197.781 225.000 195.920 L 155.320 72.000 L 136.000 72.000 L 136.000 80.000 C 136.000 84.418 132.418 88.000 128.000 88.000 C 123.582 88.000 120.000 84.418 120.000 80.000 L 120.000 72.000 L 100.680 72.000 L 31.000 195.920 C 28.835 199.786 23.946 201.165 20.080 199.000 C 16.214 196.835 14.835 191.946 17.000 188.080 L 82.320 72.000 L 24.000 72.000 C 19.582 72.000 16.000 68.418 16.000 64.000 C 16.000 59.582 19.582 56.000 24.000 56.000 L 232.000 56.000 C 236.418 56.000 240.000 59.582 240.000 64.000 C 240.000 68.418 236.418 72.000 232.000 72.000 L 173.680 72.000 L 239.000 188.080 C 240.046 189.935 240.309 192.131 239.731 194.180 C 239.153 196.230 237.781 197.965 235.920 199.000 ZM 128.000 112.000 C 123.582 112.000 120.000 115.582 120.000 120.000 L 120.000 136.000 C 120.000 140.418 123.582 144.000 128.000 144.000 C 132.418 144.000 136.000 140.418 136.000 136.000 L 136.000 120.000 C 136.000 115.582 132.418 112.000 128.000 112.000 ZM 128.000 168.000 C 123.582 168.000 120.000 171.582 120.000 176.000 L 120.000 192.000 C 120.000 196.418 123.582 200.000 128.000 200.000 C 132.418 200.000 136.000 196.418 136.000 192.000 L 136.000 176.000 C 136.000 171.582 132.418 168.000 128.000 168.000 Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
