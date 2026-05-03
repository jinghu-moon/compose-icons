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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 8.000 C 19.170 7.000 18.612 7.000 18.000 7.000 C 17.388 7.000 16.000 7.271 16.000 9.000 C 16.000 10.729 17.384 11.233 19.000 12.000 C 20.616 12.767 21.125 13.812 21.000 15.000 C 20.875 16.188 20.000 17.000 18.000 17.000 C 16.000 17.000 15.000 16.000 14.500 15.000 C 14.000 14.000 12.915 10.220 12.003 9.000 C 10.346 6.791 7.212 6.343 5.003 8.000 C 2.794 9.657 2.346 12.791 4.003 15.000 C 5.660 17.209 8.794 17.657 11.003 16.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandLastfm!!
    }

private var _brandLastfm: ImageVector? = null
