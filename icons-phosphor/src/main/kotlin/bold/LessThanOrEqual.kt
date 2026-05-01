package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorBoldIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 104.0f),
                    PathNode.CurveTo(35.999813f, 98.972916f, 39.1331f, 94.47854f, 43.85f, 92.74f),
                    PathNode.LineTo(195.85f, 36.74f),
                    PathNode.CurveTo(202.06873f, 34.448017f, 208.96802f, 37.631275f, 211.26f, 43.85f),
                    PathNode.CurveTo(213.55199f, 50.068726f, 210.36873f, 56.968018f, 204.15f, 59.26f),
                    PathNode.LineTo(82.71f, 104.0f),
                    PathNode.LineTo(204.15f, 148.74f),
                    PathNode.CurveTo(209.60622f, 150.75037f, 212.836f, 156.38333f, 211.81467f, 162.10773f),
                    PathNode.CurveTo(210.7933f, 167.83214f, 205.8148f, 172.0006f, 200.0f, 172.0f),
                    PathNode.CurveTo(198.58356f, 172.00334f, 197.178f, 171.75272f, 195.85f, 171.26f),
                    PathNode.LineTo(43.85f, 115.26f),
                    PathNode.CurveTo(39.1331f, 113.52146f, 35.999813f, 109.027084f, 36.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(41.37258f, 188.0f, 36.0f, 193.37259f, 36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 206.62741f, 41.37258f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 193.37259f, 206.62741f, 188.0f, 200.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
