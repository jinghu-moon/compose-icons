package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorThinIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 28.0f),
                    PathNode.CurveTo(181.79086f, 28.0f, 180.0f, 29.790861f, 180.0f, 32.0f),
                    PathNode.LineTo(180.0f, 58.13f),
                    PathNode.CurveTo(166.45078f, 34.59225f, 138.7803f, 23.090965f, 112.5386f, 30.089535f),
                    PathNode.CurveTo(86.29689f, 37.088104f, 68.02861f, 60.84109f, 68.0f, 88.0f),
                    PathNode.LineTo(68.0f, 112.0f),
                    PathNode.CurveTo(68.02861f, 139.1589f, 86.29689f, 162.91188f, 112.5386f, 169.91046f),
                    PathNode.CurveTo(138.7803f, 176.90904f, 166.45078f, 165.40775f, 180.0f, 141.87f),
                    PathNode.LineTo(180.0f, 168.0f),
                    PathNode.CurveTo(179.96693f, 196.7051f, 156.7051f, 219.96693f, 128.0f, 220.0f),
                    PathNode.CurveTo(110.28f, 220.0f, 92.72f, 211.25f, 83.28f, 197.71f),
                    PathNode.CurveTo(82.01527f, 195.8985f, 79.5215f, 195.45526f, 77.71f, 196.72f),
                    PathNode.CurveTo(75.898506f, 197.98473f, 75.45527f, 200.4785f, 76.72f, 202.29f),
                    PathNode.CurveTo(87.61f, 217.91f, 107.74f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(161.1211f, 227.96143f, 187.96143f, 201.1211f, 188.0f, 168.0f),
                    PathNode.LineTo(188.0f, 32.0f),
                    PathNode.CurveTo(188.0f, 29.790861f, 186.20914f, 28.0f, 184.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(99.2949f, 163.96693f, 76.033066f, 140.7051f, 76.0f, 112.0f),
                    PathNode.LineTo(76.0f, 88.0f),
                    PathNode.CurveTo(76.0f, 59.281193f, 99.2812f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(156.71881f, 36.0f, 180.0f, 59.281193f, 180.0f, 88.0f),
                    PathNode.LineTo(180.0f, 112.0f),
                    PathNode.CurveTo(179.96693f, 140.7051f, 156.7051f, 163.96693f, 128.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
