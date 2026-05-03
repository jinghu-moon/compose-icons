package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorRegularIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 208.0f),
                    PathNode.CurveTo(184.0f, 212.41827f, 180.41827f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.CurveTo(147.40971f, 216.0f, 135.55417f, 210.07224f, 128.0f, 200.0f),
                    PathNode.CurveTo(120.44582f, 210.07224f, 108.590294f, 216.0f, 96.0f, 216.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.CurveTo(75.58172f, 216.0f, 72.0f, 212.41827f, 72.0f, 208.0f),
                    PathNode.CurveTo(72.0f, 203.58173f, 75.58172f, 200.0f, 80.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.CurveTo(109.25484f, 200.0f, 120.0f, 189.25484f, 120.0f, 176.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(99.58172f, 136.0f, 96.0f, 132.41827f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 123.58172f, 99.58172f, 120.0f, 104.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 66.74516f, 109.25484f, 56.0f, 96.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.CurveTo(75.58172f, 56.0f, 72.0f, 52.418278f, 72.0f, 48.0f),
                    PathNode.CurveTo(72.0f, 43.581722f, 75.58172f, 40.0f, 80.0f, 40.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.CurveTo(108.590294f, 40.0f, 120.44582f, 45.927765f, 128.0f, 56.0f),
                    PathNode.CurveTo(135.55417f, 45.927765f, 147.40971f, 40.0f, 160.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(180.41827f, 40.0f, 184.0f, 43.581722f, 184.0f, 48.0f),
                    PathNode.CurveTo(184.0f, 52.418278f, 180.41827f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(146.74516f, 56.0f, 136.0f, 66.74516f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(156.41827f, 120.0f, 160.0f, 123.58172f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 132.41827f, 156.41827f, 136.0f, 152.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 189.25484f, 146.74516f, 200.0f, 160.0f, 200.0f),
                    PathNode.LineTo(176.0f, 200.0f),
                    PathNode.CurveTo(180.41827f, 200.0f, 184.0f, 203.58173f, 184.0f, 208.0f),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
