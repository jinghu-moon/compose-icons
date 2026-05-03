package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorRegularIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(195.31f, 120.0f),
                    PathNode.LineTo(136.0f, 60.69f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(148.69f, 48.0f),
                    PathNode.LineTo(208.0f, 107.32f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 83.31f),
                    PathNode.LineTo(172.69f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 84.69f),
                    PathNode.LineTo(171.31f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 48.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.31f, 208.0f),
                    PathNode.LineTo(48.0f, 148.69f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(60.69f, 136.0f),
                    PathNode.LineTo(120.0f, 195.31f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 172.69f),
                    PathNode.LineTo(83.31f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 171.31f),
                    PathNode.LineTo(84.69f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
