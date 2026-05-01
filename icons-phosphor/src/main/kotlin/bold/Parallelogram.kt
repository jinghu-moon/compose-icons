package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorBoldIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.78f, 45.14f),
                    PathNode.CurveTo(245.10825f, 39.434452f, 238.7849f, 35.990147f, 232.0f, 36.0f),
                    PathNode.LineTo(88.81f, 36.0f),
                    PathNode.CurveTo(80.93986f, 35.9989f, 73.8007f, 40.613525f, 70.57f, 47.79f),
                    PathNode.LineTo(5.77f, 191.79f),
                    PathNode.CurveTo(2.984419f, 197.97772f, 3.526365f, 205.1558f, 7.209421f, 210.85515f),
                    PathNode.CurveTo(10.892477f, 216.55449f, 17.214176f, 219.99756f, 24.0f, 220.0f),
                    PathNode.LineTo(167.19f, 220.0f),
                    PathNode.CurveTo(175.06015f, 220.0011f, 182.19931f, 215.38647f, 185.43f, 208.21f),
                    PathNode.LineTo(250.23f, 64.21f),
                    PathNode.CurveTo(253.03311f, 58.022484f, 252.48642f, 50.832558f, 248.78f, 45.14f),
                    PathNode.Close,
                    PathNode.MoveTo(164.6f, 196.0f),
                    PathNode.LineTo(30.2f, 196.0f),
                    PathNode.LineTo(91.4f, 60.0f),
                    PathNode.LineTo(225.8f, 60.0f),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
