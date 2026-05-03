package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlusSquare: ImageVector
    get() {
        if (_plusSquare != null) return _plusSquare!!
        _plusSquare = phosphorBoldIcon(
            name = "PlusSquare",
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
                    PathNode.MoveTo(76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 121.37258f, 81.37258f, 116.0f, 88.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 81.37258f, 121.37258f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(134.62741f, 76.0f, 140.0f, 81.37258f, 140.0f, 88.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(174.62741f, 116.0f, 180.0f, 121.37258f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 134.62741f, 174.62741f, 140.0f, 168.0f, 140.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 174.62741f, 134.62741f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(88.0f, 140.0f),
                    PathNode.CurveTo(81.37258f, 140.0f, 76.0f, 134.62741f, 76.0f, 128.0f),
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
        return _plusSquare!!
    }

private var _plusSquare: ImageVector? = null
