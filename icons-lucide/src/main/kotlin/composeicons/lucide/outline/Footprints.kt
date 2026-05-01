package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = lucideOutlineIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 16.0f),
                    PathNode.LineTo(4.0f, 13.62f),
                    PathNode.CurveTo(4.0f, 11.5f, 2.97f, 10.5f, 3.0f, 8.0f),
                    PathNode.CurveTo(3.03f, 5.28f, 4.49f, 2.0f, 7.5f, 2.0f),
                    PathNode.CurveTo(9.37f, 2.0f, 10.0f, 3.8f, 10.0f, 5.5f),
                    PathNode.CurveTo(10.0f, 8.61f, 8.0f, 11.16f, 8.0f, 14.18f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 17.10457f, 7.10457f, 18.0f, 6.0f, 18.0f),
                    PathNode.CurveTo(4.895431f, 18.0f, 4.0f, 17.10457f, 4.0f, 16.0f),
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
                    PathNode.MoveTo(20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 17.62f),
                    PathNode.CurveTo(20.0f, 15.5f, 21.03f, 14.5f, 21.0f, 12.0f),
                    PathNode.CurveTo(20.97f, 9.28f, 19.51f, 6.0f, 16.5f, 6.0f),
                    PathNode.CurveTo(14.63f, 6.0f, 14.0f, 7.8f, 14.0f, 9.5f),
                    PathNode.CurveTo(14.0f, 12.61f, 16.0f, 15.16f, 16.0f, 18.18f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 21.10457f, 16.89543f, 22.0f, 18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
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
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f)
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
                    PathNode.MoveTo(4.0f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f)
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
