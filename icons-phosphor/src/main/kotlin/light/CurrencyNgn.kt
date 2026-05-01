package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorLightIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 138.0f),
                    PathNode.LineTo(198.0f, 138.0f),
                    PathNode.LineTo(198.0f, 118.0f),
                    PathNode.LineTo(216.0f, 118.0f),
                    PathNode.CurveTo(219.3137f, 118.0f, 222.0f, 115.313705f, 222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 108.686295f, 219.3137f, 106.0f, 216.0f, 106.0f),
                    PathNode.LineTo(198.0f, 106.0f),
                    PathNode.LineTo(198.0f, 46.0f),
                    PathNode.CurveTo(198.0f, 42.68629f, 195.3137f, 40.0f, 192.0f, 40.0f),
                    PathNode.CurveTo(188.6863f, 40.0f, 186.0f, 42.68629f, 186.0f, 46.0f),
                    PathNode.LineTo(186.0f, 106.0f),
                    PathNode.LineTo(118.44f, 106.0f),
                    PathNode.LineTo(68.73f, 42.31f),
                    PathNode.CurveTo(67.154274f, 40.29098f, 64.470695f, 39.49474f, 62.048782f, 40.327625f),
                    PathNode.CurveTo(59.62687f, 41.16051f, 58.000637f, 43.438877f, 58.0f, 46.0f),
                    PathNode.LineTo(58.0f, 106.0f),
                    PathNode.LineTo(40.0f, 106.0f),
                    PathNode.CurveTo(36.68629f, 106.0f, 34.0f, 108.686295f, 34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 115.313705f, 36.68629f, 118.0f, 40.0f, 118.0f),
                    PathNode.LineTo(58.0f, 118.0f),
                    PathNode.LineTo(58.0f, 138.0f),
                    PathNode.LineTo(40.0f, 138.0f),
                    PathNode.CurveTo(36.68629f, 138.0f, 34.0f, 140.6863f, 34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 147.3137f, 36.68629f, 150.0f, 40.0f, 150.0f),
                    PathNode.LineTo(58.0f, 150.0f),
                    PathNode.LineTo(58.0f, 210.0f),
                    PathNode.CurveTo(58.0f, 213.3137f, 60.68629f, 216.0f, 64.0f, 216.0f),
                    PathNode.CurveTo(67.313705f, 216.0f, 70.0f, 213.3137f, 70.0f, 210.0f),
                    PathNode.LineTo(70.0f, 150.0f),
                    PathNode.LineTo(137.56f, 150.0f),
                    PathNode.LineTo(187.27f, 213.69f),
                    PathNode.CurveTo(188.84573f, 215.70901f, 191.52931f, 216.50526f, 193.95122f, 215.67238f),
                    PathNode.CurveTo(196.37312f, 214.8395f, 197.99936f, 212.56113f, 198.0f, 210.0f),
                    PathNode.LineTo(198.0f, 150.0f),
                    PathNode.LineTo(216.0f, 150.0f),
                    PathNode.CurveTo(219.3137f, 150.0f, 222.0f, 147.3137f, 222.0f, 144.0f),
                    PathNode.CurveTo(222.0f, 140.6863f, 219.3137f, 138.0f, 216.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 118.0f),
                    PathNode.LineTo(186.0f, 138.0f),
                    PathNode.LineTo(143.42f, 138.0f),
                    PathNode.LineTo(127.81f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 63.44f),
                    PathNode.LineTo(103.22f, 106.0f),
                    PathNode.LineTo(70.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 138.0f),
                    PathNode.LineTo(70.0f, 118.0f),
                    PathNode.LineTo(112.58f, 118.0f),
                    PathNode.LineTo(128.19f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 192.56f),
                    PathNode.LineTo(152.78f, 150.0f),
                    PathNode.LineTo(186.0f, 150.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
