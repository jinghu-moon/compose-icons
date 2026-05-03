package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorLightIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.14f, 133.11f),
                    PathNode.LineTo(131.14f, 197.11f),
                    PathNode.CurveTo(129.28897f, 198.2468f, 126.96807f, 198.29436f, 125.072044f, 197.23431f),
                    PathNode.CurveTo(123.17602f, 196.17429f, 122.001f, 194.17224f, 122.0f, 192.0f),
                    PathNode.LineTo(122.0f, 74.74f),
                    PathNode.LineTo(27.15f, 133.11f),
                    PathNode.CurveTo(24.327826f, 134.84694f, 20.631935f, 133.96718f, 18.895f, 131.145f),
                    PathNode.CurveTo(17.158064f, 128.32283f, 18.037825f, 124.62694f, 20.86f, 122.89f),
                    PathNode.LineTo(124.86f, 58.89f),
                    PathNode.CurveTo(126.71102f, 57.753197f, 129.03192f, 57.705647f, 130.92796f, 58.765682f),
                    PathNode.CurveTo(132.82399f, 59.825714f, 133.999f, 61.827766f, 134.0f, 64.0f),
                    PathNode.LineTo(134.0f, 181.26f),
                    PathNode.LineTo(228.85f, 122.89f),
                    PathNode.CurveTo(231.67218f, 121.15306f, 235.36806f, 122.03282f, 237.105f, 124.855f),
                    PathNode.CurveTo(238.84193f, 127.67718f, 237.96217f, 131.37306f, 235.14f, 133.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
