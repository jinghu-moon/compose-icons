package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorThinIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.45f, 63.86f),
                    PathNode.CurveTo(203.65f, 45.89f, 190.35f, 36.0f, 176.0f, 36.0f),
                    PathNode.CurveTo(161.65f, 36.0f, 148.35f, 45.89f, 138.55f, 63.86f),
                    PathNode.CurveTo(133.78033f, 72.83042f, 130.23221f, 82.39862f, 128.0f, 92.31f),
                    PathNode.CurveTo(125.7678f, 82.39862f, 122.21966f, 72.83042f, 117.45f, 63.86f),
                    PathNode.CurveTo(107.65f, 45.89f, 94.35f, 36.0f, 80.0f, 36.0f),
                    PathNode.CurveTo(65.65f, 36.0f, 52.35f, 45.89f, 42.55f, 63.86f),
                    PathNode.CurveTo(33.17f, 81.06f, 28.0f, 103.84f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 152.16f, 33.17f, 174.94f, 42.55f, 192.14f),
                    PathNode.CurveTo(52.35f, 210.11f, 65.65f, 220.0f, 80.0f, 220.0f),
                    PathNode.CurveTo(94.35f, 220.0f, 107.65f, 210.11f, 117.45f, 192.14f),
                    PathNode.CurveTo(122.21966f, 183.16957f, 125.7678f, 173.60138f, 128.0f, 163.69f),
                    PathNode.CurveTo(130.23221f, 173.60138f, 133.78033f, 183.16957f, 138.55f, 192.14f),
                    PathNode.CurveTo(148.35f, 210.14f, 161.65f, 220.0f, 176.0f, 220.0f),
                    PathNode.CurveTo(190.35f, 220.0f, 203.65f, 210.11f, 213.45f, 192.14f),
                    PathNode.CurveTo(222.83f, 174.94f, 228.0f, 152.14f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 103.86f, 222.83f, 81.06f, 213.45f, 63.86f),
                    PathNode.Close,
                    PathNode.MoveTo(110.45f, 188.31f),
                    PathNode.CurveTo(102.1f, 203.59f, 91.29f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(68.71f, 212.0f, 57.9f, 203.59f, 49.57f, 188.31f),
                    PathNode.CurveTo(43.57f, 177.31f, 39.4f, 163.72f, 37.39f, 148.89f),
                    PathNode.CurveTo(48.61981f, 158.91257f, 65.76406f, 158.26369f, 76.20416f, 147.42097f),
                    PathNode.CurveTo(86.64427f, 136.57826f, 86.64427f, 119.42174f, 76.20416f, 108.579025f),
                    PathNode.CurveTo(65.76406f, 97.736305f, 48.61981f, 97.08744f, 37.39f, 107.11f),
                    PathNode.CurveTo(39.39f, 92.28f, 43.56f, 78.72f, 49.57f, 67.69f),
                    PathNode.CurveTo(57.9f, 52.41f, 68.71f, 44.0f, 80.0f, 44.0f),
                    PathNode.CurveTo(91.29f, 44.0f, 102.1f, 52.41f, 110.43f, 67.69f),
                    PathNode.CurveTo(119.18f, 83.73f, 124.0f, 105.15f, 124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 150.85f, 119.18f, 172.27f, 110.43f, 188.31f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 116.95431f, 44.954304f, 108.0f, 56.0f, 108.0f),
                    PathNode.CurveTo(67.04569f, 108.0f, 76.0f, 116.95431f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 139.0457f, 67.04569f, 148.0f, 56.0f, 148.0f),
                    PathNode.CurveTo(44.954304f, 148.0f, 36.0f, 139.0457f, 36.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.43f, 188.31f),
                    PathNode.CurveTo(198.1f, 203.59f, 187.29f, 212.0f, 176.0f, 212.0f),
                    PathNode.CurveTo(164.71f, 212.0f, 153.9f, 203.59f, 145.57f, 188.31f),
                    PathNode.CurveTo(139.57f, 177.31f, 135.4f, 163.72f, 133.39f, 148.89f),
                    PathNode.CurveTo(144.61981f, 158.91257f, 161.76405f, 158.26369f, 172.20416f, 147.42097f),
                    PathNode.CurveTo(182.64427f, 136.57826f, 182.64427f, 119.42174f, 172.20416f, 108.579025f),
                    PathNode.CurveTo(161.76405f, 97.736305f, 144.61981f, 97.08744f, 133.39f, 107.11f),
                    PathNode.CurveTo(135.39f, 92.28f, 139.56f, 78.72f, 145.57f, 67.69f),
                    PathNode.CurveTo(153.9f, 52.41f, 164.71f, 44.0f, 176.0f, 44.0f),
                    PathNode.CurveTo(187.29f, 44.0f, 198.1f, 52.41f, 206.43f, 67.69f),
                    PathNode.CurveTo(215.18f, 83.73f, 220.0f, 105.15f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 150.85f, 215.18f, 172.27f, 206.43f, 188.31f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 128.0f),
                    PathNode.CurveTo(132.0f, 116.95431f, 140.9543f, 108.0f, 152.0f, 108.0f),
                    PathNode.CurveTo(163.0457f, 108.0f, 172.0f, 116.95431f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 139.0457f, 163.0457f, 148.0f, 152.0f, 148.0f),
                    PathNode.CurveTo(140.9543f, 148.0f, 132.0f, 139.0457f, 132.0f, 128.0f),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
