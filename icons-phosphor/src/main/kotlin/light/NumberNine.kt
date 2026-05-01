package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorLightIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 42.0f),
                    PathNode.CurveTo(106.245316f, 41.98621f, 86.606766f, 55.028053f, 78.180725f, 75.08469f),
                    PathNode.CurveTo(69.7547f, 95.14132f, 74.18683f, 118.29555f, 89.42421f, 133.82259f),
                    PathNode.CurveTo(104.6616f, 149.34961f, 127.72828f, 154.21692f, 147.94f, 146.17f),
                    PathNode.LineTo(114.77f, 205.05f),
                    PathNode.CurveTo(113.14353f, 207.93845f, 114.16655f, 211.59853f, 117.055f, 213.225f),
                    PathNode.CurveTo(119.94345f, 214.85149f, 123.60352f, 213.82845f, 125.23f, 210.94f),
                    PathNode.LineTo(174.77f, 122.94f),
                    PathNode.CurveTo(184.3859f, 106.235344f, 184.36897f, 85.67178f, 174.72559f, 68.98298f),
                    PathNode.CurveTo(165.0822f, 52.294174f, 147.27461f, 42.010693f, 128.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.0f),
                    PathNode.CurveTo(104.80404f, 138.0f, 86.0f, 119.19596f, 86.0f, 96.0f),
                    PathNode.CurveTo(86.0f, 72.80404f, 104.80404f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(151.19595f, 54.0f, 170.0f, 72.80404f, 170.0f, 96.0f),
                    PathNode.CurveTo(170.0f, 119.19596f, 151.19595f, 138.0f, 128.0f, 138.0f),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
