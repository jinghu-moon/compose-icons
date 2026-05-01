package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorRegularIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(223.99931f, 43.256416f, 221.89383f, 38.757675f, 218.25192f, 35.71825f),
                    PathNode.CurveTo(214.61002f, 32.67882f, 209.80719f, 31.412085f, 205.14f, 32.26f),
                    PathNode.LineTo(45.14f, 61.35f),
                    PathNode.CurveTo(37.531998f, 62.73219f, 32.001118f, 69.35747f, 32.0f, 77.09f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 123.58172f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 132.41827f, 11.581722f, 136.0f, 16.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 178.91f),
                    PathNode.CurveTo(32.001118f, 186.64253f, 37.531998f, 193.2678f, 45.14f, 194.65f),
                    PathNode.LineTo(205.14f, 223.74f),
                    PathNode.CurveTo(206.08394f, 223.90977f, 207.04091f, 223.99677f, 208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 77.09f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 178.91f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
