package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorFillIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.66f, 117.66f),
                    PathNode.LineTo(157.66f, 197.66f),
                    PathNode.CurveTo(155.3719f, 199.95064f, 151.92874f, 200.63632f, 148.93768f, 199.39697f),
                    PathNode.CurveTo(145.94662f, 198.15764f, 143.99745f, 195.23764f, 144.0f, 192.0f),
                    PathNode.LineTo(144.0f, 152.23f),
                    PathNode.CurveTo(86.9f, 155.47f, 47.75f, 192.5f, 36.76f, 204.23f),
                    PathNode.LineTo(36.76f, 204.23f),
                    PathNode.CurveTo(33.220486f, 208.01006f, 27.65537f, 209.09311f, 22.956568f, 206.91638f),
                    PathNode.CurveTo(18.257767f, 204.73967f, 15.485348f, 199.79424f, 16.08f, 194.65f),
                    PathNode.CurveTo(19.79f, 162.39f, 37.46f, 131.36f, 65.84f, 107.28f),
                    PathNode.CurveTo(89.41f, 87.28f, 118.06f, 74.59f, 144.0f, 72.37f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(143.99745f, 28.762346f, 145.94662f, 25.842361f, 148.93768f, 24.60302f),
                    PathNode.CurveTo(151.92874f, 23.36368f, 155.3719f, 24.049358f, 157.66f, 26.34f),
                    PathNode.LineTo(237.66f, 106.34f),
                    PathNode.CurveTo(239.16223f, 107.840546f, 240.00629f, 109.876724f, 240.00629f, 112.0f),
                    PathNode.CurveTo(240.00629f, 114.123276f, 239.16223f, 116.159454f, 237.66f, 117.66f),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
