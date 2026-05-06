package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meeple: ImageVector
    get() {
        if (_meeple != null) return _meeple!!
        _meeple = tablerOutlineIcon(
            name = "Meeple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 20h-5C3.448 20 3 19.552 3 19 3 17 6.378 14.093 7 13 6 13 3 12.5 3 11 3 9 7 7.5 9 7 9 5.5 9.5 3 12 3c2.5 0 3 2.5 3 4 2 .5 6 2 6 4 0 1.5-3 2-4 2 .622 1.093 4 4 4 6 0 .552-.448 1-1 1h-5c-1 0-2-4-3-4-1 0-2 4-3 4"),
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
        return _meeple!!
    }

private var _meeple: ImageVector? = null
