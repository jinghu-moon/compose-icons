package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorDuotoneIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 69.09f),
                    PathNode.LineTo(144.0f, 170.91f),
                    PathNode.LineTo(50.24f, 199.67f),
                    PathNode.CurveTo(47.824352f, 200.37457f, 45.21798f, 199.90152f, 43.203995f, 198.393f),
                    PathNode.CurveTo(41.190014f, 196.88448f, 40.003143f, 194.5163f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(40.003143f, 45.4837f, 41.190014f, 43.11552f, 43.203995f, 41.607f),
                    PathNode.CurveTo(45.21798f, 40.098476f, 47.824352f, 39.625435f, 50.24f, 40.33f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.54f, 86.66f),
                    PathNode.LineTo(52.48f, 32.66f),
                    PathNode.CurveTo(47.648705f, 31.250868f, 42.435963f, 32.196953f, 38.407993f, 35.213997f),
                    PathNode.CurveTo(34.380024f, 38.231037f, 32.00629f, 42.967403f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 200.83656f, 39.163445f, 208.0f, 48.0f, 208.0f),
                    PathNode.CurveTo(49.529995f, 208.00056f, 51.052162f, 207.78166f, 52.52f, 207.35f),
                    PathNode.LineTo(136.0f, 181.73f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 200.83656f, 143.16344f, 208.0f, 152.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(192.83656f, 208.0f, 200.0f, 200.83656f, 200.0f, 192.0f),
                    PathNode.LineTo(200.0f, 162.1f),
                    PathNode.LineTo(228.54f, 153.35f),
                    PathNode.CurveTo(235.3215f, 151.31245f, 239.9738f, 145.08093f, 240.0f, 138.0f),
                    PathNode.LineTo(240.0f, 102.0f),
                    PathNode.CurveTo(239.96944f, 94.92277f, 235.31798f, 88.69647f, 228.54f, 86.66f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 165.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(136.0f, 75.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.LineTo(152.0f, 176.82f),
                    PathNode.LineTo(184.0f, 167.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 138.0f),
                    PathNode.LineTo(223.89f, 138.0f),
                    PathNode.LineTo(152.0f, 160.08f),
                    PathNode.LineTo(152.0f, 79.92f),
                    PathNode.LineTo(223.89f, 101.92f),
                    PathNode.LineTo(224.0f, 101.92f),
                    PathNode.LineTo(224.0f, 137.92f),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
