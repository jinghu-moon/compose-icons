package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorBoldIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.49f, 55.51f),
                    PathNode.LineTo(200.49f, 7.51f),
                    PathNode.CurveTo(195.79558f, 2.81558f, 188.18442f, 2.81558f, 183.49f, 7.51f),
                    PathNode.CurveTo(178.79558f, 12.20442f, 178.79558f, 19.81558f, 183.49f, 24.51f),
                    PathNode.LineTo(199.0f, 40.0f),
                    PathNode.LineTo(133.63f, 105.37f),
                    PathNode.LineTo(102.14f, 73.86f),
                    PathNode.CurveTo(94.33f, 66.05236f, 81.67f, 66.05236f, 73.86f, 73.86f),
                    PathNode.LineTo(17.86f, 129.86f),
                    PathNode.CurveTo(14.099651f, 133.60359f, 11.990085f, 138.69391f, 12.0f, 144.0f),
                    PathNode.LineTo(12.0f, 224.0f),
                    PathNode.CurveTo(12.0f, 235.0457f, 20.954306f, 244.0f, 32.0f, 244.0f),
                    PathNode.LineTo(112.0f, 244.0f),
                    PathNode.CurveTo(117.30697f, 244.01437f, 122.39894f, 241.90411f, 126.14f, 238.14f),
                    PathNode.LineTo(182.14f, 182.14f),
                    PathNode.CurveTo(189.94763f, 174.33f, 189.94763f, 161.67f, 182.14f, 153.86f),
                    PathNode.LineTo(150.63f, 122.34f),
                    PathNode.LineTo(216.0f, 57.0f),
                    PathNode.LineTo(231.51f, 72.52f),
                    PathNode.CurveTo(236.20442f, 77.214424f, 243.81558f, 77.214424f, 248.51f, 72.52f),
                    PathNode.CurveTo(253.20442f, 67.82558f, 253.20442f, 60.21442f, 248.51f, 55.52f),
                    PathNode.Close,
                    PathNode.MoveTo(162.34f, 168.0f),
                    PathNode.LineTo(110.34f, 220.0f),
                    PathNode.LineTo(36.0f, 220.0f),
                    PathNode.LineTo(36.0f, 145.66f),
                    PathNode.LineTo(88.0f, 93.66f),
                    PathNode.LineTo(116.69f, 122.34f),
                    PathNode.LineTo(79.51f, 159.51f),
                    PathNode.CurveTo(74.81558f, 164.20442f, 74.81558f, 171.81558f, 79.51f, 176.51f),
                    PathNode.CurveTo(84.20442f, 181.20442f, 91.81558f, 181.20442f, 96.51f, 176.51f),
                    PathNode.LineTo(133.68f, 139.33f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
