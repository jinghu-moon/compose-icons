package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorRegularIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.4f, 114.49f),
                    PathNode.LineTo(88.32f, 26.35f),
                    PathNode.CurveTo(83.37354f, 23.32106f, 77.17521f, 23.206276f, 72.12f, 26.05f),
                    PathNode.CurveTo(67.113335f, 28.849327f, 64.00836f, 34.1339f, 64.0f, 39.87f),
                    PathNode.LineTo(64.0f, 216.13f),
                    PathNode.CurveTo(64.03858f, 224.92953f, 71.20045f, 232.0332f, 80.0f, 232.0f),
                    PathNode.CurveTo(82.94952f, 231.99872f, 85.841805f, 231.1857f, 88.36f, 229.65f),
                    PathNode.LineTo(232.4f, 141.51f),
                    PathNode.CurveTo(237.10855f, 138.64009f, 239.98163f, 133.52425f, 239.98163f, 128.01f),
                    PathNode.CurveTo(239.98163f, 122.49576f, 237.10855f, 117.379906f, 232.4f, 114.51f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 215.94f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.LineTo(223.83f, 128.0f),
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
        return _play!!
    }

private var _play: ImageVector? = null
