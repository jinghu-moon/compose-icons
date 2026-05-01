package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorRegularIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 92.41828f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.CurveTo(203.58173f, 96.0f, 200.0f, 92.41828f, 200.0f, 88.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.LineTo(168.0f, 56.0f),
                    PathNode.CurveTo(163.58173f, 56.0f, 160.0f, 52.418278f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 43.581722f, 163.58173f, 40.0f, 168.0f, 40.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(212.41827f, 40.0f, 216.0f, 43.581722f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 163.58173f, 52.418278f, 160.0f, 48.0f, 160.0f),
                    PathNode.CurveTo(43.581722f, 160.0f, 40.0f, 163.58173f, 40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(40.0f, 212.41827f, 43.581722f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(92.41828f, 216.0f, 96.0f, 212.41827f, 96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 203.58173f, 92.41828f, 200.0f, 88.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.CurveTo(203.58173f, 160.0f, 200.0f, 163.58173f, 200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(163.58173f, 200.0f, 160.0f, 203.58173f, 160.0f, 208.0f),
                    PathNode.CurveTo(160.0f, 212.41827f, 163.58173f, 216.0f, 168.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(216.0f, 163.58173f, 212.41827f, 160.0f, 208.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(43.581722f, 40.0f, 40.0f, 43.581722f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(40.0f, 92.41828f, 43.581722f, 96.0f, 48.0f, 96.0f),
                    PathNode.CurveTo(52.418278f, 96.0f, 56.0f, 92.41828f, 56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(92.41828f, 56.0f, 96.0f, 52.418278f, 96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 43.581722f, 92.41828f, 40.0f, 88.0f, 40.0f),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
