package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorBoldIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(25.372583f, 44.0f, 20.0f, 49.37258f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 206.62741f, 25.372583f, 212.0f, 32.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(230.62741f, 212.0f, 236.0f, 206.62741f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 49.37258f, 230.62741f, 44.0f, 224.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 140.0f),
                    PathNode.LineTo(92.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.LineTo(164.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 140.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(68.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(212.0f, 140.0f),
                    PathNode.LineTo(188.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 92.0f),
                    PathNode.LineTo(140.0f, 92.0f),
                    PathNode.LineTo(140.0f, 68.0f),
                    PathNode.LineTo(212.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 68.0f),
                    PathNode.LineTo(116.0f, 92.0f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 164.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 188.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(212.0f, 188.0f),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
