package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorLightIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 104.0f),
                    PathNode.CurveTo(229.96693f, 74.19033f, 205.80966f, 50.033066f, 176.0f, 50.0f),
                    PathNode.LineTo(134.0f, 50.0f),
                    PathNode.LineTo(134.0f, 48.0f),
                    PathNode.CurveTo(134.0f, 33.6406f, 145.6406f, 22.0f, 160.0f, 22.0f),
                    PathNode.CurveTo(163.3137f, 22.0f, 166.0f, 19.31371f, 166.0f, 16.0f),
                    PathNode.CurveTo(166.0f, 12.686292f, 163.3137f, 10.0f, 160.0f, 10.0f),
                    PathNode.CurveTo(139.01318f, 10.0f, 122.0f, 27.01318f, 122.0f, 48.0f),
                    PathNode.LineTo(122.0f, 50.0f),
                    PathNode.LineTo(80.0f, 50.0f),
                    PathNode.CurveTo(50.19033f, 50.033066f, 26.033068f, 74.19033f, 26.0f, 104.0f),
                    PathNode.CurveTo(26.007374f, 109.400635f, 29.120474f, 114.315445f, 34.0f, 116.63f),
                    PathNode.LineTo(34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 162.57f, 66.71f, 188.83f, 93.0f, 209.93f),
                    PathNode.CurveTo(107.26f, 221.38f, 122.0f, 233.22f, 122.0f, 240.0f),
                    PathNode.CurveTo(122.0f, 243.3137f, 124.686295f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(131.3137f, 246.0f, 134.0f, 243.3137f, 134.0f, 240.0f),
                    PathNode.CurveTo(134.0f, 233.22f, 148.75f, 221.38f, 163.0f, 209.93f),
                    PathNode.CurveTo(189.28f, 188.83f, 222.0f, 162.57f, 222.0f, 128.0f),
                    PathNode.LineTo(222.0f, 116.63f),
                    PathNode.CurveTo(226.87953f, 114.315445f, 229.99263f, 109.400635f, 230.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 62.0f),
                    PathNode.LineTo(176.0f, 62.0f),
                    PathNode.CurveTo(199.19595f, 62.0f, 218.0f, 80.80404f, 218.0f, 104.0f),
                    PathNode.CurveTo(218.0f, 105.10457f, 217.10457f, 106.0f, 216.0f, 106.0f),
                    PathNode.LineTo(40.0f, 106.0f),
                    PathNode.CurveTo(38.89543f, 106.0f, 38.0f, 105.10457f, 38.0f, 104.0f),
                    PathNode.CurveTo(38.0f, 80.80404f, 56.80404f, 62.0f, 80.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.5f, 200.58f),
                    PathNode.CurveTo(144.02f, 209.79f, 134.02f, 217.82f, 128.0f, 225.58f),
                    PathNode.CurveTo(122.0f, 217.86f, 112.0f, 209.83f, 100.5f, 200.58f),
                    PathNode.CurveTo(76.22f, 181.08f, 46.0f, 156.82f, 46.0f, 128.0f),
                    PathNode.LineTo(46.0f, 118.0f),
                    PathNode.LineTo(210.0f, 118.0f),
                    PathNode.LineTo(210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 156.82f, 179.78f, 181.08f, 155.5f, 200.58f),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
