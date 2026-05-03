package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointerBan: ImageVector
    get() {
        if (_mousePointerBan != null) return _mousePointerBan!!
        _mousePointerBan = lucideOutlineIcon(
            name = "MousePointerBan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.034f, 2.681f),
                    PathNode.CurveTo(1.960317f, 2.496148f, 2.003753f, 2.285176f, 2.144464f, 2.144464f),
                    PathNode.CurveTo(2.285176f, 2.003753f, 2.496148f, 1.960317f, 2.681f, 2.034f),
                    PathNode.LineTo(11.681f, 5.534f),
                    PathNode.CurveTo(11.87951f, 5.610866f, 12.007586f, 5.804991f, 12.00015f, 6.017734f),
                    PathNode.CurveTo(11.992712f, 6.230476f, 11.851393f, 6.415184f, 11.648f, 6.478f),
                    PathNode.LineTo(8.204001f, 7.545f),
                    PathNode.CurveTo(7.888525f, 7.642537f, 7.641537f, 7.889525f, 7.544f, 8.205f),
                    PathNode.LineTo(6.478f, 11.648f),
                    PathNode.CurveTo(6.415184f, 11.851393f, 6.230476f, 11.992712f, 6.017734f, 12.00015f),
                    PathNode.CurveTo(5.804991f, 12.007586f, 5.610866f, 11.87951f, 5.534f, 11.681f),
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
                    PathNode.MoveTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 19.31371f, 19.31371f, 22.0f, 16.0f, 22.0f),
                    PathNode.CurveTo(12.686292f, 22.0f, 10.0f, 19.31371f, 10.0f, 16.0f),
                    PathNode.CurveTo(10.0f, 12.686292f, 12.686292f, 10.0f, 16.0f, 10.0f),
                    PathNode.CurveTo(19.31371f, 10.0f, 22.0f, 12.686292f, 22.0f, 16.0f),
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
                    PathNode.MoveTo(11.8f, 11.8f),
                    PathNode.LineTo(20.2f, 20.2f)
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
        return _mousePointerBan!!
    }

private var _mousePointerBan: ImageVector? = null
