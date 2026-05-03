package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorFillIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.45f, 40.07f),
                    PathNode.CurveTo(223.21342f, 36.018856f, 219.98114f, 32.78658f, 215.93f, 32.55f),
                    PathNode.CurveTo(139.8f, 28.08f, 78.82f, 51.0f, 52.82f, 94.0f),
                    PathNode.CurveTo(43.807644f, 108.70914f, 39.366573f, 125.763405f, 40.06f, 143.0f),
                    PathNode.CurveTo(40.512623f, 154.02238f, 42.755245f, 164.89774f, 46.7f, 175.2f),
                    PathNode.CurveTo(47.171135f, 176.4887f, 48.269928f, 177.44598f, 49.611023f, 177.73611f),
                    PathNode.CurveTo(50.952114f, 178.02625f, 52.34833f, 177.60873f, 53.31f, 176.63f),
                    PathNode.LineTo(138.31f, 90.33f),
                    PathNode.CurveTo(141.43594f, 87.20407f, 146.50407f, 87.20407f, 149.63f, 90.33f),
                    PathNode.CurveTo(152.75594f, 93.45593f, 152.75594f, 98.52407f, 149.63f, 101.65f),
                    PathNode.LineTo(56.74f, 195.94f),
                    PathNode.LineTo(42.55f, 210.13f),
                    PathNode.CurveTo(39.48992f, 213.10918f, 39.22889f, 217.93831f, 41.95f, 221.23f),
                    PathNode.CurveTo(43.402775f, 222.91237f, 45.49001f, 223.91444f, 47.711327f, 223.99602f),
                    PathNode.CurveTo(49.93264f, 224.07756f, 52.08775f, 223.23128f, 53.66f, 221.66f),
                    PathNode.LineTo(70.45f, 204.87f),
                    PathNode.CurveTo(84.59f, 211.71f, 98.86f, 215.44f, 113.01f, 215.94f),
                    PathNode.QuadTo(114.68f, 216.0f, 116.34f, 216.0f),
                    PathNode.CurveTo(132.45404f, 216.04123f, 148.26239f, 211.6027f, 162.0f, 203.18f),
                    PathNode.CurveTo(205.0f, 177.18f, 227.93f, 116.21f, 223.45f, 40.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _leaf!!
    }

private var _leaf: ImageVector? = null
