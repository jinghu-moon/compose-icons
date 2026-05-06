package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = tablerFilledIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.874 3.486 17.7 11h3.3c.846 0 1.293 .973 .791 1.612l-.074 .085-6.9 7.095c-1.939 1.947-4.787 2.678-7.424 1.905C4.756 20.924 2.753 18.771 2.172 16.086 1.591 13.4 2.525 10.612 4.607 8.818L12.353 2.238c.722-.614 1.814 .028 1.628 .958l-.577 2.879L20.514 2.125c.88-.488 1.849 .481 1.36 1.36M9.5 11C7.641 11 6.107 12.452 6.005 14.308L6 14.5C6 16.433 7.567 18 9.5 18 11.433 18 13 16.433 13 14.5 13 12.567 11.433 11 9.5 11"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
