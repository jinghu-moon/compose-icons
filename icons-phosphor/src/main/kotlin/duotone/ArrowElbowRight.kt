package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorDuotoneIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.LineTo(160.0f, 80.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(156.76236f, 71.99745f, 153.84236f, 73.94662f, 152.60303f, 76.937675f),
                    PathNode.CurveTo(151.36368f, 79.92874f, 152.04936f, 83.37191f, 154.34f, 85.66f),
                    PathNode.LineTo(184.69f, 116.0f),
                    PathNode.LineTo(120.0f, 180.69f),
                    PathNode.LineTo(29.66f, 90.34f),
                    PathNode.CurveTo(26.53407f, 87.214066f, 21.46593f, 87.214066f, 18.34f, 90.34f),
                    PathNode.CurveTo(15.214068f, 93.465935f, 15.214068f, 98.534065f, 18.34f, 101.66f),
                    PathNode.LineTo(114.34f, 197.66f),
                    PathNode.CurveTo(115.840546f, 199.16223f, 117.876724f, 200.00629f, 120.0f, 200.00629f),
                    PathNode.CurveTo(122.123276f, 200.00629f, 124.159454f, 199.16223f, 125.66f, 197.66f),
                    PathNode.LineTo(196.0f, 127.31f),
                    PathNode.LineTo(226.34f, 157.66f),
                    PathNode.CurveTo(228.6281f, 159.95064f, 232.07126f, 160.63632f, 235.06232f, 159.39697f),
                    PathNode.CurveTo(238.05338f, 158.15764f, 240.00255f, 155.23764f, 240.0f, 152.0f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 75.58172f, 236.41827f, 72.0f, 232.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 132.69f),
                    PathNode.LineTo(179.31f, 88.0f),
                    PathNode.LineTo(224.0f, 88.0f),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
