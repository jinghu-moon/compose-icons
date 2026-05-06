package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = radixIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.325 .781c.919-.079 1.157-.026 1.734 .394l2.39 1.68c.394 .289 .525 .367 .525 .682v9.213c0 .577-.21 .919-.945 .972l-8.694 .524c-.552 .026-.815-.052-1.104-.42L1.471 11.542c-.315-.42-.446-.735-.446-1.102v-8.189c0-.472 .211-.866 .814-.918L9.325 .781ZM4.124 4.324c-.315 .026-.42 .184-.42 .525v7.82c0 .42 .21 .578 .683 .552l8.169-.473c.473-.026 .526-.315 .526-.656v-7.769c0-.341-.132-.525-.421-.499L4.124 4.324ZM11.769 5.269c.052 .236-0 .472-.237 .499l-.394 .079v5.773c-.342 .184-.656 .289-.919 .289-.42 0-.526-.131-.841-.524L6.803 7.343v3.91l.815 .185c-0 .017-.012 .472-.657 .472l-1.812 .106c-.053-.105 0-.367 .184-.42l.474-.132v-5.17L5.149 6.24c-.053-.236 .079-.577 .446-.604L7.539 5.505l2.68 4.095v-3.622L9.535 5.899c-.052-.289 .157-.499 .42-.525l1.813-.105ZM9.641 1.516 2.443 2.041c-.262 .026-.314 .158-.21 .263l1.025 .813c.42 .341 .577 .314 1.365 .262l7.434-.446c.157 0 .028-.156-.025-.183L10.796 1.857c-.236-.184-.551-.394-1.155-.342Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
