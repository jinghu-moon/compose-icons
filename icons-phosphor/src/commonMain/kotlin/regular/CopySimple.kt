package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorRegularIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(35.581722f, 64.0f, 32.0f, 67.58172f, 32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(184.0f, 224.0f),
                    PathNode.CurveTo(188.41827f, 224.0f, 192.0f, 220.41827f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(192.0f, 67.58172f, 188.41827f, 64.0f, 184.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(224.0f, 188.41827f, 220.41827f, 192.0f, 216.0f, 192.0f),
                    PathNode.CurveTo(211.58173f, 192.0f, 208.0f, 188.41827f, 208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(67.58172f, 48.0f, 64.0f, 44.418278f, 64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 67.58172f, 32.0f, 72.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
