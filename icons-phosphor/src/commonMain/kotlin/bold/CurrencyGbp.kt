package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorBoldIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 208.0f),
                    PathNode.CurveTo(196.0f, 214.62741f, 190.62741f, 220.0f, 184.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(49.37258f, 220.0f, 44.0f, 214.62741f, 44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 201.37259f, 49.37258f, 196.0f, 56.0f, 196.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.CurveTo(73.25484f, 196.0f, 84.0f, 185.25484f, 84.0f, 172.0f),
                    PathNode.LineTo(84.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(49.37258f, 140.0f, 44.0f, 134.62741f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 121.37258f, 49.37258f, 116.0f, 56.0f, 116.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.CurveTo(83.99731f, 62.32148f, 96.50694f, 42.588795f, 116.11465f, 33.34238f),
                    PathNode.CurveTo(135.72235f, 24.095968f, 158.9054f, 26.997042f, 175.63f, 40.79f),
                    PathNode.CurveTo(180.7414f, 45.009457f, 181.46446f, 52.573605f, 177.245f, 57.685f),
                    PathNode.CurveTo(173.02554f, 62.796394f, 165.4614f, 63.519455f, 160.35f, 59.3f),
                    PathNode.CurveTo(154.63336f, 54.554222f, 147.42976f, 51.97013f, 140.0f, 52.0f),
                    PathNode.CurveTo(122.32689f, 52.0f, 108.0f, 66.32689f, 108.0f, 84.0f),
                    PathNode.LineTo(108.0f, 116.0f),
                    PathNode.LineTo(136.0f, 116.0f),
                    PathNode.CurveTo(142.62741f, 116.0f, 148.0f, 121.37258f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 134.62741f, 142.62741f, 140.0f, 136.0f, 140.0f),
                    PathNode.LineTo(108.0f, 140.0f),
                    PathNode.LineTo(108.0f, 172.0f),
                    PathNode.CurveTo(108.0095f, 180.42822f, 105.78756f, 188.70872f, 101.56f, 196.0f),
                    PathNode.LineTo(184.0f, 196.0f),
                    PathNode.CurveTo(190.62741f, 196.0f, 196.0f, 201.37259f, 196.0f, 208.0f),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
