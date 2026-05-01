package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorRegularIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.48f, 115.7f),
                    PathNode.CurveTo(191.40703f, 103.256584f, 195.4833f, 84.210205f, 188.7816f, 67.56588f),
                    PathNode.CurveTo(182.0799f, 50.921547f, 165.94287f, 40.013897f, 148.0f, 40.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.CurveTo(75.58172f, 40.0f, 72.0f, 43.581722f, 72.0f, 48.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.CurveTo(72.0f, 204.41827f, 75.58172f, 208.0f, 80.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(182.87694f, 208.0f, 202.5747f, 191.85512f, 207.06592f, 169.42339f),
                    PathNode.CurveTo(211.55713f, 146.99164f, 199.5935f, 124.507614f, 178.48f, 115.7f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 56.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(163.46397f, 56.0f, 176.0f, 68.536026f, 176.0f, 84.0f),
                    PathNode.CurveTo(176.0f, 99.463974f, 163.46397f, 112.0f, 148.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(177.67311f, 128.0f, 192.0f, 142.32689f, 192.0f, 160.0f),
                    PathNode.CurveTo(192.0f, 177.67311f, 177.67311f, 192.0f, 160.0f, 192.0f),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
