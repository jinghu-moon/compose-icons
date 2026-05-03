package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorDuotoneIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(67.71f, 64.59f),
                    PathNode.LineTo(115.5f, 92.19f),
                    PathNode.LineTo(40.43f, 112.0f),
                    PathNode.LineTo(32.27f, 82.0f),
                    PathNode.CurveTo(31.735554f, 79.99713f, 32.024677f, 77.863686f, 33.07291f, 76.0753f),
                    PathNode.CurveTo(34.121147f, 74.28691f, 35.841343f, 72.99227f, 37.85f, 72.48f),
                    PathNode.Close,
                    PathNode.MoveTo(199.84f, 37.76f),
                    PathNode.CurveTo(198.66829f, 33.59221f, 194.36035f, 31.14391f, 190.18f, 32.27f),
                    PathNode.LineTo(126.61f, 49.05f),
                    PathNode.LineTo(174.4f, 76.64f),
                    PathNode.LineTo(208.0f, 67.77f),
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
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.LineTo(102.09f, 104.0f),
                    PathNode.LineTo(210.0f, 75.51f),
                    PathNode.CurveTo(212.0631f, 74.96639f, 213.8236f, 73.621216f, 214.8902f, 71.773445f),
                    PathNode.CurveTo(215.95679f, 69.925674f, 216.24112f, 67.7284f, 215.68f, 65.67f),
                    PathNode.LineTo(207.52f, 35.67f),
                    PathNode.CurveTo(205.18286f, 27.270985f, 196.52834f, 22.310896f, 188.1f, 24.54f),
                    PathNode.LineTo(35.81f, 64.74f),
                    PathNode.CurveTo(31.7138f, 65.803314f, 28.21785f, 68.47033f, 26.11f, 72.14f),
                    PathNode.CurveTo(23.990053f, 75.765205f, 23.430775f, 80.095116f, 24.56f, 84.14f),
                    PathNode.LineTo(32.0f, 111.56f),
                    PathNode.CurveTo(32.0f, 111.7f, 32.0f, 111.85f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 208.83656f, 39.163445f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(216.83656f, 216.0f, 224.0f, 208.83656f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 107.58172f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.16f, 40.0f),
                    PathNode.LineTo(198.16f, 62.07f),
                    PathNode.LineTo(175.54f, 68.07f),
                    PathNode.LineTo(147.42f, 51.83f),
                    PathNode.Close,
                    PathNode.MoveTo(125.47f, 57.6f),
                    PathNode.LineTo(153.59f, 73.84f),
                    PathNode.LineTo(116.65f, 83.59f),
                    PathNode.LineTo(88.53f, 67.37f),
                    PathNode.Close,
                    PathNode.MoveTo(46.07f, 102.22f),
                    PathNode.LineTo(40.07f, 80.14f),
                    PathNode.LineTo(66.57f, 73.14f),
                    PathNode.LineTo(94.69f, 89.4f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(208.0f, 200.0f),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
