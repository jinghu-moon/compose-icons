package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Blob: ImageVector
    get() {
        if (_blob != null) return _blob!!
        _blob = tablerFilledIcon(
            name = "Blob",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c2.779 0 5.349 1.556 7.243 4.082C20.971 9.388 22 12.341 22 15.098c0 1.47-.293 2.718-.903 3.745-.603 1.014-1.479 1.758-2.582 2.257C16.922 21.818 15.18 22 12 22 8.825 22 7.08 21.817 5.486 21.1 4.474 20.643 3.653 19.98 3.06 19.09l-.157-.247C2.293 17.815 2 16.569 2 15.098 2 12.341 3.03 9.388 4.757 7.082 6.65 4.556 9.22 3 12 3"),
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
        return _blob!!
    }

private var _blob: ImageVector? = null
