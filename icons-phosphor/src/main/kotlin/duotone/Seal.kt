package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Seal: ImageVector
    get() {
        if (_seal != null) return _seal!!
        _seal = phosphorDuotoneIcon(
            name = "Seal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 140.51f, 214.18f, 149.95f, 209.32f, 161.69f),
                    PathNode.CurveTo(204.64f, 173.01f, 210.74f, 192.33f, 201.54f, 201.54f),
                    PathNode.CurveTo(192.34f, 210.75f, 173.01f, 204.64f, 161.69f, 209.32f),
                    PathNode.CurveTo(150.0f, 214.18f, 140.5f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(115.5f, 232.0f, 106.0f, 214.18f, 94.31f, 209.32f),
                    PathNode.CurveTo(82.99f, 204.64f, 63.67f, 210.74f, 54.46f, 201.54f),
                    PathNode.CurveTo(45.25f, 192.34f, 51.36f, 173.01f, 46.68f, 161.69f),
                    PathNode.CurveTo(41.82f, 150.0f, 24.0f, 140.5f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 115.5f, 41.82f, 106.0f, 46.68f, 94.31f),
                    PathNode.CurveTo(51.36f, 83.0f, 45.26f, 63.67f, 54.46f, 54.46f),
                    PathNode.CurveTo(63.66f, 45.25f, 83.0f, 51.36f, 94.31f, 46.68f),
                    PathNode.CurveTo(106.05f, 41.82f, 115.5f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(140.5f, 24.0f, 150.0f, 41.82f, 161.69f, 46.68f),
                    PathNode.CurveTo(173.01f, 51.36f, 192.33f, 45.26f, 201.54f, 54.46f),
                    PathNode.CurveTo(210.75f, 63.66f, 204.64f, 82.99f, 209.32f, 94.31f),
                    PathNode.CurveTo(214.18f, 106.05f, 232.0f, 115.5f, 232.0f, 128.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.86f, 102.82f),
                    PathNode.CurveTo(222.09f, 98.88f, 218.19f, 94.82f, 216.72f, 91.25f),
                    PathNode.CurveTo(215.36f, 87.98f, 215.28f, 82.56f, 215.2f, 77.31f),
                    PathNode.CurveTo(215.05f, 67.55f, 214.89f, 56.49f, 207.2f, 48.8f),
                    PathNode.CurveTo(199.51f, 41.11f, 188.45f, 40.95f, 178.69f, 40.8f),
                    PathNode.CurveTo(173.44f, 40.72f, 168.02f, 40.64f, 164.75f, 39.28f),
                    PathNode.CurveTo(161.18f, 37.81f, 157.12f, 33.91f, 153.18f, 30.14f),
                    PathNode.CurveTo(146.27f, 23.51f, 138.44f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(117.56f, 16.0f, 109.73f, 23.51f, 102.82f, 30.14f),
                    PathNode.CurveTo(98.88f, 33.91f, 94.82f, 37.81f, 91.25f, 39.28f),
                    PathNode.CurveTo(88.0f, 40.64f, 82.56f, 40.72f, 77.31f, 40.8f),
                    PathNode.CurveTo(67.55f, 40.95f, 56.49f, 41.11f, 48.8f, 48.8f),
                    PathNode.CurveTo(41.11f, 56.49f, 41.0f, 67.55f, 40.8f, 77.31f),
                    PathNode.CurveTo(40.72f, 82.56f, 40.64f, 87.98f, 39.28f, 91.25f),
                    PathNode.CurveTo(37.81f, 94.82f, 33.91f, 98.88f, 30.14f, 102.82f),
                    PathNode.CurveTo(23.51f, 109.73f, 16.0f, 117.56f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 138.44f, 23.51f, 146.27f, 30.14f, 153.18f),
                    PathNode.CurveTo(33.91f, 157.12f, 37.81f, 161.18f, 39.28f, 164.75f),
                    PathNode.CurveTo(40.64f, 168.02f, 40.72f, 173.44f, 40.8f, 178.69f),
                    PathNode.CurveTo(40.95f, 188.45f, 41.11f, 199.51f, 48.8f, 207.2f),
                    PathNode.CurveTo(56.49f, 214.89f, 67.55f, 215.05f, 77.31f, 215.2f),
                    PathNode.CurveTo(82.56f, 215.28f, 87.98f, 215.36f, 91.25f, 216.72f),
                    PathNode.CurveTo(94.82f, 218.19f, 98.88f, 222.09f, 102.82f, 225.86f),
                    PathNode.CurveTo(109.73f, 232.49f, 117.56f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(138.44f, 240.0f, 146.27f, 232.49f, 153.18f, 225.86f),
                    PathNode.CurveTo(157.12f, 222.09f, 161.18f, 218.19f, 164.75f, 216.72f),
                    PathNode.CurveTo(168.02f, 215.36f, 173.44f, 215.28f, 178.69f, 215.2f),
                    PathNode.CurveTo(188.45f, 215.05f, 199.51f, 214.89f, 207.2f, 207.2f),
                    PathNode.CurveTo(214.89f, 199.51f, 215.05f, 188.45f, 215.2f, 178.69f),
                    PathNode.CurveTo(215.28f, 173.44f, 215.36f, 168.02f, 216.72f, 164.75f),
                    PathNode.CurveTo(218.19f, 161.18f, 222.09f, 157.12f, 225.86f, 153.18f),
                    PathNode.CurveTo(232.49f, 146.27f, 240.0f, 138.44f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 117.56f, 232.49f, 109.73f, 225.86f, 102.82f),
                    PathNode.Close,
                    PathNode.MoveTo(214.31f, 142.11f),
                    PathNode.CurveTo(209.52f, 147.11f, 204.56f, 152.28f, 201.93f, 158.63f),
                    PathNode.CurveTo(199.41f, 164.73f, 199.3f, 171.7f, 199.2f, 178.45f),
                    PathNode.CurveTo(199.1f, 185.45f, 198.99f, 192.78f, 195.88f, 195.88f),
                    PathNode.CurveTo(192.77f, 198.98f, 185.49f, 199.1f, 178.45f, 199.2f),
                    PathNode.CurveTo(171.7f, 199.3f, 164.73f, 199.41f, 158.63f, 201.93f),
                    PathNode.CurveTo(152.28f, 204.56f, 147.11f, 209.52f, 142.11f, 214.31f),
                    PathNode.CurveTo(137.11f, 219.1f, 132.0f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(124.0f, 224.0f, 118.86f, 219.08f, 113.89f, 214.31f),
                    PathNode.CurveTo(108.92f, 209.54f, 103.72f, 204.56f, 97.37f, 201.93f),
                    PathNode.CurveTo(91.27f, 199.41f, 84.3f, 199.3f, 77.55f, 199.2f),
                    PathNode.CurveTo(70.55f, 199.1f, 63.22f, 198.99f, 60.12f, 195.88f),
                    PathNode.LineTo(60.12f, 195.88f),
                    PathNode.CurveTo(57.01f, 192.78f, 56.9f, 185.49f, 56.8f, 178.45f),
                    PathNode.CurveTo(56.7f, 171.7f, 56.59f, 164.73f, 54.07f, 158.63f),
                    PathNode.CurveTo(51.44f, 152.28f, 46.48f, 147.11f, 41.69f, 142.11f),
                    PathNode.CurveTo(36.9f, 137.11f, 32.0f, 132.0f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 124.0f, 36.92f, 118.86f, 41.69f, 113.89f),
                    PathNode.CurveTo(46.46f, 108.92f, 51.44f, 103.72f, 54.07f, 97.37f),
                    PathNode.CurveTo(56.59f, 91.27f, 56.7f, 84.3f, 56.8f, 77.55f),
                    PathNode.CurveTo(56.9f, 70.55f, 57.01f, 63.22f, 60.12f, 60.12f),
                    PathNode.CurveTo(63.23f, 57.02f, 70.51f, 56.9f, 77.55f, 56.8f),
                    PathNode.CurveTo(84.3f, 56.7f, 91.27f, 56.59f, 97.37f, 54.07f),
                    PathNode.CurveTo(103.72f, 51.44f, 108.89f, 46.48f, 113.89f, 41.69f),
                    PathNode.CurveTo(118.89f, 36.9f, 124.0f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(132.0f, 32.0f, 137.14f, 36.92f, 142.11f, 41.69f),
                    PathNode.CurveTo(147.08f, 46.46f, 152.28f, 51.44f, 158.63f, 54.07f),
                    PathNode.CurveTo(164.73f, 56.59f, 171.7f, 56.7f, 178.45f, 56.8f),
                    PathNode.CurveTo(185.45f, 56.9f, 192.78f, 57.01f, 195.88f, 60.12f),
                    PathNode.CurveTo(198.98f, 63.23f, 199.1f, 70.51f, 199.2f, 77.55f),
                    PathNode.CurveTo(199.3f, 84.3f, 199.41f, 91.27f, 201.93f, 97.37f),
                    PathNode.CurveTo(204.56f, 103.72f, 209.52f, 108.89f, 214.31f, 113.89f),
                    PathNode.CurveTo(219.1f, 118.89f, 224.0f, 124.0f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 132.0f, 219.08f, 137.14f, 214.31f, 142.11f),
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
        return _seal!!
    }

private var _seal: ImageVector? = null
