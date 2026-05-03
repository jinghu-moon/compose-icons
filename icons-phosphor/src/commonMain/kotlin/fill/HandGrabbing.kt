package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorFillIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 104.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 200.60106f, 176.60106f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(79.39894f, 240.0f, 40.0f, 200.60106f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(40.0f, 127.163445f, 47.163445f, 120.0f, 56.0f, 120.0f),
                    PathNode.CurveTo(64.836555f, 120.0f, 72.0f, 127.163445f, 72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 148.41827f, 75.58172f, 152.0f, 80.0f, 152.0f),
                    PathNode.CurveTo(84.41828f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 79.163445f, 95.163445f, 72.0f, 104.0f, 72.0f),
                    PathNode.CurveTo(112.836555f, 72.0f, 120.0f, 79.163445f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 108.41828f, 123.58172f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 108.41828f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 79.163445f, 143.16344f, 72.0f, 152.0f, 72.0f),
                    PathNode.CurveTo(160.83656f, 72.0f, 168.0f, 79.163445f, 168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 171.58173f, 112.0f, 176.0f, 112.0f),
                    PathNode.CurveTo(180.41827f, 112.0f, 184.0f, 108.41828f, 184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 95.163445f, 191.16344f, 88.0f, 200.0f, 88.0f),
                    PathNode.CurveTo(208.83656f, 88.0f, 216.0f, 95.163445f, 216.0f, 104.0f),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
