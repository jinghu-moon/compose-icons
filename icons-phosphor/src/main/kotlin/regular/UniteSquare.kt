package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorRegularIcon(
            name = "UniteSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 91.58172f, 220.41827f, 88.0f, 216.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 35.581722f, 164.41827f, 32.0f, 160.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.CurveTo(32.0f, 164.41827f, 35.581722f, 168.0f, 40.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 220.41827f, 91.58172f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.31f, 208.0f),
                    PathNode.LineTo(48.0f, 100.69f),
                    PathNode.LineTo(48.0f, 59.31f),
                    PathNode.LineTo(196.69f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(59.31f, 48.0f),
                    PathNode.LineTo(100.69f, 48.0f),
                    PathNode.LineTo(208.0f, 155.31f),
                    PathNode.LineTo(208.0f, 196.69f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 132.69f),
                    PathNode.LineTo(179.31f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 76.69f),
                    PathNode.LineTo(123.31f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 123.31f),
                    PathNode.LineTo(76.69f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 179.31f),
                    PathNode.LineTo(132.69f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
