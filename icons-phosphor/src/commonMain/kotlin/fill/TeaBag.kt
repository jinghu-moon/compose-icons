package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorFillIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 136.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.LineTo(131.47f, 72.0f),
                    PathNode.CurveTo(137.08594f, 72.018135f, 142.28606f, 74.963104f, 145.19f, 79.77f),
                    PathNode.LineTo(165.72f, 114.0f),
                    PathNode.CurveTo(167.21057f, 116.4902f, 167.99849f, 119.337776f, 168.0f, 122.24f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 224.83656f, 160.83656f, 232.0f, 152.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 122.22f),
                    PathNode.CurveTo(40.00512f, 119.32457f, 40.792908f, 116.484375f, 42.28f, 114.0f),
                    PathNode.LineTo(62.81f, 79.77f),
                    PathNode.CurveTo(65.713936f, 74.963104f, 70.91406f, 72.018135f, 76.53f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 140.41827f, 99.58172f, 144.0f, 104.0f, 144.0f),
                    PathNode.CurveTo(108.41828f, 144.0f, 112.0f, 140.41827f, 112.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.CurveTo(215.16344f, 160.0f, 208.0f, 152.83656f, 208.0f, 144.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 33.072056f, 182.92795f, 8.0f, 152.0f, 8.0f),
                    PathNode.CurveTo(121.07206f, 8.0f, 96.0f, 33.072056f, 96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.LineTo(112.0f, 64.0f),
                    PathNode.CurveTo(112.0f, 41.90861f, 129.90862f, 24.0f, 152.0f, 24.0f),
                    PathNode.CurveTo(174.09138f, 24.0f, 192.0f, 41.90861f, 192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.CurveTo(192.0f, 161.67311f, 206.32689f, 176.0f, 224.0f, 176.0f),
                    PathNode.CurveTo(228.41827f, 176.0f, 232.0f, 172.41827f, 232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 163.58173f, 228.41827f, 160.0f, 224.0f, 160.0f),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
