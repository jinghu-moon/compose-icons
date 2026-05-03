package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beef: ImageVector
    get() {
        if (_beef != null) return _beef!!
        _beef = lucideOutlineIcon(
            name = "Beef",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.4f, 13.7f),
                    PathNode.CurveTo(18.651615f, 12.007866f, 19.557228f, 9.058117f, 18.64303f, 6.394036f),
                    PathNode.CurveTo(17.728832f, 3.729954f, 15.202857f, 1.957778f, 12.386675f, 2.004695f),
                    PathNode.CurveTo(9.570492f, 2.051612f, 7.10495f, 3.906945f, 6.28f, 6.6f),
                    PathNode.CurveTo(5.18f, 9.73f, 5.5f, 10.5f, 3.1f, 12.68f),
                    PathNode.CurveTo(2.120103f, 13.483346f, 1.750598f, 14.815722f, 2.176772f, 16.00901f),
                    PathNode.CurveTo(2.602947f, 17.2023f, 3.732892f, 17.999157f, 5.0f, 18.0f),
                    PathNode.CurveTo(9.0f, 18.0f, 13.4f, 16.2f, 16.4f, 13.7f)
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
                    PathNode.MoveTo(18.5f, 6.0f),
                    PathNode.LineTo(20.69f, 10.5f),
                    PathNode.CurveTo(21.549536f, 13.142752f, 20.628262f, 16.03934f, 18.4f, 17.7f),
                    PathNode.CurveTo(15.4f, 20.2f, 11.0f, 22.0f, 7.0f, 22.0f),
                    PathNode.CurveTo(5.864501f, 21.998447f, 4.827189f, 21.355932f, 4.32f, 20.34f),
                    PathNode.LineTo(2.4f, 16.5f)
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
                    PathNode.MoveTo(15.0f, 8.5f),
                    PathNode.CurveTo(15.0f, 9.880712f, 13.880712f, 11.0f, 12.5f, 11.0f),
                    PathNode.CurveTo(11.119288f, 11.0f, 10.0f, 9.880712f, 10.0f, 8.5f),
                    PathNode.CurveTo(10.0f, 7.119288f, 11.119288f, 6.0f, 12.5f, 6.0f),
                    PathNode.CurveTo(13.880712f, 6.0f, 15.0f, 7.119288f, 15.0f, 8.5f),
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
        return _beef!!
    }

private var _beef: ImageVector? = null
