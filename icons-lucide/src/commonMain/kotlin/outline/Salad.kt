package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = lucideOutlineIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
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
                    PathNode.MoveTo(11.38f, 12.0f),
                    PathNode.CurveTo(10.123724f, 12.011709f, 9.071011f, 11.052594f, 8.966026f, 9.800658f),
                    PathNode.CurveTo(8.861042f, 8.548721f, 9.739319f, 7.42768f, 10.98f, 7.23f),
                    PathNode.CurveTo(10.78488f, 6.366539f, 11.080914f, 5.465777f, 11.75022f, 4.88641f),
                    PathNode.CurveTo(12.419525f, 4.307042f, 13.353415f, 4.143151f, 14.18f, 4.46f),
                    PathNode.CurveTo(14.539116f, 3.894667f, 15.118124f, 3.505109f, 15.777102f, 3.385468f),
                    PathNode.CurveTo(16.43608f, 3.265826f, 17.115074f, 3.426986f, 17.65f, 3.83f),
                    PathNode.CurveTo(18.60528f, 3.079178f, 19.970974f, 3.160717f, 20.830128f, 4.019872f),
                    PathNode.CurveTo(21.689283f, 4.879027f, 21.770823f, 6.244721f, 21.02f, 7.2f),
                    PathNode.CurveTo(21.477901f, 7.808233f, 21.620058f, 8.597649f, 21.403103f, 9.327409f),
                    PathNode.CurveTo(21.186146f, 10.057169f, 20.635813f, 10.640709f, 19.92f, 10.9f),
                    PathNode.CurveTo(20.011242f, 11.259933f, 20.021488f, 11.635628f, 19.95f, 12.0f)
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
                    PathNode.MoveTo(13.0f, 12.0f),
                    PathNode.LineTo(17.0f, 8.0f)
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
                    PathNode.MoveTo(10.9f, 7.25f),
                    PathNode.CurveTo(9.777488f, 6.053359f, 8.036869f, 5.665864f, 6.512732f, 6.273309f),
                    PathNode.CurveTo(4.988595f, 6.880755f, 3.991686f, 8.359295f, 4.0f, 10.0f),
                    PathNode.CurveTo(4.0f, 10.73f, 4.2f, 11.41f, 4.54f, 12.0f)
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
        return _salad!!
    }

private var _salad: ImageVector? = null
