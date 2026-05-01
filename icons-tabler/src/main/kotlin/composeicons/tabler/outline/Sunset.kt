package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sunset: ImageVector
    get() {
        if (_sunset != null) return _sunset!!
        _sunset = tablerOutlineIcon(
            name = "Sunset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.MoveTo(20.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.MoveTo(5.6f, 10.6f),
                    PathNode.LineTo(6.3f, 11.3f),
                    PathNode.MoveTo(18.4f, 10.6f),
                    PathNode.LineTo(17.7f, 11.3f),
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 14.790861f, 9.790861f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(14.209139f, 13.0f, 16.0f, 14.790861f, 16.0f, 17.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 9.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
        return _sunset!!
    }

private var _sunset: ImageVector? = null
