package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandThreads: ImageVector
    get() {
        if (_brandThreads != null) return _brandThreads!!
        _brandThreads = tablerOutlineIcon(
            name = "BrandThreads",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 7.5C17.667 4.5 15.333 3 12 3 7 3 4 5.5 4 12c0 6.5 3.5 9 8 9 4.5 0 7-3 7-5 0-2-1-5-7-5C9.5 11 9 12.25 9 13.5 9 15 10 16 11.5 16 14 16 15 14.5 15 11 15 7.5 13 7 12 7 11 7 10.167 7.333 9.5 8"),
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
        return _brandThreads!!
    }

private var _brandThreads: ImageVector? = null
