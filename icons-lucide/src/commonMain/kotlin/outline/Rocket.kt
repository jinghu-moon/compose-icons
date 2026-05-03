package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = lucideOutlineIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(12.0f, 20.0f, 15.03f, 19.45f, 16.0f, 18.0f),
                    PathNode.CurveTo(17.08f, 16.38f, 16.0f, 13.0f, 16.0f, 13.0f)
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
                    PathNode.MoveTo(4.5f, 16.5f),
                    PathNode.CurveTo(3.0f, 17.76f, 2.5f, 21.5f, 2.5f, 21.5f),
                    PathNode.CurveTo(2.5f, 21.5f, 6.24f, 21.0f, 7.5f, 19.5f),
                    PathNode.CurveTo(8.21f, 18.66f, 8.2f, 17.37f, 7.41f, 16.59f),
                    PathNode.CurveTo(6.605108f, 15.821765f, 5.350828f, 15.782972f, 4.5f, 16.5f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.532145f, 10.61943f, 10.202204f, 9.296063f, 11.0f, 8.05f),
                    PathNode.CurveTo(13.369152f, 4.261956f, 17.532183f, 1.972289f, 22.0f, 2.0f),
                    PathNode.CurveTo(22.0f, 4.72f, 21.22f, 9.5f, 16.0f, 13.0f),
                    PathNode.CurveTo(14.736721f, 13.79843f, 13.396711f, 14.468435f, 12.0f, 15.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 12.0f, 4.55f, 8.97f, 6.0f, 8.0f),
                    PathNode.CurveTo(7.62f, 6.92f, 11.0f, 8.05f, 11.0f, 8.05f)
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
