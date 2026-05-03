package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = lucideOutlineIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(18.0f, 4.447716f, 17.552284f, 4.0f, 17.0f, 4.0f),
                    PathNode.LineTo(6.5f, 4.0f),
                    PathNode.CurveTo(6.310614f, 4.0f, 6.137483f, 4.107001f, 6.052787f, 4.276394f),
                    PathNode.CurveTo(5.968091f, 4.445785f, 5.986368f, 4.648492f, 6.1f, 4.8f),
                    PathNode.LineTo(10.6f, 10.8f),
                    PathNode.CurveTo(11.133333f, 11.511111f, 11.133333f, 12.488889f, 10.6f, 13.2f),
                    PathNode.LineTo(6.1f, 19.2f),
                    PathNode.CurveTo(5.986368f, 19.35151f, 5.968091f, 19.554214f, 6.052787f, 19.723606f),
                    PathNode.CurveTo(6.137483f, 19.893f, 6.310614f, 20.0f, 6.5f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.552284f, 20.0f, 18.0f, 19.552284f, 18.0f, 19.0f),
                    PathNode.LineTo(18.0f, 17.0f)
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
