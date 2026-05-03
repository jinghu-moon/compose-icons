package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorRegularIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 101.34f),
                    PathNode.CurveTo(207.69032f, 110.82737f, 217.67084f, 118.19918f, 229.0f, 122.76f),
                    PathNode.CurveTo(233.07431f, 124.32991f, 237.65485f, 122.34299f, 239.29243f, 118.29541f),
                    PathNode.CurveTo(240.93002f, 114.24784f, 239.01973f, 109.63482f, 235.0f, 107.93f),
                    PathNode.CurveTo(213.8004f, 99.419945f, 199.9324f, 78.84381f, 200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 51.581722f, 196.41827f, 48.0f, 192.0f, 48.0f),
                    PathNode.CurveTo(187.58173f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 86.92794f, 158.92795f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(97.07206f, 112.0f, 72.0f, 86.92794f, 72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 51.581722f, 68.41828f, 48.0f, 64.0f, 48.0f),
                    PathNode.CurveTo(59.581722f, 48.0f, 56.0f, 51.581722f, 56.0f, 56.0f),
                    PathNode.CurveTo(56.067593f, 78.84381f, 42.199608f, 99.419945f, 21.0f, 107.93f),
                    PathNode.CurveTo(16.980278f, 109.63482f, 15.069971f, 114.24784f, 16.707561f, 118.29541f),
                    PathNode.CurveTo(18.34515f, 122.34299f, 22.925695f, 124.32991f, 27.0f, 122.76f),
                    PathNode.CurveTo(38.329166f, 118.19918f, 48.30968f, 110.82737f, 56.0f, 101.34f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(19.581722f, 160.0f, 16.0f, 163.58173f, 16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 172.41827f, 19.581722f, 176.0f, 24.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.CurveTo(56.0f, 204.41827f, 59.581722f, 208.0f, 64.0f, 208.0f),
                    PathNode.CurveTo(68.41828f, 208.0f, 72.0f, 204.41827f, 72.0f, 200.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 204.41827f, 187.58173f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(196.41827f, 208.0f, 200.0f, 204.41827f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(236.41827f, 176.0f, 240.0f, 172.41827f, 240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 163.58173f, 236.41827f, 160.0f, 232.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 126.2f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(112.0f, 126.2f),
                    PathNode.CurveTo(122.531624f, 128.60037f, 133.46837f, 128.60037f, 144.0f, 126.2f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 101.2f),
                    PathNode.CurveTo(78.527954f, 109.26768f, 86.71252f, 115.8392f, 96.0f, 120.47f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.LineTo(160.0f, 120.48f),
                    PathNode.CurveTo(169.28748f, 115.8492f, 177.47205f, 109.27768f, 184.0f, 101.21f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bridge!!
    }

private var _bridge: ImageVector? = null
