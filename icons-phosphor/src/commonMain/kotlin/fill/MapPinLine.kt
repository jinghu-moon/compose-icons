package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorFillIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 224.0f),
                    PathNode.LineTo(150.54f, 224.0f),
                    PathNode.CurveTo(158.84854f, 216.58127f, 166.6839f, 208.64903f, 174.0f, 200.25f),
                    PathNode.CurveTo(201.45f, 168.68f, 216.0f, 135.4f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 55.39894f, 176.60106f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(79.39894f, 16.0f, 40.0f, 55.39894f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 135.4f, 54.51f, 168.68f, 82.0f, 200.25f),
                    PathNode.CurveTo(89.3161f, 208.64903f, 97.15147f, 216.58127f, 105.46f, 224.0f),
                    PathNode.LineTo(56.0f, 224.0f),
                    PathNode.CurveTo(51.581722f, 224.0f, 48.0f, 227.58173f, 48.0f, 232.0f),
                    PathNode.CurveTo(48.0f, 236.41827f, 51.581722f, 240.0f, 56.0f, 240.0f),
                    PathNode.LineTo(200.0f, 240.0f),
                    PathNode.CurveTo(204.41827f, 240.0f, 208.0f, 236.41827f, 208.0f, 232.0f),
                    PathNode.CurveTo(208.0f, 227.58173f, 204.41827f, 224.0f, 200.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 121.67311f, 145.67311f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(110.32689f, 136.0f, 96.0f, 121.67311f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
