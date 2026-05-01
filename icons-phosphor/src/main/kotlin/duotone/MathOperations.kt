package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorDuotoneIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(47.163445f, 216.0f, 40.0f, 208.83656f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(208.83656f, 40.0f, 216.0f, 47.163445f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(112.0f, 72.0f),
                    PathNode.CurveTo(112.0f, 76.41828f, 108.41828f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(35.581722f, 80.0f, 32.0f, 76.41828f, 32.0f, 72.0f),
                    PathNode.CurveTo(32.0f, 67.58172f, 35.581722f, 64.0f, 40.0f, 64.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(108.41828f, 64.0f, 112.0f, 67.58172f, 112.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.CurveTo(80.0f, 147.58173f, 76.41828f, 144.0f, 72.0f, 144.0f),
                    PathNode.CurveTo(67.58172f, 144.0f, 64.0f, 147.58173f, 64.0f, 152.0f),
                    PathNode.LineTo(64.0f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(35.581722f, 176.0f, 32.0f, 179.58173f, 32.0f, 184.0f),
                    PathNode.CurveTo(32.0f, 188.41827f, 35.581722f, 192.0f, 40.0f, 192.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 220.41827f, 67.58172f, 224.0f, 72.0f, 224.0f),
                    PathNode.CurveTo(76.41828f, 224.0f, 80.0f, 220.41827f, 80.0f, 216.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.CurveTo(108.41828f, 192.0f, 112.0f, 188.41827f, 112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 179.58173f, 108.41828f, 176.0f, 104.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(220.41827f, 176.0f, 224.0f, 172.41827f, 224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 163.58173f, 220.41827f, 160.0f, 216.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(147.58173f, 160.0f, 144.0f, 163.58173f, 144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 172.41827f, 147.58173f, 176.0f, 152.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(147.58173f, 192.0f, 144.0f, 195.58173f, 144.0f, 200.0f),
                    PathNode.CurveTo(144.0f, 204.41827f, 147.58173f, 208.0f, 152.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.CurveTo(224.0f, 195.58173f, 220.41827f, 192.0f, 216.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.34f, 101.66f),
                    PathNode.CurveTo(155.84055f, 103.16222f, 157.87672f, 104.006294f, 160.0f, 104.006294f),
                    PathNode.CurveTo(162.12328f, 104.006294f, 164.15945f, 103.16222f, 165.66f, 101.66f),
                    PathNode.LineTo(184.0f, 83.31f),
                    PathNode.LineTo(202.34f, 101.66f),
                    PathNode.CurveTo(205.46593f, 104.785934f, 210.53407f, 104.785934f, 213.66f, 101.66f),
                    PathNode.CurveTo(216.78593f, 98.534065f, 216.78593f, 93.465935f, 213.66f, 90.34f),
                    PathNode.LineTo(195.31f, 72.0f),
                    PathNode.LineTo(213.66f, 53.66f),
                    PathNode.CurveTo(216.78593f, 50.53407f, 216.78593f, 45.46593f, 213.66f, 42.34f),
                    PathNode.CurveTo(210.53407f, 39.21407f, 205.46593f, 39.21407f, 202.34f, 42.34f),
                    PathNode.LineTo(184.0f, 60.69f),
                    PathNode.LineTo(165.66f, 42.34f),
                    PathNode.CurveTo(162.53407f, 39.21407f, 157.46593f, 39.21407f, 154.34f, 42.34f),
                    PathNode.CurveTo(151.21407f, 45.46593f, 151.21407f, 50.53407f, 154.34f, 53.66f),
                    PathNode.LineTo(172.69f, 72.0f),
                    PathNode.LineTo(154.34f, 90.34f),
                    PathNode.CurveTo(152.83777f, 91.840546f, 151.99371f, 93.876724f, 151.99371f, 96.0f),
                    PathNode.CurveTo(151.99371f, 98.123276f, 152.83777f, 100.159454f, 154.34f, 101.66f),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
