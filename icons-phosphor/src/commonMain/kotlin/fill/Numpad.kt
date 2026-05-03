package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Numpad: ImageVector
    get() {
        if (_numpad != null) return _numpad!!
        _numpad = phosphorFillIcon(
            name = "Numpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(216.0f, 31.163445f, 208.83656f, 24.0f, 200.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 164.0f),
                    PathNode.CurveTo(73.37258f, 164.0f, 68.0f, 158.62741f, 68.0f, 152.0f),
                    PathNode.CurveTo(68.0f, 145.37259f, 73.37258f, 140.0f, 80.0f, 140.0f),
                    PathNode.CurveTo(86.62742f, 140.0f, 92.0f, 145.37259f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 158.62741f, 86.62742f, 164.0f, 80.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 124.0f),
                    PathNode.CurveTo(73.37258f, 124.0f, 68.0f, 118.62742f, 68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 105.37258f, 73.37258f, 100.0f, 80.0f, 100.0f),
                    PathNode.CurveTo(86.62742f, 100.0f, 92.0f, 105.37258f, 92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 118.62742f, 86.62742f, 124.0f, 80.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 84.0f),
                    PathNode.CurveTo(73.37258f, 84.0f, 68.0f, 78.62742f, 68.0f, 72.0f),
                    PathNode.CurveTo(68.0f, 65.37258f, 73.37258f, 60.0f, 80.0f, 60.0f),
                    PathNode.CurveTo(86.62742f, 60.0f, 92.0f, 65.37258f, 92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 78.62742f, 86.62742f, 84.0f, 80.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(121.37258f, 204.0f, 116.0f, 198.62741f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 185.37259f, 121.37258f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(134.62741f, 180.0f, 140.0f, 185.37259f, 140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 198.62741f, 134.62741f, 204.0f, 128.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(121.37258f, 164.0f, 116.0f, 158.62741f, 116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 145.37259f, 121.37258f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(134.62741f, 140.0f, 140.0f, 145.37259f, 140.0f, 152.0f),
                    PathNode.CurveTo(140.0f, 158.62741f, 134.62741f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 124.0f),
                    PathNode.CurveTo(121.37258f, 124.0f, 116.0f, 118.62742f, 116.0f, 112.0f),
                    PathNode.CurveTo(116.0f, 105.37258f, 121.37258f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(134.62741f, 100.0f, 140.0f, 105.37258f, 140.0f, 112.0f),
                    PathNode.CurveTo(140.0f, 118.62742f, 134.62741f, 124.0f, 128.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(121.37258f, 84.0f, 116.0f, 78.62742f, 116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 65.37258f, 121.37258f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(134.62741f, 60.0f, 140.0f, 65.37258f, 140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 78.62742f, 134.62741f, 84.0f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 164.0f),
                    PathNode.CurveTo(169.37259f, 164.0f, 164.0f, 158.62741f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 145.37259f, 169.37259f, 140.0f, 176.0f, 140.0f),
                    PathNode.CurveTo(182.62741f, 140.0f, 188.0f, 145.37259f, 188.0f, 152.0f),
                    PathNode.CurveTo(188.0f, 158.62741f, 182.62741f, 164.0f, 176.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 124.0f),
                    PathNode.CurveTo(169.37259f, 124.0f, 164.0f, 118.62742f, 164.0f, 112.0f),
                    PathNode.CurveTo(164.0f, 105.37258f, 169.37259f, 100.0f, 176.0f, 100.0f),
                    PathNode.CurveTo(182.62741f, 100.0f, 188.0f, 105.37258f, 188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 118.62742f, 182.62741f, 124.0f, 176.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 84.0f),
                    PathNode.CurveTo(169.37259f, 84.0f, 164.0f, 78.62742f, 164.0f, 72.0f),
                    PathNode.CurveTo(164.0f, 65.37258f, 169.37259f, 60.0f, 176.0f, 60.0f),
                    PathNode.CurveTo(182.62741f, 60.0f, 188.0f, 65.37258f, 188.0f, 72.0f),
                    PathNode.CurveTo(188.0f, 78.62742f, 182.62741f, 84.0f, 176.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _numpad!!
    }

private var _numpad: ImageVector? = null
