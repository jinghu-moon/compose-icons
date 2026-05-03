package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorFillIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.12f, 123.64f),
                    PathNode.CurveTo(216.5229f, 121.08527f, 216.42542f, 117.96974f, 214.86554f, 115.50773f),
                    PathNode.CurveTo(213.30568f, 113.04571f, 210.53027f, 111.62682f, 207.62111f, 111.80411f),
                    PathNode.CurveTo(204.71193f, 111.98139f, 202.12936f, 113.72678f, 200.88f, 116.36f),
                    PathNode.CurveTo(193.48445f, 130.60747f, 181.95303f, 142.2853f, 167.8f, 149.86f),
                    PathNode.LineTo(149.56f, 108.81f),
                    PathNode.CurveTo(160.77895f, 100.401566f, 166.09567f, 86.24468f, 163.1853f, 72.52986f),
                    PathNode.CurveTo(160.27493f, 58.81504f, 149.66695f, 48.037487f, 136.0f, 44.91f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 44.91f),
                    PathNode.CurveTo(106.33305f, 48.037487f, 95.725075f, 58.81504f, 92.8147f, 72.52986f),
                    PathNode.CurveTo(89.90432f, 86.24468f, 95.221054f, 100.401566f, 106.44f, 108.81f),
                    PathNode.LineTo(56.69f, 220.75f),
                    PathNode.CurveTo(55.513012f, 223.3643f, 55.82501f, 226.40857f, 57.507816f, 228.7298f),
                    PathNode.CurveTo(59.190628f, 231.05101f, 61.986927f, 232.29424f, 64.83763f, 231.9886f),
                    PathNode.CurveTo(67.68833f, 231.68298f, 70.15752f, 229.8752f, 71.31f, 227.25f),
                    PathNode.LineTo(96.45f, 170.69f),
                    PathNode.CurveTo(106.593155f, 174.22192f, 117.25953f, 176.01712f, 128.0f, 176.0f),
                    PathNode.CurveTo(138.7461f, 175.9876f, 149.41869f, 174.22797f, 159.6f, 170.79f),
                    PathNode.LineTo(184.69f, 227.25f),
                    PathNode.CurveTo(186.49782f, 231.26549f, 191.21094f, 233.0649f, 195.23483f, 231.2759f),
                    PathNode.CurveTo(199.25874f, 229.48688f, 201.08017f, 224.78223f, 199.31f, 220.75f),
                    PathNode.LineTo(174.31f, 164.5f),
                    PathNode.CurveTo(191.792f, 155.40144f, 206.04285f, 141.13312f, 215.12f, 123.64f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(119.50652f, 160.01035f, 111.06624f, 158.6599f, 103.0f, 156.0f),
                    PathNode.LineTo(121.08f, 115.32f),
                    PathNode.CurveTo(125.66224f, 116.22678f, 130.37776f, 116.22678f, 134.96f, 115.32f),
                    PathNode.LineTo(153.1f, 156.12f),
                    PathNode.CurveTo(144.98117f, 158.69011f, 136.51591f, 159.99869f, 128.0f, 160.0f),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
