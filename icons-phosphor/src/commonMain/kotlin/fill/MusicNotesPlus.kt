package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorFillIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 52.418278f, 228.41827f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(208.0f, 76.41828f, 204.41827f, 80.0f, 200.0f, 80.0f),
                    PathNode.CurveTo(195.58173f, 80.0f, 192.0f, 76.41828f, 192.0f, 72.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(171.58173f, 56.0f, 168.0f, 52.418278f, 168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 43.581722f, 171.58173f, 40.0f, 176.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 24.0f),
                    PathNode.CurveTo(192.0f, 19.581722f, 195.58173f, 16.0f, 200.0f, 16.0f),
                    PathNode.CurveTo(204.41827f, 16.0f, 208.0f, 19.581722f, 208.0f, 24.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(228.41827f, 40.0f, 232.0f, 43.581722f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.6f, 77.86f),
                    PathNode.LineTo(153.84f, 71.1f),
                    PathNode.CurveTo(147.94398f, 65.3355f, 144.43149f, 57.56446f, 144.0f, 49.33f),
                    PathNode.CurveTo(143.82735f, 45.37333f, 144.39368f, 41.41914f, 145.67f, 37.67f),
                    PathNode.CurveTo(146.12814f, 36.286694f, 145.79779f, 34.763687f, 144.80768f, 33.694527f),
                    PathNode.CurveTo(143.81755f, 32.62537f, 142.32436f, 32.179237f, 140.91f, 32.53f),
                    PathNode.LineTo(78.06f, 48.25f),
                    PathNode.CurveTo(74.50258f, 49.139214f, 72.00514f, 52.33313f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 166.1f),
                    PathNode.CurveTo(59.136467f, 157.47705f, 42.199734f, 158.04692f, 29.94491f, 167.51503f),
                    PathNode.CurveTo(17.690086f, 176.98314f, 12.863584f, 193.2276f, 17.960365f, 207.85117f),
                    PathNode.CurveTo(23.057148f, 222.47472f, 36.934986f, 232.20012f, 52.42f, 232.0f),
                    PathNode.CurveTo(72.25f, 231.77f, 88.0f, 215.13f, 88.0f, 195.3f),
                    PathNode.LineTo(88.0f, 102.25f),
                    PathNode.LineTo(158.74f, 84.56f),
                    PathNode.CurveTo(160.13466f, 84.20912f, 161.2336f, 83.13657f, 161.61829f, 81.75087f),
                    PathNode.CurveTo(162.00298f, 80.36516f, 161.61418f, 78.8796f, 160.6f, 77.86f),
                    PathNode.Close,
                    PathNode.MoveTo(210.71f, 102.17f),
                    PathNode.CurveTo(208.40045f, 102.98556f, 206.00467f, 103.53249f, 203.57f, 103.8f),
                    PathNode.CurveTo(201.53029f, 104.020515f, 199.98811f, 105.74844f, 200.0f, 107.8f),
                    PathNode.LineTo(200.0f, 134.1f),
                    PathNode.CurveTo(187.13647f, 125.47705f, 170.19974f, 126.04692f, 157.94492f, 135.51503f),
                    PathNode.CurveTo(145.6901f, 144.98314f, 140.86359f, 161.2276f, 145.96037f, 175.85117f),
                    PathNode.CurveTo(151.05716f, 190.47472f, 164.93498f, 200.20012f, 180.42f, 200.0f),
                    PathNode.CurveTo(200.25f, 199.77f, 216.0f, 183.14f, 216.0f, 163.3f),
                    PathNode.LineTo(216.0f, 106.0f),
                    PathNode.CurveTo(216.01422f, 104.70186f, 215.39755f, 103.477554f, 214.34602f, 102.716225f),
                    PathNode.CurveTo(213.29445f, 101.954895f, 211.93883f, 101.75124f, 210.71f, 102.17f),
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
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
