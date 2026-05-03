package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorBoldIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.LineTo(223.83f, 124.0f),
                    PathNode.LineTo(243.12f, 76.52f),
                    PathNode.CurveTo(245.4047f, 70.42731f, 242.41731f, 63.623848f, 236.38551f, 61.182922f),
                    PathNode.CurveTo(230.35371f, 58.741993f, 223.47552f, 61.553097f, 220.88f, 67.52f),
                    PathNode.LineTo(197.88f, 124.03f),
                    PathNode.LineTo(162.08f, 124.03f),
                    PathNode.LineTo(139.08f, 67.52f),
                    PathNode.CurveTo(137.24356f, 62.99262f, 132.84566f, 60.03061f, 127.96f, 60.03061f),
                    PathNode.CurveTo(123.07433f, 60.03061f, 118.676445f, 62.99262f, 116.84f, 67.52f),
                    PathNode.LineTo(93.92f, 124.0f),
                    PathNode.LineTo(58.08f, 124.0f),
                    PathNode.LineTo(35.08f, 67.49f),
                    PathNode.CurveTo(32.484467f, 61.523094f, 25.60629f, 58.711994f, 19.574492f, 61.15292f),
                    PathNode.CurveTo(13.54269f, 63.593845f, 10.5553f, 70.39731f, 12.84f, 76.49f),
                    PathNode.LineTo(32.17f, 124.0f),
                    PathNode.LineTo(16.0f, 124.0f),
                    PathNode.CurveTo(9.372583f, 124.0f, 4.0f, 129.37259f, 4.0f, 136.0f),
                    PathNode.CurveTo(4.0f, 142.62741f, 9.372583f, 148.0f, 16.0f, 148.0f),
                    PathNode.LineTo(41.92f, 148.0f),
                    PathNode.LineTo(64.92f, 204.52f),
                    PathNode.CurveTo(66.75645f, 209.04738f, 71.154335f, 212.0094f, 76.04f, 212.0094f),
                    PathNode.CurveTo(80.92567f, 212.0094f, 85.323555f, 209.04738f, 87.16f, 204.52f),
                    PathNode.LineTo(110.16f, 148.0f),
                    PathNode.LineTo(146.0f, 148.0f),
                    PathNode.LineTo(169.0f, 204.52f),
                    PathNode.CurveTo(170.83644f, 209.04738f, 175.23433f, 212.0094f, 180.12f, 212.0094f),
                    PathNode.CurveTo(185.00566f, 212.0094f, 189.40355f, 209.04738f, 191.24f, 204.52f),
                    PathNode.LineTo(214.24f, 148.0f),
                    PathNode.LineTo(240.0f, 148.0f),
                    PathNode.CurveTo(246.62741f, 148.0f, 252.0f, 142.62741f, 252.0f, 136.0f),
                    PathNode.CurveTo(252.0f, 129.37259f, 246.62741f, 124.0f, 240.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 168.12f),
                    PathNode.LineTo(67.83f, 148.0f),
                    PathNode.LineTo(84.17f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(119.83f, 124.0f),
                    PathNode.LineTo(128.0f, 103.89f),
                    PathNode.LineTo(136.17f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 168.12f),
                    PathNode.LineTo(171.83f, 148.0f),
                    PathNode.LineTo(188.17f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
