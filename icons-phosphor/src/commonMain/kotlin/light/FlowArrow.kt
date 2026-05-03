package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorLightIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.24f, 75.76f),
                    PathNode.LineTo(212.24f, 43.76f),
                    PathNode.CurveTo(209.87592f, 41.55713f, 206.19193f, 41.622128f, 203.90703f, 43.907024f),
                    PathNode.CurveTo(201.62213f, 46.19192f, 201.55713f, 49.875923f, 203.76f, 52.24f),
                    PathNode.LineTo(225.51f, 74.0f),
                    PathNode.LineTo(208.0f, 74.0f),
                    PathNode.CurveTo(160.0f, 74.0f, 148.56f, 101.46f, 138.46f, 125.69f),
                    PathNode.CurveTo(129.03f, 148.33f, 120.8f, 168.02f, 85.46f, 169.85f),
                    PathNode.CurveTo(82.23271f, 150.29478f, 64.51769f, 136.50406f, 44.768303f, 138.1725f),
                    PathNode.CurveTo(25.018913f, 139.84093f, 9.868532f, 156.40813f, 9.96763f, 176.22762f),
                    PathNode.CurveTo(10.066728f, 196.0471f, 25.38202f, 212.46198f, 45.147102f, 213.93283f),
                    PathNode.CurveTo(64.912186f, 215.40369f, 82.48842f, 201.43651f, 85.52f, 181.85f),
                    PathNode.CurveTo(128.86f, 179.79f, 139.81f, 153.56f, 149.52f, 130.3f),
                    PathNode.CurveTo(159.44f, 106.53f, 168.0f, 86.0f, 208.0f, 86.0f),
                    PathNode.LineTo(225.51f, 86.0f),
                    PathNode.LineTo(203.76f, 107.76f),
                    PathNode.CurveTo(202.15477f, 109.25577f, 201.494f, 111.508446f, 202.03691f, 113.6343f),
                    PathNode.CurveTo(202.57982f, 115.76018f, 204.23982f, 117.42017f, 206.36569f, 117.96308f),
                    PathNode.CurveTo(208.49156f, 118.506f, 210.74425f, 117.84522f, 212.24f, 116.24f),
                    PathNode.LineTo(244.24f, 84.24f),
                    PathNode.CurveTo(246.57962f, 81.89746f, 246.57962f, 78.10254f, 244.24f, 75.76f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 202.0f),
                    PathNode.CurveTo(33.6406f, 202.0f, 22.0f, 190.3594f, 22.0f, 176.0f),
                    PathNode.CurveTo(22.0f, 161.6406f, 33.6406f, 150.0f, 48.0f, 150.0f),
                    PathNode.CurveTo(62.3594f, 150.0f, 74.0f, 161.6406f, 74.0f, 176.0f),
                    PathNode.CurveTo(74.0f, 190.3594f, 62.3594f, 202.0f, 48.0f, 202.0f),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
