package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorRegularIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(223.94489f, 176.57822f, 184.57822f, 215.94489f, 136.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.CurveTo(59.581722f, 216.0f, 56.0f, 212.41827f, 56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 203.58173f, 59.581722f, 200.0f, 64.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(175.7645f, 200.0f, 208.0f, 167.7645f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 88.2355f, 175.7645f, 56.0f, 136.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(59.581722f, 56.0f, 56.0f, 52.418278f, 56.0f, 48.0f),
                    PathNode.CurveTo(56.0f, 43.581722f, 59.581722f, 40.0f, 64.0f, 40.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(184.57822f, 40.055107f, 223.94489f, 79.42178f, 224.0f, 128.0f),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
