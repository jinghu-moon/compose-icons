package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = tablerFilledIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.555 4.168c.221 .147 .374 .376 .426 .636 .052 .26-.002 .53-.149 .751L18.211 9.487l1.236 .619c.476 .256 .661 .844 .42 1.327-.242 .483-.823 .687-1.314 .461l-1.46-.73-3.876 5.815c.903 .991 1.039 2.461 .334 3.6-.706 1.14-2.082 1.673-3.372 1.306C8.889 21.519 8 20.341 8 19l.005-.176q.008-.135 .027-.267L5.445 16.832c-.46-.307-.584-.927-.277-1.387 .307-.46 .927-.584 1.387-.277l2.424 1.615c.666-.609 1.572-.885 2.464-.75L19.168 4.445c.147-.221 .376-.374 .636-.426 .26-.052 .53 .002 .751 .149M9.988 3.769l.14 .082 3.307 2.104c.516 .328 .881 .849 1.012 1.447 .131 .598 .019 1.223-.312 1.738l-3.094 4.81c-.684 1.066-2.101 1.378-3.17 .698L4.565 12.544c-.516-.328-.881-.849-1.012-1.447C3.422 10.499 3.534 9.874 3.865 9.359L6.959 4.549C7.609 3.537 8.93 3.197 9.988 3.769"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
