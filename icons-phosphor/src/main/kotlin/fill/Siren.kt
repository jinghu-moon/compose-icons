package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorFillIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 16.0f),
                    PathNode.LineTo(120.0f, 8.0f),
                    PathNode.CurveTo(120.0f, 3.581722f, 123.58172f, 0f, 128.0f, 0f),
                    PathNode.CurveTo(132.41827f, 0f, 136.0f, 3.581722f, 136.0f, 8.0f),
                    PathNode.LineTo(136.0f, 16.0f),
                    PathNode.CurveTo(136.0f, 20.418278f, 132.41827f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 20.418278f, 120.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.CurveTo(202.12238f, 48.001667f, 204.15842f, 47.15991f, 205.66f, 45.66f),
                    PathNode.LineTo(213.66f, 37.66f),
                    PathNode.CurveTo(216.78593f, 34.53407f, 216.78593f, 29.46593f, 213.66f, 26.34f),
                    PathNode.CurveTo(210.53407f, 23.21407f, 205.46593f, 23.214067f, 202.34f, 26.34f),
                    PathNode.LineTo(194.34f, 34.34f),
                    PathNode.CurveTo(192.04936f, 36.628094f, 191.36368f, 40.071262f, 192.60303f, 43.06232f),
                    PathNode.CurveTo(193.84236f, 46.05338f, 196.76236f, 48.00255f, 200.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.34f, 45.66f),
                    PathNode.CurveTo(53.46593f, 48.78593f, 58.53407f, 48.78593f, 61.66f, 45.66f),
                    PathNode.CurveTo(64.785934f, 42.53407f, 64.785934f, 37.46593f, 61.66f, 34.34f),
                    PathNode.LineTo(53.66f, 26.34f),
                    PathNode.CurveTo(50.53407f, 23.21407f, 45.46593f, 23.21407f, 42.34f, 26.34f),
                    PathNode.CurveTo(39.21407f, 29.46593f, 39.21407f, 34.53407f, 42.34f, 37.66f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 167.16344f, 31.163445f, 160.0f, 40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(39.99932f, 104.544395f, 49.362637f, 82.05911f, 66.01103f, 65.53652f),
                    PathNode.CurveTo(82.659424f, 49.013924f, 105.21508f, 39.82142f, 128.67f, 40.0f),
                    PathNode.CurveTo(176.82f, 40.36f, 216.0f, 80.29f, 216.0f, 129.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(224.83656f, 160.0f, 232.0f, 167.16344f, 232.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.68f, 87.89f),
                    PathNode.CurveTo(153.67f, 91.08f, 168.0f, 108.32f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 132.41827f, 171.58173f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(180.41827f, 136.0f, 184.0f, 132.41827f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 100.6f, 163.93f, 76.57f, 137.32f, 72.11f),
                    PathNode.CurveTo(134.48814f, 71.6092f, 131.6054f, 72.66689f, 129.76941f, 74.88034f),
                    PathNode.CurveTo(127.93341f, 77.093796f, 127.426735f, 80.12236f, 128.44229f, 82.812874f),
                    PathNode.CurveTo(129.45784f, 85.50337f, 131.83934f, 87.44179f, 134.68f, 87.89f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
