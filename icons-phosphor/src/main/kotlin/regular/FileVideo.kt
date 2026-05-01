package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorRegularIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 116.41828f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(52.418278f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(187.58173f, 216.0f, 184.0f, 219.58173f, 184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 228.41827f, 187.58173f, 232.0f, 192.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 51.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.88f, 145.0f),
                    PathNode.CurveTo(153.33466f, 143.59154f, 150.22536f, 143.67578f, 147.76f, 145.22f),
                    PathNode.LineTo(127.81f, 157.68f),
                    PathNode.CurveTo(126.65979f, 149.83131f, 119.9325f, 144.01036f, 112.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(39.163445f, 144.0f, 32.0f, 151.16344f, 32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(119.9325f, 223.98964f, 126.65979f, 218.16869f, 127.81f, 210.32f),
                    PathNode.LineTo(147.76f, 222.78f),
                    PathNode.CurveTo(150.22554f, 224.32097f, 153.33304f, 224.40295f, 155.8764f, 222.99413f),
                    PathNode.CurveTo(158.41977f, 221.5853f, 159.99855f, 218.90749f, 160.0f, 216.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(160.00142f, 149.09117f, 158.42381f, 146.41078f, 155.88f, 145.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 201.57f),
                    PathNode.LineTo(128.0f, 191.57f),
                    PathNode.LineTo(128.0f, 176.43f),
                    PathNode.LineTo(144.0f, 166.43f),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
