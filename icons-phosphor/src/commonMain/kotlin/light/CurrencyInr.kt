package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorLightIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 80.0f),
                    PathNode.CurveTo(206.0f, 83.313705f, 203.3137f, 86.0f, 200.0f, 86.0f),
                    PathNode.LineTo(165.69f, 86.0f),
                    PathNode.CurveTo(165.89455f, 87.993484f, 165.99802f, 89.99605f, 166.0f, 92.0f),
                    PathNode.CurveTo(165.96143f, 124.016525f, 140.01653f, 149.96143f, 108.0f, 150.0f),
                    PathNode.LineTo(87.52f, 150.0f),
                    PathNode.LineTo(164.0f, 219.56f),
                    PathNode.CurveTo(166.45215f, 221.79123f, 166.63123f, 225.58786f, 164.4f, 228.04f),
                    PathNode.CurveTo(162.16876f, 230.49214f, 158.37215f, 230.67123f, 155.92f, 228.44f),
                    PathNode.LineTo(67.92f, 148.44f),
                    PathNode.CurveTo(66.07947f, 146.76723f, 65.46176f, 144.13235f, 66.36706f, 141.81586f),
                    PathNode.CurveTo(67.272354f, 139.49936f, 69.512955f, 137.98154f, 72.0f, 138.0f),
                    PathNode.LineTo(108.0f, 138.0f),
                    PathNode.CurveTo(133.39139f, 137.96695f, 153.96695f, 117.391396f, 154.0f, 92.0f),
                    PathNode.CurveTo(153.99323f, 89.99357f, 153.85963f, 87.98957f, 153.6f, 86.0f),
                    PathNode.LineTo(72.0f, 86.0f),
                    PathNode.CurveTo(68.686295f, 86.0f, 66.0f, 83.313705f, 66.0f, 80.0f),
                    PathNode.CurveTo(66.0f, 76.686295f, 68.686295f, 74.0f, 72.0f, 74.0f),
                    PathNode.LineTo(150.33f, 74.0f),
                    PathNode.CurveTo(143.0942f, 57.037086f, 126.44171f, 46.021976f, 108.0f, 46.0f),
                    PathNode.LineTo(72.0f, 46.0f),
                    PathNode.CurveTo(68.686295f, 46.0f, 66.0f, 43.31371f, 66.0f, 40.0f),
                    PathNode.CurveTo(66.0f, 36.68629f, 68.686295f, 34.0f, 72.0f, 34.0f),
                    PathNode.LineTo(200.0f, 34.0f),
                    PathNode.CurveTo(203.3137f, 34.0f, 206.0f, 36.68629f, 206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 43.31371f, 203.3137f, 46.0f, 200.0f, 46.0f),
                    PathNode.LineTo(143.27f, 46.0f),
                    PathNode.CurveTo(152.55232f, 53.126488f, 159.47292f, 62.883614f, 163.13f, 74.0f),
                    PathNode.LineTo(200.0f, 74.0f),
                    PathNode.CurveTo(203.3137f, 74.0f, 206.0f, 76.686295f, 206.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
