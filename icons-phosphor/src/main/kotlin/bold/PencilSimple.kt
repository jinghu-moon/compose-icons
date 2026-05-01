package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorBoldIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.14f, 70.54f),
                    PathNode.LineTo(185.46f, 25.85f),
                    PathNode.CurveTo(181.70905f, 22.097519f, 176.62073f, 19.989271f, 171.315f, 19.989271f),
                    PathNode.CurveTo(166.00926f, 19.989271f, 160.92096f, 22.097519f, 157.17f, 25.85f),
                    PathNode.LineTo(33.86f, 149.17f),
                    PathNode.CurveTo(30.094933f, 152.91043f, 27.984512f, 158.0028f, 28.0f, 163.31f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(92.69f, 228.0f),
                    PathNode.CurveTo(97.99697f, 228.01437f, 103.088936f, 225.90411f, 106.83f, 222.14f),
                    PathNode.LineTo(230.14f, 98.82f),
                    PathNode.CurveTo(237.94763f, 91.01f, 237.94763f, 78.35f, 230.14f, 70.54f),
                    PathNode.Close,
                    PathNode.MoveTo(91.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 165.0f),
                    PathNode.LineTo(136.0f, 81.0f),
                    PathNode.LineTo(175.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 103.0f),
                    PathNode.LineTo(153.0f, 64.0f),
                    PathNode.LineTo(171.34f, 45.66f),
                    PathNode.LineTo(210.34f, 84.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
