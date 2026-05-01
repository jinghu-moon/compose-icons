package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorBoldIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.62f, 51.65f),
                    PathNode.CurveTo(255.26076f, 45.580772f, 250.41922f, 40.739235f, 244.35f, 40.38f),
                    PathNode.CurveTo(191.08f, 37.25f, 148.15f, 53.74f, 129.51f, 84.52f),
                    PathNode.CurveTo(117.37f, 104.52f, 116.95f, 128.69f, 128.05f, 151.82f),
                    PathNode.CurveTo(122.64765f, 158.7125f, 118.49176f, 166.4963f, 115.77f, 174.82f),
                    PathNode.LineTo(103.11f, 162.16f),
                    PathNode.CurveTo(110.3f, 145.39f, 109.54f, 128.05f, 100.71f, 113.47f),
                    PathNode.CurveTo(86.73f, 90.36f, 54.89f, 78.0f, 15.55f, 80.27f),
                    PathNode.CurveTo(9.477188f, 80.629745f, 4.634362f, 85.47687f, 4.28f, 91.55f),
                    PathNode.CurveTo(2.0f, 130.89f, 14.36f, 162.73f, 37.45f, 176.71f),
                    PathNode.CurveTo(45.28112f, 181.483f, 54.27898f, 183.99895f, 63.45f, 183.98f),
                    PathNode.CurveTo(71.26897f, 183.91591f, 78.99283f, 182.25885f, 86.15f, 179.11f),
                    PathNode.LineTo(112.0f, 205.0f),
                    PathNode.LineTo(112.0f, 228.0f),
                    PathNode.CurveTo(112.0f, 234.62741f, 117.37258f, 240.0f, 124.0f, 240.0f),
                    PathNode.CurveTo(130.62741f, 240.0f, 136.0f, 234.62741f, 136.0f, 228.0f),
                    PathNode.LineTo(136.0f, 198.51f),
                    PathNode.CurveTo(135.97528f, 187.78323f, 139.29222f, 177.3151f, 145.49f, 168.56f),
                    PathNode.CurveTo(155.5298f, 173.31537f, 166.48152f, 175.83665f, 177.59f, 175.95f),
                    PathNode.CurveTo(189.54218f, 175.97697f, 201.26974f, 172.70337f, 211.48f, 166.49f),
                    PathNode.CurveTo(242.25f, 147.85f, 258.76f, 104.92f, 255.62f, 51.65f),
                    PathNode.Close,
                    PathNode.MoveTo(49.88f, 156.18f),
                    PathNode.CurveTo(36.69f, 148.18f, 28.7f, 128.72f, 28.05f, 104.05f),
                    PathNode.CurveTo(52.72f, 104.7f, 72.19f, 112.69f, 80.18f, 125.88f),
                    PathNode.CurveTo(83.30459f, 130.96236f, 84.586266f, 136.96469f, 83.81f, 142.88f),
                    PathNode.LineTo(72.48f, 131.51f),
                    PathNode.CurveTo(67.785576f, 126.81558f, 60.17442f, 126.81558f, 55.48f, 131.51f),
                    PathNode.CurveTo(50.78558f, 136.20442f, 50.78558f, 143.81558f, 55.48f, 148.51f),
                    PathNode.LineTo(66.82f, 159.85f),
                    PathNode.CurveTo(60.920746f, 160.57838f, 54.948853f, 159.28459f, 49.88f, 156.18f),
                    PathNode.Close,
                    PathNode.MoveTo(199.05f, 146.0f),
                    PathNode.CurveTo(188.39f, 152.45f, 176.05f, 153.67f, 163.24f, 149.76f),
                    PathNode.LineTo(200.49f, 112.52f),
                    PathNode.CurveTo(205.18442f, 107.82558f, 205.18442f, 100.214424f, 200.49f, 95.52f),
                    PathNode.CurveTo(195.79558f, 90.82558f, 188.18442f, 90.82558f, 183.49f, 95.52f),
                    PathNode.LineTo(146.24f, 132.76f),
                    PathNode.CurveTo(142.37f, 120.0f, 143.59f, 107.61f, 150.0f, 97.0f),
                    PathNode.CurveTo(162.7f, 76.0f, 192.65f, 64.0f, 231.32f, 64.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.14f, 103.0f, 220.14f, 133.18f, 199.05f, 146.0f),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
