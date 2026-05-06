package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDownRight: ImageVector
    get() {
        if (_circleArrowDownRight != null) return _circleArrowDownRight!!
        _circleArrowDownRight = tablerFilledIcon(
            name = "CircleArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM15 8l-.117 .007C14.38 8.066 14 8.493 14 9v3.585L9.707 8.293 9.613 8.21C9.196 7.887 8.6 7.944 8.251 8.34c-.349 .395-.33 .994 .042 1.367L12.585 14h-3.585l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l6.034 .001c.063-.002 .125-.011 .186-.025l.053-.014 .066-.02 .13-.059 .093-.055c.277-.184 .442-.496 .438-.828v-6l-.007-.117C15.934 8.38 15.507 8 15 8Z"),
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
        return _circleArrowDownRight!!
    }

private var _circleArrowDownRight: ImageVector? = null
