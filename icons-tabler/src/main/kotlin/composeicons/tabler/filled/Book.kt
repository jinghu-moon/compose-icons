package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = tablerFilledIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.5 5.134c.273 .158 .456 .435 .493 .748L22 6v13c-0 .357-.191 .687-.5 .866-.309 .179-.691 .179-1-0C18.199 18.537 15.389 18.438 13 19.6v-15.174c2.797-1.045 5.914-.785 8.5 .708M11 4.427l.001 15.174C8.709 18.485 6.022 18.529 3.767 19.718l-.327 .18-.103 .044-.049 .016-.11 .026-.061 .01L3 20h-.042l-.11-.012-.077-.014-.108-.032-.126-.056-.095-.056-.089-.067-.06-.056-.073-.082-.064-.089-.022-.036-.032-.06-.044-.103-.016-.049-.026-.11-.01-.061-.004-.049L2 6c0-.357 .191-.687 .5-.866C5.086 3.641 8.203 3.382 11 4.427"),
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
        return _book!!
    }

private var _book: ImageVector? = null
