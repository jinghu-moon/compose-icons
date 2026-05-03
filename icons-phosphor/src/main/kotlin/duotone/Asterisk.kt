package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorDuotoneIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 128.000 C 200.000 167.764 167.764 200.000 128.000 200.000 C 88.235 200.000 56.000 167.764 56.000 128.000 C 56.000 88.235 88.235 56.000 128.000 56.000 C 167.764 56.000 200.000 88.235 200.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 214.860 180.120 C 213.768 181.945 211.993 183.260 209.929 183.775 C 207.865 184.289 205.681 183.960 203.860 182.860 L 136.000 142.130 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 142.130 L 52.120 182.860 C 49.668 184.367 46.595 184.440 44.073 183.051 C 41.552 181.663 39.971 179.027 39.933 176.149 C 39.895 173.271 41.406 170.594 43.890 169.140 L 112.450 128.000 L 43.890 86.860 C 41.406 85.406 39.895 82.729 39.933 79.851 C 39.971 76.973 41.552 74.337 44.073 72.949 C 46.595 71.560 49.668 71.633 52.120 73.140 L 120.000 113.870 L 120.000 40.000 C 120.000 35.582 123.582 32.000 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 L 136.000 113.870 L 203.880 73.140 C 206.332 71.633 209.405 71.560 211.927 72.949 C 214.448 74.337 216.029 76.973 216.067 79.851 C 216.105 82.729 214.594 85.406 212.110 86.860 L 143.550 128.000 L 212.110 169.140 C 213.932 170.231 215.245 172.001 215.761 174.060 C 216.276 176.120 215.952 178.300 214.860 180.120 Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
