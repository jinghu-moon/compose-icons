package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = tablerOutlineIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 11.209139f, 8.790861f, 13.0f, 11.0f, 13.0f),
                    PathNode.CurveTo(13.209139f, 13.0f, 15.0f, 11.209139f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 6.790861f, 13.209139f, 5.0f, 11.0f, 5.0f),
                    PathNode.CurveTo(8.790861f, 5.0f, 7.0f, 6.790861f, 7.0f, 9.0f)
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
                    PathNode.MoveTo(5.75f, 15.0f),
                    PathNode.CurveTo(8.051914f, 16.999428f, 11.288917f, 17.519613f, 14.10137f, 16.342062f),
                    PathNode.CurveTo(16.913822f, 15.16451f, 18.814568f, 12.493192f, 19.005238f, 9.450139f),
                    PathNode.CurveTo(19.195906f, 6.407088f, 17.64347f, 3.519403f, 15.0f, 2.0f)
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
                    PathNode.MoveTo(11.0f, 17.0f),
                    PathNode.LineTo(11.0f, 21.0f)
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
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.LineTo(15.0f, 21.0f)
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
        return _globe!!
    }

private var _globe: ImageVector? = null
