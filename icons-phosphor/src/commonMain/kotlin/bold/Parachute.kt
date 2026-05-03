package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorBoldIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 120.0f),
                    PathNode.CurveTo(235.93387f, 60.38066f, 187.61934f, 12.066133f, 128.0f, 12.0f),
                    PathNode.LineTo(128.0f, 12.0f),
                    PathNode.CurveTo(68.38066f, 12.066133f, 20.066133f, 60.38066f, 20.0f, 120.0f),
                    PathNode.CurveTo(20.004957f, 123.33794f, 21.4f, 126.52299f, 23.85f, 128.79f),
                    PathNode.LineTo(24.07f, 128.99f),
                    PathNode.CurveTo(24.24f, 129.14f, 24.42f, 129.3f, 24.61f, 129.44f),
                    PathNode.LineTo(24.8f, 129.6f),
                    PathNode.LineTo(116.0f, 198.0f),
                    PathNode.LineTo(116.0f, 212.0f),
                    PathNode.LineTo(112.0f, 212.0f),
                    PathNode.CurveTo(105.37258f, 212.0f, 100.0f, 217.37259f, 100.0f, 224.0f),
                    PathNode.CurveTo(100.0f, 230.62741f, 105.37258f, 236.0f, 112.0f, 236.0f),
                    PathNode.LineTo(144.0f, 236.0f),
                    PathNode.CurveTo(150.62741f, 236.0f, 156.0f, 230.62741f, 156.0f, 224.0f),
                    PathNode.CurveTo(156.0f, 217.37259f, 150.62741f, 212.0f, 144.0f, 212.0f),
                    PathNode.LineTo(140.0f, 212.0f),
                    PathNode.LineTo(140.0f, 198.0f),
                    PathNode.LineTo(231.2f, 129.6f),
                    PathNode.LineTo(231.2f, 129.6f),
                    PathNode.CurveTo(234.22166f, 127.33374f, 236.0f, 123.777084f, 236.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.15f, 108.0f),
                    PathNode.LineTo(179.63f, 108.0f),
                    PathNode.CurveTo(177.84f, 78.73f, 169.63f, 57.47f, 160.7f, 42.64f),
                    PathNode.CurveTo(187.76889f, 54.131683f, 206.8894f, 78.90308f, 211.15f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.42f, 108.0f),
                    PathNode.CurveTo(103.15f, 68.76f, 119.0f, 48.11f, 128.0f, 39.38f),
                    PathNode.CurveTo(137.0f, 48.11f, 152.85f, 68.76f, 155.58f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.3f, 42.64f),
                    PathNode.CurveTo(86.3f, 57.47f, 78.16f, 78.73f, 76.37f, 108.0f),
                    PathNode.LineTo(44.85f, 108.0f),
                    PathNode.CurveTo(49.110596f, 78.90308f, 68.23111f, 54.131683f, 95.3f, 42.64f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 132.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 132.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.LineTo(140.0f, 168.0f),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
