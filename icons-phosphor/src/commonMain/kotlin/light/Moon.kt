package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorLightIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.13f, 143.64f),
                    PathNode.CurveTo(230.5595f, 142.07188f, 228.25165f, 141.49876f, 226.13f, 142.15f),
                    PathNode.CurveTo(194.3441f, 151.75716f, 159.85043f, 143.09602f, 136.37337f, 119.61267f),
                    PathNode.CurveTo(112.89627f, 96.12932f, 104.24435f, 61.633327f, 113.86f, 29.85f),
                    PathNode.CurveTo(114.50238f, 27.730417f, 113.92486f, 25.429329f, 112.35772f, 23.864283f),
                    PathNode.CurveTo(110.79058f, 22.299236f, 108.48872f, 21.72479f, 106.37f, 22.37f),
                    PathNode.CurveTo(85.685585f, 28.715914f, 67.52831f, 41.42146f, 54.48f, 58.68f),
                    PathNode.CurveTo(23.89766f, 99.28916f, 27.887041f, 156.21881f, 63.834118f, 192.16588f),
                    PathNode.CurveTo(99.78118f, 228.11296f, 156.71083f, 232.10234f, 197.32f, 201.52f),
                    PathNode.CurveTo(214.57854f, 188.4717f, 227.2841f, 170.3144f, 233.63f, 149.63f),
                    PathNode.CurveTo(234.27467f, 147.50954f, 233.69792f, 145.20639f, 232.13f, 143.64f),
                    PathNode.Close,
                    PathNode.MoveTo(190.13f, 191.93f),
                    PathNode.CurveTo(154.29918f, 218.80312f, 104.16067f, 215.23988f, 72.49039f, 183.56961f),
                    PathNode.CurveTo(40.820114f, 151.89934f, 37.256878f, 101.760826f, 64.13f, 65.93f),
                    PathNode.CurveTo(73.388504f, 53.654213f, 85.60961f, 43.92756f, 99.65f, 37.66f),
                    PathNode.CurveTo(93.64983f, 70.61716f, 104.20488f, 104.420525f, 127.89217f, 128.10782f),
                    PathNode.CurveTo(151.57948f, 151.79512f, 185.38284f, 162.35016f, 218.34f, 156.35f),
                    PathNode.CurveTo(212.0895f, 170.40881f, 202.37276f, 182.65106f, 190.1f, 191.93f),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
