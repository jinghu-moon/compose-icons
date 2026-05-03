package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorThinIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(45.39f, 53.06f),
                    PathNode.CurveTo(44.515713f, 53.81275f, 44.009014f, 54.906338f, 44.0f, 56.06f),
                    PathNode.LineTo(44.0f, 224.0f),
                    PathNode.CurveTo(44.0f, 226.20914f, 45.79086f, 228.0f, 48.0f, 228.0f),
                    PathNode.CurveTo(50.20914f, 228.0f, 52.0f, 226.20914f, 52.0f, 224.0f),
                    PathNode.LineTo(52.0f, 177.87f),
                    PathNode.CurveTo(81.41f, 153.48f, 107.08f, 166.18f, 134.23f, 179.6f),
                    PathNode.CurveTo(150.73f, 187.77f, 167.56f, 196.1f, 185.36f, 196.1f),
                    PathNode.CurveTo(198.5f, 196.1f, 212.17f, 191.55f, 226.62f, 179.04f),
                    PathNode.CurveTo(227.49057f, 178.2854f, 227.9935f, 177.19208f, 228.0f, 176.04f),
                    PathNode.LineTo(228.0f, 56.04f),
                    PathNode.CurveTo(227.99123f, 54.477932f, 227.07396f, 53.063892f, 225.65112f, 52.419113f),
                    PathNode.CurveTo(224.22832f, 51.77433f, 222.56033f, 52.016808f, 221.38f, 53.04f),
                    PathNode.CurveTo(191.38f, 79.04f, 165.38f, 66.11f, 137.77f, 52.47f),
                    PathNode.CurveTo(109.07f, 38.28f, 79.4f, 23.62f, 45.39f, 53.06f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 174.17f),
                    PathNode.CurveTo(190.59f, 198.57f, 164.92f, 185.87f, 137.77f, 172.44f),
                    PathNode.CurveTo(110.95f, 159.17f, 83.27f, 145.44f, 52.0f, 167.78f),
                    PathNode.LineTo(52.0f, 57.92f),
                    PathNode.CurveTo(81.41f, 33.52f, 107.08f, 46.22f, 134.23f, 59.65f),
                    PathNode.CurveTo(161.05f, 72.92f, 188.73f, 86.65f, 220.0f, 64.31f),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
