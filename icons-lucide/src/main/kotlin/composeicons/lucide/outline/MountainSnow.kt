package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MountainSnow: ImageVector
    get() {
        if (_mountainSnow != null) return _mountainSnow!!
        _mountainSnow = lucideOutlineIcon(
            name = "MountainSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.LineTo(22.0f, 21.0f),
                    PathNode.LineTo(2.0f, 21.0f),
                    PathNode.LineTo(8.0f, 3.0f),
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
                    PathNode.MoveTo(4.14f, 15.08f),
                    PathNode.CurveTo(6.76f, 13.51f, 9.38f, 13.65f, 12.0f, 15.5f),
                    PathNode.CurveTo(14.74f, 17.44f, 17.49f, 17.5f, 20.23f, 15.69f)
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
        return _mountainSnow!!
    }

private var _mountainSnow: ImageVector? = null
