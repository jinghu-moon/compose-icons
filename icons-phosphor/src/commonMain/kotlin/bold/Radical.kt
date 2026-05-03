package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorBoldIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 80.0f),
                    PathNode.LineTo(252.0f, 104.0f),
                    PathNode.CurveTo(252.0f, 110.62742f, 246.62741f, 116.0f, 240.0f, 116.0f),
                    PathNode.CurveTo(233.37259f, 116.0f, 228.0f, 110.62742f, 228.0f, 104.0f),
                    PathNode.LineTo(228.0f, 92.0f),
                    PathNode.LineTo(136.32f, 92.0f),
                    PathNode.LineTo(91.24f, 212.21f),
                    PathNode.CurveTo(89.482925f, 216.89232f, 85.00614f, 219.99399f, 80.005f, 219.99399f),
                    PathNode.CurveTo(75.00385f, 219.99399f, 70.52708f, 216.89232f, 68.77f, 212.21f),
                    PathNode.LineTo(20.77f, 84.21f),
                    PathNode.CurveTo(19.225298f, 80.18716f, 19.956198f, 75.644936f, 22.6849f, 72.30974f),
                    PathNode.CurveTo(25.4136f, 68.97453f, 29.721092f, 67.358505f, 33.97018f, 68.075874f),
                    PathNode.CurveTo(38.21927f, 68.793236f, 41.757477f, 71.73383f, 43.24f, 75.78f),
                    PathNode.LineTo(80.0f, 173.78f),
                    PathNode.LineTo(116.77f, 75.78f),
                    PathNode.CurveTo(118.52774f, 71.10096f, 123.00169f, 68.00146f, 128.0f, 68.0f),
                    PathNode.LineTo(240.0f, 68.0f),
                    PathNode.CurveTo(246.62741f, 68.0f, 252.0f, 73.37258f, 252.0f, 80.0f),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
