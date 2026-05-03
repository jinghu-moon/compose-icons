package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CandyCane: ImageVector
    get() {
        if (_candyCane != null) return _candyCane!!
        _candyCane = lucideOutlineIcon(
            name = "CandyCane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.7f, 21.0f),
                    PathNode.CurveTo(5.147715f, 21.966497f, 3.916499f, 22.302284f, 2.95f, 21.75f),
                    PathNode.CurveTo(1.983502f, 21.197716f, 1.647715f, 19.966497f, 2.2f, 19.0f),
                    PathNode.LineTo(10.8f, 5.0f),
                    PathNode.CurveTo(12.456854f, 2.12812f, 16.128119f, 1.143146f, 19.0f, 2.8f),
                    PathNode.CurveTo(21.871881f, 4.456855f, 22.856853f, 8.12812f, 21.2f, 11.0f),
                    PathNode.CurveTo(20.845278f, 11.623901f, 20.183455f, 12.009907f, 19.465763f, 12.011484f),
                    PathNode.CurveTo(18.748074f, 12.013062f, 18.084558f, 11.629971f, 17.727097f, 11.007635f),
                    PathNode.CurveTo(17.369633f, 10.385299f, 17.373032f, 9.619141f, 17.736f, 9.0f),
                    PathNode.CurveTo(18.098969f, 8.38086f, 18.102367f, 7.614702f, 17.744904f, 6.992366f),
                    PathNode.CurveTo(17.387442f, 6.37003f, 16.723927f, 5.986938f, 16.006237f, 5.988516f),
                    PathNode.CurveTo(15.288547f, 5.990094f, 14.626723f, 6.376099f, 14.272f, 7.0f),
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
                    PathNode.MoveTo(17.75f, 7.0f),
                    PathNode.LineTo(15.0f, 2.1f)
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
                    PathNode.MoveTo(10.9f, 4.8f),
                    PathNode.LineTo(13.0f, 9.0f)
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
                    PathNode.MoveTo(7.9f, 9.7f),
                    PathNode.LineTo(9.9f, 14.1f)
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
                    PathNode.MoveTo(4.9f, 14.7f),
                    PathNode.LineTo(7.0f, 18.9f)
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
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
