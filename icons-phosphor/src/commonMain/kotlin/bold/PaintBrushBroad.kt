package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorBoldIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(47.71089f, 20.027554f, 28.027554f, 39.71089f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 151.46397f, 40.53603f, 164.0f, 56.0f, 164.0f),
                    PathNode.LineTo(95.64f, 164.0f),
                    PathNode.LineTo(92.0f, 207.0f),
                    PathNode.CurveTo(92.0f, 207.33f, 92.0f, 207.67f, 92.0f, 208.0f),
                    PathNode.CurveTo(92.0f, 227.88223f, 108.11775f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(147.88223f, 244.0f, 164.0f, 227.88223f, 164.0f, 208.0f),
                    PathNode.CurveTo(164.0f, 207.67f, 164.0f, 207.33f, 164.0f, 207.0f),
                    PathNode.LineTo(160.4f, 164.0f),
                    PathNode.LineTo(200.0f, 164.0f),
                    PathNode.CurveTo(215.46397f, 164.0f, 228.0f, 151.46397f, 228.0f, 136.0f),
                    PathNode.LineTo(228.0f, 32.0f),
                    PathNode.CurveTo(228.0f, 25.372583f, 222.62741f, 20.0f, 216.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(160.0f, 74.62742f, 165.37259f, 80.0f, 172.0f, 80.0f),
                    PathNode.CurveTo(178.62741f, 80.0f, 184.0f, 74.62742f, 184.0f, 68.0f),
                    PathNode.LineTo(184.0f, 44.0f),
                    PathNode.LineTo(204.0f, 44.0f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.LineTo(52.0f, 96.0f),
                    PathNode.LineTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 52.954304f, 60.954304f, 44.0f, 72.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 140.0f),
                    PathNode.LineTo(156.0f, 140.0f),
                    PathNode.CurveTo(150.27852f, 140.00157f, 144.83165f, 142.45346f, 141.03703f, 146.73555f),
                    PathNode.CurveTo(137.24242f, 151.01764f, 135.46342f, 156.71985f, 136.15f, 162.4f),
                    PathNode.LineTo(139.99f, 208.4f),
                    PathNode.CurveTo(139.99f, 215.02742f, 134.61742f, 220.4f, 127.99f, 220.4f),
                    PathNode.CurveTo(121.36258f, 220.4f, 115.99f, 215.02742f, 115.99f, 208.4f),
                    PathNode.LineTo(119.83f, 162.4f),
                    PathNode.CurveTo(120.51617f, 156.72331f, 118.73977f, 151.0244f, 114.94961f, 146.74303f),
                    PathNode.CurveTo(111.15944f, 142.46164f, 105.718f, 140.00728f, 100.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(53.79086f, 140.0f, 52.0f, 138.20914f, 52.0f, 136.0f),
                    PathNode.LineTo(52.0f, 120.0f),
                    PathNode.LineTo(204.0f, 120.0f),
                    PathNode.LineTo(204.0f, 136.0f),
                    PathNode.CurveTo(204.0f, 138.20914f, 202.20914f, 140.0f, 200.0f, 140.0f),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
