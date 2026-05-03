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
                pathData = parseSvgPathData("M 19.000 7.500 C 17.667 4.500 15.333 3.000 12.000 3.000 C 7.000 3.000 4.000 5.500 4.000 12.000 C 4.000 18.500 7.500 21.000 12.000 21.000 C 16.500 21.000 19.000 18.000 19.000 16.000 C 19.000 14.000 18.000 11.000 12.000 11.000 C 9.500 11.000 9.000 12.250 9.000 13.500 C 9.000 15.000 10.000 16.000 11.500 16.000 C 14.000 16.000 15.000 14.500 15.000 11.000 C 15.000 7.500 13.000 7.000 12.000 7.000 C 11.000 7.000 10.167 7.333 9.500 8.000"),
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
