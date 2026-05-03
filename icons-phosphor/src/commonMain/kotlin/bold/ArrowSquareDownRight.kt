package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDownRight: ImageVector
    get() {
        if (_arrowSquareDownRight != null) return _arrowSquareDownRight!!
        _arrowSquareDownRight = phosphorBoldIcon(
            name = "ArrowSquareDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(87.51f, 104.49f),
                    PathNode.CurveTo(82.81558f, 99.79558f, 82.81558f, 92.18442f, 87.51f, 87.49f),
                    PathNode.CurveTo(92.20442f, 82.79558f, 99.81558f, 82.79558f, 104.51f, 87.49f),
                    PathNode.LineTo(148.0f, 131.0f),
                    PathNode.LineTo(148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 105.37258f, 153.37259f, 100.0f, 160.0f, 100.0f),
                    PathNode.CurveTo(166.62741f, 100.0f, 172.0f, 105.37258f, 172.0f, 112.0f),
                    PathNode.LineTo(172.0f, 160.0f),
                    PathNode.CurveTo(172.0f, 166.62741f, 166.62741f, 172.0f, 160.0f, 172.0f),
                    PathNode.LineTo(112.0f, 172.0f),
                    PathNode.CurveTo(105.37258f, 172.0f, 100.0f, 166.62741f, 100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 153.37259f, 105.37258f, 148.0f, 112.0f, 148.0f),
                    PathNode.LineTo(131.0f, 148.0f),
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
        return _arrowSquareDownRight!!
    }

private var _arrowSquareDownRight: ImageVector? = null
