package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorRegularIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 132.41827f, 164.41827f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(91.58172f, 136.0f, 88.0f, 132.41827f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 123.58172f, 91.58172f, 120.0f, 96.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(164.41827f, 120.0f, 168.0f, 123.58172f, 168.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 155.58173f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 164.41827f, 91.58172f, 168.0f, 96.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(164.41827f, 168.0f, 168.0f, 164.41827f, 168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 155.58173f, 164.41827f, 152.0f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 217.67311f, 201.67311f, 232.0f, 184.0f, 232.0f),
                    PathNode.LineTo(72.0f, 232.0f),
                    PathNode.CurveTo(54.32689f, 232.0f, 40.0f, 217.67311f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 35.581722f, 43.581722f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(72.0f, 19.581722f, 75.58172f, 16.0f, 80.0f, 16.0f),
                    PathNode.CurveTo(84.41828f, 16.0f, 88.0f, 19.581722f, 88.0f, 24.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 123.58172f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(132.41827f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(168.0f, 19.581722f, 171.58173f, 16.0f, 176.0f, 16.0f),
                    PathNode.CurveTo(180.41827f, 16.0f, 184.0f, 19.581722f, 184.0f, 24.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(212.41827f, 32.0f, 216.0f, 35.581722f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 60.418278f, 180.41827f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(171.58173f, 64.0f, 168.0f, 60.418278f, 168.0f, 56.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.CurveTo(136.0f, 60.418278f, 132.41827f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(123.58172f, 64.0f, 120.0f, 60.418278f, 120.0f, 56.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 56.0f),
                    PathNode.CurveTo(88.0f, 60.418278f, 84.41828f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(75.58172f, 64.0f, 72.0f, 60.418278f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.CurveTo(56.0f, 208.83656f, 63.163445f, 216.0f, 72.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.CurveTo(192.83656f, 216.0f, 200.0f, 208.83656f, 200.0f, 200.0f),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
