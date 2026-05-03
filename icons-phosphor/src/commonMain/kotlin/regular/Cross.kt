package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorRegularIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(160.0f, 23.163445f, 152.83656f, 16.0f, 144.0f, 16.0f),
                    PathNode.LineTo(112.0f, 16.0f),
                    PathNode.CurveTo(103.163445f, 16.0f, 96.0f, 23.163445f, 96.0f, 32.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.CurveTo(47.163445f, 72.0f, 40.0f, 79.163445f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(40.0f, 128.83656f, 47.163445f, 136.0f, 56.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(96.0f, 232.83656f, 103.163445f, 240.0f, 112.0f, 240.0f),
                    PathNode.LineTo(144.0f, 240.0f),
                    PathNode.CurveTo(152.83656f, 240.0f, 160.0f, 232.83656f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(208.83656f, 136.0f, 216.0f, 128.83656f, 216.0f, 120.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 79.163445f, 208.83656f, 72.0f, 200.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(147.58173f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 123.58172f, 108.41828f, 120.0f, 104.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(108.41828f, 88.0f, 112.0f, 84.41828f, 112.0f, 80.0f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 84.41828f, 147.58173f, 88.0f, 152.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
