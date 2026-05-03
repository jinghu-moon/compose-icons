package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorThinIcon(
            name = "DropSimple",
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
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(86.04464f, 219.9559f, 52.044098f, 185.95538f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 108.1f, 73.15f, 76.2f, 90.9f, 55.77f),
                    PathNode.CurveTo(102.072556f, 42.96826f, 114.50148f, 31.319912f, 128.0f, 21.0f),
                    PathNode.CurveTo(141.50046f, 31.33251f, 153.92944f, 42.99432f, 165.1f, 55.81f),
                    PathNode.CurveTo(182.85f, 76.2f, 204.0f, 108.1f, 204.0f, 144.0f),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
