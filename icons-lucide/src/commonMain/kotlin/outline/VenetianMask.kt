package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VenetianMask: ImageVector
    get() {
        if (_venetianMask != null) return _venetianMask!!
        _venetianMask = lucideOutlineIcon(
            name = "VenetianMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 11.0f),
                    PathNode.CurveTo(16.5f, 11.0f, 15.5f, 11.5f, 15.0f, 13.0f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(2.895431f, 6.0f, 2.0f, 6.895431f, 2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 14.761424f, 4.238577f, 17.0f, 7.0f, 17.0f),
                    PathNode.CurveTo(8.847711f, 17.068825f, 10.614537f, 17.775555f, 12.0f, 19.0f),
                    PathNode.CurveTo(13.385463f, 17.775555f, 15.152289f, 17.068825f, 17.0f, 17.0f),
                    PathNode.CurveTo(19.761423f, 17.0f, 22.0f, 14.761424f, 22.0f, 12.0f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 6.895431f, 21.10457f, 6.0f, 20.0f, 6.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.CurveTo(15.152289f, 6.068825f, 13.385463f, 6.775555f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.614537f, 6.775555f, 8.847711f, 6.068825f, 7.0f, 6.0f),
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
                    PathNode.MoveTo(6.0f, 11.0f),
                    PathNode.CurveTo(7.5f, 11.0f, 8.5f, 11.5f, 9.0f, 13.0f)
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
        return _venetianMask!!
    }

private var _venetianMask: ImageVector? = null
