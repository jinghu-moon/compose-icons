package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorThinIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 197.870 37.520 C 194.054 35.404 189.390 35.527 185.690 37.840 L 60.000 116.440 L 60.000 40.000 C 60.000 37.791 58.209 36.000 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 216.000 C 52.000 218.209 53.791 220.000 56.000 220.000 C 58.209 220.000 60.000 218.209 60.000 216.000 L 60.000 139.560 L 185.690 218.160 C 189.390 220.473 194.054 220.596 197.870 218.480 C 201.671 216.425 204.028 212.441 204.000 208.120 L 204.000 47.880 C 204.028 43.559 201.671 39.575 197.870 37.520 ZM 196.000 208.120 C 196.009 209.527 195.239 210.824 194.000 211.490 C 192.727 212.194 191.173 212.152 189.940 211.380 L 61.820 131.260 C 60.689 130.563 60.000 129.329 60.000 128.000 C 60.000 126.671 60.689 125.437 61.820 124.740 L 189.940 44.620 C 190.572 44.220 191.303 44.005 192.050 44.000 C 192.733 44.001 193.404 44.176 194.000 44.510 C 195.239 45.176 196.009 46.473 196.000 47.880 Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
