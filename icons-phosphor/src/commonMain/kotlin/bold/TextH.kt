package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextH: ImageVector
    get() {
        if (_textH != null) return _textH!!
        _textH = phosphorBoldIcon(
            name = "TextH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 56.0f),
                    PathNode.LineTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 206.62741f, 206.62741f, 212.0f, 200.0f, 212.0f),
                    PathNode.CurveTo(193.37259f, 212.0f, 188.0f, 206.62741f, 188.0f, 200.0f),
                    PathNode.LineTo(188.0f, 140.0f),
                    PathNode.LineTo(68.0f, 140.0f),
                    PathNode.LineTo(68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 206.62741f, 62.62742f, 212.0f, 56.0f, 212.0f),
                    PathNode.CurveTo(49.37258f, 212.0f, 44.0f, 206.62741f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 49.37258f, 49.37258f, 44.0f, 56.0f, 44.0f),
                    PathNode.CurveTo(62.62742f, 44.0f, 68.0f, 49.37258f, 68.0f, 56.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.LineTo(188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 49.37258f, 193.37259f, 44.0f, 200.0f, 44.0f),
                    PathNode.CurveTo(206.62741f, 44.0f, 212.0f, 49.37258f, 212.0f, 56.0f),
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
        return _textH!!
    }

private var _textH: ImageVector? = null
