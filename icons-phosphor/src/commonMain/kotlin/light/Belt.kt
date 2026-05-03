package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorLightIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 162.0f),
                    PathNode.LineTo(190.0f, 162.0f),
                    PathNode.LineTo(190.0f, 94.0f),
                    PathNode.LineTo(248.0f, 94.0f),
                    PathNode.CurveTo(251.3137f, 94.0f, 254.0f, 91.313705f, 254.0f, 88.0f),
                    PathNode.CurveTo(254.0f, 84.686295f, 251.3137f, 82.0f, 248.0f, 82.0f),
                    PathNode.LineTo(188.63f, 82.0f),
                    PathNode.CurveTo(186.31544f, 77.120476f, 181.40063f, 74.00738f, 176.0f, 74.0f),
                    PathNode.LineTo(112.0f, 74.0f),
                    PathNode.CurveTo(106.599365f, 74.00738f, 101.684555f, 77.120476f, 99.37f, 82.0f),
                    PathNode.LineTo(62.0f, 82.0f),
                    PathNode.LineTo(62.0f, 80.0f),
                    PathNode.CurveTo(62.0f, 76.686295f, 59.31371f, 74.0f, 56.0f, 74.0f),
                    PathNode.CurveTo(52.68629f, 74.0f, 50.0f, 76.686295f, 50.0f, 80.0f),
                    PathNode.LineTo(50.0f, 82.0f),
                    PathNode.LineTo(8.0f, 82.0f),
                    PathNode.CurveTo(4.686292f, 82.0f, 2.0f, 84.686295f, 2.0f, 88.0f),
                    PathNode.CurveTo(2.0f, 91.313705f, 4.686292f, 94.0f, 8.0f, 94.0f),
                    PathNode.LineTo(50.0f, 94.0f),
                    PathNode.LineTo(50.0f, 162.0f),
                    PathNode.LineTo(8.0f, 162.0f),
                    PathNode.CurveTo(4.686292f, 162.0f, 2.0f, 164.6863f, 2.0f, 168.0f),
                    PathNode.CurveTo(2.0f, 171.3137f, 4.686292f, 174.0f, 8.0f, 174.0f),
                    PathNode.LineTo(50.0f, 174.0f),
                    PathNode.LineTo(50.0f, 176.0f),
                    PathNode.CurveTo(50.0f, 179.3137f, 52.68629f, 182.0f, 56.0f, 182.0f),
                    PathNode.CurveTo(59.31371f, 182.0f, 62.0f, 179.3137f, 62.0f, 176.0f),
                    PathNode.LineTo(62.0f, 174.0f),
                    PathNode.LineTo(99.37f, 174.0f),
                    PathNode.CurveTo(101.684555f, 178.87953f, 106.599365f, 181.99263f, 112.0f, 182.0f),
                    PathNode.LineTo(176.0f, 182.0f),
                    PathNode.CurveTo(181.40063f, 181.99263f, 186.31544f, 178.87953f, 188.63f, 174.0f),
                    PathNode.LineTo(248.0f, 174.0f),
                    PathNode.CurveTo(251.3137f, 174.0f, 254.0f, 171.3137f, 254.0f, 168.0f),
                    PathNode.CurveTo(254.0f, 164.6863f, 251.3137f, 162.0f, 248.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 94.0f),
                    PathNode.LineTo(98.0f, 94.0f),
                    PathNode.LineTo(98.0f, 162.0f),
                    PathNode.LineTo(62.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 170.0f),
                    PathNode.LineTo(112.0f, 170.0f),
                    PathNode.CurveTo(110.89543f, 170.0f, 110.0f, 169.10457f, 110.0f, 168.0f),
                    PathNode.LineTo(110.0f, 88.0f),
                    PathNode.CurveTo(110.0f, 86.89543f, 110.89543f, 86.0f, 112.0f, 86.0f),
                    PathNode.LineTo(176.0f, 86.0f),
                    PathNode.CurveTo(177.10457f, 86.0f, 178.0f, 86.89543f, 178.0f, 88.0f),
                    PathNode.LineTo(178.0f, 122.0f),
                    PathNode.LineTo(144.0f, 122.0f),
                    PathNode.CurveTo(140.6863f, 122.0f, 138.0f, 124.686295f, 138.0f, 128.0f),
                    PathNode.CurveTo(138.0f, 131.3137f, 140.6863f, 134.0f, 144.0f, 134.0f),
                    PathNode.LineTo(178.0f, 134.0f),
                    PathNode.LineTo(178.0f, 168.0f),
                    PathNode.CurveTo(178.0f, 169.10457f, 177.10457f, 170.0f, 176.0f, 170.0f),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
