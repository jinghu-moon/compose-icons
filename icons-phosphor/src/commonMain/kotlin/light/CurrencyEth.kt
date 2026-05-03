package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorLightIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.72f, 124.29f),
                    PathNode.LineTo(132.72f, 12.29f),
                    PathNode.CurveTo(131.58257f, 10.840682f, 129.84235f, 9.994267f, 128.0f, 9.994267f),
                    PathNode.CurveTo(126.157646f, 9.994267f, 124.41743f, 10.840682f, 123.28f, 12.29f),
                    PathNode.LineTo(35.28f, 124.29f),
                    PathNode.CurveTo(33.56733f, 126.46684f, 33.56733f, 129.53316f, 35.28f, 131.71f),
                    PathNode.LineTo(123.28f, 243.71f),
                    PathNode.CurveTo(124.41743f, 245.15932f, 126.157646f, 246.00574f, 128.0f, 246.00574f),
                    PathNode.CurveTo(129.84235f, 246.00574f, 131.58257f, 245.15932f, 132.72f, 243.71f),
                    PathNode.LineTo(220.72f, 131.71f),
                    PathNode.CurveTo(222.43268f, 129.53316f, 222.43268f, 126.46684f, 220.72f, 124.29f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 33.35f),
                    PathNode.LineTo(206.56f, 125.7f),
                    PathNode.LineTo(134.0f, 158.7f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 158.68f),
                    PathNode.LineTo(49.44f, 125.68f),
                    PathNode.LineTo(122.0f, 33.35f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 171.86f),
                    PathNode.LineTo(122.0f, 222.65f),
                    PathNode.LineTo(59.92f, 143.65f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 171.86f),
                    PathNode.LineTo(196.08f, 143.65f),
                    PathNode.LineTo(134.0f, 222.65f),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
