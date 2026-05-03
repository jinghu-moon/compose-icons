package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = phosphorFillIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.22f, 131.44f),
                    PathNode.CurveTo(194.54f, 166.44f, 180.16f, 182.0f, 164.57f, 182.0f),
                    PathNode.CurveTo(144.89f, 182.0f, 133.18f, 157.44f, 120.78f, 131.44f),
                    PathNode.CurveTo(112.0f, 113.0f, 101.0f, 90.0f, 91.43f, 90.0f),
                    PathNode.CurveTo(87.69f, 90.0f, 77.06f, 94.0f, 59.22f, 131.44f),
                    PathNode.CurveTo(57.257275f, 135.31345f, 52.562946f, 136.91393f, 48.64283f, 135.04616f),
                    PathNode.CurveTo(44.722706f, 133.1784f, 43.008316f, 128.52448f, 44.78f, 124.56f),
                    PathNode.CurveTo(61.46f, 89.59f, 75.84f, 74.0f, 91.43f, 74.0f),
                    PathNode.CurveTo(111.11f, 74.0f, 122.82f, 98.56f, 135.22f, 124.56f),
                    PathNode.CurveTo(144.0f, 143.0f, 155.0f, 166.0f, 164.57f, 166.0f),
                    PathNode.CurveTo(168.31f, 166.0f, 178.94f, 162.0f, 196.78f, 124.56f),
                    PathNode.CurveTo(197.96509f, 121.90815f, 200.49443f, 120.10697f, 203.38803f, 119.85434f),
                    PathNode.CurveTo(206.28163f, 119.60169f, 209.08484f, 120.9373f, 210.71155f, 123.34366f),
                    PathNode.CurveTo(212.33826f, 125.750015f, 212.53288f, 128.84903f, 211.22f, 131.44f),
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
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
