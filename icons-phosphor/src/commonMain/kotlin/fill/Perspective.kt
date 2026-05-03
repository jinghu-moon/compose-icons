package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorFillIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 136.0f),
                    PathNode.CurveTo(248.0f, 140.41827f, 244.41827f, 144.0f, 240.0f, 144.0f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.CurveTo(207.03757f, 223.99736f, 206.07722f, 223.91035f, 205.13f, 223.74f),
                    PathNode.LineTo(45.13f, 194.65f),
                    PathNode.CurveTo(37.525974f, 193.26353f, 32.000237f, 186.63939f, 32.0f, 178.91f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.LineTo(16.0f, 144.0f),
                    PathNode.CurveTo(11.581722f, 144.0f, 8.0f, 140.41827f, 8.0f, 136.0f),
                    PathNode.CurveTo(8.0f, 131.58173f, 11.581722f, 128.0f, 16.0f, 128.0f),
                    PathNode.LineTo(240.0f, 128.0f),
                    PathNode.CurveTo(244.41827f, 128.0f, 248.0f, 131.58173f, 248.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 112.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(222.20914f, 112.0f, 224.0f, 110.20914f, 224.0f, 108.0f),
                    PathNode.LineTo(224.0f, 48.42f),
                    PathNode.CurveTo(224.05792f, 44.350826f, 222.60818f, 40.404125f, 219.93f, 37.34f),
                    PathNode.CurveTo(216.2197f, 33.188656f, 210.61807f, 31.264639f, 205.14f, 32.26f),
                    PathNode.LineTo(45.14f, 61.35f),
                    PathNode.CurveTo(37.531998f, 62.73219f, 32.001118f, 69.35747f, 32.0f, 77.09f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.CurveTo(32.0f, 110.20914f, 33.79086f, 112.0f, 36.0f, 112.0f),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
