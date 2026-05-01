package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MegaphoneOff: ImageVector
    get() {
        if (_megaphoneOff != null) return _megaphoneOff!!
        _megaphoneOff = lucideOutlineIcon(
            name = "MegaphoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.636f, 6.0f),
                    PathNode.CurveTo(14.459438f, 5.934792f, 17.184849f, 4.951903f, 19.4f, 3.2f),
                    PathNode.CurveTo(19.703018f, 2.972737f, 20.108427f, 2.936181f, 20.447214f, 3.105573f),
                    PathNode.CurveTo(20.785997f, 3.274965f, 21.0f, 3.621228f, 21.0f, 4.0f),
                    PathNode.LineTo(21.0f, 15.344f)
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
                    PathNode.MoveTo(14.378f, 14.357f),
                    PathNode.CurveTo(13.27246f, 14.090771f, 12.136767f, 13.970747f, 11.0f, 14.0f),
                    PathNode.LineTo(5.0f, 14.0f),
                    PathNode.CurveTo(3.895431f, 14.0f, 3.0f, 13.104569f, 3.0f, 12.0f),
                    PathNode.LineTo(3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 6.895431f, 3.895431f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 14.0f),
                    PathNode.CurveTo(6.0f, 16.596443f, 6.842135f, 19.122847f, 8.4f, 21.2f),
                    PathNode.CurveTo(9.062741f, 22.083656f, 10.316344f, 22.262741f, 11.2f, 21.6f),
                    PathNode.CurveTo(12.083655f, 20.937258f, 12.262742f, 19.683655f, 11.6f, 18.8f),
                    PathNode.CurveTo(10.561423f, 17.41523f, 10.0f, 15.730962f, 10.0f, 14.0f)
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
                    PathNode.MoveTo(8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 14.0f)
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
        return _megaphoneOff!!
    }

private var _megaphoneOff: ImageVector? = null
