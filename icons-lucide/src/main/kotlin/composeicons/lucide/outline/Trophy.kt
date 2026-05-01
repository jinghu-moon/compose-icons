package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = lucideOutlineIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 14.66f),
                    PathNode.LineTo(10.0f, 16.286f),
                    PathNode.CurveTo(9.99232f, 16.982752f, 9.622561f, 17.625284f, 9.024f, 17.982f),
                    PathNode.CurveTo(7.757047f, 18.920391f, 7.006913f, 20.401388f, 7.0f, 21.978f)
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
                    PathNode.MoveTo(14.0f, 14.66f),
                    PathNode.LineTo(14.0f, 16.286f),
                    PathNode.CurveTo(14.00768f, 16.982752f, 14.377439f, 17.625284f, 14.976f, 17.982f),
                    PathNode.CurveTo(16.242952f, 18.920391f, 16.993088f, 20.401388f, 17.0f, 21.978f)
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
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.LineTo(19.5f, 9.0f),
                    PathNode.CurveTo(20.880713f, 9.0f, 22.0f, 7.880712f, 22.0f, 6.5f),
                    PathNode.CurveTo(22.0f, 5.119288f, 20.880713f, 4.0f, 19.5f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f)
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
                    PathNode.MoveTo(4.0f, 22.0f),
                    PathNode.LineTo(20.0f, 22.0f)
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
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.CurveTo(6.0f, 12.313708f, 8.686292f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(15.313708f, 15.0f, 18.0f, 12.313708f, 18.0f, 9.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(18.0f, 2.447715f, 17.552284f, 2.0f, 17.0f, 2.0f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.CurveTo(6.447716f, 2.0f, 6.0f, 2.447715f, 6.0f, 3.0f),
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
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.LineTo(4.5f, 9.0f),
                    PathNode.CurveTo(3.119288f, 9.0f, 2.0f, 7.880712f, 2.0f, 6.5f),
                    PathNode.CurveTo(2.0f, 5.119288f, 3.119288f, 4.0f, 4.5f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f)
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
        return _trophy!!
    }

private var _trophy: ImageVector? = null
