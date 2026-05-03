package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorBoldIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 41.37258f, 121.37258f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(134.62741f, 36.0f, 140.0f, 41.37258f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 134.62741f, 134.62741f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(121.37258f, 140.0f, 116.0f, 134.62741f, 116.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.55f, 46.0f),
                    PathNode.CurveTo(177.00883f, 42.588097f, 169.75801f, 44.214424f, 166.20491f, 49.666134f),
                    PathNode.CurveTo(162.6518f, 55.11784f, 164.09135f, 62.408043f, 169.45f, 66.1f),
                    PathNode.CurveTo(191.41f, 80.37f, 204.0f, 103.0f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 169.97365f, 169.97365f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(86.02636f, 204.0f, 52.0f, 169.97365f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 103.0f, 64.59f, 80.37f, 86.55f, 66.05f),
                    PathNode.CurveTo(91.61326f, 62.255222f, 92.86f, 55.181023f, 89.39908f, 49.883957f),
                    PathNode.CurveTo(85.93815f, 44.58689f, 78.95889f, 42.887287f, 73.45f, 46.0f),
                    PathNode.CurveTo(44.56f, 64.78f, 28.0f, 94.69f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 94.69f, 211.44f, 64.78f, 182.55f, 46.0f),
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
        return _power!!
    }

private var _power: ImageVector? = null
