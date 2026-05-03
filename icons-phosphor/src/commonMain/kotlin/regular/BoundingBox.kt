package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorRegularIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(216.83656f, 96.0f, 224.0f, 88.836555f, 224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(167.16344f, 32.0f, 160.0f, 39.163445f, 160.0f, 48.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 39.163445f, 88.836555f, 32.0f, 80.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.CurveTo(32.0f, 88.836555f, 39.163445f, 96.0f, 48.0f, 96.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.CurveTo(39.163445f, 160.0f, 32.0f, 167.16344f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(88.836555f, 224.0f, 96.0f, 216.83656f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 216.83656f, 167.16344f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 167.16344f, 216.83656f, 160.0f, 208.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.LineTo(80.0f, 63.9f),
                    PathNode.CurveTo(79.9868f, 63.966015f, 79.9868f, 64.03399f, 80.0f, 64.1f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.LineTo(80.0f, 191.9f),
                    PathNode.CurveTo(79.9868f, 191.96602f, 79.9868f, 192.03398f, 80.0f, 192.1f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(167.16344f, 160.0f, 160.0f, 167.16344f, 160.0f, 176.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(96.0f, 167.16344f, 88.836555f, 160.0f, 80.0f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(88.836555f, 96.0f, 96.0f, 88.836555f, 96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 88.836555f, 167.16344f, 96.0f, 176.0f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
