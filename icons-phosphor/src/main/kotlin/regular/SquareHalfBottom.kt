package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SquareHalfBottom: ImageVector
    get() {
        if (_squareHalfBottom != null) return _squareHalfBottom!!
        _squareHalfBottom = phosphorRegularIcon(
            name = "SquareHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(47.163445f, 40.0f, 40.0f, 47.163445f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 208.83656f, 47.163445f, 216.0f, 56.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 136.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.LineTo(152.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _squareHalfBottom!!
    }

private var _squareHalfBottom: ImageVector? = null
