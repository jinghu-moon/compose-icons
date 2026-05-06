package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = tablerFilledIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.883 5.007l.058-.005h.118l.058 .005 .06 .009 .052 .01 .108 .032 .067 .027 .132 .07 .09 .065 .081 .073 .083 .094 .054 .077 .054 .096 .017 .036 .027 .067 .032 .108 .01 .053 .01 .06 .004 .057L15 6v12c0 .852-.986 1.297-1.623 .783l-.084-.076-6-6c-.356-.356-.392-.922-.083-1.32l.083-.094 6-6 .094-.083 .077-.054 .096-.054 .036-.017 .067-.027 .108-.032 .053-.01 .06-.01Z"),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
