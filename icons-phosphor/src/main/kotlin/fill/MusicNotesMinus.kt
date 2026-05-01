package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotesMinus: ImageVector
    get() {
        if (_musicNotesMinus != null) return _musicNotesMinus!!
        _musicNotesMinus = phosphorFillIcon(
            name = "MusicNotesMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(171.58173f, 40.0f, 168.0f, 43.581722f, 168.0f, 48.0f),
                    PathNode.CurveTo(168.0f, 52.418278f, 171.58173f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(228.41827f, 56.0f, 232.0f, 52.418278f, 232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 43.581722f, 228.41827f, 40.0f, 224.0f, 40.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.13f, 76.5f),
                    PathNode.CurveTo(147.57713f, 69.65365f, 140.49716f, 52.961464f, 145.69f, 37.74f),
                    PathNode.CurveTo(146.16977f, 36.362274f, 145.86143f, 34.83262f, 144.88539f, 33.748356f),
                    PathNode.CurveTo(143.90935f, 32.66409f, 142.4204f, 32.197197f, 141.0f, 32.53f),
                    PathNode.LineTo(78.06f, 48.25f),
                    PathNode.CurveTo(74.50258f, 49.139214f, 72.00514f, 52.33313f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 166.1f),
                    PathNode.CurveTo(59.136467f, 157.47705f, 42.199734f, 158.04692f, 29.94491f, 167.51503f),
                    PathNode.CurveTo(17.690086f, 176.98314f, 12.863584f, 193.2276f, 17.960365f, 207.85117f),
                    PathNode.CurveTo(23.057148f, 222.47472f, 36.934986f, 232.20012f, 52.42f, 232.0f),
                    PathNode.CurveTo(72.25f, 231.77f, 88.0f, 215.13f, 88.0f, 195.3f),
                    PathNode.LineTo(88.0f, 102.25f),
                    PathNode.LineTo(161.26f, 83.94f),
                    PathNode.CurveTo(162.8787f, 83.53986f, 164.07936f, 82.17759f, 164.27303f, 80.52146f),
                    PathNode.CurveTo(164.46667f, 78.86533f, 163.6127f, 77.2628f, 162.13f, 76.5f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 80.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(201.79086f, 80.0f, 200.0f, 81.79086f, 200.0f, 84.0f),
                    PathNode.LineTo(200.0f, 134.1f),
                    PathNode.CurveTo(187.13647f, 125.47705f, 170.19974f, 126.04692f, 157.94492f, 135.51503f),
                    PathNode.CurveTo(145.6901f, 144.98314f, 140.86359f, 161.2276f, 145.96037f, 175.85117f),
                    PathNode.CurveTo(151.05716f, 190.47472f, 164.93498f, 200.20012f, 180.42f, 200.0f),
                    PathNode.CurveTo(200.25f, 199.77f, 216.0f, 183.14f, 216.0f, 163.3f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(216.0f, 81.79086f, 214.20914f, 80.0f, 212.0f, 80.0f),
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
        return _musicNotesMinus!!
    }

private var _musicNotesMinus: ImageVector? = null
