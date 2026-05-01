package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tank: ImageVector
    get() {
        if (_tank != null) return _tank!!
        _tank = tablerOutlineIcon(
            name = "Tank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 15.0f),
                    PathNode.CurveTo(2.0f, 13.343145f, 3.343146f, 12.0f, 5.0f, 12.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.CurveTo(18.656855f, 12.0f, 20.0f, 13.343145f, 20.0f, 15.0f),
                    PathNode.CurveTo(20.0f, 16.656855f, 18.656855f, 18.0f, 17.0f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(3.343146f, 18.0f, 2.0f, 16.656855f, 2.0f, 15.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(15.0f, 12.0f)
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
                    PathNode.MoveTo(21.0f, 9.0f),
                    PathNode.LineTo(13.2f, 9.0f)
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
        return _tank!!
    }

private var _tank: ImageVector? = null
