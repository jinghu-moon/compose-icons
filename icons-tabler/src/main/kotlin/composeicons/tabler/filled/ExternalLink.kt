package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = tablerFilledIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 5c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C5.448 7 5 7.448 5 8v10c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1v-6c0-.552 .448-1 1-1 .552 0 1 .448 1 1v6c0 1.657-1.343 3-3 3h-10C4.343 21 3 19.657 3 18v-10C3 6.343 4.343 5 6 5ZM15 3h5l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .096 .067 .09 .08q.054 .053 .097 .112l.071 .11 .054 .114 .035 .105 .03 .148L21 4v5c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2.586l-7.293 7.293c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L17.584 5h-2.584C14.448 5 14 4.552 14 4c0-.552 .448-1 1-1"),
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
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
