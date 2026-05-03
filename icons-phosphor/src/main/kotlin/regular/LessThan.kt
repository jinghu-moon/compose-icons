package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorRegularIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 207.230 203.420 C 206.323 205.340 204.689 206.820 202.690 207.535 C 200.690 208.249 198.489 208.140 196.570 207.230 L 44.570 135.230 C 41.776 133.907 39.994 131.092 39.994 128.000 C 39.994 124.908 41.776 122.093 44.570 120.770 L 196.570 48.770 C 200.563 46.878 205.333 48.582 207.225 52.575 C 209.117 56.568 207.413 61.338 203.420 63.230 L 66.690 128.000 L 203.420 192.770 C 207.412 194.660 209.118 199.427 207.230 203.420 Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
