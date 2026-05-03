package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorFillIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.18f, 97.26f),
                    PathNode.CurveTo(237.13477f, 90.9727f, 231.5102f, 86.531425f, 224.92f, 86.0f),
                    PathNode.LineTo(165.92f, 81.24f),
                    PathNode.LineTo(143.14f, 26.15f),
                    PathNode.CurveTo(140.62036f, 20.010498f, 134.64142f, 16.00139f, 128.005f, 16.00139f),
                    PathNode.CurveTo(121.368576f, 16.00139f, 115.38965f, 20.010498f, 112.87f, 26.15f),
                    PathNode.LineTo(90.11f, 81.23f),
                    PathNode.LineTo(31.08f, 86.0f),
                    PathNode.CurveTo(24.479704f, 86.55821f, 18.85707f, 91.018425f, 16.811604f, 97.31855f),
                    PathNode.CurveTo(14.766137f, 103.618675f, 16.69641f, 110.5311f, 21.71f, 114.86f),
                    PathNode.LineTo(66.71f, 153.69f),
                    PathNode.LineTo(53.0f, 211.75f),
                    PathNode.CurveTo(51.453114f, 218.19638f, 53.9394f, 224.94008f, 59.30063f, 228.83955f),
                    PathNode.CurveTo(64.66186f, 232.73903f, 71.8435f, 233.02727f, 77.5f, 229.57f),
                    PathNode.LineTo(128.0f, 198.49f),
                    PathNode.LineTo(178.53f, 229.57f),
                    PathNode.CurveTo(184.18533f, 233.00711f, 191.35231f, 232.70836f, 196.70198f, 228.81252f),
                    PathNode.CurveTo(202.05165f, 224.91669f, 204.53557f, 218.18727f, 203.0f, 211.75f),
                    PathNode.LineTo(189.24f, 153.68f),
                    PathNode.LineTo(234.24f, 114.85f),
                    PathNode.CurveTo(239.29549f, 110.527214f, 241.24579f, 103.58274f, 239.18f, 97.26f),
                    PathNode.Close,
                    PathNode.MoveTo(223.84f, 102.73f),
                    PathNode.LineTo(175.14f, 144.73f),
                    PathNode.CurveTo(172.87602f, 146.68141f, 171.88869f, 149.73213f, 172.58f, 152.64f),
                    PathNode.LineTo(187.46f, 215.44f),
                    PathNode.CurveTo(187.53995f, 215.61975f, 187.46527f, 215.83064f, 187.29f, 215.92f),
                    PathNode.CurveTo(187.11f, 216.06f, 187.06f, 216.03f, 186.91f, 215.92f),
                    PathNode.LineTo(132.19f, 182.27f),
                    PathNode.CurveTo(130.92822f, 181.50046f, 129.47792f, 181.09547f, 128.0f, 181.1f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.CurveTo(128.24f, 32.0f, 128.27f, 32.08f, 128.35f, 32.26f),
                    PathNode.LineTo(153.0f, 91.86f),
                    PathNode.CurveTo(154.14728f, 94.637665f, 156.75449f, 96.53803f, 159.75f, 96.78f),
                    PathNode.LineTo(223.66f, 101.94f),
                    PathNode.CurveTo(223.82f, 101.94f, 223.91f, 101.94f, 224.0f, 102.23f),
                    PathNode.CurveTo(224.09f, 102.52f, 224.0f, 102.63f, 223.84f, 102.73f),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
