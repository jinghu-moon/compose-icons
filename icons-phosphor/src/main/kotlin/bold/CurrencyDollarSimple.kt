package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyDollarSimple: ImageVector
    get() {
        if (_currencyDollarSimple != null) return _currencyDollarSimple!!
        _currencyDollarSimple = phosphorBoldIcon(
            name = "CurrencyDollarSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 168.0f),
                    PathNode.CurveTo(203.96693f, 196.7051f, 180.7051f, 219.96693f, 152.0f, 220.0f),
                    PathNode.LineTo(140.0f, 220.0f),
                    PathNode.LineTo(140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 238.62741f, 134.62741f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(121.37258f, 244.0f, 116.0f, 238.62741f, 116.0f, 232.0f),
                    PathNode.LineTo(116.0f, 220.0f),
                    PathNode.LineTo(104.0f, 220.0f),
                    PathNode.CurveTo(75.2949f, 219.96693f, 52.033066f, 196.7051f, 52.0f, 168.0f),
                    PathNode.CurveTo(52.0f, 161.37259f, 57.37258f, 156.0f, 64.0f, 156.0f),
                    PathNode.CurveTo(70.62742f, 156.0f, 76.0f, 161.37259f, 76.0f, 168.0f),
                    PathNode.CurveTo(76.0f, 183.46397f, 88.536026f, 196.0f, 104.0f, 196.0f),
                    PathNode.LineTo(152.0f, 196.0f),
                    PathNode.CurveTo(167.46397f, 196.0f, 180.0f, 183.46397f, 180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 152.53603f, 167.46397f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(112.0f, 140.0f),
                    PathNode.CurveTo(83.2812f, 140.0f, 60.0f, 116.7188f, 60.0f, 88.0f),
                    PathNode.CurveTo(60.0f, 59.281193f, 83.2812f, 36.0f, 112.0f, 36.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(116.0f, 24.0f),
                    PathNode.CurveTo(116.0f, 17.372583f, 121.37258f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(134.62741f, 12.0f, 140.0f, 17.372583f, 140.0f, 24.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(144.0f, 36.0f),
                    PathNode.CurveTo(172.7051f, 36.033066f, 195.96693f, 59.2949f, 196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 94.62742f, 190.62741f, 100.0f, 184.0f, 100.0f),
                    PathNode.CurveTo(177.37259f, 100.0f, 172.0f, 94.62742f, 172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 72.536026f, 159.46397f, 60.0f, 144.0f, 60.0f),
                    PathNode.LineTo(112.0f, 60.0f),
                    PathNode.CurveTo(96.536026f, 60.0f, 84.0f, 72.536026f, 84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 103.463974f, 96.536026f, 116.0f, 112.0f, 116.0f),
                    PathNode.LineTo(152.0f, 116.0f),
                    PathNode.CurveTo(180.7051f, 116.033066f, 203.96693f, 139.2949f, 204.0f, 168.0f),
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
        return _currencyDollarSimple!!
    }

private var _currencyDollarSimple: ImageVector? = null
