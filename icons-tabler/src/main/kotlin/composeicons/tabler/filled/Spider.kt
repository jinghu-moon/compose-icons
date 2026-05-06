package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Spider: ImageVector
    get() {
        if (_spider != null) return _spider!!
        _spider = tablerFilledIcon(
            name = "Spider",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 3c.552 0 1 .448 1 1v2c-0 .265-.105 .52-.293 .707L16.414 10h3.17L20.793 8.793c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402l-1.5 1.5c-.187 .188-.442 .293-.707 .293h-3.585l4.292 4.293c.188 .187 .293 .442 .293 .707v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1.585L16.984 15.399c-.208 2.598-2.378 4.6-4.984 4.6-2.606 0-4.776-2.002-4.984-4.6L5 17.414v1.586c-0 .507-.38 .934-.883 .993L4 20C3.448 20 3 19.552 3 19v-2c0-.265 .105-.52 .293-.707L7.584 12h-3.584c-.265-0-.52-.105-.707-.293L1.793 10.207C1.414 9.815 1.419 9.191 1.805 8.805c.386-.386 1.009-.391 1.402-.012L4.415 10h3.17L4.293 6.707C4.105 6.52 4 6.265 4 6v-2C4 3.448 4.448 3 5 3c.552 0 1 .448 1 1v1.585L9.025 8.61C9.219 7.115 10.493 5.996 12 5.996c1.507 0 2.781 1.119 2.975 2.614L18 5.584v-1.584c0-.507 .38-.934 .883-.993Z"),
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
        return _spider!!
    }

private var _spider: ImageVector? = null
