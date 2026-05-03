package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorThinIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 134.62741f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(121.37258f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(97.08f, 147.73f),
                    PathNode.CurveTo(78.05f, 127.35f, 68.0f, 103.93f, 68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 46.862915f, 94.862915f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(161.13708f, 20.0f, 188.0f, 46.862915f, 188.0f, 80.0f),
                    PathNode.CurveTo(188.0f, 103.93f, 177.95f, 127.35f, 158.92f, 147.73f),
                    PathNode.CurveTo(150.41505f, 156.93292f, 140.6837f, 164.92123f, 130.0f, 171.47f),
                    PathNode.CurveTo(128.76239f, 172.18452f, 127.2376f, 172.18452f, 126.0f, 171.47f),
                    PathNode.CurveTo(115.31629f, 164.92123f, 105.584946f, 156.93292f, 97.08f, 147.73f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 127.09f, 118.25f, 157.0f, 128.0f, 163.3f),
                    PathNode.CurveTo(137.75f, 157.02f, 180.0f, 127.09f, 180.0f, 80.0f),
                    PathNode.CurveTo(180.0f, 51.281193f, 156.71881f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(99.2812f, 28.0f, 76.0f, 51.281193f, 76.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.38f, 151.38f),
                    PathNode.CurveTo(199.30617f, 150.61784f, 197.00716f, 151.68117f, 196.245f, 153.755f),
                    PathNode.CurveTo(195.48285f, 155.82883f, 196.54617f, 158.12785f, 198.62f, 158.89f),
                    PathNode.CurveTo(217.29f, 165.78f, 228.0f, 174.89f, 228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 201.39f, 187.82f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(68.18f, 220.0f, 28.0f, 201.39f, 28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 174.93f, 38.71f, 165.78f, 57.38f, 158.89f),
                    PathNode.CurveTo(59.45383f, 158.12785f, 60.517155f, 155.82883f, 59.755f, 153.755f),
                    PathNode.CurveTo(58.992847f, 151.68117f, 56.69383f, 150.61784f, 54.62f, 151.38f),
                    PathNode.CurveTo(32.29f, 159.62f, 20.0f, 171.21f, 20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 196.46f, 31.73f, 207.83f, 53.0f, 216.0f),
                    PathNode.CurveTo(73.09f, 223.73f, 99.72f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(156.28f, 228.0f, 182.89f, 223.75f, 203.0f, 216.0f),
                    PathNode.CurveTo(224.29f, 207.81f, 236.0f, 196.44f, 236.0f, 184.0f),
                    PathNode.CurveTo(236.0f, 171.21f, 223.71f, 159.62f, 201.38f, 151.38f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
