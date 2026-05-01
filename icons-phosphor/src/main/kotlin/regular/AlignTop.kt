package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorRegularIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 44.418278f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 44.418278f, 32.0f, 40.0f),
                    PathNode.CurveTo(32.0f, 35.581722f, 35.581722f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(208.0f, 184.83656f, 200.83656f, 192.0f, 192.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(143.16344f, 192.0f, 136.0f, 184.83656f, 136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 71.163445f, 143.16344f, 64.0f, 152.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(200.83656f, 64.0f, 208.0f, 71.163445f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 224.83656f, 112.836555f, 232.0f, 104.0f, 232.0f),
                    PathNode.LineTo(64.0f, 232.0f),
                    PathNode.CurveTo(55.163445f, 232.0f, 48.0f, 224.83656f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(48.0f, 71.163445f, 55.163445f, 64.0f, 64.0f, 64.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(112.836555f, 64.0f, 120.0f, 71.163445f, 120.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.LineTo(104.0f, 216.0f),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
