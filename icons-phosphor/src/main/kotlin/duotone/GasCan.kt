package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorDuotoneIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(208.0f, 220.41827f, 204.41827f, 224.0f, 200.0f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 220.41827f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 107.31f),
                    PathNode.CurveTo(48.00098f, 105.19109f, 48.84254f, 103.15913f, 50.34f, 101.66f),
                    PathNode.LineTo(117.66f, 34.34f),
                    PathNode.CurveTo(119.15913f, 32.84254f, 121.19109f, 32.00098f, 123.31f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(204.41827f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
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
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(123.31f, 24.0f),
                    PathNode.CurveTo(119.06421f, 23.986435f, 114.99025f, 25.675812f, 112.0f, 28.69f),
                    PathNode.LineTo(101.66f, 39.0f),
                    PathNode.LineTo(91.31f, 28.69f),
                    PathNode.CurveTo(85.06246f, 22.446554f, 74.93754f, 22.446554f, 68.69f, 28.69f),
                    PathNode.LineTo(44.69f, 52.69f),
                    PathNode.CurveTo(38.446556f, 58.93754f, 38.446556f, 69.06246f, 44.69f, 75.31f),
                    PathNode.LineTo(55.0f, 85.66f),
                    PathNode.LineTo(44.69f, 96.0f),
                    PathNode.CurveTo(41.67581f, 98.99025f, 39.986435f, 103.06421f, 40.0f, 107.31f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 64.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.LineTo(90.34f, 50.34f),
                    PathNode.LineTo(66.34f, 74.34f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 107.31f),
                    PathNode.LineTo(72.0f, 91.31f),
                    PathNode.LineTo(72.0f, 91.31f),
                    PathNode.LineTo(123.31f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(128.0f, 59.581722f, 131.58173f, 56.0f, 136.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(180.41827f, 56.0f, 184.0f, 59.581722f, 184.0f, 64.0f),
                    PathNode.CurveTo(184.0f, 68.41828f, 180.41827f, 72.0f, 176.0f, 72.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(131.58173f, 72.0f, 128.0f, 68.41828f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.8f, 126.4f),
                    PathNode.LineTo(141.33f, 156.0f),
                    PathNode.LineTo(180.8f, 185.6f),
                    PathNode.CurveTo(184.33463f, 188.25096f, 185.05096f, 193.26538f, 182.4f, 196.8f),
                    PathNode.CurveTo(179.74904f, 200.33463f, 174.73462f, 201.05096f, 171.2f, 198.4f),
                    PathNode.LineTo(128.0f, 166.0f),
                    PathNode.LineTo(84.8f, 198.4f),
                    PathNode.CurveTo(81.26538f, 201.05096f, 76.25097f, 200.33463f, 73.6f, 196.8f),
                    PathNode.CurveTo(70.949036f, 193.26538f, 71.665375f, 188.25096f, 75.2f, 185.6f),
                    PathNode.LineTo(114.67f, 156.0f),
                    PathNode.LineTo(75.2f, 126.4f),
                    PathNode.CurveTo(71.665375f, 123.74903f, 70.949036f, 118.73462f, 73.6f, 115.2f),
                    PathNode.CurveTo(76.25097f, 111.665375f, 81.26538f, 110.949036f, 84.8f, 113.6f),
                    PathNode.LineTo(128.0f, 146.0f),
                    PathNode.LineTo(171.2f, 113.6f),
                    PathNode.CurveTo(174.73462f, 110.949036f, 179.74904f, 111.665375f, 182.4f, 115.2f),
                    PathNode.CurveTo(185.05096f, 118.73462f, 184.33463f, 123.74903f, 180.8f, 126.4f),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
