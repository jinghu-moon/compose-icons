package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorFillIcon(
            name = "CurrencyInr",
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
                    PathNode.MoveTo(166.32f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(180.41827f, 96.0f, 184.0f, 99.58172f, 184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 108.41828f, 180.41827f, 112.0f, 176.0f, 112.0f),
                    PathNode.LineTo(167.81f, 112.0f),
                    PathNode.CurveTo(165.7149f, 134.63995f, 146.73665f, 151.96773f, 124.0f, 152.0f),
                    PathNode.LineTo(111.32f, 152.0f),
                    PathNode.LineTo(164.91f, 193.69f),
                    PathNode.CurveTo(167.27795f, 195.40508f, 168.52165f, 198.27536f, 168.15367f, 201.17592f),
                    PathNode.CurveTo(167.78569f, 204.07648f, 165.86465f, 206.54527f, 163.14343f, 207.61472f),
                    PathNode.CurveTo(160.42224f, 208.68416f, 157.33437f, 208.1839f, 155.09f, 206.31f),
                    PathNode.LineTo(83.09f, 150.31f),
                    PathNode.CurveTo(80.39659f, 148.21089f, 79.3325f, 144.63358f, 80.44074f, 141.40364f),
                    PathNode.CurveTo(81.54899f, 138.1737f, 84.58522f, 136.0033f, 88.0f, 136.0f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.CurveTo(137.91772f, 135.9986f, 149.72176f, 125.77497f, 151.71f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.CurveTo(83.58172f, 112.0f, 80.0f, 108.41828f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 99.58172f, 83.58172f, 96.0f, 88.0f, 96.0f),
                    PathNode.LineTo(149.29f, 96.0f),
                    PathNode.CurveTo(144.65623f, 86.23116f, 134.81212f, 80.003174f, 124.0f, 80.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.CurveTo(83.58172f, 80.0f, 80.0f, 76.41828f, 80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 67.58172f, 83.58172f, 64.0f, 88.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(180.41827f, 64.0f, 184.0f, 67.58172f, 184.0f, 72.0f),
                    PathNode.CurveTo(184.0f, 76.41828f, 180.41827f, 80.0f, 176.0f, 80.0f),
                    PathNode.LineTo(157.92f, 80.0f),
                    PathNode.CurveTo(161.80002f, 84.69261f, 164.6607f, 90.14152f, 166.32f, 96.0f),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
