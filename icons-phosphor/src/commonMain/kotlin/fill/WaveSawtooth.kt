package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorFillIcon(
            name = "WaveSawtooth",
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
                    PathNode.MoveTo(204.44f, 134.66f),
                    PathNode.LineTo(132.44f, 182.66f),
                    PathNode.CurveTo(131.12477f, 183.53528f, 129.57985f, 184.00154f, 128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 180.41827f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 95.0f),
                    PathNode.LineTo(60.44f, 134.66f),
                    PathNode.CurveTo(56.761784f, 137.11214f, 51.792145f, 136.11821f, 49.34f, 132.44f),
                    PathNode.CurveTo(46.887856f, 128.76178f, 47.881783f, 123.792145f, 51.56f, 121.34f),
                    PathNode.LineTo(123.56f, 73.34f),
                    PathNode.CurveTo(126.015465f, 71.701744f, 129.17355f, 71.54874f, 131.77588f, 72.94194f),
                    PathNode.CurveTo(134.37822f, 74.33517f, 136.00192f, 77.04819f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 161.05f),
                    PathNode.LineTo(195.56f, 121.34f),
                    PathNode.CurveTo(199.23822f, 118.887856f, 204.20786f, 119.88178f, 206.66f, 123.56f),
                    PathNode.CurveTo(209.11214f, 127.23822f, 208.11821f, 132.20786f, 204.44f, 134.66f),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
