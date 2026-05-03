package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorFillIcon(
            name = "Gif",
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
                    PathNode.MoveTo(112.0f, 144.0f),
                    PathNode.CurveTo(112.0f, 161.67311f, 97.67311f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(62.32689f, 176.0f, 48.0f, 161.67311f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 112.0f),
                    PathNode.CurveTo(48.002026f, 98.73356f, 56.189655f, 86.844086f, 68.583f, 82.11087f),
                    PathNode.CurveTo(80.97635f, 77.377655f, 95.005066f, 80.78236f, 103.85f, 90.67f),
                    PathNode.CurveTo(105.86788f, 92.78199f, 106.574265f, 95.8259f, 105.692764f, 98.61073f),
                    PathNode.CurveTo(104.811264f, 101.39557f, 102.48203f, 103.47859f, 99.61641f, 104.044785f),
                    PathNode.CurveTo(96.75079f, 104.61098f, 93.804375f, 103.57033f, 91.93f, 101.33f),
                    PathNode.CurveTo(87.507645f, 96.38164f, 80.48959f, 94.67701f, 74.290054f, 97.045395f),
                    PathNode.CurveTo(68.09052f, 99.41378f, 63.99662f, 105.36347f, 64.0f, 112.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(64.0f, 152.83656f, 71.163445f, 160.0f, 80.0f, 160.0f),
                    PathNode.CurveTo(88.836555f, 160.0f, 96.0f, 152.83656f, 96.0f, 144.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(83.58172f, 136.0f, 80.0f, 132.41827f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 83.58172f, 120.0f, 88.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.CurveTo(108.41828f, 120.0f, 112.0f, 123.58172f, 112.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 172.41827f, 140.41827f, 176.0f, 136.0f, 176.0f),
                    PathNode.CurveTo(131.58173f, 176.0f, 128.0f, 172.41827f, 128.0f, 168.0f),
                    PathNode.LineTo(128.0f, 88.0f),
                    PathNode.CurveTo(128.0f, 83.58172f, 131.58173f, 80.0f, 136.0f, 80.0f),
                    PathNode.CurveTo(140.41827f, 80.0f, 144.0f, 83.58172f, 144.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(196.0f, 120.0f),
                    PathNode.CurveTo(200.41827f, 120.0f, 204.0f, 123.58172f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 132.41827f, 200.41827f, 136.0f, 196.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 172.41827f, 172.41827f, 176.0f, 168.0f, 176.0f),
                    PathNode.CurveTo(163.58173f, 176.0f, 160.0f, 172.41827f, 160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(160.0f, 83.58172f, 163.58173f, 80.0f, 168.0f, 80.0f),
                    PathNode.LineTo(204.0f, 80.0f),
                    PathNode.CurveTo(208.41827f, 80.0f, 212.0f, 83.58172f, 212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 92.41828f, 208.41827f, 96.0f, 204.0f, 96.0f),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
