package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorBoldIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 116.0f),
                    PathNode.LineTo(204.0f, 116.0f),
                    PathNode.LineTo(204.0f, 46.0f),
                    PathNode.CurveTo(204.0f, 39.37258f, 198.62741f, 34.0f, 192.0f, 34.0f),
                    PathNode.CurveTo(185.37259f, 34.0f, 180.0f, 39.37258f, 180.0f, 46.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.LineTo(133.86f, 116.0f),
                    PathNode.LineTo(73.46f, 38.62f),
                    PathNode.CurveTo(70.30854f, 34.58196f, 64.94139f, 32.98948f, 60.097565f, 34.65525f),
                    PathNode.CurveTo(55.25374f, 36.32102f, 52.00127f, 40.87775f, 52.0f, 46.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(33.37258f, 116.0f, 28.0f, 121.37258f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 134.62741f, 33.37258f, 140.0f, 40.0f, 140.0f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.LineTo(52.0f, 210.0f),
                    PathNode.CurveTo(52.0f, 216.62741f, 57.37258f, 222.0f, 64.0f, 222.0f),
                    PathNode.CurveTo(70.62742f, 222.0f, 76.0f, 216.62741f, 76.0f, 210.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.LineTo(122.14f, 140.0f),
                    PathNode.LineTo(182.54f, 217.38f),
                    PathNode.CurveTo(185.69145f, 221.41805f, 191.05861f, 223.01053f, 195.90244f, 221.34476f),
                    PathNode.CurveTo(200.74626f, 219.67899f, 203.99873f, 215.12225f, 204.0f, 210.0f),
                    PathNode.LineTo(204.0f, 140.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.CurveTo(222.62741f, 140.0f, 228.0f, 134.62741f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 121.37258f, 222.62741f, 116.0f, 216.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 116.0f),
                    PathNode.LineTo(76.0f, 80.88f),
                    PathNode.LineTo(103.41f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 175.12f),
                    PathNode.LineTo(152.59f, 140.0f),
                    PathNode.LineTo(180.0f, 140.0f),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
