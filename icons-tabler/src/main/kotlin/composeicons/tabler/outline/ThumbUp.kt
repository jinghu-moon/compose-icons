package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) return _thumbUp!!
        _thumbUp = tablerOutlineIcon(
            name = "ThumbUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 19.552284f, 6.552285f, 20.0f, 6.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(3.447715f, 20.0f, 3.0f, 19.552284f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 11.447715f, 3.447715f, 11.0f, 4.0f, 11.0f),
                    PathNode.LineTo(7.0f, 11.0f),
                    PathNode.CurveTo(9.209139f, 11.0f, 11.0f, 9.209139f, 11.0f, 7.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(11.0f, 4.895431f, 11.895431f, 4.0f, 13.0f, 4.0f),
                    PathNode.CurveTo(14.104569f, 4.0f, 15.0f, 4.895431f, 15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(19.10457f, 11.0f, 20.0f, 11.895431f, 20.0f, 13.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(18.704561f, 19.26026f, 17.889174f, 20.075645f, 17.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(8.343146f, 20.0f, 7.0f, 18.656855f, 7.0f, 17.0f)
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
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
