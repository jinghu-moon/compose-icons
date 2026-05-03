package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbDownOff: ImageVector
    get() {
        if (_thumbDownOff != null) return _thumbDownOff!!
        _thumbDownOff = tablerOutlineIcon(
            name = "ThumbDownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.CurveTo(3.447715f, 4.0f, 3.0f, 4.447716f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 12.552285f, 3.447715f, 13.0f, 4.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(9.209139f, 13.0f, 11.0f, 14.790861f, 11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 19.10457f, 11.895431f, 20.0f, 13.0f, 20.0f),
                    PathNode.CurveTo(14.104569f, 20.0f, 15.0f, 19.10457f, 15.0f, 18.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(19.10457f, 13.0f, 20.0f, 12.104569f, 20.0f, 11.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(18.705f, 4.74f, 17.89f, 3.924f, 17.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(9.43f, 4.0f, 8.898f, 4.159f, 8.444f, 4.434f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _thumbDownOff!!
    }

private var _thumbDownOff: ImageVector? = null
