package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NotificationOff: ImageVector
    get() {
        if (_notificationOff != null) return _notificationOff!!
        _notificationOff = tablerOutlineIcon(
            name = "NotificationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.154f, 6.187f),
                    PathNode.CurveTo(5.449733f, 6.515767f, 4.999712f, 7.222775f, 5.0f, 8.0f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.10457f, 5.895431f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.CurveTo(16.775812f, 19.000055f, 17.481668f, 18.551441f, 17.811f, 17.849f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
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
        }
        return _notificationOff!!
    }

private var _notificationOff: ImageVector? = null
