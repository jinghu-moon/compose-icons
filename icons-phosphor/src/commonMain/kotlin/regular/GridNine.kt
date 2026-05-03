package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorRegularIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(31.163445f, 48.0f, 24.0f, 55.163445f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 192.0f),
                    PathNode.CurveTo(24.0f, 200.83656f, 31.163445f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(224.83656f, 208.0f, 232.0f, 200.83656f, 232.0f, 192.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 55.163445f, 224.83656f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(40.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.LineTo(168.0f, 192.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(216.0f, 192.0f),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
