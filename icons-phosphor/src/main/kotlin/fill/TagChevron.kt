package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorFillIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.660 132.440 L 201.000 200.880 C 198.038 205.320 193.057 207.990 187.720 208.000 L 32.000 208.000 C 29.048 208.002 26.335 206.378 24.942 203.776 C 23.549 201.174 23.702 198.015 25.340 195.560 L 70.390 128.000 L 25.390 60.440 C 23.757 57.992 23.599 54.845 24.980 52.246 C 26.361 49.647 29.057 48.016 32.000 48.000 L 187.720 48.000 C 193.057 48.010 198.038 50.680 201.000 55.120 L 246.630 123.560 C 248.433 126.242 248.445 129.746 246.660 132.440 Z"),
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
        return _tagChevron!!
    }

private var _tagChevron: ImageVector? = null
