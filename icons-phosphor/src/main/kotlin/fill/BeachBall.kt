package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorFillIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 211.440 100.000 C 196.380 95.135 180.787 92.113 165.000 91.000 C 163.887 75.213 160.865 59.620 156.000 44.560 C 182.110 53.390 202.610 73.890 211.440 100.000 ZM 85.000 51.240 C 109.921 59.476 132.845 72.832 152.300 90.450 C 112.297 90.103 73.142 101.986 40.080 124.510 C 41.311 93.943 58.317 66.204 85.000 51.240 ZM 131.480 215.920 C 154.006 182.855 165.890 143.697 165.540 103.690 C 183.163 123.147 196.522 146.074 204.760 171.000 C 189.796 197.683 162.057 214.689 131.490 215.920 Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
