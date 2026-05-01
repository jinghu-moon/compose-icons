package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorRegularIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 80.0f),
                    PathNode.LineTo(248.0f, 104.0f),
                    PathNode.CurveTo(248.0f, 108.41828f, 244.41827f, 112.0f, 240.0f, 112.0f),
                    PathNode.CurveTo(235.58173f, 112.0f, 232.0f, 108.41828f, 232.0f, 104.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.LineTo(133.55f, 88.0f),
                    PathNode.LineTo(87.49f, 210.81f),
                    PathNode.CurveTo(86.32614f, 213.94553f, 83.334564f, 216.02612f, 79.99f, 216.02612f),
                    PathNode.CurveTo(76.64544f, 216.02612f, 73.65386f, 213.94553f, 72.49f, 210.81f),
                    PathNode.LineTo(24.49f, 82.81f),
                    PathNode.CurveTo(22.93808f, 78.66786f, 25.037865f, 74.05192f, 29.18f, 72.5f),
                    PathNode.CurveTo(33.322136f, 70.94808f, 37.93808f, 73.04787f, 39.49f, 77.19f),
                    PathNode.LineTo(80.0f, 185.22f),
                    PathNode.LineTo(120.51f, 77.22f),
                    PathNode.CurveTo(121.6713f, 74.08637f, 124.65811f, 72.00478f, 128.0f, 72.0f),
                    PathNode.LineTo(240.0f, 72.0f),
                    PathNode.CurveTo(244.41827f, 72.0f, 248.0f, 75.58172f, 248.0f, 80.0f),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
