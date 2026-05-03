package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorBoldIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.14f, 77.41f),
                    PathNode.LineTo(178.59f, 25.86f),
                    PathNode.CurveTo(174.84958f, 22.094933f, 169.75719f, 19.984512f, 164.45f, 20.0f),
                    PathNode.LineTo(91.55f, 20.0f),
                    PathNode.CurveTo(86.242805f, 19.984512f, 81.15043f, 22.094933f, 77.41f, 25.86f),
                    PathNode.LineTo(25.86f, 77.41f),
                    PathNode.CurveTo(22.094933f, 81.15043f, 19.984512f, 86.242805f, 20.0f, 91.55f),
                    PathNode.LineTo(20.0f, 164.45f),
                    PathNode.CurveTo(19.984512f, 169.75719f, 22.094933f, 174.84958f, 25.86f, 178.59f),
                    PathNode.LineTo(77.41f, 230.14f),
                    PathNode.CurveTo(81.15043f, 233.90506f, 86.242805f, 236.01549f, 91.55f, 236.0f),
                    PathNode.LineTo(164.45f, 236.0f),
                    PathNode.CurveTo(169.75719f, 236.01549f, 174.84958f, 233.90506f, 178.59f, 230.14f),
                    PathNode.LineTo(230.14f, 178.59f),
                    PathNode.CurveTo(233.90506f, 174.84958f, 236.01549f, 169.75719f, 236.0f, 164.45f),
                    PathNode.LineTo(236.0f, 91.55f),
                    PathNode.CurveTo(236.01549f, 86.242805f, 233.90506f, 81.15043f, 230.14f, 77.41f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 162.79f),
                    PathNode.LineTo(162.79f, 212.0f),
                    PathNode.LineTo(93.21f, 212.0f),
                    PathNode.LineTo(44.0f, 162.79f),
                    PathNode.LineTo(44.0f, 93.21f),
                    PathNode.LineTo(93.21f, 44.0f),
                    PathNode.LineTo(162.79f, 44.0f),
                    PathNode.LineTo(212.0f, 93.21f),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
