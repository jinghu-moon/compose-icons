package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = tablerFilledIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM12 18c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M15.684 7.051l-6 2c-.299 .1-.533 .334-.633 .633L7.044 15.71l-.023 .086-.017 .113L7 15.977v.044l.009 .111 .012 .07 .04 .144 .045 .1 .054 .095 .064 .09 .069 .075 .084 .074 .098 .07 .1 .054 .078 .033 .105 .033 .109 .02 .043 .005 .068 .004h.044l.111-.009 .07-.012 .02-.006 .019-.002 .074-.022 6-2c.299-.1 .533-.334 .633-.633l2-6c.12-.359 .026-.756-.242-1.023-.268-.268-.664-.361-1.023-.242ZM14.419 9.58l-1.21 3.629L9.58 14.419l1.21-3.629L14.419 9.58ZM5 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 11.448 5.552 11 5 11M19 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M12 4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 4.448 12.552 4 12 4"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
