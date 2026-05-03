package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = phosphorDuotoneIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 80.180 L 224.000 175.820 C 223.993 178.737 222.399 181.420 219.840 182.820 L 131.840 231.000 C 129.447 232.309 126.553 232.309 124.160 231.000 L 36.160 182.820 C 33.601 181.420 32.007 178.737 32.000 175.820 L 32.000 80.180 C 32.007 77.263 33.601 74.580 36.160 73.180 L 124.160 25.000 C 126.553 23.691 129.447 23.691 131.840 25.000 L 219.840 73.180 C 222.399 74.580 223.993 77.263 224.000 80.180 Z"),
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
        pathData = parseSvgPathData("M 223.680 66.150 L 135.680 18.000 C 130.901 15.359 125.099 15.359 120.320 18.000 L 32.320 66.170 C 27.201 68.971 24.013 74.335 24.000 80.170 L 24.000 175.810 C 24.013 181.645 27.201 187.009 32.320 189.810 L 120.320 237.980 C 125.099 240.621 130.901 240.621 135.680 237.980 L 223.680 189.810 C 228.799 187.009 231.987 181.645 232.000 175.810 L 232.000 80.180 C 231.998 74.335 228.808 68.956 223.680 66.150 ZM 216.000 175.820 L 128.000 224.000 L 40.000 175.820 L 40.000 80.180 L 128.000 32.000 L 128.000 32.000 L 216.000 80.170 Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
