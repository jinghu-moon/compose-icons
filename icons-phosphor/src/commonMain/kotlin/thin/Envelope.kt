package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorThinIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(29.790861f, 52.0f, 28.0f, 53.79086f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 53.79086f, 226.20914f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.57f),
                    PathNode.LineTo(42.28f, 60.0f),
                    PathNode.LineTo(213.72f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.63f, 128.0f),
                    PathNode.LineTo(36.0f, 190.91f),
                    PathNode.LineTo(36.0f, 65.09f),
                    PathNode.Close,
                    PathNode.MoveTo(110.55f, 133.43f),
                    PathNode.LineTo(125.3f, 147.0f),
                    PathNode.CurveTo(126.82844f, 148.3983f, 129.17157f, 148.3983f, 130.7f, 147.0f),
                    PathNode.LineTo(145.45f, 133.48f),
                    PathNode.LineTo(213.72f, 196.0f),
                    PathNode.LineTo(42.28f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.37f, 128.0f),
                    PathNode.LineTo(220.0f, 65.09f),
                    PathNode.LineTo(220.0f, 190.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _envelope!!
    }

private var _envelope: ImageVector? = null
