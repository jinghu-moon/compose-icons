package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard: ImageVector
    get() {
        if (_playCard != null) return _playCard!!
        _playCard = tablerFilledIcon(
            name = "PlayCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.617-.001 2.943 1.282 2.995 2.898Q20 4.948 20 5v14c0 1.657-1.343 3-3 3h-10C5.343 22 4 20.657 4 19v-14C4 3.343 5.343 2 7 2ZM16.01 17h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M12.8 7.4C12.611 7.148 12.315 7 12 7c-.315 0-.611 .148-.8 .4l-3 4c-.267 .356-.267 .844 0 1.2l2.988 3.984 .012 .016q.007 .01 .017 .02c.022 .032 .048 .06 .077 .086l.016 .018 .018 .016q.025 .024 .052 .043l.025 .02c.026 .021 .054 .04 .084 .056l.056 .03q.016 .01 .033 .018l.043 .017c.024 .012 .048 .021 .074 .028 .098 .033 .201 .049 .305 .047h.047c.032-.002 .064-.005 .095-.01 .055-.008 .11-.02 .163-.037l.025-.008 .049-.02c.027-.008 .052-.019 .076-.034 .028-.013 .055-.028 .08-.046 .029-.019 .058-.039 .085-.06 .032-.023 .06-.049 .086-.078l.018-.016 .016-.018 .043-.052 .017-.02 .009-.012 2.991-3.988c.267-.356 .267-.844 0-1.2ZM8.01 5h-.01C7.448 5 7 5.448 7 6c0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _playCard!!
    }

private var _playCard: ImageVector? = null
