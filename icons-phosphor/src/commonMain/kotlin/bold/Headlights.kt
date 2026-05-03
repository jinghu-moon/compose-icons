package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorBoldIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 80.0f),
                    PathNode.CurveTo(164.0f, 73.37258f, 169.37259f, 68.0f, 176.0f, 68.0f),
                    PathNode.LineTo(240.0f, 68.0f),
                    PathNode.CurveTo(246.62741f, 68.0f, 252.0f, 73.37258f, 252.0f, 80.0f),
                    PathNode.CurveTo(252.0f, 86.62742f, 246.62741f, 92.0f, 240.0f, 92.0f),
                    PathNode.LineTo(176.0f, 92.0f),
                    PathNode.CurveTo(169.37259f, 92.0f, 164.0f, 86.62742f, 164.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(169.37259f, 164.0f, 164.0f, 169.37259f, 164.0f, 176.0f),
                    PathNode.CurveTo(164.0f, 182.62741f, 169.37259f, 188.0f, 176.0f, 188.0f),
                    PathNode.LineTo(240.0f, 188.0f),
                    PathNode.CurveTo(246.62741f, 188.0f, 252.0f, 182.62741f, 252.0f, 176.0f),
                    PathNode.CurveTo(252.0f, 169.37259f, 246.62741f, 164.0f, 240.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.LineTo(176.0f, 116.0f),
                    PathNode.CurveTo(169.37259f, 116.0f, 164.0f, 121.37258f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 134.62741f, 169.37259f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(240.0f, 140.0f),
                    PathNode.CurveTo(246.62741f, 140.0f, 252.0f, 134.62741f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 121.37258f, 246.62741f, 116.0f, 240.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 64.0f),
                    PathNode.LineTo(148.0f, 192.0f),
                    PathNode.CurveTo(148.0f, 203.0457f, 139.0457f, 212.0f, 128.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.CurveTo(65.61223f, 212.00063f, 44.15047f, 203.06422f, 28.379177f, 187.17465f),
                    PathNode.CurveTo(12.607886f, 171.28506f, 3.832092f, 149.75714f, 4.0f, 127.37f),
                    PathNode.CurveTo(4.34f, 81.4f, 42.43f, 44.0f, 88.9f, 44.0f),
                    PathNode.LineTo(128.0f, 44.0f),
                    PathNode.CurveTo(139.0457f, 44.0f, 148.0f, 52.954304f, 148.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 68.0f),
                    PathNode.LineTo(88.9f, 68.0f),
                    PathNode.CurveTo(55.57f, 68.0f, 28.25f, 94.71f, 28.0f, 127.54f),
                    PathNode.CurveTo(27.877386f, 143.53255f, 34.144627f, 158.91223f, 45.410126f, 170.26408f),
                    PathNode.CurveTo(56.675625f, 181.61595f, 72.00699f, 188.00047f, 88.0f, 188.0f),
                    PathNode.LineTo(124.0f, 188.0f),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
