package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorRegularIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.19f, 53.07f),
                    PathNode.LineTo(144.88f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.CurveTo(180.41827f, 128.0f, 184.0f, 131.58173f, 184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 140.41827f, 180.41827f, 144.0f, 176.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 163.58173f, 184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 172.41827f, 180.41827f, 176.0f, 176.0f, 176.0f),
                    PathNode.LineTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.CurveTo(75.58172f, 176.0f, 72.0f, 172.41827f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 163.58173f, 75.58172f, 160.0f, 80.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(75.58172f, 144.0f, 72.0f, 140.41827f, 72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 131.58173f, 75.58172f, 128.0f, 80.0f, 128.0f),
                    PathNode.LineTo(111.12f, 128.0f),
                    PathNode.LineTo(49.81f, 53.07f),
                    PathNode.CurveTo(47.00992f, 49.651356f, 47.511356f, 44.610085f, 50.93f, 41.81f),
                    PathNode.CurveTo(54.348644f, 39.00992f, 59.389915f, 39.511356f, 62.19f, 42.93f),
                    PathNode.LineTo(128.0f, 123.37f),
                    PathNode.LineTo(193.81f, 42.93f),
                    PathNode.CurveTo(196.61008f, 39.511356f, 201.65134f, 39.00992f, 205.07f, 41.81f),
                    PathNode.CurveTo(208.48865f, 44.610085f, 208.99008f, 49.651356f, 206.19f, 53.07f),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
