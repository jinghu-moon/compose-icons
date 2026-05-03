package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorThinIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 36.000 C 197.791 36.000 196.000 37.791 196.000 40.000 L 196.000 116.440 L 70.310 37.840 C 66.610 35.527 61.946 35.404 58.130 37.520 C 54.329 39.575 51.972 43.559 52.000 47.880 L 52.000 208.120 C 51.972 212.441 54.329 216.425 58.130 218.480 C 61.946 220.596 66.610 220.473 70.310 218.160 L 196.000 139.560 L 196.000 216.000 C 196.000 218.209 197.791 220.000 200.000 220.000 C 202.209 220.000 204.000 218.209 204.000 216.000 L 204.000 40.000 C 204.000 37.791 202.209 36.000 200.000 36.000 ZM 194.180 131.260 L 66.060 211.380 C 64.827 212.152 63.273 212.194 62.000 211.490 C 60.761 210.824 59.991 209.527 60.000 208.120 L 60.000 47.880 C 59.991 46.473 60.761 45.176 62.000 44.510 C 62.611 44.168 63.300 43.992 64.000 44.000 C 64.747 44.005 65.478 44.220 66.110 44.620 L 194.230 124.740 C 195.361 125.437 196.050 126.671 196.050 128.000 C 196.050 129.329 195.361 130.563 194.230 131.260 Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
