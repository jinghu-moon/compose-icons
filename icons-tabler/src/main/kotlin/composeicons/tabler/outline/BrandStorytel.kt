package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStorytel: ImageVector
    get() {
        if (_brandStorytel != null) return _brandStorytel!!
        _brandStorytel = tablerOutlineIcon(
            name = "BrandStorytel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.103f, 22.0f),
                    PathNode.CurveTo(6.395f, 19.067f, 20.928f, 19.57f, 20.928f, 10.462f),
                    PathNode.CurveTo(20.928f, 4.164f, 15.954f, 2.0f, 12.477f, 2.0f),
                    PathNode.CurveTo(9.0f, 2.0f, 3.0f, 5.036f, 3.0f, 13.241f),
                    PathNode.CurveTo(3.0f, 19.615f, 4.103f, 22.0f, 4.103f, 22.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandStorytel!!
    }

private var _brandStorytel: ImageVector? = null
