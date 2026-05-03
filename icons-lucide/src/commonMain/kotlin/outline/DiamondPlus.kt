package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DiamondPlus: ImageVector
    get() {
        if (_diamondPlus != null) return _diamondPlus!!
        _diamondPlus = lucideOutlineIcon(
            name = "DiamondPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
                    PathNode.MoveTo(2.7f, 10.3f),
                    PathNode.CurveTo(2.247503f, 10.752033f, 1.993254f, 11.3654f, 1.993254f, 12.005f),
                    PathNode.CurveTo(1.993254f, 12.6446f, 2.247503f, 13.257967f, 2.7f, 13.71f),
                    PathNode.LineTo(10.29f, 21.3f),
                    PathNode.CurveTo(10.742033f, 21.752497f, 11.3554f, 22.006746f, 11.995f, 22.006746f),
                    PathNode.CurveTo(12.6346f, 22.006746f, 13.247967f, 21.752497f, 13.7f, 21.3f),
                    PathNode.LineTo(21.29f, 13.71f),
                    PathNode.CurveTo(21.742496f, 13.257967f, 21.996746f, 12.6446f, 21.996746f, 12.005f),
                    PathNode.CurveTo(21.996746f, 11.3654f, 21.742496f, 10.752033f, 21.29f, 10.3f),
                    PathNode.LineTo(13.7f, 2.71f),
                    PathNode.CurveTo(13.247967f, 2.257503f, 12.6346f, 2.003254f, 11.995f, 2.003254f),
                    PathNode.CurveTo(11.3554f, 2.003254f, 10.742033f, 2.257503f, 10.29f, 2.71f),
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
        return _diamondPlus!!
    }

private var _diamondPlus: ImageVector? = null
