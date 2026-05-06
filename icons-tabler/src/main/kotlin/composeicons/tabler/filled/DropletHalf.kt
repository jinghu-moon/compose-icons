package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropletHalf: ImageVector
    get() {
        if (_dropletHalf != null) return _dropletHalf!!
        _dropletHalf = tablerFilledIcon(
            name = "DropletHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.07 .003c.713 .018 1.381 .35 1.825 .907l.108 .148 4.92 7.306c1.952 3.267 1.191 7.42-1.796 9.836-2.968 2.402-7.285 2.402-10.254 0C3.956 17.84 3.162 13.824 4.972 10.55l.134-.232L9.999 3.058c.185-.275 .426-.509 .709-.686 .322-.202 .687-.325 1.066-.36L12 2ZM11 5.149 6.794 11.389c-1.44 2.41-.88 5.463 1.337 7.257 .829 .668 1.818 1.108 2.869 1.276v-14.773Z"),
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
        return _dropletHalf!!
    }

private var _dropletHalf: ImageVector? = null
