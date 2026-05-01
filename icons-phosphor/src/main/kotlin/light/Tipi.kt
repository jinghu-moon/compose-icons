package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorLightIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.05f, 212.77f),
                    PathNode.LineTo(135.12f, 53.5f),
                    PathNode.LineTo(157.05f, 19.24f),
                    PathNode.CurveTo(158.44424f, 17.447063f, 158.70659f, 15.020554f, 157.72778f, 12.971049f),
                    PathNode.CurveTo(156.74898f, 10.921545f, 154.6968f, 9.600404f, 152.42598f, 9.557846f),
                    PathNode.CurveTo(150.15514f, 9.515287f, 148.05492f, 10.75861f, 147.0f, 12.77f),
                    PathNode.LineTo(128.0f, 42.37f),
                    PathNode.LineTo(109.0f, 12.77f),
                    PathNode.CurveTo(107.98689f, 10.683799f, 105.862206f, 9.368272f, 103.54314f, 9.391316f),
                    PathNode.CurveTo(101.22407f, 9.41436f, 99.12594f, 10.771848f, 98.154495f, 12.877769f),
                    PathNode.CurveTo(97.183044f, 14.983691f, 97.51225f, 17.460894f, 99.0f, 19.24f),
                    PathNode.LineTo(120.88f, 53.5f),
                    PathNode.LineTo(19.0f, 212.77f),
                    PathNode.CurveTo(17.825405f, 214.60855f, 17.741383f, 216.9398f, 18.78057f, 218.85814f),
                    PathNode.CurveTo(19.819761f, 220.77649f, 21.818365f, 221.97955f, 24.0f, 222.0f),
                    PathNode.LineTo(232.0f, 222.0f),
                    PathNode.CurveTo(234.1906f, 221.99767f, 236.20583f, 220.80167f, 237.25728f, 218.87991f),
                    PathNode.CurveTo(238.30873f, 216.95815f, 238.22928f, 214.61609f, 237.05f, 212.77f),
                    PathNode.Close,
                    PathNode.MoveTo(82.64f, 210.0f),
                    PathNode.LineTo(128.0f, 139.13f),
                    PathNode.LineTo(173.36f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.64f, 210.0f),
                    PathNode.LineTo(133.09f, 124.77f),
                    PathNode.CurveTo(131.98651f, 123.05005f, 130.08351f, 122.00999f, 128.04f, 122.00999f),
                    PathNode.CurveTo(125.99649f, 122.00999f, 124.09349f, 123.05005f, 122.99f, 124.77f),
                    PathNode.LineTo(68.4f, 210.0f),
                    PathNode.LineTo(35.0f, 210.0f),
                    PathNode.LineTo(128.0f, 64.63f),
                    PathNode.LineTo(221.0f, 210.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tipi!!
    }

private var _tipi: ImageVector? = null
