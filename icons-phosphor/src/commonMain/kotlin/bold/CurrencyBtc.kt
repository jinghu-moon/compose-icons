package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorBoldIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(185.08f, 114.46f),
                    PathNode.CurveTo(195.48265f, 101.79562f, 198.7047f, 84.69894f, 193.62544f, 69.11681f),
                    PathNode.CurveTo(188.54616f, 53.5347f, 175.86766f, 41.621086f, 160.0f, 37.52f),
                    PathNode.LineTo(160.0f, 24.0f),
                    PathNode.CurveTo(160.0f, 17.372583f, 154.62741f, 12.0f, 148.0f, 12.0f),
                    PathNode.CurveTo(141.37259f, 12.0f, 136.0f, 17.372583f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.LineTo(120.0f, 36.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 17.372583f, 114.62742f, 12.0f, 108.0f, 12.0f),
                    PathNode.CurveTo(101.37258f, 12.0f, 96.0f, 17.372583f, 96.0f, 24.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(65.37258f, 36.0f, 60.0f, 41.37258f, 60.0f, 48.0f),
                    PathNode.CurveTo(60.0f, 54.62742f, 65.37258f, 60.0f, 72.0f, 60.0f),
                    PathNode.LineTo(76.0f, 60.0f),
                    PathNode.LineTo(76.0f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.CurveTo(65.37258f, 188.0f, 60.0f, 193.37259f, 60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 206.62741f, 65.37258f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.CurveTo(96.0f, 230.62741f, 101.37258f, 236.0f, 108.0f, 236.0f),
                    PathNode.CurveTo(114.62742f, 236.0f, 120.0f, 230.62741f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 212.0f),
                    PathNode.LineTo(136.0f, 212.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 230.62741f, 141.37259f, 236.0f, 148.0f, 236.0f),
                    PathNode.CurveTo(154.62741f, 236.0f, 160.0f, 230.62741f, 160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(183.72322f, 211.98999f, 204.43222f, 195.92519f, 210.33989f, 172.94931f),
                    PathNode.CurveTo(216.24757f, 149.97343f, 205.85608f, 125.91191f, 185.08f, 114.46f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 84.0f),
                    PathNode.CurveTo(172.0f, 97.25484f, 161.25484f, 108.0f, 148.0f, 108.0f),
                    PathNode.LineTo(100.0f, 108.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.LineTo(148.0f, 60.0f),
                    PathNode.CurveTo(161.25484f, 60.0f, 172.0f, 70.74516f, 172.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 188.0f),
                    PathNode.LineTo(100.0f, 188.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.CurveTo(175.46397f, 132.0f, 188.0f, 144.53603f, 188.0f, 160.0f),
                    PathNode.CurveTo(188.0f, 175.46397f, 175.46397f, 188.0f, 160.0f, 188.0f),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
