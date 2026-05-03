package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationSouth: ImageVector
    get() {
        if (_navigationSouth != null) return _navigationSouth!!
        _navigationSouth = tablerOutlineIcon(
            name = "NavigationSouth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 8.25f),
                    PathNode.CurveTo(10.0f, 8.664f, 10.336f, 9.0f, 10.75f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.552285f, 9.0f, 14.0f, 8.552285f, 14.0f, 8.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 6.447716f, 13.552285f, 6.0f, 13.0f, 6.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(10.447715f, 6.0f, 10.0f, 5.552285f, 10.0f, 5.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(10.0f, 3.447715f, 10.447715f, 3.0f, 11.0f, 3.0f),
                    PathNode.LineTo(13.25f, 3.0f),
                    PathNode.CurveTo(13.664213f, 3.0f, 14.0f, 3.335786f, 14.0f, 3.75f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 21.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.LineTo(16.0f, 21.0f)
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
        return _navigationSouth!!
    }

private var _navigationSouth: ImageVector? = null
