package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorRegularIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 204.41827f, 212.41827f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(51.581722f, 208.0f, 48.0f, 204.41827f, 48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 195.58173f, 51.581722f, 192.0f, 56.0f, 192.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(212.41827f, 192.0f, 216.0f, 195.58173f, 216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(51.581722f, 152.0f, 48.0f, 155.58173f, 48.0f, 160.0f),
                    PathNode.CurveTo(48.0f, 164.41827f, 51.581722f, 168.0f, 56.0f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(187.34622f, 168.0f, 216.0f, 139.34622f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 68.65378f, 187.34622f, 40.0f, 152.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 43.581722f, 48.0f, 48.0f),
                    PathNode.CurveTo(48.0f, 52.418278f, 51.581722f, 56.0f, 56.0f, 56.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.CurveTo(178.50967f, 56.0f, 200.0f, 77.49033f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 130.50967f, 178.50967f, 152.0f, 152.0f, 152.0f),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
