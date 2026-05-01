package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartSpark: ImageVector
    get() {
        if (_heartSpark != null) return _heartSpark!!
        _heartSpark = tablerOutlineIcon(
            name = "HeartSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.537f, 19.542f),
                    PathNode.LineTo(4.5f, 12.572f),
                    PathNode.CurveTo(3.151298f, 11.259582f, 2.65373f, 9.301041f, 3.21248f, 7.504033f),
                    PathNode.CurveTo(3.771231f, 5.707025f, 5.291653f, 4.375945f, 7.146762f, 4.0597f),
                    PathNode.CurveTo(9.001871f, 3.743454f, 10.877429f, 4.495612f, 12.0f, 6.006f),
                    PathNode.CurveTo(13.615057f, 3.860572f, 16.6364f, 3.374031f, 18.84332f, 4.903988f),
                    PathNode.CurveTo(21.050243f, 6.433944f, 21.654518f, 9.433958f, 20.212f, 11.699f)
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
                    PathNode.MoveTo(19.0f, 22.5f),
                    PathNode.CurveTo(19.418587f, 20.769625f, 20.769625f, 19.418587f, 22.5f, 19.0f),
                    PathNode.CurveTo(20.769625f, 18.581413f, 19.418587f, 17.230375f, 19.0f, 15.5f),
                    PathNode.CurveTo(18.581413f, 17.230375f, 17.230375f, 18.581413f, 15.5f, 19.0f),
                    PathNode.CurveTo(17.230375f, 19.418587f, 18.581413f, 20.769625f, 19.0f, 22.5f)
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
        return _heartSpark!!
    }

private var _heartSpark: ImageVector? = null
