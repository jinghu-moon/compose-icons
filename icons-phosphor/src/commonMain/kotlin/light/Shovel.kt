package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorLightIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.24f, 59.76f),
                    PathNode.LineTo(196.24f, 11.76f),
                    PathNode.CurveTo(193.87592f, 9.557129f, 190.19193f, 9.622129f, 187.90703f, 11.907025f),
                    PathNode.CurveTo(185.62213f, 14.191922f, 185.55713f, 17.875921f, 187.76f, 20.24f),
                    PathNode.LineTo(207.52f, 40.0f),
                    PathNode.LineTo(133.66f, 113.86f),
                    PathNode.LineTo(97.9f, 78.1f),
                    PathNode.CurveTo(95.27445f, 75.47418f, 91.71328f, 73.99899f, 88.0f, 73.99899f),
                    PathNode.CurveTo(84.28672f, 73.99899f, 80.72555f, 75.47418f, 78.1f, 78.1f),
                    PathNode.LineTo(22.1f, 134.1f),
                    PathNode.CurveTo(19.468937f, 136.72195f, 17.993107f, 140.28555f, 18.0f, 144.0f),
                    PathNode.LineTo(18.0f, 224.0f),
                    PathNode.CurveTo(18.0f, 231.73198f, 24.268015f, 238.0f, 32.0f, 238.0f),
                    PathNode.LineTo(112.0f, 238.0f),
                    PathNode.CurveTo(115.71445f, 238.0069f, 119.27804f, 236.53107f, 121.9f, 233.9f),
                    PathNode.LineTo(177.9f, 177.9f),
                    PathNode.CurveTo(180.52582f, 175.27444f, 182.001f, 171.71329f, 182.001f, 168.0f),
                    PathNode.CurveTo(182.001f, 164.28671f, 180.52582f, 160.72556f, 177.9f, 158.1f),
                    PathNode.LineTo(142.14f, 122.34f),
                    PathNode.LineTo(216.0f, 48.48f),
                    PathNode.LineTo(235.76f, 68.24f),
                    PathNode.CurveTo(237.25575f, 69.84522f, 239.50844f, 70.506f, 241.63431f, 69.96308f),
                    PathNode.CurveTo(243.76018f, 69.42017f, 245.42018f, 67.76018f, 245.96309f, 65.63431f),
                    PathNode.CurveTo(246.506f, 63.508446f, 245.84523f, 61.255764f, 244.24f, 59.76f),
                    PathNode.Close,
                    PathNode.MoveTo(169.41f, 166.58f),
                    PathNode.CurveTo(169.78862f, 166.95554f, 170.0016f, 167.46672f, 170.0016f, 168.0f),
                    PathNode.CurveTo(170.0016f, 168.53328f, 169.78862f, 169.04446f, 169.41f, 169.42f),
                    PathNode.LineTo(113.41f, 225.42f),
                    PathNode.CurveTo(113.03502f, 225.79192f, 112.528145f, 226.00043f, 112.0f, 226.0f),
                    PathNode.LineTo(32.0f, 226.0f),
                    PathNode.CurveTo(30.89543f, 226.0f, 30.0f, 225.10457f, 30.0f, 224.0f),
                    PathNode.LineTo(30.0f, 144.0f),
                    PathNode.CurveTo(29.996927f, 143.4684f, 30.205627f, 142.95744f, 30.58f, 142.58f),
                    PathNode.LineTo(86.58f, 86.58f),
                    PathNode.CurveTo(86.957436f, 86.20563f, 87.46839f, 85.996925f, 88.0f, 86.0f),
                    PathNode.CurveTo(88.53014f, 86.00436f, 89.03841f, 86.21196f, 89.42f, 86.58f),
                    PathNode.LineTo(125.17f, 122.34f),
                    PathNode.LineTo(83.76f, 163.76f),
                    PathNode.CurveTo(82.15478f, 165.25575f, 81.494f, 167.50844f, 82.03692f, 169.63431f),
                    PathNode.CurveTo(82.57983f, 171.76018f, 84.23982f, 173.42018f, 86.3657f, 173.96309f),
                    PathNode.CurveTo(88.491554f, 174.506f, 90.74423f, 173.84523f, 92.24f, 172.24f),
                    PathNode.LineTo(133.66f, 130.83f),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
