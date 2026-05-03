package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FishChristianity: ImageVector
    get() {
        if (_fishChristianity != null) return _fishChristianity!!
        _fishChristianity = tablerOutlineIcon(
            name = "FishChristianity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 7.0f),
                    PathNode.CurveTo(22.0f, 7.0f, 16.354f, 17.0f, 9.692f, 17.0f),
                    PathNode.CurveTo(6.466f, 17.025f, 3.498f, 15.095f, 2.0f, 12.0f),
                    PathNode.CurveTo(3.498f, 8.905f, 6.466f, 6.975f, 9.692f, 7.0f),
                    PathNode.CurveTo(16.354f, 7.0f, 22.0f, 17.0f, 22.0f, 17.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _fishChristianity!!
    }

private var _fishChristianity: ImageVector? = null
