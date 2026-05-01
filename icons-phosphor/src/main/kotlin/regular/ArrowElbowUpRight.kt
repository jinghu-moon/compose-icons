package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorRegularIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 85.66f),
                    PathNode.LineTo(173.66f, 133.66f),
                    PathNode.CurveTo(170.53407f, 136.78593f, 165.46593f, 136.78593f, 162.34f, 133.66f),
                    PathNode.CurveTo(159.21407f, 130.53407f, 159.21407f, 125.465935f, 162.34f, 122.34f),
                    PathNode.LineTo(196.69f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(80.0f, 228.41827f, 76.41828f, 232.0f, 72.0f, 232.0f),
                    PathNode.CurveTo(67.58172f, 232.0f, 64.0f, 228.41827f, 64.0f, 224.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 67.58172f, 72.0f, 72.0f, 72.0f),
                    PathNode.LineTo(196.69f, 72.0f),
                    PathNode.LineTo(162.34f, 37.66f),
                    PathNode.CurveTo(159.21407f, 34.53407f, 159.21407f, 29.46593f, 162.34f, 26.34f),
                    PathNode.CurveTo(165.46593f, 23.21407f, 170.53407f, 23.214067f, 173.66f, 26.34f),
                    PathNode.LineTo(221.66f, 74.34f),
                    PathNode.CurveTo(223.16223f, 75.840546f, 224.00629f, 77.876724f, 224.00629f, 80.0f),
                    PathNode.CurveTo(224.00629f, 82.123276f, 223.16223f, 84.159454f, 221.66f, 85.66f),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
