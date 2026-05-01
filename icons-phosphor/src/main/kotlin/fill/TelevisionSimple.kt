package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorFillIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 64.0f),
                    PathNode.LineTo(147.31f, 64.0f),
                    PathNode.LineTo(181.66f, 29.66f),
                    PathNode.CurveTo(184.78593f, 26.53407f, 184.78593f, 21.46593f, 181.66f, 18.34f),
                    PathNode.CurveTo(178.53407f, 15.214068f, 173.46593f, 15.214068f, 170.34f, 18.34f),
                    PathNode.LineTo(128.0f, 60.69f),
                    PathNode.LineTo(85.66f, 18.34f),
                    PathNode.CurveTo(82.534065f, 15.214068f, 77.465935f, 15.214068f, 74.34f, 18.34f),
                    PathNode.CurveTo(71.214066f, 21.46593f, 71.214066f, 26.53407f, 74.34f, 29.66f),
                    PathNode.LineTo(108.69f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(31.163445f, 64.0f, 24.0f, 71.163445f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(232.0f, 71.163445f, 224.83656f, 64.0f, 216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 100.0f),
                    PathNode.LineTo(200.0f, 180.0f),
                    PathNode.CurveTo(200.0f, 182.20914f, 198.20914f, 184.0f, 196.0f, 184.0f),
                    PathNode.LineTo(60.0f, 184.0f),
                    PathNode.CurveTo(57.79086f, 184.0f, 56.0f, 182.20914f, 56.0f, 180.0f),
                    PathNode.LineTo(56.0f, 100.0f),
                    PathNode.CurveTo(56.0f, 97.79086f, 57.79086f, 96.0f, 60.0f, 96.0f),
                    PathNode.LineTo(196.0f, 96.0f),
                    PathNode.CurveTo(198.20914f, 96.0f, 200.0f, 97.79086f, 200.0f, 100.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null
