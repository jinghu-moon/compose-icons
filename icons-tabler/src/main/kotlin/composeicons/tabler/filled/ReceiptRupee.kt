package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReceiptRupee: ImageVector
    get() {
        if (_receiptRupee != null) return _receiptRupee!!
        _receiptRupee = tablerFilledIcon(
            name = "ReceiptRupee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.657 0 3 1.343 3 3v16c0 .369-.203 .708-.528 .882-.325 .174-.72 .155-1.027-.05L16.127 20.287l-1.42 1.42c-.356 .356-.922 .392-1.32 .083l-.094-.083L12 20.415l-1.293 1.292c-.356 .356-.922 .392-1.32 .083l-.094-.083L7.872 20.287 5.555 21.832l-.019 .012-.054 .03-.028 .017-.054 .023-.05 .023-.049 .015-.06 .019-.052 .009-.057 .011-.084 .006L5.022 22h-.022l-.049-.003h-.039l-.013-.003h-.016l-.041-.008-.038-.005-.015-.005-.018-.002-.034-.011-.04-.01-.019-.007-.015-.004-.029-.013-.04-.015-.021-.011-.013-.005-.028-.016-.036-.018-.014-.01-.018-.01-.038-.027-.022-.014-.01-.009-.02-.014-.045-.041-.012-.008-.024-.024-.035-.039-.02-.02-.007-.011-.011-.012-.032-.045-.02-.025-.012-.019-.03-.054-.017-.028-.023-.054-.023-.05c-.013-.035-.025-.071-.034-.108l-.01-.057-.01-.053L4 21v-16C4 3.343 5.343 2 7 2ZM15 6h-6C7.713 6 7.668 7.864 8.867 7.993L9 8h1c.715 0 1.375 .381 1.732 1h-2.732C8.448 9 8 9.448 8 10c0 .552 .448 1 1 1l2.732 .001c-.358 .618-1.018 .999-1.732 .999h-1c-.89 0-1.337 1.077-.707 1.707l3 3c.391 .39 1.023 .39 1.414 0l.083-.094c.309-.398 .273-.964-.083-1.32L11.223 13.808l.113-.037c1.253-.445 2.204-1.483 2.538-2.77L15 11c.552 0 1-.448 1-1C16 9.448 15.552 9 15 9h-1.126c-.077-.297-.188-.584-.33-.855L13.465 8h1.535c.552 0 1-.448 1-1l-.007-.117C15.934 6.38 15.507 6 15 6"),
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
        return _receiptRupee!!
    }

private var _receiptRupee: ImageVector? = null
