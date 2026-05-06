package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDownLeft: ImageVector
    get() {
        if (_circleArrowDownLeft != null) return _circleArrowDownLeft!!
        _circleArrowDownLeft = tablerFilledIcon(
            name = "CircleArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM9 8C8.448 8 8 8.448 8 9v6l.007 .117 .029 .149 .035 .105 .054 .113 .071 .111c.03 .04 .061 .077 .097 .112l.09 .08 .096 .067 .098 .052 .11 .044 .112 .03 .126 .017L15 16l.117-.007c.503-.059 .883-.486 .883-.993l-.007-.117C15.934 14.38 15.507 14 15 14h-3.586L15.707 9.707l.083-.094c.323-.417 .266-1.013-.13-1.362-.395-.349-.994-.33-1.367 .042L10 12.584v-3.584L9.993 8.883C9.934 8.38 9.507 8 9 8Z"),
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
        return _circleArrowDownLeft!!
    }

private var _circleArrowDownLeft: ImageVector? = null
