package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GiftCard: ImageVector
    get() {
        if (_giftCard != null) return _giftCard!!
        _giftCard = tablerFilledIcon(
            name = "GiftCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 4c2.131-0 3.888 1.671 3.995 3.8L22 8v8c0 2.131-1.671 3.888-3.8 3.995L18 20h-12C3.869 20 2.112 18.329 2.005 16.2L2 16v-8C2 5.869 3.671 4.112 5.8 4.005L6 4h12ZM12.507 9l-.19 .004c-.928 .052-1.719 .583-2.317 1.444C9.44 9.643 8.712 9.126 7.861 9.02L7.663 9.003 7.499 9l-.16 .005C6.059 9.091 5 10.184 5 11.5c0 1.226 1.222 2.211 2.453 2.447l.16 .026L6.293 15.293l-.083 .094c-.28 .361-.28 .865 0 1.226l.083 .094 .094 .083c.361 .28 .865 .28 1.226 0l.094-.083L10 14.415l2.293 2.292 .094 .083c.398 .309 .964 .273 1.32-.083 .356-.356 .392-.922 .083-1.32l-.083-.094L12.387 13.973c1.229-.169 2.502-1.11 2.606-2.315L15 11.5l-.005-.163C14.915 10.148 13.975 9.175 12.82 9.021l-.159-.016L12.507 9ZM12.482 11l.102 .009c.194 .04 .367 .21 .407 .406l.009 .085-.012 .031-.034 .04c-.13 .135-.513 .369-.836 .42L12 12h-.602l.052-.1 .088-.156c.27-.444 .574-.696 .852-.738L12.482 11ZM7.518 11l.084 .005 .094 .02c.254 .077 .523 .32 .765 .718l.09 .157L8.601 12h-.601l-.106-.008C7.496 11.935 7 11.592 7 11.5c0-.23 .194-.446 .416-.491l.102-.01Z"),
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
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
