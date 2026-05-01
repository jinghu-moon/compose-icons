package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorBoldIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.13f, 116.0f),
                    PathNode.LineTo(179.56f, 116.0f),
                    PathNode.CurveTo(177.97356f, 92.46758f, 170.64299f, 69.68276f, 158.21f, 49.64f),
                    PathNode.CurveTo(186.52165f, 60.604424f, 206.7406f, 85.95834f, 211.13f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 207.0f),
                    PathNode.CurveTo(118.64f, 196.19f, 103.54f, 173.87f, 100.55f, 140.0f),
                    PathNode.LineTo(155.49f, 140.0f),
                    PathNode.CurveTo(153.99612f, 158.68684f, 148.13553f, 176.76189f, 138.38f, 192.77f),
                    PathNode.CurveTo(135.31096f, 197.78653f, 131.83955f, 202.54552f, 128.0f, 207.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.55f, 116.0f),
                    PathNode.CurveTo(102.04387f, 97.31315f, 107.90447f, 79.23811f, 117.66f, 63.23f),
                    PathNode.CurveTo(120.71626f, 58.214905f, 124.17426f, 53.45597f, 128.0f, 49.0f),
                    PathNode.CurveTo(137.36f, 59.81f, 152.46f, 82.13f, 155.45f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(97.79f, 49.64f),
                    PathNode.CurveTo(85.35701f, 69.68276f, 78.02645f, 92.46758f, 76.44f, 116.0f),
                    PathNode.LineTo(44.87f, 116.0f),
                    PathNode.CurveTo(49.259403f, 85.95834f, 69.47835f, 60.604424f, 97.79f, 49.64f),
                    PathNode.Close,
                    PathNode.MoveTo(44.87f, 140.0f),
                    PathNode.LineTo(76.44f, 140.0f),
                    PathNode.CurveTo(78.02645f, 163.53241f, 85.35701f, 186.31725f, 97.79f, 206.36f),
                    PathNode.CurveTo(69.47835f, 195.39557f, 49.259403f, 170.04166f, 44.87f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.21f, 206.36f),
                    PathNode.CurveTo(170.64299f, 186.31725f, 177.97356f, 163.53241f, 179.56f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(206.7406f, 170.04166f, 186.52165f, 195.39557f, 158.21f, 206.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
