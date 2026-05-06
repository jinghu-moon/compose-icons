package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FishChristianity: ImageVector
    get() {
        if (_fishChristianity != null) return _fishChristianity!!
        _fishChristianity = tablerOutlineIcon(
            name = "FishChristianity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 7C22 7 16.354 17 9.692 17 6.466 17.025 3.498 15.095 2 12 3.498 8.905 6.466 6.975 9.692 7 16.354 7 22 17 22 17"),
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
        return _fishChristianity!!
    }

private var _fishChristianity: ImageVector? = null
