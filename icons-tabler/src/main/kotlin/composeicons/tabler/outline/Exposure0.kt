package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Exposure0: ImageVector
    get() {
        if (_exposure0 != null) return _exposure0!!
        _exposure0 = tablerOutlineIcon(
            name = "Exposure0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.CurveTo(14.209139f, 19.0f, 16.0f, 17.209139f, 16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 6.790861f, 14.209139f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(9.790861f, 5.0f, 8.0f, 6.790861f, 8.0f, 9.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.CurveTo(8.0f, 17.209139f, 9.790861f, 19.0f, 12.0f, 19.0f)
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
        return _exposure0!!
    }

private var _exposure0: ImageVector? = null
