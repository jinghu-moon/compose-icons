package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = tablerOutlineIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.718f, 20.713f),
                    PathNode.CurveTo(9.371513f, 21.659166f, 5.808282f, 20.225903f, 4.049042f, 17.226023f),
                    PathNode.CurveTo(2.289802f, 14.226142f, 2.778504f, 10.416675f, 5.238f, 7.958f),
                    PathNode.LineTo(5.958f, 7.238f),
                    PathNode.CurveTo(8.367606f, 4.828376f, 12.081355f, 4.305066f, 15.063f, 5.955f),
                    PathNode.LineTo(17.45f, 3.61f),
                    PathNode.CurveTo(18.239704f, 2.827398f, 19.50523f, 2.80419f, 20.323095f, 3.557312f),
                    PathNode.CurveTo(21.140963f, 4.310434f, 21.221968f, 5.573578f, 20.507f, 6.425f),
                    PathNode.LineTo(20.391f, 6.551f),
                    PathNode.LineTo(18.045f, 8.938f),
                    PathNode.CurveTo(19.63504f, 11.811842f, 19.211542f, 15.380169f, 16.993f, 17.802f)
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
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.CurveTo(11.0f, 19.656855f, 12.343145f, 21.0f, 14.0f, 21.0f),
                    PathNode.CurveTo(15.656855f, 21.0f, 17.0f, 19.656855f, 17.0f, 18.0f),
                    PathNode.CurveTo(17.0f, 16.343145f, 15.656855f, 15.0f, 14.0f, 15.0f),
                    PathNode.CurveTo(12.343145f, 15.0f, 11.0f, 16.343145f, 11.0f, 18.0f)
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
                    PathNode.MoveTo(9.3f, 5.3f),
                    PathNode.LineTo(18.7f, 14.7f)
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
