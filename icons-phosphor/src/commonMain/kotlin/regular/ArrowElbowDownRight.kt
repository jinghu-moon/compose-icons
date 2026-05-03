package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorRegularIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.66f, 181.66f),
                    PathNode.LineTo(173.66f, 229.66f),
                    PathNode.CurveTo(170.53407f, 232.78593f, 165.46593f, 232.78593f, 162.34f, 229.66f),
                    PathNode.CurveTo(159.21407f, 226.53407f, 159.21407f, 221.46593f, 162.34f, 218.34f),
                    PathNode.LineTo(196.69f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(64.0f, 27.581722f, 67.58172f, 24.0f, 72.0f, 24.0f),
                    PathNode.CurveTo(76.41828f, 24.0f, 80.0f, 27.581722f, 80.0f, 32.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(196.69f, 168.0f),
                    PathNode.LineTo(162.34f, 133.66f),
                    PathNode.CurveTo(159.21407f, 130.53407f, 159.21407f, 125.465935f, 162.34f, 122.34f),
                    PathNode.CurveTo(165.46593f, 119.214066f, 170.53407f, 119.214066f, 173.66f, 122.34f),
                    PathNode.LineTo(221.66f, 170.34f),
                    PathNode.CurveTo(223.16223f, 171.84055f, 224.00629f, 173.87672f, 224.00629f, 176.0f),
                    PathNode.CurveTo(224.00629f, 178.12328f, 223.16223f, 180.15945f, 221.66f, 181.66f),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
