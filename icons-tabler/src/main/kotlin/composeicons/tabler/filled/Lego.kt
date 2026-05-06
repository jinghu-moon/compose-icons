package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = tablerFilledIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2c.552 0 1 .448 1 1v1l.2 .005c2.052 .103 3.692 1.743 3.795 3.795L21 8v9c0 1.764-1.156 3.321-2.845 3.83L18 20.873v.127c-0 .507-.38 .934-.883 .993L17 22h-10C6.448 22 6 21.552 6 21v-.127l-.155-.042C4.226 20.343 3.089 18.889 3.005 17.2L3 17v-9C3 5.791 4.791 4 7 4v-1C7 2.448 7.448 2 8 2ZM15.2 14.286c-.394-.387-1.027-.38-1.414 .014-.47 .48-1.114 .751-1.786 .751-.672 0-1.316-.271-1.786-.751-.388-.385-1.014-.387-1.404-.004-.39 .383-.401 1.008-.024 1.404 .846 .864 2.005 1.35 3.214 1.35 1.209 0 2.368-.487 3.214-1.35 .387-.394 .38-1.027-.014-1.414M9.51 10h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.51 10h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
