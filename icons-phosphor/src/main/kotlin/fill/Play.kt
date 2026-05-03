package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorFillIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 128.000 C 240.013 133.525 237.129 138.653 232.400 141.510 L 88.320 229.650 C 83.374 232.679 77.175 232.794 72.120 229.950 C 67.113 227.151 64.008 221.866 64.000 216.130 L 64.000 39.870 C 64.008 34.134 67.113 28.849 72.120 26.050 C 77.175 23.206 83.374 23.321 88.320 26.350 L 232.400 114.490 C 237.129 117.347 240.013 122.475 240.000 128.000 Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
