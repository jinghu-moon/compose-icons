package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorFillIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(87.63f, 16.0f, 56.0f, 35.33f, 56.0f, 60.0f),
                    PathNode.LineTo(56.0f, 196.0f),
                    PathNode.CurveTo(56.0f, 220.67f, 87.63f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(168.37f, 240.0f, 200.0f, 220.67f, 200.0f, 196.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(200.0f, 35.33f, 168.37f, 16.0f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(98.17f, 224.0f, 72.0f, 210.92f, 72.0f, 196.0f),
                    PathNode.LineTo(72.0f, 77.43f),
                    PathNode.CurveTo(82.92f, 88.5f, 103.9f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(152.1f, 96.0f, 173.08f, 88.5f, 184.0f, 77.43f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.CurveTo(184.0f, 210.92f, 157.83f, 224.0f, 128.0f, 224.0f),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
