package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) return _squaresFour!!
        _squaresFour = phosphorFillIcon(
            name = "SquaresFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 56.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 112.836555f, 112.836555f, 120.0f, 104.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(47.163445f, 120.0f, 40.0f, 112.836555f, 40.0f, 104.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.CurveTo(112.836555f, 40.0f, 120.0f, 47.163445f, 120.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(143.16344f, 40.0f, 136.0f, 47.163445f, 136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.CurveTo(136.0f, 112.836555f, 143.16344f, 120.0f, 152.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(208.83656f, 120.0f, 216.0f, 112.836555f, 216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(47.163445f, 136.0f, 40.0f, 143.16344f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 208.83656f, 47.163445f, 216.0f, 56.0f, 216.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.CurveTo(112.836555f, 216.0f, 120.0f, 208.83656f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.CurveTo(120.0f, 143.16344f, 112.836555f, 136.0f, 104.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.CurveTo(143.16344f, 136.0f, 136.0f, 143.16344f, 136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 208.83656f, 143.16344f, 216.0f, 152.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 143.16344f, 208.83656f, 136.0f, 200.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
