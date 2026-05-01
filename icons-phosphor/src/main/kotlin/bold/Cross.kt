package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorBoldIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 68.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(164.0f, 32.0f),
                    PathNode.CurveTo(164.0f, 20.954306f, 155.0457f, 12.0f, 144.0f, 12.0f),
                    PathNode.LineTo(112.0f, 12.0f),
                    PathNode.CurveTo(100.95431f, 12.0f, 92.0f, 20.954306f, 92.0f, 32.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(56.0f, 68.0f),
                    PathNode.CurveTo(44.954304f, 68.0f, 36.0f, 76.95431f, 36.0f, 88.0f),
                    PathNode.LineTo(36.0f, 120.0f),
                    PathNode.CurveTo(36.0f, 131.0457f, 44.954304f, 140.0f, 56.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.LineTo(92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 235.0457f, 100.95431f, 244.0f, 112.0f, 244.0f),
                    PathNode.LineTo(144.0f, 244.0f),
                    PathNode.CurveTo(155.0457f, 244.0f, 164.0f, 235.0457f, 164.0f, 224.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.LineTo(200.0f, 140.0f),
                    PathNode.CurveTo(211.0457f, 140.0f, 220.0f, 131.0457f, 220.0f, 120.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(220.0f, 76.95431f, 211.0457f, 68.0f, 200.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(145.37259f, 116.0f, 140.0f, 121.37258f, 140.0f, 128.0f),
                    PathNode.LineTo(140.0f, 220.0f),
                    PathNode.LineTo(116.0f, 220.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 121.37258f, 110.62742f, 116.0f, 104.0f, 116.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.LineTo(104.0f, 92.0f),
                    PathNode.CurveTo(110.62742f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 145.37259f, 92.0f, 152.0f, 92.0f),
                    PathNode.LineTo(196.0f, 92.0f),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
