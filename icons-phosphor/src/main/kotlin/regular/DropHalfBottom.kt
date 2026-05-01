package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorRegularIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 47.75f),
                    PathNode.CurveTo(161.6478f, 33.484356f, 147.74547f, 20.638535f, 132.55f, 9.45f),
                    PathNode.CurveTo(129.79443f, 7.519659f, 126.12557f, 7.519659f, 123.37f, 9.45f),
                    PathNode.CurveTo(108.202515f, 20.643194f, 94.327194f, 33.48885f, 82.0f, 47.75f),
                    PathNode.CurveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 192.60106f, 79.39894f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(176.60106f, 232.0f, 216.0f, 192.60106f, 216.0f, 144.0f),
                    PathNode.CurveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f),
                    PathNode.Close,
                    PathNode.MoveTo(187.83f, 184.0f),
                    PathNode.LineTo(68.17f, 184.0f),
                    PathNode.CurveTo(64.84859f, 179.01996f, 62.161182f, 173.64516f, 60.17f, 168.0f),
                    PathNode.LineTo(195.87f, 168.0f),
                    PathNode.CurveTo(193.86623f, 173.64711f, 191.16534f, 179.022f, 187.83f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.CurveTo(199.9983f, 146.67323f, 199.84473f, 149.3442f, 199.54f, 152.0f),
                    PathNode.LineTo(56.46f, 152.0f),
                    PathNode.CurveTo(56.15527f, 149.3442f, 56.001686f, 146.67323f, 56.0f, 144.0f),
                    PathNode.QuadTo(56.0f, 140.0f, 56.36f, 136.0f),
                    PathNode.LineTo(199.64f, 136.0f),
                    PathNode.QuadTo(200.0f, 140.0f, 200.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(142.16f, 37.1f, 184.86f, 73.74f, 196.84f, 120.0f),
                    PathNode.LineTo(59.16f, 120.0f),
                    PathNode.CurveTo(71.14f, 73.76f, 113.84f, 37.12f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.81f, 200.0f),
                    PathNode.LineTo(173.19f, 200.0f),
                    PathNode.CurveTo(146.83954f, 221.33209f, 109.16046f, 221.33209f, 82.81f, 200.0f),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
