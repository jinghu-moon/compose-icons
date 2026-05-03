package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorFillIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(158.66f, 219.56f),
                    PathNode.CurveTo(160.29826f, 222.01547f, 160.45126f, 225.17355f, 159.05804f, 227.77588f),
                    PathNode.CurveTo(157.66484f, 230.37822f, 154.95181f, 232.00192f, 152.0f, 232.0f),
                    PathNode.LineTo(24.0f, 232.0f),
                    PathNode.CurveTo(21.072147f, 232.00114f, 18.377556f, 230.40276f, 16.974817f, 227.83281f),
                    PathNode.CurveTo(15.572079f, 225.26286f, 15.6853f, 222.13193f, 17.27f, 219.67f),
                    PathNode.LineTo(53.27f, 163.67f),
                    PathNode.CurveTo(54.7419f, 161.37971f, 57.277515f, 159.99516f, 60.0f, 159.99516f),
                    PathNode.CurveTo(62.722485f, 159.99516f, 65.258095f, 161.37971f, 66.73f, 163.67f),
                    PathNode.LineTo(76.49f, 178.85f),
                    PathNode.LineTo(97.34f, 147.56f),
                    PathNode.CurveTo(98.8232f, 145.3313f, 101.32287f, 143.9922f, 104.0f, 143.9922f),
                    PathNode.CurveTo(106.67713f, 143.9922f, 109.1768f, 145.3313f, 110.66f, 147.56f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(187.58173f, 232.0f, 184.0f, 228.41827f, 184.0f, 224.0f),
                    PathNode.CurveTo(184.0f, 219.58173f, 187.58173f, 216.0f, 192.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 132.41827f, 52.418278f, 136.0f, 48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
