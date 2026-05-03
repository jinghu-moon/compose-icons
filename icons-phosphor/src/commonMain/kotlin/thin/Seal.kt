package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seal: ImageVector
    get() {
        if (_seal != null) return _seal!!
        _seal = phosphorThinIcon(
            name = "Seal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.0f, 105.58f),
                    PathNode.CurveTo(219.0f, 101.38f, 214.8f, 97.04f, 213.0f, 92.78f),
                    PathNode.CurveTo(211.35f, 88.78f, 211.27f, 83.25f, 211.18f, 77.37f),
                    PathNode.CurveTo(211.04f, 68.37f, 210.89f, 58.18f, 204.35f, 51.63f),
                    PathNode.CurveTo(197.81f, 45.08f, 187.61f, 44.94f, 178.61f, 44.8f),
                    PathNode.CurveTo(172.73f, 44.71f, 167.18f, 44.63f, 163.2f, 42.98f),
                    PathNode.CurveTo(158.94f, 41.22f, 154.6f, 37.05f, 150.4f, 32.98f),
                    PathNode.CurveTo(143.72f, 26.58f, 136.81f, 19.98f, 127.98f, 19.98f),
                    PathNode.CurveTo(119.15f, 19.98f, 112.24f, 26.6f, 105.56f, 32.98f),
                    PathNode.CurveTo(101.36f, 36.98f, 97.02f, 41.18f, 92.76f, 42.98f),
                    PathNode.CurveTo(88.76f, 44.63f, 83.23f, 44.71f, 77.35f, 44.8f),
                    PathNode.CurveTo(68.35f, 44.94f, 58.16f, 45.09f, 51.61f, 51.63f),
                    PathNode.CurveTo(45.06f, 58.17f, 44.94f, 68.37f, 44.8f, 77.37f),
                    PathNode.CurveTo(44.71f, 83.25f, 44.63f, 88.8f, 42.98f, 92.78f),
                    PathNode.CurveTo(41.22f, 97.04f, 37.05f, 101.38f, 33.03f, 105.58f),
                    PathNode.CurveTo(26.62f, 112.26f, 20.03f, 119.17f, 20.03f, 128.0f),
                    PathNode.CurveTo(20.03f, 136.83f, 26.65f, 143.74f, 33.03f, 150.42f),
                    PathNode.CurveTo(37.03f, 154.62f, 41.23f, 158.96f, 43.03f, 163.22f),
                    PathNode.CurveTo(44.68f, 167.22f, 44.76f, 172.75f, 44.85f, 178.63f),
                    PathNode.CurveTo(44.99f, 187.63f, 45.14f, 197.82f, 51.68f, 204.37f),
                    PathNode.LineTo(51.68f, 204.37f),
                    PathNode.CurveTo(58.23f, 210.91f, 68.43f, 211.06f, 77.42f, 211.2f),
                    PathNode.CurveTo(83.3f, 211.29f, 88.85f, 211.37f, 92.83f, 213.02f),
                    PathNode.CurveTo(97.09f, 214.78f, 101.43f, 218.95f, 105.63f, 223.02f),
                    PathNode.CurveTo(112.31f, 229.42f, 119.22f, 236.02f, 128.05f, 236.02f),
                    PathNode.CurveTo(136.88f, 236.02f, 143.79f, 229.4f, 150.47f, 223.02f),
                    PathNode.CurveTo(154.67f, 219.02f, 159.01f, 214.82f, 163.27f, 213.02f),
                    PathNode.CurveTo(167.27f, 211.37f, 172.8f, 211.29f, 178.68f, 211.2f),
                    PathNode.CurveTo(187.68f, 211.06f, 197.87f, 210.91f, 204.42f, 204.37f),
                    PathNode.CurveTo(210.97f, 197.83f, 211.11f, 187.63f, 211.25f, 178.63f),
                    PathNode.CurveTo(211.34f, 172.75f, 211.42f, 167.2f, 213.07f, 163.22f),
                    PathNode.CurveTo(214.83f, 158.96f, 219.0f, 154.62f, 223.02f, 150.42f),
                    PathNode.CurveTo(229.43f, 143.74f, 236.02f, 136.83f, 236.02f, 128.0f),
                    PathNode.CurveTo(236.02f, 119.17f, 229.38f, 112.26f, 223.0f, 105.58f),
                    PathNode.Close,
                    PathNode.MoveTo(217.22f, 144.88f),
                    PathNode.CurveTo(212.68f, 149.61f, 207.98f, 154.51f, 205.65f, 160.16f),
                    PathNode.CurveTo(203.42f, 165.55f, 203.32f, 172.16f, 203.22f, 178.51f),
                    PathNode.CurveTo(203.1f, 186.71f, 202.98f, 194.51f, 198.73f, 198.71f),
                    PathNode.CurveTo(194.48f, 202.91f, 186.73f, 203.08f, 178.53f, 203.2f),
                    PathNode.CurveTo(172.16f, 203.3f, 165.53f, 203.4f, 160.18f, 205.63f),
                    PathNode.CurveTo(154.53f, 207.96f, 149.63f, 212.63f, 144.9f, 217.2f),
                    PathNode.CurveTo(139.09f, 222.75f, 133.62f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(122.38f, 228.0f, 116.91f, 222.75f, 111.12f, 217.2f),
                    PathNode.CurveTo(106.39f, 212.66f, 101.49f, 207.96f, 95.84f, 205.63f),
                    PathNode.CurveTo(90.45f, 203.4f, 83.84f, 203.3f, 77.49f, 203.2f),
                    PathNode.CurveTo(69.29f, 203.08f, 61.54f, 202.96f, 57.29f, 198.71f),
                    PathNode.LineTo(57.29f, 198.71f),
                    PathNode.CurveTo(53.04f, 194.46f, 52.92f, 186.71f, 52.8f, 178.51f),
                    PathNode.CurveTo(52.7f, 172.14f, 52.6f, 165.51f, 50.37f, 160.16f),
                    PathNode.CurveTo(48.04f, 154.51f, 43.37f, 149.61f, 38.8f, 144.88f),
                    PathNode.CurveTo(33.25f, 139.09f, 28.0f, 133.62f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 122.38f, 33.25f, 116.91f, 38.8f, 111.12f),
                    PathNode.CurveTo(43.34f, 106.39f, 48.04f, 101.49f, 50.37f, 95.84f),
                    PathNode.CurveTo(52.6f, 90.45f, 52.7f, 83.84f, 52.8f, 77.49f),
                    PathNode.CurveTo(52.92f, 69.29f, 53.04f, 61.54f, 57.29f, 57.29f),
                    PathNode.CurveTo(61.54f, 53.04f, 69.29f, 52.92f, 77.49f, 52.8f),
                    PathNode.CurveTo(83.86f, 52.7f, 90.49f, 52.6f, 95.84f, 50.37f),
                    PathNode.CurveTo(101.49f, 48.04f, 106.39f, 43.37f, 111.12f, 38.8f),
                    PathNode.CurveTo(116.91f, 33.25f, 122.38f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(133.62f, 28.0f, 139.09f, 33.25f, 144.88f, 38.8f),
                    PathNode.CurveTo(149.61f, 43.34f, 154.51f, 48.04f, 160.16f, 50.37f),
                    PathNode.CurveTo(165.55f, 52.6f, 172.16f, 52.7f, 178.51f, 52.8f),
                    PathNode.CurveTo(186.71f, 52.92f, 194.51f, 53.04f, 198.71f, 57.29f),
                    PathNode.CurveTo(202.91f, 61.54f, 203.08f, 69.29f, 203.2f, 77.49f),
                    PathNode.CurveTo(203.3f, 83.86f, 203.4f, 90.49f, 205.63f, 95.84f),
                    PathNode.CurveTo(207.96f, 101.49f, 212.63f, 106.39f, 217.2f, 111.12f),
                    PathNode.CurveTo(222.75f, 116.91f, 228.0f, 122.38f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 133.62f, 222.75f, 139.09f, 217.2f, 144.88f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _seal!!
    }

private var _seal: ImageVector? = null
