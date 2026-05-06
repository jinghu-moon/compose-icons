package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodCrazyHappy: ImageVector
    get() {
        if (_moodCrazyHappy != null) return _moodCrazyHappy!!
        _moodCrazyHappy = tablerFilledIcon(
            name = "MoodCrazyHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34M15.2 14.286c-.394-.387-1.027-.38-1.414 .014-.47 .48-1.114 .751-1.786 .751-.672 0-1.316-.271-1.786-.751-.388-.385-1.014-.387-1.404-.004-.39 .383-.401 1.008-.024 1.404 .846 .864 2.005 1.35 3.214 1.35 1.209 0 2.368-.487 3.214-1.35 .387-.394 .38-1.027-.014-1.414M7.707 7.793C7.315 7.414 6.691 7.419 6.305 7.805c-.386 .386-.391 1.009-.012 1.402L7.085 10l-.792 .793c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l.793-.792 .793 .792c.251 .26 .623 .364 .973 .273 .35-.092 .623-.365 .714-.714 .092-.35-.013-.721-.273-.973L9.915 10l.792-.793c.26-.251 .364-.623 .273-.973-.092-.35-.365-.623-.714-.714-.35-.092-.721 .013-.973 .273l-.793 .792ZM14.707 7.793c-.392-.379-1.016-.374-1.402 .012-.386 .386-.391 1.009-.012 1.402l.792 .793-.792 .793c-.379 .392-.374 1.016 .012 1.402 .386 .386 1.009 .391 1.402 .012l.793-.792 .793 .792c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402L16.915 10l.792-.793c.26-.251 .364-.623 .273-.973-.092-.35-.365-.623-.714-.714-.35-.092-.721 .013-.973 .273l-.793 .792Z"),
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
        return _moodCrazyHappy!!
    }

private var _moodCrazyHappy: ImageVector? = null
