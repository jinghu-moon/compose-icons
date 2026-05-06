package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mug: ImageVector
    get() {
        if (_mug != null) return _mug!!
        _mug = tablerFilledIcon(
            name = "Mug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.903 4.008 4.086 4h10.828c.552-.002 1.082 .216 1.474 .606 .391 .39 .612 .919 .612 1.471v.923h1.5C20.417 7 22 8.477 22 10.333v2.334C22 14.523 20.417 16 18.5 16h-1.663c-.608 2.358-2.735 4.004-5.17 4h-4.334C4.389 20 2 17.625 2 14.692v-8.618C2.003 4.996 2.829 4.1 3.903 4.008M17 14h1.5C19.343 14 20 13.387 20 12.667v-2.334C20 9.613 19.343 9 18.5 9h-1.5Z"),
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
        return _mug!!
    }

private var _mug: ImageVector? = null
