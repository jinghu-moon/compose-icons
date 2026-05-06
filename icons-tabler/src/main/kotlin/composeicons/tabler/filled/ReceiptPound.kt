package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReceiptPound: ImageVector
    get() {
        if (_receiptPound != null) return _receiptPound!!
        _receiptPound = tablerFilledIcon(
            name = "ReceiptPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v16c0 .369-.203 .708-.528 .882-.325 .174-.72 .155-1.027-.05L16.127 20.287l-1.42 1.42c-.356 .356-.922 .392-1.32 .083l-.094-.083L12 20.415l-1.293 1.292c-.356 .356-.922 .392-1.32 .083l-.094-.083L7.872 20.287 5.555 21.832l-.019 .012-.054 .03-.028 .017-.054 .023-.05 .023-.049 .015-.06 .019-.052 .009-.057 .011-.084 .006L5.022 22h-.022l-.049-.003h-.039l-.013-.003h-.016l-.041-.008-.038-.005-.015-.005-.018-.002-.034-.011-.04-.01-.019-.007-.015-.004-.029-.013-.04-.015-.021-.011-.013-.005-.028-.016-.036-.018-.014-.01-.018-.01-.038-.027-.022-.014-.01-.009-.02-.014-.045-.041-.012-.008-.024-.024-.035-.039-.02-.02-.007-.011-.011-.012-.032-.045-.02-.025-.012-.019-.03-.054-.017-.028-.023-.054-.023-.05c-.013-.035-.025-.071-.034-.108l-.01-.057-.01-.053L4 21v-16C4 3.343 5.343 2 7 2ZM13 6C11.343 6 10 7.343 10 9v2h-1c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h1c-0 .507-.38 .934-.883 .993L9 14c-1.287 0-1.332 1.864-.133 1.993L9 16h6c.552 0 1-.448 1-1l-.007-.117C15.934 14.38 15.507 14 15 14h-3.171l.048-.148c.082-.277 .123-.564 .123-.852h1c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-1v-2c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 7.343 14.657 6 13 6"),
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
        return _receiptPound!!
    }

private var _receiptPound: ImageVector? = null
