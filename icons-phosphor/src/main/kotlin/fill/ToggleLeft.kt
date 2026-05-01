package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorFillIcon(
            name = "ToggleLeft",
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
                    PathNode.MoveTo(80.0f, 168.0f),
                    PathNode.CurveTo(57.90861f, 168.0f, 40.0f, 150.09138f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 105.90861f, 57.90861f, 88.0f, 80.0f, 88.0f),
                    PathNode.CurveTo(102.09139f, 88.0f, 120.0f, 105.90861f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 150.09138f, 102.09139f, 168.0f, 80.0f, 168.0f),
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
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
