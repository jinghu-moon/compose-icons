package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorFillIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.34f, 85.66f),
                    PathNode.CurveTo(167.21407f, 82.534065f, 167.21407f, 77.465935f, 170.34f, 74.34f),
                    PathNode.CurveTo(173.46593f, 71.214066f, 178.53407f, 71.214066f, 181.66f, 74.34f),
                    PathNode.LineTo(192.0f, 84.69f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 43.581722f, 195.58173f, 40.0f, 200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 43.581722f, 208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 84.69f),
                    PathNode.LineTo(218.34f, 74.34f),
                    PathNode.CurveTo(221.46593f, 71.214066f, 226.53407f, 71.214066f, 229.66f, 74.34f),
                    PathNode.CurveTo(232.78593f, 77.465935f, 232.78593f, 82.534065f, 229.66f, 85.66f),
                    PathNode.LineTo(205.66f, 109.66f),
                    PathNode.CurveTo(204.15945f, 111.16222f, 202.12328f, 112.006294f, 200.0f, 112.006294f),
                    PathNode.CurveTo(197.87672f, 112.006294f, 195.84055f, 111.16222f, 194.34f, 109.66f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(187.5f, 144.0f),
                    PathNode.LineTo(93.88f, 42.57f),
                    PathNode.CurveTo(92.36452f, 40.93033f, 90.23276f, 39.998592f, 88.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(23.163445f, 40.0f, 16.0f, 47.163445f, 16.0f, 56.0f),
                    PathNode.LineTo(16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 104.836555f, 23.163445f, 112.0f, 32.0f, 112.0f),
                    PathNode.LineTo(68.5f, 112.0f),
                    PathNode.LineTo(162.12f, 213.43f),
                    PathNode.CurveTo(163.63548f, 215.06966f, 165.76724f, 216.0014f, 168.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(232.83656f, 216.0f, 240.0f, 208.83656f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.0f, 151.16344f, 232.83656f, 144.0f, 224.0f, 144.0f),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
