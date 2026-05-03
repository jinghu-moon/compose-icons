package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Egg: ImageVector
    get() {
        if (_egg != null) return _egg!!
        _egg = phosphorThinIcon(
            name = "Egg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(92.87f, 20.0f, 44.0f, 86.52f, 44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 198.39192f, 81.60808f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(174.39192f, 236.0f, 212.0f, 198.39192f, 212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 86.52f, 163.13f, 20.0f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(86.04464f, 227.9559f, 52.044098f, 193.95538f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 123.54f, 62.0f, 92.27f, 79.33f, 66.22f),
                    PathNode.CurveTo(94.81f, 43.0f, 113.91f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(142.09f, 28.0f, 161.19f, 43.0f, 176.67f, 66.22f),
                    PathNode.CurveTo(194.0f, 92.27f, 204.0f, 123.54f, 204.0f, 152.0f),
                    PathNode.CurveTo(203.9559f, 193.95538f, 169.95538f, 227.9559f, 128.0f, 228.0f),
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
        return _egg!!
    }

private var _egg: ImageVector? = null
