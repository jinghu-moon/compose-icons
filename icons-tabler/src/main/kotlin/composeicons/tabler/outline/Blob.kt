package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blob: ImageVector
    get() {
        if (_blob != null) return _blob!!
        _blob = tablerOutlineIcon(
            name = "Blob",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.897 20.188C7.567 20.94 9.793 21 12 21c2.207 0 4.434-.059 6.104-.812 .868-.392 1.614-.982 2.133-1.856 .514-.865 .763-1.94 .763-3.234C21 12.521 20.017 9.783 18.443 7.682 16.873 5.588 14.61 4 12 4 9.39 4 7.127 5.588 5.557 7.682 3.983 9.783 3 12.522 3 15.098c0 1.295 .249 2.369 .763 3.234 .519 .874 1.265 1.464 2.134 1.856"),
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
        return _blob!!
    }

private var _blob: ImageVector? = null
