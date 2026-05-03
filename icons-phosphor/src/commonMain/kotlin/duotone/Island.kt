package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Island: ImageVector
    get() {
        if (_island != null) return _island!!
        _island = phosphorDuotoneIcon(
            name = "Island",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 140.0f),
                    PathNode.CurveTo(32.0f, 128.9543f, 40.954304f, 120.0f, 52.0f, 120.0f),
                    PathNode.CurveTo(63.045696f, 120.0f, 72.0f, 128.9543f, 72.0f, 140.0f),
                    PathNode.CurveTo(72.0f, 151.0457f, 63.045696f, 160.0f, 52.0f, 160.0f),
                    PathNode.CurveTo(40.954304f, 160.0f, 32.0f, 151.0457f, 32.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 192.0f, 24.0f, 224.0f, 24.0f, 224.0f),
                    PathNode.LineTo(232.0f, 224.0f),
                    PathNode.CurveTo(232.0f, 224.0f, 192.0f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.25f, 229.0f),
                    PathNode.CurveTo(236.92453f, 230.6585f, 234.99416f, 231.7221f, 232.88406f, 231.95656f),
                    PathNode.CurveTo(230.77396f, 232.19101f, 228.6572f, 231.57709f, 227.0f, 230.25f),
                    PathNode.CurveTo(226.63f, 229.95f, 188.18f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(67.82f, 200.0f, 29.36f, 230.0f, 29.0f, 230.26f),
                    PathNode.CurveTo(25.54546f, 233.02142f, 20.506424f, 232.45953f, 17.745f, 229.005f),
                    PathNode.CurveTo(14.983577f, 225.55046f, 15.545459f, 220.51143f, 19.0f, 217.75f),
                    PathNode.CurveTo(20.63f, 216.45f, 57.52f, 187.49f, 117.29f, 184.3f),
                    PathNode.CurveTo(114.18085f, 171.91248f, 113.07019f, 159.10786f, 114.0f, 146.37f),
                    PathNode.CurveTo(115.74f, 124.66f, 124.92f, 95.74f, 157.0f, 73.89f),
                    PathNode.CurveTo(152.08781f, 72.69589f, 147.05501f, 72.06848f, 142.0f, 72.02f),
                    PathNode.LineTo(140.33f, 72.02f),
                    PathNode.CurveTo(121.33f, 72.64f, 109.39f, 83.73f, 103.83f, 105.94f),
                    PathNode.CurveTo(102.93366f, 109.52649f, 99.69666f, 112.03175f, 96.0f, 112.0f),
                    PathNode.CurveTo(95.345726f, 112.0034f, 94.693726f, 111.92274f, 94.06f, 111.76f),
                    PathNode.CurveTo(89.77469f, 110.688f, 87.169266f, 106.34563f, 88.24f, 102.06f),
                    PathNode.CurveTo(97.49f, 65.11f, 121.35f, 56.64f, 139.74f, 56.06f),
                    PathNode.CurveTo(147.04382f, 55.90105f, 154.33585f, 56.725105f, 161.42f, 58.51f),
                    PathNode.CurveTo(157.59f, 52.18f, 151.99f, 45.58f, 144.21f, 42.26f),
                    PathNode.CurveTo(134.21f, 38.02f, 122.04f, 39.87f, 107.9f, 47.77f),
                    PathNode.CurveTo(104.034004f, 49.923912f, 99.15391f, 48.53599f, 97.0f, 44.67f),
                    PathNode.CurveTo(94.84609f, 40.80401f, 96.23401f, 35.923912f, 100.1f, 33.77f),
                    PathNode.CurveTo(118.84f, 23.32f, 135.82f, 21.23f, 150.58f, 27.57f),
                    PathNode.CurveTo(163.07f, 32.93f, 171.31f, 43.35f, 176.45f, 52.57f),
                    PathNode.CurveTo(182.63f, 42.93f, 190.33f, 36.4f, 198.84f, 33.63f),
                    PathNode.CurveTo(210.7f, 29.76f, 223.48f, 32.91f, 236.84f, 43.0f),
                    PathNode.CurveTo(240.20367f, 45.71137f, 240.8069f, 50.60362f, 238.20256f, 54.050842f),
                    PathNode.CurveTo(235.59824f, 57.498062f, 230.72736f, 58.254715f, 227.2f, 55.76f),
                    PathNode.CurveTo(218.29f, 49.03f, 210.43f, 46.7f, 203.85f, 48.83f),
                    PathNode.CurveTo(196.56f, 51.18f, 190.98f, 58.83f, 187.48f, 65.44f),
                    PathNode.CurveTo(194.67575f, 66.89868f, 201.59932f, 69.47308f, 208.0f, 73.07f),
                    PathNode.CurveTo(222.61f, 81.42f, 240.0f, 99.12f, 240.0f, 136.01f),
                    PathNode.CurveTo(240.0f, 140.42828f, 236.41827f, 144.01f, 232.0f, 144.01f),
                    PathNode.CurveTo(227.58173f, 144.01f, 224.0f, 140.42828f, 224.0f, 136.01f),
                    PathNode.CurveTo(224.0f, 112.55f, 215.93f, 96.01f, 200.0f, 87.01f),
                    PathNode.CurveTo(198.14442f, 85.95609f, 196.2239f, 85.02088f, 194.25f, 84.21f),
                    PathNode.CurveTo(199.28717f, 94.45031f, 201.05367f, 105.99185f, 199.31f, 117.27f),
                    PathNode.CurveTo(198.05267f, 125.61399f, 195.03232f, 133.59442f, 190.45f, 140.68f),
                    PathNode.CurveTo(187.8972f, 144.26006f, 182.93364f, 145.10887f, 179.33626f, 142.58052f),
                    PathNode.CurveTo(175.73888f, 140.05222f, 174.85626f, 135.09453f, 177.36f, 131.48f),
                    PathNode.CurveTo(178.1f, 130.39f, 193.69f, 107.1f, 174.1f, 82.11f),
                    PathNode.CurveTo(147.1f, 97.32f, 132.21f, 119.36f, 129.94f, 147.7f),
                    PathNode.CurveTo(129.05574f, 159.97752f, 130.35243f, 172.31462f, 133.77f, 184.14f),
                    PathNode.CurveTo(196.42f, 185.95f, 235.29f, 216.47f, 236.97f, 217.8f),
                    PathNode.CurveTo(240.40126f, 220.54764f, 240.97285f, 225.54904f, 238.25f, 229.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 140.0f),
                    PathNode.CurveTo(24.0f, 124.536026f, 36.53603f, 112.0f, 52.0f, 112.0f),
                    PathNode.CurveTo(67.463974f, 112.0f, 80.0f, 124.536026f, 80.0f, 140.0f),
                    PathNode.CurveTo(80.0f, 155.46397f, 67.463974f, 168.0f, 52.0f, 168.0f),
                    PathNode.CurveTo(36.53603f, 168.0f, 24.0f, 155.46397f, 24.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 140.0f),
                    PathNode.CurveTo(40.0f, 146.62741f, 45.37258f, 152.0f, 52.0f, 152.0f),
                    PathNode.CurveTo(58.62742f, 152.0f, 64.0f, 146.62741f, 64.0f, 140.0f),
                    PathNode.CurveTo(64.0f, 133.37259f, 58.62742f, 128.0f, 52.0f, 128.0f),
                    PathNode.CurveTo(45.37258f, 128.0f, 40.0f, 133.37259f, 40.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _island!!
    }

private var _island: ImageVector? = null
