package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorRegularIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 72.000 L 184.000 56.000 L 80.650 56.000 L 134.250 123.000 C 136.590 125.923 136.590 130.077 134.250 133.000 L 80.650 200.000 L 184.000 200.000 L 184.000 184.000 C 184.000 179.582 187.582 176.000 192.000 176.000 C 196.418 176.000 200.000 179.582 200.000 184.000 L 200.000 208.000 C 200.000 212.418 196.418 216.000 192.000 216.000 L 64.000 216.000 C 60.923 216.002 58.118 214.239 56.785 211.466 C 55.452 208.693 55.827 205.402 57.750 203.000 L 117.750 128.000 L 57.750 53.000 C 55.827 50.598 55.452 47.307 56.785 44.534 C 58.118 41.761 60.923 39.998 64.000 40.000 L 192.000 40.000 C 196.418 40.000 200.000 43.582 200.000 48.000 L 200.000 72.000 C 200.000 76.418 196.418 80.000 192.000 80.000 C 187.582 80.000 184.000 76.418 184.000 72.000 Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
