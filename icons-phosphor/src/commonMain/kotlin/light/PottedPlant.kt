package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) return _pottedPlant!!
        _pottedPlant = phosphorLightIcon(
            name = "PottedPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.24f, 140.24f),
                    PathNode.LineTo(124.24f, 140.24f),
                    PathNode.LineTo(145.33f, 119.15f),
                    PathNode.CurveTo(153.4926f, 123.49236f, 162.57503f, 125.8204f, 171.82f, 125.94f),
                    PathNode.CurveTo(180.58464f, 125.96112f, 189.18459f, 123.559364f, 196.67f, 119.0f),
                    PathNode.CurveTo(219.74f, 105.0f, 232.09f, 72.47f, 229.67f, 31.91f),
                    PathNode.CurveTo(229.49257f, 28.871643f, 227.06836f, 26.447435f, 224.03f, 26.27f),
                    PathNode.CurveTo(183.47f, 23.89f, 150.91f, 36.27f, 136.94f, 59.27f),
                    PathNode.CurveTo(127.72f, 74.49f, 127.74f, 92.98f, 136.8f, 110.62f),
                    PathNode.LineTo(120.0f, 127.51f),
                    PathNode.LineTo(105.36f, 112.88f),
                    PathNode.CurveTo(111.68f, 99.88f, 111.51f, 86.28f, 104.69f, 75.02f),
                    PathNode.CurveTo(94.21f, 57.72f, 70.0f, 48.44f, 39.85f, 50.21f),
                    PathNode.CurveTo(36.81164f, 50.387436f, 34.387436f, 52.81164f, 34.21f, 55.85f),
                    PathNode.CurveTo(32.44f, 86.0f, 41.72f, 110.2f, 59.0f, 120.69f),
                    PathNode.CurveTo(64.72022f, 124.18344f, 71.29742f, 126.02159f, 78.0f, 126.0f),
                    PathNode.CurveTo(84.57705f, 125.92095f, 91.0501f, 124.348f, 96.93f, 121.4f),
                    PathNode.LineTo(111.51f, 136.0f),
                    PathNode.LineTo(101.51f, 146.0f),
                    PathNode.LineTo(56.0f, 146.0f),
                    PathNode.CurveTo(52.68629f, 146.0f, 50.0f, 148.6863f, 50.0f, 152.0f),
                    PathNode.CurveTo(50.0f, 155.3137f, 52.68629f, 158.0f, 56.0f, 158.0f),
                    PathNode.LineTo(67.18f, 158.0f),
                    PathNode.LineTo(80.75f, 219.0f),
                    PathNode.CurveTo(82.12779f, 225.4406f, 87.833755f, 230.03209f, 94.42f, 230.0f),
                    PathNode.LineTo(161.59f, 230.0f),
                    PathNode.CurveTo(168.1725f, 230.02734f, 173.87297f, 225.4369f, 175.25f, 219.0f),
                    PathNode.LineTo(188.82f, 158.0f),
                    PathNode.LineTo(200.0f, 158.0f),
                    PathNode.CurveTo(203.3137f, 158.0f, 206.0f, 155.3137f, 206.0f, 152.0f),
                    PathNode.CurveTo(206.0f, 148.6863f, 203.3137f, 146.0f, 200.0f, 146.0f),
                    PathNode.LineTo(118.48f, 146.0f),
                    PathNode.LineTo(124.24f, 140.24f),
                    PathNode.Close,
                    PathNode.MoveTo(147.24f, 65.54f),
                    PathNode.CurveTo(158.24f, 47.32f, 184.48f, 37.21f, 217.96f, 38.04f),
                    PathNode.CurveTo(218.79f, 71.51f, 208.68f, 97.72f, 190.46f, 108.76f),
                    PathNode.CurveTo(178.16f, 116.2f, 163.37f, 115.68f, 148.67f, 107.33f),
                    PathNode.CurveTo(140.31f, 92.63f, 139.79f, 77.84f, 147.24f, 65.54f),
                    PathNode.Close,
                    PathNode.MoveTo(93.58f, 109.54f),
                    PathNode.CurveTo(83.58f, 115.1f, 73.58f, 115.41f, 65.24f, 110.38f),
                    PathNode.CurveTo(52.78f, 102.87f, 45.75f, 85.0f, 46.0f, 62.0f),
                    PathNode.CurveTo(69.0f, 61.71f, 86.88f, 68.78f, 94.42f, 81.24f),
                    PathNode.CurveTo(99.45f, 89.54f, 99.14f, 99.56f, 93.58f, 109.58f),
                    PathNode.Close,
                    PathNode.MoveTo(176.52f, 158.0f),
                    PathNode.LineTo(163.52f, 216.43f),
                    PathNode.CurveTo(163.3184f, 217.34575f, 162.50768f, 217.99849f, 161.57f, 218.0f),
                    PathNode.LineTo(94.42f, 218.0f),
                    PathNode.CurveTo(93.46365f, 218.02231f, 92.625404f, 217.36429f, 92.42f, 216.43f),
                    PathNode.LineTo(79.48f, 158.0f),
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
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
