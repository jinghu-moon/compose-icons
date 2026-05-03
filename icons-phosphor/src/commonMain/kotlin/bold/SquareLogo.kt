package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SquareLogo: ImageVector
    get() {
        if (_squareLogo != null) return _squareLogo!!
        _squareLogo = phosphorBoldIcon(
            name = "SquareLogo",
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
                    PathNode.MoveTo(96.0f, 172.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(166.62741f, 172.0f, 172.0f, 166.62741f, 172.0f, 160.0f),
                    PathNode.LineTo(172.0f, 96.0f),
                    PathNode.CurveTo(172.0f, 89.37258f, 166.62741f, 84.0f, 160.0f, 84.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(89.37258f, 84.0f, 84.0f, 89.37258f, 84.0f, 96.0f),
                    PathNode.LineTo(84.0f, 160.0f),
                    PathNode.CurveTo(84.0f, 166.62741f, 89.37258f, 172.0f, 96.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 108.0f),
                    PathNode.LineTo(148.0f, 108.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.LineTo(108.0f, 148.0f),
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
        return _squareLogo!!
    }

private var _squareLogo: ImageVector? = null
