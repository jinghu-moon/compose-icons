package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDown: ImageVector
    get() {
        if (_circleArrowDown != null) return _circleArrowDown!!
        _circleArrowDown = tablerFilledIcon(
            name = "CircleArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.167 2.406 6.03 7.439 4.433 11.979-1.597 4.539-6.201 7.298-10.957 6.565C5.72 21.15 2.161 17.134 2.005 12.324L2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM12 7c-.552 0-1 .448-1 1v5.585L8.707 11.293l-.094-.083c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367l4 4c.028 .028 .057 .054 .094 .083l.092 .064 .098 .052 .081 .034 .113 .034 .112 .02L12 17l.115-.007 .114-.02 .142-.044 .113-.054 .111-.071c.04-.029 .077-.062 .112-.097l4-4 .083-.094c.323-.417 .266-1.013-.13-1.362-.395-.349-.994-.33-1.367 .042L13 13.584v-5.584l-.007-.117C12.934 7.38 12.507 7 12 7Z"),
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
        return _circleArrowDown!!
    }

private var _circleArrowDown: ImageVector? = null
