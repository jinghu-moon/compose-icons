package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLastfm: ImageVector
    get() {
        if (_brandLastfm != null) return _brandLastfm!!
        _brandLastfm = tablerOutlineIcon(
            name = "BrandLastfm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 8C19.17 7 18.612 7 18 7c-.612 0-2 .271-2 2 0 1.729 1.384 2.233 3 3 1.616 .767 2.125 1.812 2 3-.125 1.188-1 2-3 2-2 0-3-1-3.5-2C14 14 12.915 10.22 12.003 9 10.346 6.791 7.212 6.343 5.003 8c-2.209 1.657-2.657 4.791-1 7 1.657 2.209 4.791 2.657 7 1"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandLastfm!!
    }

private var _brandLastfm: ImageVector? = null
