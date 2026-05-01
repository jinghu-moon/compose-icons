package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Growth: ImageVector
    get() {
        if (_growth != null) return _growth!!
        _growth = tablerOutlineIcon(
            name = "Growth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.5f, 15.0f),
                    PathNode.CurveTo(14.014719f, 15.0f, 12.0f, 17.01472f, 12.0f, 19.5f),
                    PathNode.MoveTo(16.5f, 11.0f),
                    PathNode.CurveTo(14.014719f, 11.0f, 12.0f, 13.014719f, 12.0f, 15.5f),
                    PathNode.MoveTo(16.5f, 7.0f),
                    PathNode.CurveTo(14.014719f, 7.0f, 12.0f, 9.014719f, 12.0f, 11.5f),
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.CurveTo(10.21f, 15.0f, 12.0f, 17.015f, 12.0f, 19.5f),
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.CurveTo(10.21f, 11.0f, 12.0f, 13.015f, 12.0f, 15.5f),
                    PathNode.MoveTo(8.0f, 7.0f),
                    PathNode.CurveTo(10.21f, 7.0f, 12.0f, 9.015f, 12.0f, 11.5f),
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 10.0f)
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
        return _growth!!
    }

private var _growth: ImageVector? = null
