package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartExclamation: ImageVector
    get() {
        if (_heartExclamation != null) return _heartExclamation!!
        _heartExclamation = tablerOutlineIcon(
            name = "HeartExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.03f, 17.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(4.5f, 12.572f),
                    PathNode.CurveTo(3.151298f, 11.259582f, 2.65373f, 9.301041f, 3.21248f, 7.504033f),
                    PathNode.CurveTo(3.771231f, 5.707025f, 5.291653f, 4.375945f, 7.146762f, 4.0597f),
                    PathNode.CurveTo(9.001871f, 3.743454f, 10.877429f, 4.495612f, 12.0f, 6.006f),
                    PathNode.CurveTo(13.083982f, 4.573189f, 14.853365f, 3.832116f, 16.634892f, 4.064764f),
                    PathNode.CurveTo(18.41642f, 4.297412f, 19.93616f, 5.468007f, 20.615847f, 7.131134f),
                    PathNode.CurveTo(21.295532f, 8.794261f, 21.030655f, 10.694193f, 19.922f, 12.108f)
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
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 19.0f)
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
                    PathNode.MoveTo(19.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.01f)
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
        return _heartExclamation!!
    }

private var _heartExclamation: ImageVector? = null
