package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorDuotoneIcon(
            name = "PlayCircle",
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
                    PathNode.MoveTo(108.0f, 168.0f),
                    PathNode.LineTo(108.0f, 88.0f),
                    PathNode.LineTo(172.0f, 128.0f),
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
                    PathNode.Close,
                    PathNode.MoveTo(176.24f, 121.22f),
                    PathNode.LineTo(112.24f, 81.22f),
                    PathNode.CurveTo(109.77445f, 79.67903f, 106.66696f, 79.597046f, 104.1236f, 81.005875f),
                    PathNode.CurveTo(101.58023f, 82.414696f, 100.00145f, 85.09251f, 100.0f, 88.0f),
                    PathNode.LineTo(100.0f, 168.0f),
                    PathNode.CurveTo(100.00145f, 170.90749f, 101.58023f, 173.5853f, 104.1236f, 174.99413f),
                    PathNode.CurveTo(106.66696f, 176.40295f, 109.77445f, 176.32097f, 112.24f, 174.78f),
                    PathNode.LineTo(176.24f, 134.78f),
                    PathNode.CurveTo(178.57541f, 133.31732f, 179.99364f, 130.75565f, 179.99364f, 128.0f),
                    PathNode.CurveTo(179.99364f, 125.244354f, 178.57541f, 122.682686f, 176.24f, 121.22f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 153.57f),
                    PathNode.LineTo(116.0f, 102.43f),
                    PathNode.LineTo(156.91f, 128.0f),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
