package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorThinIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.45f, 40.31f),
                    PathNode.CurveTo(219.33171f, 38.284428f, 217.71559f, 36.66829f, 215.69f, 36.55f),
                    PathNode.CurveTo(141.06f, 32.16f, 81.46f, 54.39f, 56.24f, 96.0f),
                    PathNode.CurveTo(39.0f, 124.56f, 39.9f, 158.37f, 58.8f, 191.54f),
                    PathNode.LineTo(37.17f, 213.17f),
                    PathNode.CurveTo(35.607033f, 214.73297f, 35.607033f, 217.26703f, 37.17f, 218.83f),
                    PathNode.CurveTo(38.732967f, 220.39296f, 41.267033f, 220.39296f, 42.83f, 218.83f),
                    PathNode.LineTo(64.46f, 197.19f),
                    PathNode.CurveTo(81.85f, 207.1f, 99.46f, 212.08f, 116.29f, 212.08f),
                    PathNode.CurveTo(131.71889f, 212.09402f, 146.84947f, 207.82936f, 160.0f, 199.76f),
                    PathNode.CurveTo(201.61f, 174.54f, 223.84f, 114.93f, 219.45f, 40.31f),
                    PathNode.Close,
                    PathNode.MoveTo(155.82f, 192.92f),
                    PathNode.CurveTo(130.45f, 208.29f, 100.26f, 207.67f, 70.34f, 191.31f),
                    PathNode.LineTo(162.84f, 98.82f),
                    PathNode.CurveTo(164.40297f, 97.257034f, 164.40297f, 94.72297f, 162.84f, 93.16f),
                    PathNode.CurveTo(161.27704f, 91.59703f, 158.74297f, 91.59703f, 157.18f, 93.16f),
                    PathNode.LineTo(64.69f, 185.66f),
                    PathNode.CurveTo(48.33f, 155.74f, 47.69f, 125.55f, 63.08f, 100.18f),
                    PathNode.CurveTo(86.34f, 61.77f, 141.72f, 41.0f, 211.66f, 44.34f),
                    PathNode.CurveTo(215.0f, 114.28f, 194.23f, 169.66f, 155.82f, 192.92f),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
