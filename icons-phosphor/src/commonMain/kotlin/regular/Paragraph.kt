package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorRegularIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.CurveTo(60.653774f, 40.0f, 32.0f, 68.65378f, 32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 139.34622f, 60.653774f, 168.0f, 96.0f, 168.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 212.41827f, 139.58173f, 216.0f, 144.0f, 216.0f),
                    PathNode.CurveTo(148.41827f, 216.0f, 152.0f, 212.41827f, 152.0f, 208.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.LineTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 179.58173f, 216.0f, 184.0f, 216.0f),
                    PathNode.CurveTo(188.41827f, 216.0f, 192.0f, 212.41827f, 192.0f, 208.0f),
                    PathNode.LineTo(192.0f, 56.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(212.41827f, 56.0f, 216.0f, 52.418278f, 216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 43.581722f, 212.41827f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(69.49033f, 152.0f, 48.0f, 130.50967f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 77.49033f, 69.49033f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
