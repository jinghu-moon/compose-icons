package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = tablerFilledIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.825 4.196l5 1.43c1.287 .368 2.175 1.545 2.175 2.884v.065c1.7 .33 3 1.72 3 3.425 0 1.705-1.3 3.095-3 3.425v.066c0 1.339-.887 2.517-2.175 2.885l-5 1.428c-.539 .154-1.111 .154-1.65 0l-5-1.429C4.952 18.025 4.082 16.943 4.005 15.673L4 15.426C2.3 15.096 1 13.706 1 12 1 10.295 2.3 8.904 4 8.574v-.064C4 7.171 4.888 5.994 6.175 5.626l5-1.428c.539-.154 1.111-.154 1.65 0M15 13h-6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h6c.552 0 1-.448 1-1 0-.552-.448-1-1-1M4 10.651C3.4 10.899 3 11.421 3 12c0 .578 .4 1.101 1 1.349ZM20.001 10.651v2.697C20.6 13.1 21 12.578 21 12c0-.578-.4-1.1-.999-1.348M15 9h-6C8.448 9 8 9.448 8 10c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1C16 9.448 15.552 9 15 9"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
