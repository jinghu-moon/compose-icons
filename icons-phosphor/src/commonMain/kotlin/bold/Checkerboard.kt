package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorBoldIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.0f, 116.0f),
                    PathNode.LineTo(140.0f, 63.0f),
                    PathNode.LineTo(140.0f, 52.0f),
                    PathNode.LineTo(151.0f, 52.0f),
                    PathNode.LineTo(204.0f, 105.0f),
                    PathNode.LineTo(204.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 97.0f),
                    PathNode.LineTo(159.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 71.0f),
                    PathNode.LineTo(185.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 52.0f),
                    PathNode.LineTo(116.0f, 68.0f),
                    PathNode.LineTo(116.0f, 68.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(105.0f, 204.0f),
                    PathNode.LineTo(52.0f, 151.0f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.LineTo(63.0f, 140.0f),
                    PathNode.LineTo(116.0f, 193.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 159.0f),
                    PathNode.LineTo(97.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 185.0f),
                    PathNode.LineTo(71.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(204.0f, 140.0f),
                    PathNode.LineTo(204.0f, 204.0f),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
