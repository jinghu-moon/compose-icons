package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorFillIcon(
            name = "PencilCircle",
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
                    PathNode.MoveTo(128.0f, 170.87f),
                    PathNode.CurveTo(119.97234f, 161.72147f, 107.44183f, 157.93245f, 95.69f, 161.1f),
                    PathNode.LineTo(111.0f, 128.0f),
                    PathNode.LineTo(145.0f, 128.0f),
                    PathNode.LineTo(160.27f, 161.1f),
                    PathNode.CurveTo(148.53055f, 157.949f, 136.02025f, 161.73659f, 128.0f, 170.87f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 206.37f),
                    PathNode.CurveTo(158.01738f, 211.45201f, 147.15627f, 214.58136f, 136.0f, 215.59f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 183.16344f, 143.16344f, 176.0f, 152.0f, 176.0f),
                    PathNode.CurveTo(160.83656f, 176.0f, 168.0f, 183.16344f, 168.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.22f, 190.23f),
                    PathNode.CurveTo(188.22f, 192.23f, 186.14f, 194.1f, 184.0f, 195.87f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.00139f, 174.84264f, 183.74878f, 173.69908f, 183.26f, 172.65f),
                    PathNode.LineTo(135.26f, 68.65f),
                    PathNode.CurveTo(133.95059f, 65.821106f, 131.11723f, 64.010414f, 128.0f, 64.010414f),
                    PathNode.CurveTo(124.88276f, 64.010414f, 122.0494f, 65.821106f, 120.74f, 68.65f),
                    PathNode.LineTo(72.74f, 172.65f),
                    PathNode.CurveTo(72.25123f, 173.69908f, 71.99862f, 174.84264f, 72.0f, 176.0f),
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
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
