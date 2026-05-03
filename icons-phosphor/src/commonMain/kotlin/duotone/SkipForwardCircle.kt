package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorDuotoneIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(74.98067f, 32.0f, 32.0f, 74.98067f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 181.01933f, 74.98067f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(181.01933f, 224.0f, 224.0f, 181.01933f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 74.98067f, 181.01933f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 88.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.CurveTo(155.58173f, 80.0f, 152.0f, 83.58172f, 152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 113.57f),
                    PathNode.LineTo(100.24f, 81.22f),
                    PathNode.CurveTo(97.77445f, 79.67903f, 94.66696f, 79.597046f, 92.1236f, 81.005875f),
                    PathNode.CurveTo(89.58023f, 82.414696f, 88.00145f, 85.09251f, 88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(88.00145f, 170.90749f, 89.58023f, 173.5853f, 92.1236f, 174.99413f),
                    PathNode.CurveTo(94.66696f, 176.40295f, 97.77445f, 176.32097f, 100.24f, 174.78f),
                    PathNode.LineTo(152.0f, 142.43f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 172.41827f, 155.58173f, 176.0f, 160.0f, 176.0f),
                    PathNode.CurveTo(164.41827f, 176.0f, 168.0f, 172.41827f, 168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(168.0f, 83.58172f, 164.41827f, 80.0f, 160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 153.57f),
                    PathNode.LineTo(104.0f, 102.43f),
                    PathNode.LineTo(144.91f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
