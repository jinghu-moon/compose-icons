package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = tablerOutlineIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 20.0f, 7.0f, 18.0f, 8.0f, 16.5f),
                    PathNode.CurveTo(6.5f, 16.5f, 6.0f, 16.0f, 4.0f, 15.0f),
                    PathNode.CurveTo(4.0f, 15.0f, 5.839f, 13.62f, 9.0f, 14.0f),
                    PathNode.CurveTo(7.211f, 13.03f, 5.721f, 11.97f, 4.0f, 8.0f),
                    PathNode.CurveTo(4.0f, 8.0f, 7.98f, 7.7f, 10.5f, 11.5f),
                    PathNode.CurveTo(8.216f, 6.6f, 12.0f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(14.734f, 7.47f, 14.389f, 9.5f, 13.5f, 11.5f),
                    PathNode.CurveTo(16.031f, 7.73f, 20.0f, 8.0f, 20.0f, 8.0f),
                    PathNode.CurveTo(18.279f, 11.97f, 16.789f, 13.03f, 15.0f, 14.0f),
                    PathNode.CurveTo(18.161f, 13.62f, 20.0f, 15.0f, 20.0f, 15.0f),
                    PathNode.CurveTo(18.0f, 16.0f, 17.5f, 16.5f, 16.0f, 16.5f),
                    PathNode.CurveTo(17.0f, 18.0f, 17.0f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(15.0f, 20.0f, 12.562f, 17.78f, 12.0f, 17.0f),
                    PathNode.CurveTo(11.437f, 17.78f, 9.0f, 20.0f, 7.0f, 20.0f)
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
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 17.0f)
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
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
