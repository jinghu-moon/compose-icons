package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorLightIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.33f, 115.0f),
                    PathNode.LineTo(115.33f, 83.0f),
                    PathNode.CurveTo(113.487656f, 81.770805f, 111.11799f, 81.656494f, 109.16588f, 82.70264f),
                    PathNode.CurveTo(107.21377f, 83.74879f, 105.99671f, 85.78524f, 106.0f, 88.0f),
                    PathNode.LineTo(106.0f, 152.0f),
                    PathNode.CurveTo(105.99671f, 154.21475f, 107.21377f, 156.25122f, 109.16588f, 157.29736f),
                    PathNode.CurveTo(111.11799f, 158.3435f, 113.487656f, 158.22919f, 115.33f, 157.0f),
                    PathNode.LineTo(163.33f, 125.0f),
                    PathNode.CurveTo(165.00587f, 123.88835f, 166.01338f, 122.01105f, 166.01338f, 120.0f),
                    PathNode.CurveTo(166.01338f, 117.98895f, 165.00587f, 116.11165f, 163.33f, 115.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 140.79f),
                    PathNode.LineTo(118.0f, 99.21f),
                    PathNode.LineTo(149.18f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(35.849735f, 42.0f, 26.0f, 51.849735f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 176.0f),
                    PathNode.CurveTo(26.0f, 188.15027f, 35.849735f, 198.0f, 48.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(220.15027f, 198.0f, 230.0f, 188.15027f, 230.0f, 176.0f),
                    PathNode.LineTo(230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 51.849735f, 220.15027f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 176.0f),
                    PathNode.CurveTo(218.0f, 181.52284f, 213.52284f, 186.0f, 208.0f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(42.477154f, 186.0f, 38.0f, 181.52284f, 38.0f, 176.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 58.477154f, 42.477154f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(213.52284f, 54.0f, 218.0f, 58.477154f, 218.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 224.0f),
                    PathNode.CurveTo(166.0f, 227.3137f, 163.3137f, 230.0f, 160.0f, 230.0f),
                    PathNode.LineTo(96.0f, 230.0f),
                    PathNode.CurveTo(92.686295f, 230.0f, 90.0f, 227.3137f, 90.0f, 224.0f),
                    PathNode.CurveTo(90.0f, 220.6863f, 92.686295f, 218.0f, 96.0f, 218.0f),
                    PathNode.LineTo(160.0f, 218.0f),
                    PathNode.CurveTo(163.3137f, 218.0f, 166.0f, 220.6863f, 166.0f, 224.0f),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
