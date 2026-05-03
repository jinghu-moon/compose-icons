package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorDuotoneIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 97.67311f, 145.67311f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(110.32689f, 112.0f, 96.0f, 97.67311f, 96.0f, 80.0f),
                    PathNode.CurveTo(96.0f, 62.32689f, 110.32689f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(145.67311f, 48.0f, 160.0f, 62.32689f, 160.0f, 80.0f),
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
                    PathNode.MoveTo(215.12f, 123.64f),
                    PathNode.CurveTo(216.5229f, 121.08527f, 216.42542f, 117.96974f, 214.86554f, 115.50773f),
                    PathNode.CurveTo(213.30568f, 113.04571f, 210.53027f, 111.62682f, 207.62111f, 111.80411f),
                    PathNode.CurveTo(204.71193f, 111.98139f, 202.12936f, 113.72678f, 200.88f, 116.36f),
                    PathNode.CurveTo(193.48445f, 130.60747f, 181.95303f, 142.2853f, 167.8f, 149.86f),
                    PathNode.LineTo(151.22f, 112.54f),
                    PathNode.CurveTo(164.16957f, 103.29348f, 170.40717f, 87.25094f, 167.10486f, 71.68545f),
                    PathNode.CurveTo(163.80257f, 56.11996f, 151.58847f, 43.992027f, 136.0f, 40.8f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 40.8f),
                    PathNode.CurveTo(104.41152f, 43.992027f, 92.19743f, 56.11996f, 88.89514f, 71.68545f),
                    PathNode.CurveTo(85.59284f, 87.25094f, 91.83042f, 103.29348f, 104.78f, 112.54f),
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
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(141.25484f, 56.0f, 152.0f, 66.74516f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 93.25484f, 141.25484f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(114.74516f, 104.0f, 104.0f, 93.25484f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 66.74516f, 114.74516f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(119.50652f, 160.01035f, 111.06624f, 158.6599f, 103.0f, 156.0f),
                    PathNode.LineTo(119.42f, 119.06f),
                    PathNode.CurveTo(125.08484f, 120.31335f, 130.95517f, 120.31335f, 136.62f, 119.06f),
                    PathNode.LineTo(153.1f, 156.12f),
                    PathNode.CurveTo(144.98117f, 158.69011f, 136.51591f, 159.99869f, 128.0f, 160.0f),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
