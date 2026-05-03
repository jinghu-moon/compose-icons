package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorBoldIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 116.0f),
                    PathNode.LineTo(186.79f, 116.0f),
                    PathNode.CurveTo(181.09209f, 88.059326f, 156.51573f, 67.98899f, 128.0f, 67.98899f),
                    PathNode.CurveTo(99.48426f, 67.98899f, 74.90791f, 88.059326f, 69.21f, 116.0f),
                    PathNode.LineTo(12.0f, 116.0f),
                    PathNode.CurveTo(5.372583f, 116.0f, 0f, 121.37258f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 134.62741f, 5.372583f, 140.0f, 12.0f, 140.0f),
                    PathNode.LineTo(69.21f, 140.0f),
                    PathNode.CurveTo(74.90791f, 167.94067f, 99.48426f, 188.01102f, 128.0f, 188.01102f),
                    PathNode.CurveTo(156.51573f, 188.01102f, 181.09209f, 167.94067f, 186.79f, 140.0f),
                    PathNode.LineTo(244.0f, 140.0f),
                    PathNode.CurveTo(250.62741f, 140.0f, 256.0f, 134.62741f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 121.37258f, 250.62741f, 116.0f, 244.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
