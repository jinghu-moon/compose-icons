package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorRegularIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.54f, 54.46f),
                    PathNode.CurveTo(160.92497f, 13.84498f, 95.07501f, 13.84498f, 54.46f, 54.46f),
                    PathNode.CurveTo(13.84498f, 95.07501f, 13.84498f, 160.92497f, 54.46f, 201.54f),
                    PathNode.CurveTo(95.07501f, 242.15501f, 160.92497f, 242.15501f, 201.54f, 201.54f),
                    PathNode.CurveTo(242.15501f, 160.92497f, 242.15501f, 95.07501f, 201.54f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 206.37f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.LineTo(168.0f, 206.37f),
                    PathNode.CurveTo(142.85973f, 219.12993f, 113.14027f, 219.12993f, 88.0f, 206.37f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 128.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.LineTo(138.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.22f, 190.23f),
                    PathNode.CurveTo(188.22f, 192.23f, 186.14f, 194.1f, 184.0f, 195.87f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 167.16344f, 176.83656f, 160.0f, 168.0f, 160.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(167.98987f, 136.09418f, 162.20714f, 129.38092f, 154.39f, 128.2f),
                    PathNode.LineTo(143.66f, 76.74f),
                    PathNode.CurveTo(142.1073f, 69.32886f, 135.57205f, 64.02091f, 128.0f, 64.02091f),
                    PathNode.CurveTo(120.427956f, 64.02091f, 113.8927f, 69.32886f, 112.34f, 76.74f),
                    PathNode.LineTo(101.61f, 128.2f),
                    PathNode.CurveTo(93.79287f, 129.38092f, 88.010124f, 136.09418f, 88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(79.163445f, 160.0f, 72.0f, 167.16344f, 72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 195.87f),
                    PathNode.CurveTo(69.86f, 194.1f, 67.78f, 192.23f, 65.78f, 190.23f),
                    PathNode.CurveTo(40.609013f, 165.06337f, 33.07731f, 127.21181f, 46.69714f, 94.32659f),
                    PathNode.CurveTo(60.316975f, 61.441372f, 92.40594f, 39.999207f, 128.0f, 39.999207f),
                    PathNode.CurveTo(163.59407f, 39.999207f, 195.68303f, 61.441372f, 209.30286f, 94.32659f),
                    PathNode.CurveTo(222.9227f, 127.21181f, 215.39099f, 165.06337f, 190.22f, 190.23f),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
