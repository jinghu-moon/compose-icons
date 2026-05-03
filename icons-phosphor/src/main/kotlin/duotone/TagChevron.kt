package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TagChevron: ImageVector
    get() {
        if (_tagChevron != null) return _tagChevron!!
        _tagChevron = phosphorDuotoneIcon(
            name = "TagChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 128.000 L 194.380 196.440 C 192.895 198.666 190.396 200.002 187.720 200.000 L 32.000 200.000 L 80.000 128.000 L 32.000 56.000 L 187.720 56.000 C 190.396 55.998 192.895 57.334 194.380 59.560 Z"),
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
        pathData = parseSvgPathData("M 246.660 123.560 L 201.000 55.120 C 198.038 50.680 193.057 48.010 187.720 48.000 L 32.000 48.000 C 29.048 47.998 26.335 49.622 24.942 52.224 C 23.549 54.826 23.702 57.985 25.340 60.440 L 70.390 128.000 L 25.390 195.560 C 23.757 198.008 23.599 201.155 24.980 203.754 C 26.361 206.353 29.057 207.984 32.000 208.000 L 187.720 208.000 C 193.057 207.990 198.038 205.320 201.000 200.880 L 246.630 132.440 C 248.433 129.758 248.445 126.254 246.660 123.560 ZM 187.720 192.000 L 47.000 192.000 L 86.710 132.440 C 88.504 129.752 88.504 126.248 86.710 123.560 L 47.000 64.000 L 187.720 64.000 L 230.390 128.000 Z"),
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
