package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = tablerOutlineIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 6.0f),
                    PathNode.LineTo(7.0f, 6.0f),
                    PathNode.CurveTo(5.895431f, 6.0f, 5.0f, 6.895431f, 5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.10457f, 5.895431f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.CurveTo(17.10457f, 19.0f, 18.0f, 18.10457f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 8.656855f, 15.343145f, 10.0f, 17.0f, 10.0f),
                    PathNode.CurveTo(18.656855f, 10.0f, 20.0f, 8.656855f, 20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 5.343146f, 18.656855f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(15.343145f, 4.0f, 14.0f, 5.343146f, 14.0f, 7.0f)
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
        return _notification!!
    }

private var _notification: ImageVector? = null
