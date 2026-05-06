package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Satellite: ImageVector
    get() {
        if (_satellite != null) return _satellite!!
        _satellite = tablerFilledIcon(
            name = "Satellite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 14c.552 0 1 .448 1 1 0 3.866-3.134 7-7 7-.552 0-1-.448-1-1 0-.552 .448-1 1-1 2.761 0 5-2.239 5-5 0-.552 .448-1 1-1M17 13.5c.552 0 1 .448 1 1C18 16.433 16.433 18 14.5 18c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L14.5 16c.773-0 1.419-.587 1.493-1.356L16 14.5c0-.552 .448-1 1-1M3.171 11.413l4 4.001q.212 .212 .445 .384l-.909 .91c-.39 .39-1.023 .39-1.414 0l-3-3c-.188-.188-.293-.442-.293-.708 0-.265 .106-.52 .293-.707ZM8.414 3 14 8.586c.781 .781 .781 2.047 0 2.828l-.586 .585 .793 .794c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L12 13.413 11.414 14c-.781 .781-2.047 .781-2.828 0L3 8.414C2.296 7.708 2.219 6.592 2.82 5.796l.127-.152L3 5.586 5.586 3c.781-.781 2.047-.781 2.828 0M13.707 2.293l3 3c.39 .39 .39 1.023 0 1.414l-.908 .91c-.117-.158-.245-.306-.384-.445l-4.001-4 .879-.88c.391-.39 1.023-.39 1.414 0"),
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
        return _satellite!!
    }

private var _satellite: ImageVector? = null
