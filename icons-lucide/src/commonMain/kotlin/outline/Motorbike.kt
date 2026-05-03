package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = lucideOutlineIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 14.0f),
                    PathNode.LineTo(17.0f, 11.0f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 9.895431f, 9.895431f, 9.0f, 11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(14.030603f, 9.000492f, 14.892093f, 9.784058f, 14.99f, 10.81f)
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
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.CurveTo(11.552285f, 17.0f, 12.0f, 16.552284f, 12.0f, 16.0f),
                    PathNode.CurveTo(12.0f, 12.686292f, 14.686292f, 10.0f, 18.0f, 10.0f),
                    PathNode.CurveTo(18.552284f, 10.0f, 19.0f, 9.552285f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 8.25f),
                    PathNode.CurveTo(18.789215f, 6.94486f, 18.070116f, 5.77632f, 17.0f, 5.0f)
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
                    PathNode.MoveTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.CurveTo(17.343145f, 20.0f, 16.0f, 18.656855f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 15.343145f, 17.343145f, 14.0f, 19.0f, 14.0f),
                    PathNode.CurveTo(20.656855f, 14.0f, 22.0f, 15.343145f, 22.0f, 17.0f),
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
                    PathNode.MoveTo(8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 18.656855f, 6.656854f, 20.0f, 5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.CurveTo(2.0f, 15.343145f, 3.343146f, 14.0f, 5.0f, 14.0f),
                    PathNode.CurveTo(6.656854f, 14.0f, 8.0f, 15.343145f, 8.0f, 17.0f),
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
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
