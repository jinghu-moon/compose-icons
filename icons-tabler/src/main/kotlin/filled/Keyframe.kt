package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyframe: ImageVector
    get() {
        if (_keyframe != null) return _keyframe!!
        _keyframe = tablerFilledIcon(
            name = "Keyframe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 C 11.224 4.004 10.490 4.355 10.000 4.957 L 5.645 10.197 C 4.789 11.243 4.786 12.746 5.638 13.795 L 10.006 19.051 C 10.505 19.651 11.231 20.000 12.000 20.000 C 12.776 19.996 13.510 19.645 14.000 19.043 L 18.355 13.803 C 19.211 12.757 19.214 11.254 18.362 10.205 L 13.994 4.949 C 13.504 4.351 12.773 4.003 12.000 4.000 Z"),
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
        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
