package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorFillIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.26f, 105.19f),
                    PathNode.LineTo(199.26f, 212.73f),
                    PathNode.LineTo(199.2f, 212.9f),
                    PathNode.CurveTo(197.09169f, 219.51566f, 190.94347f, 224.00548f, 184.0f, 224.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(65.05653f, 224.00548f, 58.908302f, 219.51566f, 56.8f, 212.9f),
                    PathNode.LineTo(56.74f, 212.73f),
                    PathNode.LineTo(24.74f, 105.19f),
                    PathNode.CurveTo(22.697832f, 98.69915f, 24.984432f, 91.62674f, 30.44f, 87.56f),
                    PathNode.LineTo(118.36f, 19.25f),
                    PathNode.LineTo(118.54f, 19.11f),
                    PathNode.CurveTo(124.1637f, 14.95922f, 131.8363f, 14.95922f, 137.46f, 19.11f),
                    PathNode.LineTo(137.64f, 19.25f),
                    PathNode.LineTo(225.56f, 87.56f),
                    PathNode.CurveTo(231.01556f, 91.62674f, 233.30217f, 98.69915f, 231.26f, 105.19f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
