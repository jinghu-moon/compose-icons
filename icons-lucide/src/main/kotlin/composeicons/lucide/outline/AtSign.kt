package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AtSign: ImageVector
    get() {
        if (_atSign != null) return _atSign!!
        _atSign = lucideOutlineIcon(
            name = "AtSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 14.209139f, 14.209139f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(9.790861f, 16.0f, 8.0f, 14.209139f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 9.790861f, 9.790861f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(14.209139f, 8.0f, 16.0f, 9.790861f, 16.0f, 12.0f),
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(16.0f, 14.656855f, 17.343145f, 16.0f, 19.0f, 16.0f),
                    PathNode.CurveTo(20.656855f, 16.0f, 22.0f, 14.656855f, 22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 7.362225f, 18.81124f, 3.333053f, 14.297529f, 2.26751f),
                    PathNode.CurveTo(9.783819f, 1.201968f, 5.129804f, 3.379712f, 3.055728f, 7.527864f),
                    PathNode.CurveTo(0.981652f, 11.676016f, 2.031866f, 16.705875f, 5.592526f, 19.677517f),
                    PathNode.CurveTo(9.153186f, 22.64916f, 14.28978f, 22.782665f, 18.0f, 20.0f)
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
        return _atSign!!
    }

private var _atSign: ImageVector? = null
