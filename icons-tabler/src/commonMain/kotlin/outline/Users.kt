package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = tablerOutlineIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 9.209139f, 6.790861f, 11.0f, 9.0f, 11.0f),
                    PathNode.CurveTo(11.209139f, 11.0f, 13.0f, 9.209139f, 13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 4.790861f, 11.209139f, 3.0f, 9.0f, 3.0f),
                    PathNode.CurveTo(6.790861f, 3.0f, 5.0f, 4.790861f, 5.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(3.0f, 19.0f),
                    PathNode.CurveTo(3.0f, 16.790861f, 4.790861f, 15.0f, 7.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(13.209139f, 15.0f, 15.0f, 16.790861f, 15.0f, 19.0f),
                    PathNode.LineTo(15.0f, 21.0f)
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
                    PathNode.MoveTo(16.0f, 3.13f),
                    PathNode.CurveTo(17.769915f, 3.58317f, 19.007845f, 5.177991f, 19.007845f, 7.005f),
                    PathNode.CurveTo(19.007845f, 8.832009f, 17.769915f, 10.42683f, 16.0f, 10.88f)
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
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(20.989561f, 17.18457f, 19.757818f, 15.603835f, 18.0f, 15.15f)
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
        return _users!!
    }

private var _users: ImageVector? = null
