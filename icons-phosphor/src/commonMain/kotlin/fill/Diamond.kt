package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorFillIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.01195f, 132.23273f, 238.33038f, 136.29439f, 235.33f, 139.28f),
                    PathNode.LineTo(139.28f, 235.34f),
                    PathNode.CurveTo(133.0394f, 241.54358f, 122.9606f, 241.54358f, 116.72f, 235.34f),
                    PathNode.LineTo(116.72f, 235.34f),
                    PathNode.LineTo(20.72f, 139.28f),
                    PathNode.CurveTo(14.516422f, 133.0394f, 14.516422f, 122.9606f, 20.72f, 116.72f),
                    PathNode.LineTo(116.77f, 20.66f),
                    PathNode.CurveTo(123.0106f, 14.456423f, 133.0894f, 14.456423f, 139.33f, 20.66f),
                    PathNode.LineTo(235.38f, 116.72f),
                    PathNode.CurveTo(238.36205f, 119.71383f, 240.0252f, 123.77448f, 240.0f, 128.0f),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
