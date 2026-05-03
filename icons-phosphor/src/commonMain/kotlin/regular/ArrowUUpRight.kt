package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorRegularIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.34f, 130.34f),
                    PathNode.LineTo(204.69f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.CurveTo(61.490334f, 96.0f, 40.0f, 117.49033f, 40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 170.50967f, 61.490334f, 192.0f, 88.0f, 192.0f),
                    PathNode.LineTo(176.0f, 192.0f),
                    PathNode.CurveTo(180.41827f, 192.0f, 184.0f, 195.58173f, 184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 204.41827f, 180.41827f, 208.0f, 176.0f, 208.0f),
                    PathNode.LineTo(88.0f, 208.0f),
                    PathNode.CurveTo(52.653774f, 208.0f, 24.0f, 179.34622f, 24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 108.65378f, 52.653774f, 80.0f, 88.0f, 80.0f),
                    PathNode.LineTo(204.69f, 80.0f),
                    PathNode.LineTo(170.34f, 45.66f),
                    PathNode.CurveTo(167.21407f, 42.53407f, 167.21407f, 37.46593f, 170.34f, 34.34f),
                    PathNode.CurveTo(173.46593f, 31.21407f, 178.53407f, 31.214067f, 181.66f, 34.34f),
                    PathNode.LineTo(229.66f, 82.34f),
                    PathNode.CurveTo(231.16223f, 83.840546f, 232.00629f, 85.876724f, 232.00629f, 88.0f),
                    PathNode.CurveTo(232.00629f, 90.123276f, 231.16223f, 92.159454f, 229.66f, 93.66f),
                    PathNode.LineTo(181.66f, 141.66f),
                    PathNode.CurveTo(178.53407f, 144.78593f, 173.46593f, 144.78593f, 170.34f, 141.66f),
                    PathNode.CurveTo(167.21407f, 138.53407f, 167.21407f, 133.46593f, 170.34f, 130.34f),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
