package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = lucideOutlineIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.062f, 12.348f),
                    PathNode.CurveTo(1.978659f, 12.123485f, 1.978659f, 11.876515f, 2.062f, 11.652f),
                    PathNode.CurveTo(3.722023f, 7.626908f, 7.646032f, 5.000617f, 12.0f, 5.000617f),
                    PathNode.CurveTo(16.35397f, 5.000617f, 20.277975f, 7.626908f, 21.938f, 11.652f),
                    PathNode.CurveTo(22.021341f, 11.876515f, 22.021341f, 12.123485f, 21.938f, 12.348f),
                    PathNode.CurveTo(20.277975f, 16.373093f, 16.35397f, 18.999384f, 12.0f, 18.999384f),
                    PathNode.CurveTo(7.646032f, 18.999384f, 3.722023f, 16.373093f, 2.062f, 12.348f)
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
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 13.656855f, 13.656855f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.343145f, 15.0f, 9.0f, 13.656855f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.656855f, 9.0f, 15.0f, 10.343145f, 15.0f, 12.0f),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
