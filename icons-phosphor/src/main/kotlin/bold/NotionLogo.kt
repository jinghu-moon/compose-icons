package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorBoldIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(176.0f, 36.0f),
                    PathNode.CurveTo(169.37259f, 36.0f, 164.0f, 41.37258f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 54.62742f, 169.37259f, 60.0f, 176.0f, 60.0f),
                    PathNode.LineTo(184.0f, 60.0f),
                    PathNode.LineTo(184.0f, 161.28f),
                    PathNode.LineTo(118.51f, 42.22f),
                    PathNode.CurveTo(116.402565f, 38.385693f, 112.37529f, 36.00228f, 108.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(33.37258f, 36.0f, 28.0f, 41.37258f, 28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 54.62742f, 33.37258f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(48.0f, 60.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(33.37258f, 196.0f, 28.0f, 201.37259f, 28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 214.62741f, 33.37258f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(86.62742f, 220.0f, 92.0f, 214.62741f, 92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 201.37259f, 86.62742f, 196.0f, 80.0f, 196.0f),
                    PathNode.LineTo(72.0f, 196.0f),
                    PathNode.LineTo(72.0f, 94.72f),
                    PathNode.LineTo(137.49f, 213.78f),
                    PathNode.CurveTo(139.59743f, 217.6143f, 143.62471f, 219.99773f, 148.0f, 220.0f),
                    PathNode.LineTo(196.0f, 220.0f),
                    PathNode.CurveTo(202.62741f, 220.0f, 208.0f, 214.62741f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(222.62741f, 60.0f, 228.0f, 54.62742f, 228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 41.37258f, 222.62741f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.3f, 60.0f),
                    PathNode.LineTo(100.9f, 60.0f),
                    PathNode.LineTo(175.7f, 196.0f),
                    PathNode.LineTo(155.1f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
