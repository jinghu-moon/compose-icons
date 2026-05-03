package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mail: ImageVector
    get() {
        if (_mail != null) return _mail!!
        _mail = tablerFilledIcon(
            name = "Mail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 7.535f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.000088f, 18.588558f, 20.761822f, 19.901804f, 19.176f, 19.995f),
                    PathNode.LineTo(19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.411442f, 20.000088f, 2.098195f, 18.761822f, 2.005f, 17.176f),
                    PathNode.LineTo(2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.535f),
                    PathNode.LineTo(11.445f, 13.832f),
                    PathNode.LineTo(11.561f, 13.898f),
                    PathNode.CurveTo(11.838017f, 14.033351f, 12.161983f, 14.033351f, 12.439f, 13.898f),
                    PathNode.LineTo(12.555f, 13.832f),
                    PathNode.LineTo(22.0f, 7.535f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.08f, 4.0f, 21.027f, 4.57f, 21.555f, 5.427f),
                    PathNode.LineTo(12.0f, 11.797f),
                    PathNode.LineTo(2.445f, 5.427f),
                    PathNode.CurveTo(2.953737f, 4.600717f, 3.830816f, 4.071637f, 4.799f, 4.007f),
                    PathNode.LineTo(5.0f, 4.0f),
                    PathNode.LineTo(19.0f, 4.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _mail!!
    }

private var _mail: ImageVector? = null
