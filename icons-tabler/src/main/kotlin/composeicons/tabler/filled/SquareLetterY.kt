package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterY: ImageVector
    get() {
        if (_squareLetterY != null) return _squareLetterY!!
        _squareLetterY = tablerFilledIcon(
            name = "SquareLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM14.371 7.072c-.246-.099-.522-.095-.765 .009-.244 .104-.436 .301-.535 .548L12 10.307 10.928 7.629c-.217-.493-.786-.726-1.286-.526-.5 .2-.752 .761-.57 1.268L11 13.194v2.806c0 .507 .38 .934 .883 .993L12 17c.552 0 1-.448 1-1v-2.809L14.928 8.371c.188-.47-.005-1.008-.45-1.25Z"),
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
        return _squareLetterY!!
    }

private var _squareLetterY: ImageVector? = null
