package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReceiptEuro: ImageVector
    get() {
        if (_receiptEuro != null) return _receiptEuro!!
        _receiptEuro = tablerFilledIcon(
            name = "ReceiptEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v16c0 .369-.203 .708-.528 .882-.325 .174-.72 .155-1.027-.05L16.127 20.287l-1.42 1.42c-.356 .356-.922 .392-1.32 .083l-.094-.083L12 20.415l-1.293 1.292c-.356 .356-.922 .392-1.32 .083l-.094-.083L7.872 20.287 5.555 21.832c-.29 .194-.661 .223-.977 .076-.317-.147-.534-.449-.573-.796L4 21v-16C4 3.343 5.343 2 7 2ZM13.125 6C11.079 6 9.457 7.746 9.082 10h-.082c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.082c.376 2.254 1.997 4 4.043 4 1.106 0 2.053-.465 2.707-1.445 .307-.46 .183-1.08-.277-1.387-.46-.307-1.08-.183-1.387 .277-.267 .401-.58 .555-1.043 .555-.882 0-1.7-.814-2.002-1.999L13 12c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-1.877c.301-1.186 1.12-2 2.002-2 .462 0 .776 .154 1.043 .555 .307 .46 .927 .584 1.387 .277 .46-.307 .584-.927 .277-1.387C15.178 6.465 14.232 6 13.125 6"),
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
        return _receiptEuro!!
    }

private var _receiptEuro: ImageVector? = null
