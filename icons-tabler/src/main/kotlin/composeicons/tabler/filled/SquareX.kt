package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareX: ImageVector
    get() {
        if (_squareX != null) return _squareX!!
        _squareX = tablerFilledIcon(
            name = "SquareX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2h-14C3.343 2 2 3.343 2 5v14c0 1.657 1.343 3 3 3h14c1.657 0 3-1.343 3-3v-14C22 3.343 20.657 2 19 2ZM9.613 8.21l.094 .083L12 10.585 14.293 8.293c.373-.372 .972-.39 1.367-.042 .395 .349 .452 .945 .13 1.362l-.083 .094L13.415 12l2.292 2.293c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.094-.083L12 13.415 9.707 15.707c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L10.585 12 8.293 9.707C7.921 9.334 7.903 8.735 8.251 8.34c.349-.395 .945-.452 1.362-.13Z"),
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
        return _squareX!!
    }

private var _squareX: ImageVector? = null
