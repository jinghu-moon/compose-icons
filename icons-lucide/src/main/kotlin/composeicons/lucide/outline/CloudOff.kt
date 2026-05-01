package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudOff: ImageVector
    get() {
        if (_cloudOff != null) return _cloudOff!!
        _cloudOff = lucideOutlineIcon(
            name = "CloudOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.94f, 5.274f),
                    PathNode.CurveTo(13.231114f, 5.934151f, 15.028646f, 7.715102f, 15.71f, 10.0f),
                    PathNode.LineTo(17.5f, 10.0f),
                    PathNode.CurveTo(18.97155f, 10.000018f, 20.350124f, 10.719532f, 21.191607f, 11.926746f),
                    PathNode.CurveTo(22.033089f, 13.133962f, 22.231157f, 14.67634f, 21.722f, 16.057f)
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
                    PathNode.MoveTo(18.796f, 18.81f),
                    PathNode.CurveTo(18.37558f, 18.936205f, 17.938955f, 19.000216f, 17.5f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(5.770673f, 18.999462f, 2.960809f, 16.789846f, 2.198825f, 13.651704f),
                    PathNode.CurveTo(1.43684f, 10.513561f, 2.920512f, 7.261417f, 5.79f, 5.78f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _cloudOff!!
    }

private var _cloudOff: ImageVector? = null
