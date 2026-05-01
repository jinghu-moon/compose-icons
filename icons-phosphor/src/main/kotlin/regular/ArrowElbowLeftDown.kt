package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowLeftDown: ImageVector
    get() {
        if (_arrowElbowLeftDown != null) return _arrowElbowLeftDown!!
        _arrowElbowLeftDown = phosphorRegularIcon(
            name = "ArrowElbowLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 72.0f),
                    PathNode.CurveTo(240.0f, 76.41828f, 236.41827f, 80.0f, 232.0f, 80.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(96.0f, 196.69f),
                    PathNode.LineTo(130.34f, 162.34f),
                    PathNode.CurveTo(133.46593f, 159.21407f, 138.53407f, 159.21407f, 141.66f, 162.34f),
                    PathNode.CurveTo(144.78593f, 165.46593f, 144.78593f, 170.53407f, 141.66f, 173.66f),
                    PathNode.LineTo(93.66f, 221.66f),
                    PathNode.CurveTo(92.159454f, 223.16223f, 90.123276f, 224.00629f, 88.0f, 224.00629f),
                    PathNode.CurveTo(85.876724f, 224.00629f, 83.840546f, 223.16223f, 82.34f, 221.66f),
                    PathNode.LineTo(34.34f, 173.66f),
                    PathNode.CurveTo(31.214067f, 170.53407f, 31.21407f, 165.46593f, 34.34f, 162.34f),
                    PathNode.CurveTo(37.46593f, 159.21407f, 42.53407f, 159.21407f, 45.66f, 162.34f),
                    PathNode.LineTo(80.0f, 196.69f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 67.58172f, 83.58172f, 64.0f, 88.0f, 64.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(236.41827f, 64.0f, 240.0f, 67.58172f, 240.0f, 72.0f),
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
        return _arrowElbowLeftDown!!
    }

private var _arrowElbowLeftDown: ImageVector? = null
