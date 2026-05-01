package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorBoldIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 56.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 94.62742f, 206.62741f, 100.0f, 200.0f, 100.0f),
                    PathNode.CurveTo(193.37259f, 100.0f, 188.0f, 94.62742f, 188.0f, 88.0f),
                    PathNode.LineTo(188.0f, 68.0f),
                    PathNode.LineTo(140.0f, 68.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(160.0f, 188.0f),
                    PathNode.CurveTo(166.62741f, 188.0f, 172.0f, 193.37259f, 172.0f, 200.0f),
                    PathNode.CurveTo(172.0f, 206.62741f, 166.62741f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(89.37258f, 212.0f, 84.0f, 206.62741f, 84.0f, 200.0f),
                    PathNode.CurveTo(84.0f, 193.37259f, 89.37258f, 188.0f, 96.0f, 188.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(116.0f, 68.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(68.0f, 88.0f),
                    PathNode.CurveTo(68.0f, 94.62742f, 62.62742f, 100.0f, 56.0f, 100.0f),
                    PathNode.CurveTo(49.37258f, 100.0f, 44.0f, 94.62742f, 44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 49.37258f, 49.37258f, 44.0f, 56.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(206.62741f, 44.0f, 212.0f, 49.37258f, 212.0f, 56.0f),
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
        return _textT!!
    }

private var _textT: ImageVector? = null
