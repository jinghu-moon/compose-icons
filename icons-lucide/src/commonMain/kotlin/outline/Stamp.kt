package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = lucideOutlineIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(14.0f, 8.5f),
                    PathNode.CurveTo(14.0f, 7.0f, 15.0f, 7.0f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.343146f, 13.656855f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.343145f, 2.0f, 9.0f, 3.343146f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 7.0f, 10.0f, 7.0f, 10.0f, 8.5f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(20.0f, 15.5f),
                    PathNode.CurveTo(20.0f, 14.119288f, 18.880713f, 13.0f, 17.5f, 13.0f),
                    PathNode.LineTo(6.5f, 13.0f),
                    PathNode.CurveTo(5.119288f, 13.0f, 4.0f, 14.119288f, 4.0f, 15.5f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 17.552284f, 4.447716f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.0f),
                    PathNode.CurveTo(19.552284f, 18.0f, 20.0f, 17.552284f, 20.0f, 17.0f),
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
                    PathNode.MoveTo(5.0f, 22.0f),
                    PathNode.LineTo(19.0f, 22.0f)
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
