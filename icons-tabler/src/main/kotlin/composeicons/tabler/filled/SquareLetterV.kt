package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterV: ImageVector
    get() {
        if (_squareLetterV != null) return _squareLetterV!!
        _squareLetterV = tablerFilledIcon(
            name = "SquareLetterV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM14.243 7.03c-.536-.134-1.079 .191-1.213 .727L12 11.875 10.97 7.757c-.085-.349-.35-.625-.695-.725-.345-.099-.717-.006-.974 .244-.257 .25-.361 .619-.271 .967l2 8c.252 1.01 1.688 1.01 1.94 0l2-8c.134-.536-.191-1.079-.727-1.213"),
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
        return _squareLetterV!!
    }

private var _squareLetterV: ImageVector? = null
