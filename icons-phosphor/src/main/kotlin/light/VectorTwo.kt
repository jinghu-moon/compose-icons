package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorLightIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 196.24f),
                    PathNode.LineTo(196.24f, 228.24f),
                    PathNode.CurveTo(193.87592f, 230.44287f, 190.19193f, 230.37787f, 187.90703f, 228.09297f),
                    PathNode.CurveTo(185.62213f, 225.80807f, 185.55713f, 222.12408f, 187.76f, 219.76f),
                    PathNode.LineTo(209.51f, 198.0f),
                    PathNode.LineTo(80.0f, 198.0f),
                    PathNode.CurveTo(76.686295f, 198.0f, 74.0f, 195.3137f, 74.0f, 192.0f),
                    PathNode.LineTo(74.0f, 54.49f),
                    PathNode.LineTo(52.24f, 76.24f),
                    PathNode.CurveTo(49.875923f, 78.44287f, 46.19192f, 78.37787f, 43.907024f, 76.09297f),
                    PathNode.CurveTo(41.622128f, 73.808075f, 41.55713f, 70.12408f, 43.76f, 67.76f),
                    PathNode.LineTo(75.76f, 35.76f),
                    PathNode.CurveTo(78.10254f, 33.420372f, 81.89746f, 33.420372f, 84.24f, 35.76f),
                    PathNode.LineTo(116.24f, 67.76f),
                    PathNode.CurveTo(117.84522f, 69.25577f, 118.506f, 71.508446f, 117.96308f, 73.6343f),
                    PathNode.CurveTo(117.42017f, 75.76018f, 115.76018f, 77.42017f, 113.6343f, 77.96308f),
                    PathNode.CurveTo(111.508446f, 78.506f, 109.25577f, 77.84522f, 107.76f, 76.24f),
                    PathNode.LineTo(86.0f, 54.49f),
                    PathNode.LineTo(86.0f, 186.0f),
                    PathNode.LineTo(209.51f, 186.0f),
                    PathNode.LineTo(187.76f, 164.24f),
                    PathNode.CurveTo(185.55713f, 161.87592f, 185.62213f, 158.19193f, 187.90703f, 155.90703f),
                    PathNode.CurveTo(190.19193f, 153.62213f, 193.87592f, 153.55713f, 196.24f, 155.76f),
                    PathNode.LineTo(228.24f, 187.76f),
                    PathNode.CurveTo(230.57962f, 190.10254f, 230.57962f, 193.89746f, 228.24f, 196.24f),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
