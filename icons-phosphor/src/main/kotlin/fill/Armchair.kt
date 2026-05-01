package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorFillIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 132.0f),
                    PathNode.CurveTo(239.9986f, 145.91772f, 229.77498f, 157.72176f, 216.0f, 159.71f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(47.163445f, 216.0f, 40.0f, 208.83656f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 159.71f),
                    PathNode.CurveTo(25.208883f, 157.57509f, 14.701363f, 144.20067f, 16.12785f, 129.32451f),
                    PathNode.CurveTo(17.554337f, 114.44834f, 30.411983f, 103.31442f, 45.339275f, 104.02923f),
                    PathNode.CurveTo(60.266567f, 104.74404f, 72.0015f, 117.0556f, 72.0f, 132.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 172.41827f, 75.58172f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(84.41828f, 176.0f, 88.0f, 172.41827f, 88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 171.58173f, 176.0f, 176.0f, 176.0f),
                    PathNode.CurveTo(180.41827f, 176.0f, 184.0f, 172.41827f, 184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 132.0f),
                    PathNode.CurveTo(184.0f, 116.536026f, 196.53603f, 104.0f, 212.0f, 104.0f),
                    PathNode.CurveTo(227.46397f, 104.0f, 240.0f, 116.536026f, 240.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 88.0f),
                    PathNode.CurveTo(66.73666f, 88.03228f, 85.714905f, 105.360054f, 87.81f, 128.0f),
                    PathNode.LineTo(168.19f, 128.0f),
                    PathNode.CurveTo(170.2851f, 105.360054f, 189.26335f, 88.03228f, 212.0f, 88.0f),
                    PathNode.CurveTo(214.20914f, 88.0f, 216.0f, 86.20914f, 216.0f, 84.0f),
                    PathNode.LineTo(216.0f, 72.0f),
                    PathNode.CurveTo(216.0f, 49.90861f, 198.09138f, 32.0f, 176.0f, 32.0f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.CurveTo(57.90861f, 32.0f, 40.0f, 49.90861f, 40.0f, 72.0f),
                    PathNode.LineTo(40.0f, 84.0f),
                    PathNode.CurveTo(40.0f, 86.20914f, 41.79086f, 88.0f, 44.0f, 88.0f),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
