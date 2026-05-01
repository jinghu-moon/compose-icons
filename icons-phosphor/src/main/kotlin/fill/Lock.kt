package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = phosphorFillIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 29.490332f, 154.50967f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(101.49033f, 8.0f, 80.0f, 29.490332f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.CurveTo(39.163445f, 80.0f, 32.0f, 87.163445f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 87.163445f, 216.83656f, 80.0f, 208.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(121.37258f, 164.0f, 116.0f, 158.62741f, 116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 145.37259f, 121.37258f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(134.62741f, 140.0f, 140.0f, 145.37259f, 140.0f, 152.0f),
                    PathNode.CurveTo(140.0f, 158.62741f, 134.62741f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 38.32689f, 110.32689f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(145.67311f, 24.0f, 160.0f, 38.32689f, 160.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lock!!
    }

private var _lock: ImageVector? = null
