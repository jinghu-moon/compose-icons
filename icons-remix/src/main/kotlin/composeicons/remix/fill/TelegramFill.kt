package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TelegramFill: ImageVector
    get() {
        if (_telegramFill != null) return _telegramFill!!
        _telegramFill = remixIcon(
            name = "TelegramFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10ZM12.358 9.382c-.973 .405-2.917 1.242-5.832 2.512-.473 .188-.721 .372-.744 .552-.038 .304 .343 .424 .862 .587 .071 .022 .144 .045 .219 .07 .511 .166 1.197 .36 1.554 .368 .324 .007 .685-.127 1.084-.401 2.724-1.839 4.13-2.768 4.218-2.788 .062-.014 .149-.032 .207 .02 .058 .052 .053 .15 .047 .177-.038 .161-1.534 1.552-2.308 2.272-.231 .215-.456 .434-.683 .652-.474 .457-.83 .8 .02 1.36 .861 .568 1.729 1.134 2.569 1.733 .414 .295 .787 .561 1.246 .518 .267-.025 .543-.276 .683-1.025 .331-1.771 .982-5.608 1.133-7.189 .013-.139-.003-.316-.017-.394-.013-.078-.041-.189-.142-.271-.12-.097-.305-.118-.388-.116-.376 .007-.953 .207-3.73 1.362Z"),
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
        return _telegramFill!!
    }

private var _telegramFill: ImageVector? = null
