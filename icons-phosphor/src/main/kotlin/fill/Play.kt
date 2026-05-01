package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorFillIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.01341f, 133.5251f, 237.1289f, 138.65268f, 232.4f, 141.51f),
                    PathNode.LineTo(88.32f, 229.65f),
                    PathNode.CurveTo(83.37354f, 232.67894f, 77.17521f, 232.79373f, 72.12f, 229.95f),
                    PathNode.CurveTo(67.113335f, 227.15067f, 64.00836f, 221.86612f, 64.0f, 216.13f),
                    PathNode.LineTo(64.0f, 39.87f),
                    PathNode.CurveTo(64.00836f, 34.1339f, 67.113335f, 28.849327f, 72.12f, 26.05f),
                    PathNode.CurveTo(77.17521f, 23.206276f, 83.37354f, 23.32106f, 88.32f, 26.35f),
                    PathNode.LineTo(232.4f, 114.49f),
                    PathNode.CurveTo(237.1289f, 117.34732f, 240.01341f, 122.4749f, 240.0f, 128.0f),
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
        return _play!!
    }

private var _play: ImageVector? = null
