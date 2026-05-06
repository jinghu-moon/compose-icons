package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleX: ImageVector
    get() {
        if (_circleX != null) return _circleX!!
        _circleX = tablerFilledIcon(
            name = "CircleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM10.511 9.14c-.434-.258-.991-.153-1.301 .246-.31 .398-.274 .965 .083 1.321L10.585 12 9.293 13.293l-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042L12 13.415l1.293 1.292 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L13.415 12l1.292-1.293 .083-.094c.323-.417 .266-1.013-.13-1.362-.395-.349-.994-.33-1.367 .042L12 10.585 10.707 9.293l-.094-.083Z"),
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
        return _circleX!!
    }

private var _circleX: ImageVector? = null
