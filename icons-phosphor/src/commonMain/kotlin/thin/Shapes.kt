package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorThinIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(67.79f, 62.74f),
                    PathNode.CurveTo(67.24122f, 61.113857f, 65.71625f, 60.019024f, 64.0f, 60.019024f),
                    PathNode.CurveTo(62.283756f, 60.019024f, 60.758778f, 61.113857f, 60.21f, 62.74f),
                    PathNode.LineTo(20.21f, 182.74f),
                    PathNode.CurveTo(19.80562f, 183.95839f, 20.010586f, 185.29683f, 20.761047f, 186.33836f),
                    PathNode.CurveTo(21.511509f, 187.3799f, 22.716263f, 187.99796f, 24.0f, 188.0f),
                    PathNode.LineTo(104.0f, 188.0f),
                    PathNode.CurveTo(105.28374f, 187.99796f, 106.488495f, 187.3799f, 107.23895f, 186.33836f),
                    PathNode.CurveTo(107.98941f, 185.29683f, 108.19438f, 183.95839f, 107.79f, 182.74f),
                    PathNode.Close,
                    PathNode.MoveTo(29.55f, 180.0f),
                    PathNode.LineTo(64.0f, 76.65f),
                    PathNode.LineTo(98.45f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 76.0f),
                    PathNode.CurveTo(204.0f, 49.490334f, 182.50967f, 28.0f, 156.0f, 28.0f),
                    PathNode.CurveTo(129.49033f, 28.0f, 108.0f, 49.490334f, 108.0f, 76.0f),
                    PathNode.CurveTo(108.0f, 102.50967f, 129.49033f, 124.0f, 156.0f, 124.0f),
                    PathNode.CurveTo(182.49825f, 123.97244f, 203.97244f, 102.498245f, 204.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 76.0f),
                    PathNode.CurveTo(116.0f, 53.90861f, 133.90862f, 36.0f, 156.0f, 36.0f),
                    PathNode.CurveTo(178.09138f, 36.0f, 196.0f, 53.90861f, 196.0f, 76.0f),
                    PathNode.CurveTo(196.0f, 98.09139f, 178.09138f, 116.0f, 156.0f, 116.0f),
                    PathNode.CurveTo(133.90862f, 116.0f, 116.0f, 98.09139f, 116.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 148.0f),
                    PathNode.LineTo(136.0f, 148.0f),
                    PathNode.CurveTo(133.79086f, 148.0f, 132.0f, 149.79086f, 132.0f, 152.0f),
                    PathNode.LineTo(132.0f, 208.0f),
                    PathNode.CurveTo(132.0f, 210.20914f, 133.79086f, 212.0f, 136.0f, 212.0f),
                    PathNode.LineTo(224.0f, 212.0f),
                    PathNode.CurveTo(226.20914f, 212.0f, 228.0f, 210.20914f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 152.0f),
                    PathNode.CurveTo(228.0f, 149.79086f, 226.20914f, 148.0f, 224.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 204.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(220.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shapes!!
    }

private var _shapes: ImageVector? = null
