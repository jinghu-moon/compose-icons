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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 4c-.776 .004-1.51 .355-2 .957L5.645 10.197c-.856 1.046-.859 2.549-.007 3.598l4.368 5.256c.499 .6 1.225 .949 1.994 .949 .776-.004 1.51-.355 2-.957l4.355-5.24c.856-1.046 .859-2.549 .007-3.598L13.994 4.949C13.504 4.351 12.773 4.003 12 4Z"),
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
        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
