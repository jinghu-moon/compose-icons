package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandCoins: ImageVector
    get() {
        if (_handCoins != null) return _handCoins!!
        _handCoins = lucideOutlineIcon(
            name = "HandCoins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 15.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(14.104569f, 15.0f, 15.0f, 14.104569f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 11.895431f, 14.104569f, 11.0f, 13.0f, 11.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.CurveTo(9.4f, 11.0f, 8.9f, 11.2f, 8.6f, 11.6f),
                    PathNode.LineTo(3.0f, 17.0f)
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
                    PathNode.LineTo(8.6f, 19.6f),
                    PathNode.CurveTo(8.9f, 19.2f, 9.4f, 19.0f, 10.0f, 19.0f),
                    PathNode.LineTo(14.0f, 19.0f),
                    PathNode.CurveTo(15.1f, 19.0f, 16.1f, 18.6f, 16.8f, 17.8f),
                    PathNode.LineTo(21.4f, 13.4f),
                    PathNode.CurveTo(22.203575f, 12.640609f, 22.239391f, 11.373574f, 21.48f, 10.57f),
                    PathNode.CurveTo(20.720608f, 9.766426f, 19.453575f, 9.730609f, 18.65f, 10.49f),
                    PathNode.LineTo(14.45f, 14.39f)
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
                    PathNode.MoveTo(2.0f, 16.0f),
                    PathNode.LineTo(8.0f, 22.0f)
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
                    PathNode.MoveTo(18.9f, 9.0f),
                    PathNode.CurveTo(18.9f, 10.601625f, 17.601625f, 11.9f, 16.0f, 11.9f),
                    PathNode.CurveTo(14.398375f, 11.9f, 13.1f, 10.601625f, 13.1f, 9.0f),
                    PathNode.CurveTo(13.1f, 7.398375f, 14.398375f, 6.100001f, 16.0f, 6.1f),
                    PathNode.CurveTo(17.601625f, 6.100001f, 18.9f, 7.398375f, 18.9f, 9.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 6.656854f, 7.656854f, 8.0f, 6.0f, 8.0f),
                    PathNode.CurveTo(4.343146f, 8.0f, 3.0f, 6.656854f, 3.0f, 5.0f),
                    PathNode.CurveTo(3.0f, 3.343146f, 4.343146f, 2.0f, 6.0f, 2.0f),
                    PathNode.CurveTo(7.656854f, 2.0f, 9.0f, 3.343146f, 9.0f, 5.0f),
                    PathNode.Close
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
        return _handCoins!!
    }

private var _handCoins: ImageVector? = null
