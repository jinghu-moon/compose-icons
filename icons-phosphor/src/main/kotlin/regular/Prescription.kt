package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorRegularIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(183.31f, 188.0f),
                    PathNode.LineTo(205.66f, 165.66f),
                    PathNode.CurveTo(208.78593f, 162.53407f, 208.78593f, 157.46593f, 205.66f, 154.34f),
                    PathNode.CurveTo(202.53407f, 151.21407f, 197.46593f, 151.21407f, 194.34f, 154.34f),
                    PathNode.LineTo(172.0f, 176.69f),
                    PathNode.LineTo(130.85f, 135.53f),
                    PathNode.CurveTo(157.94116f, 131.86327f, 177.56691f, 107.84534f, 175.76204f, 80.56681f),
                    PathNode.CurveTo(173.95718f, 53.288277f, 151.33812f, 32.065456f, 124.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(67.58172f, 32.0f, 64.0f, 35.581722f, 64.0f, 40.0f),
                    PathNode.LineTo(64.0f, 192.0f),
                    PathNode.CurveTo(64.0f, 196.41827f, 67.58172f, 200.0f, 72.0f, 200.0f),
                    PathNode.CurveTo(76.41828f, 200.0f, 80.0f, 196.41827f, 80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(108.69f, 136.0f),
                    PathNode.LineTo(160.69f, 188.0f),
                    PathNode.LineTo(138.34f, 210.34f),
                    PathNode.CurveTo(135.21407f, 213.46593f, 135.21407f, 218.53407f, 138.34f, 221.66f),
                    PathNode.CurveTo(141.46593f, 224.78593f, 146.53407f, 224.78593f, 149.66f, 221.66f),
                    PathNode.LineTo(172.0f, 199.31f),
                    PathNode.LineTo(194.34f, 221.66f),
                    PathNode.CurveTo(197.46593f, 224.78593f, 202.53407f, 224.78593f, 205.66f, 221.66f),
                    PathNode.CurveTo(208.78593f, 218.53407f, 208.78593f, 213.46593f, 205.66f, 210.34f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 48.0f),
                    PathNode.LineTo(124.0f, 48.0f),
                    PathNode.CurveTo(143.88223f, 48.0f, 160.0f, 64.11775f, 160.0f, 84.0f),
                    PathNode.CurveTo(160.0f, 103.88225f, 143.88223f, 120.0f, 124.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
