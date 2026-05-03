package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Highlighter: ImageVector
    get() {
        if (_highlighter != null) return _highlighter!!
        _highlighter = phosphorBoldIcon(
            name = "Highlighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.49f, 107.51f),
                    PathNode.CurveTo(250.23837f, 105.25055f, 247.17982f, 103.98054f, 243.99f, 103.98054f),
                    PathNode.CurveTo(240.80019f, 103.98054f, 237.74162f, 105.25055f, 235.49f, 107.51f),
                    PathNode.LineTo(192.0f, 151.0f),
                    PathNode.LineTo(113.0f, 72.0f),
                    PathNode.LineTo(156.52f, 28.49f),
                    PathNode.CurveTo(161.21442f, 23.79558f, 161.21442f, 16.18442f, 156.52f, 11.49f),
                    PathNode.CurveTo(151.82558f, 6.79558f, 144.21442f, 6.79558f, 139.52f, 11.49f),
                    PathNode.LineTo(93.17f, 57.86f),
                    PathNode.CurveTo(87.75398f, 63.29035f, 85.920364f, 71.33964f, 88.45f, 78.58f),
                    PathNode.LineTo(69.17f, 97.86f),
                    PathNode.CurveTo(61.36236f, 105.67f, 61.36236f, 118.33f, 69.17f, 126.14f),
                    PathNode.LineTo(71.0f, 128.0f),
                    PathNode.LineTo(15.51f, 183.51f),
                    PathNode.CurveTo(12.569234f, 186.45213f, 11.361957f, 190.70741f, 12.319492f, 194.75554f),
                    PathNode.CurveTo(13.277027f, 198.80367f, 16.262768f, 202.06714f, 20.21f, 203.38f),
                    PathNode.LineTo(92.21f, 227.38f),
                    PathNode.CurveTo(93.431f, 227.79224f, 94.71129f, 228.00168f, 96.0f, 228.0f),
                    PathNode.CurveTo(99.18499f, 227.99985f, 102.23927f, 226.73354f, 104.49f, 224.48f),
                    PathNode.LineTo(136.0f, 193.0f),
                    PathNode.LineTo(137.86f, 194.86f),
                    PathNode.CurveTo(145.67f, 202.66763f, 158.33f, 202.66763f, 166.14f, 194.86f),
                    PathNode.LineTo(185.41f, 175.59f),
                    PathNode.CurveTo(187.52898f, 176.32886f, 189.75592f, 176.71072f, 192.0f, 176.72f),
                    PathNode.CurveTo(197.30698f, 176.73438f, 202.39894f, 174.62411f, 206.14f, 170.86f),
                    PathNode.LineTo(252.49f, 124.52f),
                    PathNode.CurveTo(254.75252f, 122.26798f, 256.02448f, 119.207275f, 256.02448f, 116.015f),
                    PathNode.CurveTo(256.02448f, 112.82272f, 254.75252f, 109.762024f, 252.49f, 107.51f),
                    PathNode.Close,
                    PathNode.MoveTo(92.76f, 202.27f),
                    PathNode.LineTo(46.21f, 186.76f),
                    PathNode.LineTo(88.0f, 145.0f),
                    PathNode.LineTo(119.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 175.0f),
                    PathNode.LineTo(96.49f, 119.52f),
                    PathNode.LineTo(96.49f, 119.52f),
                    PathNode.LineTo(89.0f, 112.0f),
                    PathNode.LineTo(104.0f, 97.0f),
                    PathNode.LineTo(167.0f, 160.0f),
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
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
