package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorFillIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 200.60106f, 176.60106f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(79.39894f, 240.0f, 40.0f, 200.60106f, 40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 121.23f, 50.7f, 87.54f, 69.34f, 59.56f),
                    PathNode.CurveTo(87.53f, 32.29f, 109.46f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(146.54f, 16.0f, 168.47f, 32.29f, 186.66f, 59.56f),
                    PathNode.CurveTo(205.3f, 87.54f, 216.0f, 121.23f, 216.0f, 152.0f),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
