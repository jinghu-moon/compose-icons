package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorFillIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.3f, 129.62f),
                    PathNode.LineTo(132.62f, 188.0f),
                    PathNode.CurveTo(130.41086f, 191.82733f, 125.517334f, 193.13914f, 121.69f, 190.93f),
                    PathNode.CurveTo(117.86266f, 188.72084f, 116.55086f, 183.82733f, 118.76f, 180.0f),
                    PathNode.LineTo(135.28f, 151.39f),
                    PathNode.CurveTo(132.874f, 151.79123f, 130.43922f, 151.99524f, 128.0f, 152.0f),
                    PathNode.CurveTo(108.09597f, 152.02313f, 90.64927f, 138.69606f, 85.43637f, 119.48678f),
                    PathNode.CurveTo(80.22348f, 100.27749f, 88.53968f, 79.95905f, 105.72489f, 69.917145f),
                    PathNode.CurveTo(122.91009f, 59.875244f, 144.69418f, 62.60506f, 158.87015f, 76.57691f),
                    PathNode.CurveTo(173.04613f, 90.54877f, 176.0916f, 112.29096f, 166.3f, 129.62f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 108.0f),
                    PathNode.CurveTo(156.0f, 123.463974f, 143.46397f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(112.536026f, 136.0f, 100.0f, 123.463974f, 100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 92.536026f, 112.536026f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(143.46397f, 80.0f, 156.0f, 92.536026f, 156.0f, 108.0f),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
