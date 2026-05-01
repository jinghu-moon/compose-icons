package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorThinIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.1f, 131.41f),
                    PathNode.LineTo(130.1f, 195.41f),
                    PathNode.CurveTo(129.46817f, 195.79742f, 128.74113f, 196.00168f, 128.0f, 196.0f),
                    PathNode.CurveTo(125.79086f, 196.0f, 124.0f, 194.20914f, 124.0f, 192.0f),
                    PathNode.LineTo(124.0f, 71.16f),
                    PathNode.LineTo(26.1f, 131.41f),
                    PathNode.CurveTo(24.21671f, 132.5698f, 21.749798f, 131.98329f, 20.59f, 130.1f),
                    PathNode.CurveTo(19.430202f, 128.2167f, 20.016708f, 125.7498f, 21.9f, 124.59f),
                    PathNode.LineTo(125.9f, 60.59f),
                    PathNode.CurveTo(127.13486f, 59.82828f, 128.68536f, 59.79496f, 129.9518f, 60.50292f),
                    PathNode.CurveTo(131.21825f, 61.21088f, 132.00203f, 62.54911f, 132.0f, 64.0f),
                    PathNode.LineTo(132.0f, 184.84f),
                    PathNode.LineTo(229.9f, 124.59f),
                    PathNode.CurveTo(231.7833f, 123.4302f, 234.2502f, 124.01671f, 235.41f, 125.9f),
                    PathNode.CurveTo(236.5698f, 127.783295f, 235.98329f, 130.2502f, 234.1f, 131.41f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
