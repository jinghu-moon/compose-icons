package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorLightIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.62f, 178.58f),
                    PathNode.CurveTo(221.63606f, 179.80516f, 222.12367f, 181.38388f, 221.97551f, 182.96866f),
                    PathNode.CurveTo(221.82735f, 184.55344f, 221.05556f, 186.01439f, 219.83f, 187.03f),
                    PathNode.CurveTo(202.96f, 201.03f, 187.83f, 206.03f, 174.08f, 206.03f),
                    PathNode.CurveTo(155.89f, 206.03f, 139.95f, 197.37f, 125.14f, 189.33f),
                    PathNode.CurveTo(99.14f, 175.21f, 76.7f, 163.02f, 43.83f, 190.33f),
                    PathNode.CurveTo(41.253593f, 192.44525f, 37.45025f, 192.07141f, 35.335f, 189.495f),
                    PathNode.CurveTo(33.21975f, 186.9186f, 33.59359f, 183.11525f, 36.17f, 181.0f),
                    PathNode.CurveTo(75.3f, 148.55f, 104.82f, 164.59f, 130.86f, 178.74f),
                    PathNode.CurveTo(156.9f, 192.89f, 179.3f, 205.05f, 212.17f, 177.74f),
                    PathNode.CurveTo(213.40146f, 176.72969f, 214.9841f, 176.25052f, 216.56915f, 176.4081f),
                    PathNode.CurveTo(218.1542f, 176.56566f, 219.61154f, 177.34703f, 220.62f, 178.58f),
                    PathNode.Close,
                    PathNode.MoveTo(212.17f, 121.77f),
                    PathNode.CurveTo(179.3f, 149.04f, 156.85f, 136.84f, 130.86f, 122.77f),
                    PathNode.CurveTo(104.87f, 108.7f, 75.3f, 92.54f, 36.17f, 125.0f),
                    PathNode.CurveTo(33.615685f, 127.11525f, 33.25975f, 130.90068f, 35.375f, 133.455f),
                    PathNode.CurveTo(37.49025f, 136.00932f, 41.275684f, 136.36525f, 43.83f, 134.25f),
                    PathNode.CurveTo(76.7f, 106.98f, 99.15f, 119.17f, 125.14f, 133.25f),
                    PathNode.CurveTo(139.95f, 141.25f, 155.89f, 149.96f, 174.08f, 149.96f),
                    PathNode.CurveTo(187.87f, 149.96f, 202.96f, 144.96f, 219.83f, 130.96f),
                    PathNode.CurveTo(222.38156f, 128.84474f, 222.73524f, 125.061554f, 220.62f, 122.51f),
                    PathNode.CurveTo(218.50475f, 119.95844f, 214.72156f, 119.60475f, 212.17f, 121.72f),
                    PathNode.Close,
                    PathNode.MoveTo(43.83f, 78.21f),
                    PathNode.CurveTo(76.7f, 50.94f, 99.15f, 63.14f, 125.14f, 77.21f),
                    PathNode.CurveTo(140.0f, 85.3f, 155.89f, 94.0f, 174.08f, 94.0f),
                    PathNode.CurveTo(187.87f, 94.0f, 202.96f, 89.0f, 219.83f, 75.0f),
                    PathNode.CurveTo(222.38156f, 72.88475f, 222.73524f, 69.101555f, 220.62f, 66.55f),
                    PathNode.CurveTo(218.50475f, 63.998444f, 214.72156f, 63.64475f, 212.17f, 65.76f),
                    PathNode.CurveTo(179.3f, 93.03f, 156.85f, 80.83f, 130.86f, 66.76f),
                    PathNode.CurveTo(104.87f, 52.69f, 75.3f, 36.52f, 36.17f, 69.0f),
                    PathNode.CurveTo(33.618443f, 71.11525f, 33.264748f, 74.898445f, 35.38f, 77.45f),
                    PathNode.CurveTo(37.49525f, 80.00156f, 41.278446f, 80.35525f, 43.83f, 78.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waves!!
    }

private var _waves: ImageVector? = null
