package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = tablerFilledIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.172 2.000 C 11.968 2.000 12.731 2.316 13.293 2.879 L 21.003 10.589 C 22.334 11.921 22.334 14.079 21.003 15.411 L 15.411 21.003 C 14.079 22.334 11.921 22.334 10.589 21.003 L 2.879 13.293 C 2.316 12.731 2.000 11.968 2.000 11.172 L 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000 ZM 7.500 5.500 C 6.453 5.500 5.583 6.306 5.505 7.350 L 5.500 7.500 C 5.500 8.605 6.395 9.500 7.500 9.500 C 8.605 9.500 9.500 8.605 9.500 7.500 C 9.500 6.395 8.605 5.500 7.500 5.500"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
