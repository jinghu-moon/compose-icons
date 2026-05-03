package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorBoldIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 136.0f),
                    PathNode.LineTo(132.0f, 200.0f),
                    PathNode.CurveTo(132.0f, 206.62741f, 126.62742f, 212.0f, 120.0f, 212.0f),
                    PathNode.CurveTo(113.37258f, 212.0f, 108.0f, 206.62741f, 108.0f, 200.0f),
                    PathNode.LineTo(108.0f, 165.0f),
                    PathNode.LineTo(48.49f, 224.49f),
                    PathNode.CurveTo(43.79558f, 229.18442f, 36.18442f, 229.18442f, 31.49f, 224.49f),
                    PathNode.CurveTo(26.79558f, 219.79558f, 26.79558f, 212.18442f, 31.49f, 207.49f),
                    PathNode.LineTo(91.0f, 148.0f),
                    PathNode.LineTo(56.0f, 148.0f),
                    PathNode.CurveTo(49.37258f, 148.0f, 44.0f, 142.62741f, 44.0f, 136.0f),
                    PathNode.CurveTo(44.0f, 129.37259f, 49.37258f, 124.0f, 56.0f, 124.0f),
                    PathNode.LineTo(120.0f, 124.0f),
                    PathNode.CurveTo(126.62742f, 124.0f, 132.0f, 129.37259f, 132.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(80.0f, 28.0f),
                    PathNode.CurveTo(68.95431f, 28.0f, 60.0f, 36.954304f, 60.0f, 48.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.CurveTo(60.0f, 98.62742f, 65.37258f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(78.62742f, 104.0f, 84.0f, 98.62742f, 84.0f, 92.0f),
                    PathNode.LineTo(84.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(164.0f, 172.0f),
                    PathNode.CurveTo(157.37259f, 172.0f, 152.0f, 177.37259f, 152.0f, 184.0f),
                    PathNode.CurveTo(152.0f, 190.62741f, 157.37259f, 196.0f, 164.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(219.0457f, 196.0f, 228.0f, 187.0457f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
