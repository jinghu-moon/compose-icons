package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorFillIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 196.41827f, 132.41827f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(75.58172f, 120.0f, 72.0f, 116.41828f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 107.58172f, 75.58172f, 104.0f, 80.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(180.41827f, 104.0f, 184.0f, 107.58172f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 88.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.CurveTo(75.58172f, 88.0f, 72.0f, 84.41828f, 72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 75.58172f, 75.58172f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(180.41827f, 72.0f, 184.0f, 75.58172f, 184.0f, 80.0f),
                    PathNode.CurveTo(184.0f, 84.41828f, 180.41827f, 88.0f, 176.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
