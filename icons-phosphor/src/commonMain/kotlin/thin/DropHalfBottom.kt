package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorThinIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.0f, 50.37f),
                    PathNode.CurveTo(158.8608f, 36.349144f, 145.2002f, 23.721558f, 130.27f, 12.72f),
                    PathNode.CurveTo(128.89441f, 11.759492f, 127.06559f, 11.759492f, 125.69f, 12.72f),
                    PathNode.CurveTo(110.7738f, 23.723885f, 97.12671f, 36.351387f, 85.0f, 50.37f),
                    PathNode.CurveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 190.39192f, 81.60808f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(174.39192f, 228.0f, 212.0f, 190.39192f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.37f),
                    PathNode.Close,
                    PathNode.MoveTo(189.91f, 188.0f),
                    PathNode.LineTo(66.09f, 188.0f),
                    PathNode.CurveTo(60.903507f, 180.73541f, 57.043957f, 172.61005f, 54.69f, 164.0f),
                    PathNode.LineTo(201.31f, 164.0f),
                    PathNode.CurveTo(198.95604f, 172.61005f, 195.0965f, 180.73541f, 189.91f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(53.0f, 156.0f),
                    PathNode.CurveTo(52.347324f, 152.03305f, 52.012928f, 148.02025f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.005222f, 139.98718f, 52.2691f, 135.97887f, 52.79f, 132.0f),
                    PathNode.LineTo(203.21f, 132.0f),
                    PathNode.CurveTo(203.7309f, 135.97887f, 203.99478f, 139.98718f, 204.0f, 144.0f),
                    PathNode.CurveTo(203.98708f, 148.02025f, 203.65268f, 152.03305f, 203.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.9f, 55.77f),
                    PathNode.CurveTo(102.072556f, 42.96826f, 114.50148f, 31.319912f, 128.0f, 21.0f),
                    PathNode.CurveTo(141.50046f, 31.33251f, 153.92944f, 42.99432f, 165.1f, 55.81f),
                    PathNode.CurveTo(179.47f, 72.36f, 196.1f, 96.42f, 201.87f, 124.04f),
                    PathNode.LineTo(54.13f, 124.04f),
                    PathNode.CurveTo(59.93f, 96.38f, 76.53f, 72.32f, 90.9f, 55.77f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(107.023254f, 220.00665f, 86.9824f, 211.31686f, 72.65f, 196.0f),
                    PathNode.LineTo(183.35f, 196.0f),
                    PathNode.CurveTo(169.0176f, 211.31686f, 148.97675f, 220.00665f, 128.0f, 220.0f),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
