package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = lucideOutlineIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 17.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.LineTo(11.5f, 17.0f),
                    PathNode.LineTo(12.5f, 17.0f),
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
                    PathNode.MoveTo(15.0f, 22.0f),
                    PathNode.CurveTo(15.552285f, 22.0f, 16.0f, 21.552284f, 16.0f, 21.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.768726f, 19.99952f, 17.469145f, 19.558487f, 17.801798f, 18.865463f),
                    PathNode.CurveTo(18.13445f, 18.172438f, 18.040451f, 17.350086f, 17.56f, 16.75f),
                    PathNode.CurveTo(19.904284f, 14.483998f, 20.638857f, 11.02204f, 19.41676f, 7.999308f),
                    PathNode.CurveTo(18.19466f, 4.976576f, 15.260435f, 2.997922f, 12.0f, 2.997922f),
                    PathNode.CurveTo(8.739565f, 2.997922f, 5.80534f, 4.976576f, 4.583241f, 7.999308f),
                    PathNode.CurveTo(3.361143f, 11.02204f, 4.095716f, 14.483998f, 6.44f, 16.75f),
                    PathNode.CurveTo(5.959546f, 17.350086f, 5.865552f, 18.172438f, 6.198203f, 18.865463f),
                    PathNode.CurveTo(6.530855f, 19.558487f, 7.231274f, 19.99952f, 8.0f, 20.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(8.0f, 21.552284f, 8.447715f, 22.0f, 9.0f, 22.0f),
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 12.552285f, 15.552285f, 13.0f, 15.0f, 13.0f),
                    PathNode.CurveTo(14.447715f, 13.0f, 14.0f, 12.552285f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 11.447715f, 14.447715f, 11.0f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.552285f, 11.0f, 16.0f, 11.447715f, 16.0f, 12.0f),
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
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 12.552285f, 9.552285f, 13.0f, 9.0f, 13.0f),
                    PathNode.CurveTo(8.447715f, 13.0f, 8.0f, 12.552285f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 11.447715f, 8.447715f, 11.0f, 9.0f, 11.0f),
                    PathNode.CurveTo(9.552285f, 11.0f, 10.0f, 11.447715f, 10.0f, 12.0f),
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
        }
        return _skull!!
    }

private var _skull: ImageVector? = null
