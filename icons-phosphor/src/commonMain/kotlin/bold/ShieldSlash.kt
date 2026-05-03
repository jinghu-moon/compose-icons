package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorBoldIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.88f, 31.93f),
                    PathNode.CurveTo(53.54547f, 28.26136f, 48.29819f, 27.020948f, 43.673935f, 28.808199f),
                    PathNode.CurveTo(39.04968f, 30.595444f, 36.00053f, 35.04238f, 36.0f, 40.0f),
                    PathNode.CurveTo(30.963882f, 43.77709f, 28.0f, 49.704853f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 166.29f, 54.32f, 199.22f, 76.4f, 217.29f),
                    PathNode.CurveTo(100.11f, 236.68f, 123.84f, 243.29f, 124.84f, 243.58f),
                    PathNode.CurveTo(126.90947f, 244.1399f, 129.09053f, 244.1399f, 131.16f, 243.58f),
                    PathNode.CurveTo(132.51f, 243.21f, 161.16f, 235.16f, 187.02f, 210.76f),
                    PathNode.LineTo(199.12f, 224.07f),
                    PathNode.CurveTo(203.5975f, 228.87978f, 211.1107f, 229.19368f, 215.9738f, 224.77417f),
                    PathNode.CurveTo(220.83693f, 220.35464f, 221.24089f, 212.84575f, 216.88f, 207.93f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 219.38f),
                    PathNode.CurveTo(114.521126f, 214.46017f, 101.9785f, 207.28088f, 90.91f, 198.15f),
                    PathNode.CurveTo(65.09f, 176.69f, 52.0f, 147.71f, 52.0f, 112.0f),
                    PathNode.LineTo(52.0f, 62.24f),
                    PathNode.LineTo(170.87f, 193.0f),
                    PathNode.CurveTo(158.49977f, 204.58727f, 143.91887f, 213.55962f, 128.0f, 219.38f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.13512f, 128.74048f, 225.35008f, 145.37633f, 219.77f, 161.16f),
                    PathNode.CurveTo(218.05222f, 165.91136f, 213.54236f, 169.07785f, 208.49f, 169.08f),
                    PathNode.CurveTo(207.0983f, 169.08124f, 205.71724f, 168.83752f, 204.41f, 168.36f),
                    PathNode.CurveTo(201.41676f, 167.27695f, 198.97649f, 165.049f, 197.62617f, 162.16644f),
                    PathNode.CurveTo(196.27585f, 159.2839f, 196.12614f, 155.98294f, 197.21f, 152.99f),
                    PathNode.CurveTo(201.83334f, 139.82384f, 204.13092f, 125.95371f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.LineTo(109.33f, 60.0f),
                    PathNode.CurveTo(102.70258f, 60.0f, 97.33f, 54.62742f, 97.33f, 48.0f),
                    PathNode.CurveTo(97.33f, 41.37258f, 102.70258f, 36.0f, 109.33f, 36.0f),
                    PathNode.LineTo(208.0f, 36.0f),
                    PathNode.CurveTo(219.0457f, 36.0f, 228.0f, 44.954304f, 228.0f, 56.0f),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
