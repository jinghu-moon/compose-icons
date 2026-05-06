package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.JewelryFill: ImageVector
    get() {
        if (_jewelryFill != null) return _jewelryFill!!
        _jewelryFill = remixIcon(
            name = "JewelryFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2.847v2.016c0 .389 .225 .742 .577 .906l.409 .191c-.086 1.403-.558 2.636-1.243 3.526C13.985 10.472 13.007 11 12 11 10.994 11 10.016 10.472 9.258 9.486 8.572 8.596 8.1 7.363 8.014 5.96l.409-.191c.352-.164 .577-.518 .577-.906v-2.016c0-.489 .354-.905 .839-.961 1.443-.166 2.879-.166 4.322 0 .486 .056 .839 .472 .839 .961ZM6.097 6.855 2.85 8.37c-.747 .349-1.073 1.235-.729 1.984l4.478 9.771c.244 .533 .777 .875 1.364 .875h8.075c.586 0 1.119-.342 1.364-.875l4.478-9.771c.344-.749 .018-1.636-.729-1.984L17.903 6.855c-.213 1.468-.767 2.801-1.575 3.851-.913 1.187-2.18 2.042-3.648 2.247l1.508 2.111c.186 .261 .186 .611 0 .872l-1.985 2.779c-.1 .14-.307 .14-.407 0L9.812 15.936c-.186-.261-.186-.611 0-.872l1.508-2.111C9.853 12.748 8.585 11.893 7.672 10.706 6.864 9.656 6.31 8.323 6.097 6.855Z"),
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
        return _jewelryFill!!
    }

private var _jewelryFill: ImageVector? = null
