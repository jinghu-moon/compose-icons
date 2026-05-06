package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterY: ImageVector
    get() {
        if (_circleLetterY != null) return _circleLetterY!!
        _circleLetterY = tablerFilledIcon(
            name = "CircleLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14.371 7.072c-.246-.099-.522-.095-.765 .009-.244 .104-.436 .301-.535 .548L12 10.307 10.928 7.629c-.217-.493-.786-.726-1.286-.526-.5 .2-.752 .761-.57 1.268L11 13.194v2.806c0 .507 .38 .934 .883 .993L12 17c.552 0 1-.448 1-1v-2.809L14.928 8.371c.188-.47-.005-1.008-.45-1.25Z"),
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
        return _circleLetterY!!
    }

private var _circleLetterY: ImageVector? = null
