package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorThinIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.82f, 20.92f),
                    PathNode.CurveTo(139.81874f, 20.090439f, 138.47675f, 19.79931f, 137.22176f, 20.139412f),
                    PathNode.CurveTo(135.96677f, 20.479513f, 134.95538f, 21.4084f, 134.51f, 22.63f),
                    PathNode.LineTo(110.36f, 88.83f),
                    PathNode.LineTo(81.81f, 61.13f),
                    PathNode.CurveTo(80.98915f, 60.32135f, 79.85946f, 59.905968f, 78.71028f, 59.99024f),
                    PathNode.CurveTo(77.56111f, 60.074512f, 76.5041f, 60.650257f, 75.81f, 61.57f),
                    PathNode.CurveTo(54.71f, 89.25f, 44.0f, 117.0f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(174.39192f, 228.0f, 212.0f, 190.39192f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 86.24f, 162.22f, 38.69f, 140.82f, 20.92f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(86.04464f, 219.9559f, 52.044098f, 185.95538f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 119.93f, 61.25f, 95.07f, 79.5f, 70.0f),
                    PathNode.LineTo(109.21f, 98.83f),
                    PathNode.CurveTo(110.182846f, 99.77723f, 111.56979f, 100.16626f, 112.89336f, 99.86315f),
                    PathNode.CurveTo(114.21691f, 99.56005f, 115.29633f, 98.6062f, 115.76f, 97.33f),
                    PathNode.LineTo(140.06f, 30.73f),
                    PathNode.CurveTo(162.27f, 50.09f, 204.0f, 93.18f, 204.0f, 144.0f),
                    PathNode.CurveTo(203.9559f, 185.95538f, 169.95538f, 219.9559f, 128.0f, 220.0f),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
