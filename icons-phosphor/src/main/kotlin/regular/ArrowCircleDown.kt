package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowCircleDown: ImageVector
    get() {
        if (_arrowCircleDown != null) return _arrowCircleDown!!
        _arrowCircleDown = phosphorRegularIcon(
            name = "ArrowCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
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
                    PathNode.MoveTo(165.66f, 130.34f),
                    PathNode.CurveTo(167.16223f, 131.84055f, 168.00629f, 133.87672f, 168.00629f, 136.0f),
                    PathNode.CurveTo(168.00629f, 138.12328f, 167.16223f, 140.15945f, 165.66f, 141.66f),
                    PathNode.LineTo(133.66f, 173.66f),
                    PathNode.CurveTo(132.15945f, 175.16223f, 130.12328f, 176.00629f, 128.0f, 176.00629f),
                    PathNode.CurveTo(125.876724f, 176.00629f, 123.840546f, 175.16223f, 122.34f, 173.66f),
                    PathNode.LineTo(90.34f, 141.66f),
                    PathNode.CurveTo(87.214066f, 138.53407f, 87.214066f, 133.46593f, 90.34f, 130.34f),
                    PathNode.CurveTo(93.465935f, 127.214066f, 98.534065f, 127.214066f, 101.66f, 130.34f),
                    PathNode.LineTo(120.0f, 148.69f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 148.69f),
                    PathNode.LineTo(154.34f, 130.34f),
                    PathNode.CurveTo(155.84055f, 128.83778f, 157.87672f, 127.993706f, 160.0f, 127.993706f),
                    PathNode.CurveTo(162.12328f, 127.993706f, 164.15945f, 128.83778f, 165.66f, 130.34f),
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
        return _arrowCircleDown!!
    }

private var _arrowCircleDown: ImageVector? = null
