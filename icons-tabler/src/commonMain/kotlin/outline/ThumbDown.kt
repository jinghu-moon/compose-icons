package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) return _thumbDown!!
        _thumbDown = tablerOutlineIcon(
            name = "ThumbDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 13.0f),
                    PathNode.LineTo(7.0f, 5.0f),
                    PathNode.CurveTo(7.0f, 4.447716f, 6.552285f, 4.0f, 6.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(3.447715f, 4.0f, 3.0f, 4.447716f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 12.552285f, 3.447715f, 13.0f, 4.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.CurveTo(9.209139f, 13.0f, 11.0f, 14.790861f, 11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 19.10457f, 11.895431f, 20.0f, 13.0f, 20.0f),
                    PathNode.CurveTo(14.104569f, 20.0f, 15.0f, 19.10457f, 15.0f, 18.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(19.10457f, 13.0f, 20.0f, 12.104569f, 20.0f, 11.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(18.704561f, 4.739741f, 17.889174f, 3.924354f, 17.0f, 4.0f),
                    PathNode.LineTo(10.0f, 4.0f),
                    PathNode.CurveTo(8.343146f, 4.0f, 7.0f, 5.343146f, 7.0f, 7.0f)
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
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
