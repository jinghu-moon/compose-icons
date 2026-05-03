package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorFillIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(40.235497f, 56.0f, 8.0f, 88.2355f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 167.7645f, 40.235497f, 200.0f, 80.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(215.7645f, 200.0f, 248.0f, 167.7645f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 88.2355f, 215.7645f, 56.0f, 176.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 168.0f),
                    PathNode.CurveTo(153.90862f, 168.0f, 136.0f, 150.09138f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 105.90861f, 153.90862f, 88.0f, 176.0f, 88.0f),
                    PathNode.CurveTo(198.09138f, 88.0f, 216.0f, 105.90861f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 150.09138f, 198.09138f, 168.0f, 176.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
