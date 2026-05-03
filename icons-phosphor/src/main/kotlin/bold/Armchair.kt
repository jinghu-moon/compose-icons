package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorBoldIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 78.530 L 220.000 72.000 C 219.972 47.711 200.289 28.028 176.000 28.000 L 80.000 28.000 C 55.711 28.028 36.028 47.711 36.000 72.000 L 36.000 78.530 C 14.504 85.448 -0.070 105.448 -0.070 128.030 C -0.070 150.612 14.504 170.612 36.000 177.530 L 36.000 200.000 C 36.000 211.046 44.954 220.000 56.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 177.510 C 241.496 170.592 256.070 150.592 256.070 128.010 C 256.070 105.428 241.496 85.428 220.000 78.510 ZM 80.000 52.000 L 176.000 52.000 C 187.046 52.000 196.000 60.954 196.000 72.000 L 196.000 76.620 C 172.187 80.369 154.056 99.967 152.170 124.000 L 103.830 124.000 C 101.944 99.967 83.813 80.369 60.000 76.620 L 60.000 72.000 C 60.000 60.954 68.954 52.000 80.000 52.000 ZM 206.810 155.860 C 200.674 156.471 196.000 161.634 196.000 167.800 L 196.000 196.000 L 60.000 196.000 L 60.000 167.800 C 60.000 161.634 55.326 156.471 49.190 155.860 C 34.168 154.345 23.052 141.191 24.063 126.127 C 25.074 111.062 37.847 99.512 52.937 100.017 C 68.027 100.522 79.999 112.901 80.000 128.000 L 80.000 164.000 C 80.000 170.627 85.373 176.000 92.000 176.000 C 98.627 176.000 104.000 170.627 104.000 164.000 L 104.000 148.000 L 152.000 148.000 L 152.000 164.000 C 152.000 170.627 157.373 176.000 164.000 176.000 C 170.627 176.000 176.000 170.627 176.000 164.000 L 176.000 128.000 C 176.001 112.901 187.973 100.522 203.063 100.017 C 218.153 99.512 230.926 111.062 231.937 126.127 C 232.948 141.191 221.832 154.345 206.810 155.860 Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
