package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = phosphorDuotoneIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.LineTo(128.0f, 189.09f),
                    PathNode.LineTo(73.28f, 222.74f),
                    PathNode.CurveTo(70.37666f, 224.50252f, 66.69762f, 224.34319f, 63.957523f, 222.33626f),
                    PathNode.CurveTo(61.21743f, 220.32935f, 59.95555f, 216.86981f, 60.76f, 213.57f),
                    PathNode.LineTo(75.64f, 150.78f),
                    PathNode.LineTo(26.94f, 108.78f),
                    PathNode.CurveTo(24.402187f, 106.55165f, 23.432835f, 103.027405f, 24.47405f, 99.81463f),
                    PathNode.CurveTo(25.515268f, 96.60187f, 28.367548f, 94.316154f, 31.73f, 94.0f),
                    PathNode.LineTo(95.64f, 88.8f),
                    PathNode.LineTo(120.26f, 29.2f),
                    PathNode.CurveTo(121.52143f, 26.036898f, 124.594765f, 23.97213f, 128.0f, 24.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(69.09f, 215.94f),
                    PathNode.CurveTo(68.94f, 216.03f, 68.89f, 216.06f, 68.71f, 215.94f),
                    PathNode.CurveTo(68.53474f, 215.85062f, 68.460045f, 215.63976f, 68.54f, 215.46f),
                    PathNode.LineTo(83.42f, 152.66f),
                    PathNode.CurveTo(84.11131f, 149.75215f, 83.12398f, 146.70143f, 80.86f, 144.75f),
                    PathNode.LineTo(32.16f, 102.75f),
                    PathNode.CurveTo(31.991201f, 102.63927f, 31.934805f, 102.41802f, 32.03f, 102.24f),
                    PathNode.CurveTo(32.12f, 101.97f, 32.21f, 101.97f, 32.36f, 101.95f),
                    PathNode.LineTo(96.28f, 96.79f),
                    PathNode.CurveTo(99.26672f, 96.535416f, 101.86052f, 94.63253f, 103.0f, 91.86f),
                    PathNode.LineTo(120.0f, 50.78f),
                    PathNode.LineTo(120.0f, 184.63f),
                    PathNode.Close,
                    PathNode.MoveTo(223.84f, 102.73f),
                    PathNode.LineTo(175.14f, 144.73f),
                    PathNode.CurveTo(172.87602f, 146.68141f, 171.88869f, 149.73213f, 172.58f, 152.64f),
                    PathNode.LineTo(187.46f, 215.44f),
                    PathNode.CurveTo(187.53995f, 215.61975f, 187.46527f, 215.83064f, 187.29f, 215.92f),
                    PathNode.CurveTo(187.11f, 216.06f, 187.06f, 216.03f, 186.91f, 215.92f),
                    PathNode.LineTo(136.0f, 184.63f),
                    PathNode.LineTo(136.0f, 50.78f),
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
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
