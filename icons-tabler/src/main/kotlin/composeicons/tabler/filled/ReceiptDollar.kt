package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReceiptDollar: ImageVector
    get() {
        if (_receiptDollar != null) return _receiptDollar!!
        _receiptDollar = tablerFilledIcon(
            name = "ReceiptDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v16c0 .369-.203 .708-.528 .882-.325 .174-.72 .155-1.027-.05L16.127 20.287l-1.42 1.42c-.356 .356-.922 .392-1.32 .083l-.094-.083L12 20.415l-1.293 1.292c-.356 .356-.922 .392-1.32 .083l-.094-.083L7.872 20.287 5.555 21.832l-.019 .012-.054 .03-.028 .017-.054 .023-.05 .023-.049 .015-.06 .019-.052 .009-.057 .011-.084 .006L5.022 22h-.022l-.049-.003h-.039l-.013-.003h-.016l-.041-.008-.038-.005-.015-.005-.018-.002-.034-.011-.04-.01-.019-.007-.015-.004-.029-.013-.04-.015-.021-.011-.013-.005-.028-.016-.036-.018-.014-.01-.018-.01-.038-.027-.022-.014-.01-.009-.02-.014-.045-.041-.012-.008-.024-.024-.035-.039-.02-.02-.007-.011-.011-.012-.032-.045-.02-.025-.012-.019-.03-.054-.017-.028-.023-.054-.023-.05c-.013-.035-.025-.071-.034-.108l-.01-.057-.01-.053L4 21v-16C4 3.343 5.343 2 7 2ZM12 5c-.552 0-1 .448-1 1C9.343 6 8 7.343 8 9c0 1.657 1.343 3 3 3v2c-.403 .013-.75-.18-.934-.5-.278-.474-.887-.635-1.363-.36-.476 .275-.641 .882-.369 1.36 .519 .9 1.467 1.467 2.505 1.5L11 15.999c-0 .552 .447 1 1 1.001 .552 0 1-.447 1-1l.176-.005c1.621-.094 2.873-1.46 2.826-3.083C15.954 11.289 14.624 9.998 13 10v-2c.403-.013 .75 .18 .934 .5 .278 .474 .887 .635 1.363 .36 .476-.275 .641-.882 .369-1.36C15.147 6.6 14.199 6.033 13.161 6h-.161C13 5.448 12.552 5 12 5M13 12c.552 0 1 .448 1 1 0 .552-.448 1-1 1ZM11 8v2c-.552 0-1-.448-1-1 0-.552 .448-1 1-1"),
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
        return _receiptDollar!!
    }

private var _receiptDollar: ImageVector? = null
