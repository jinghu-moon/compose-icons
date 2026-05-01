package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorRegularIcon(
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
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(154.49f, 32.0f, 184.0f, 43.5f, 184.0f, 60.0f),
                    PathNode.CurveTo(184.0f, 76.5f, 154.49f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(101.51f, 88.0f, 72.0f, 76.5f, 72.0f, 60.0f),
                    PathNode.CurveTo(72.0f, 43.5f, 101.51f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 224.0f),
                    PathNode.CurveTo(98.17f, 224.0f, 72.0f, 210.92f, 72.0f, 196.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(85.1f, 97.85f, 105.14f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(150.86f, 104.0f, 170.9f, 97.8f, 184.0f, 88.0f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.CurveTo(184.0f, 210.92f, 157.83f, 224.0f, 128.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
