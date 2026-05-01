package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorLightIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 179.76f),
                    PathNode.CurveTo(238.57962f, 182.10254f, 238.57962f, 185.89746f, 236.24f, 188.24f),
                    PathNode.LineTo(212.24f, 212.24f),
                    PathNode.CurveTo(209.87592f, 214.44287f, 206.19193f, 214.37787f, 203.90703f, 212.09297f),
                    PathNode.CurveTo(201.62213f, 209.80807f, 201.55713f, 206.12408f, 203.76f, 203.76f),
                    PathNode.LineTo(217.52f, 190.0f),
                    PathNode.LineTo(168.0f, 190.0f),
                    PathNode.CurveTo(166.06361f, 189.99982f, 164.24634f, 189.06511f, 163.12f, 187.49f),
                    PathNode.LineTo(84.91f, 78.0f),
                    PathNode.LineTo(32.0f, 78.0f),
                    PathNode.CurveTo(28.68629f, 78.0f, 26.0f, 75.313705f, 26.0f, 72.0f),
                    PathNode.CurveTo(26.0f, 68.686295f, 28.68629f, 66.0f, 32.0f, 66.0f),
                    PathNode.LineTo(88.0f, 66.0f),
                    PathNode.CurveTo(89.93639f, 66.00018f, 91.75366f, 66.93488f, 92.88f, 68.51f),
                    PathNode.LineTo(171.09f, 178.0f),
                    PathNode.LineTo(217.52f, 178.0f),
                    PathNode.LineTo(203.76f, 164.24f),
                    PathNode.CurveTo(201.55713f, 161.87592f, 201.62213f, 158.19193f, 203.90703f, 155.90703f),
                    PathNode.CurveTo(206.19193f, 153.62213f, 209.87592f, 153.55713f, 212.24f, 155.76f),
                    PathNode.Close,
                    PathNode.MoveTo(144.17f, 105.36f),
                    PathNode.CurveTo(145.46552f, 106.28446f, 147.07527f, 106.656334f, 148.645f, 106.39377f),
                    PathNode.CurveTo(150.21474f, 106.13121f, 151.61584f, 105.25574f, 152.54f, 103.96f),
                    PathNode.LineTo(171.09f, 77.96f),
                    PathNode.LineTo(217.52f, 77.96f),
                    PathNode.LineTo(203.76f, 91.76f),
                    PathNode.CurveTo(202.15477f, 93.25577f, 201.494f, 95.508446f, 202.03691f, 97.6343f),
                    PathNode.CurveTo(202.57982f, 99.76018f, 204.23982f, 101.42017f, 206.36569f, 101.96308f),
                    PathNode.CurveTo(208.49156f, 102.506f, 210.74425f, 101.84522f, 212.24f, 100.24f),
                    PathNode.LineTo(236.24f, 76.24f),
                    PathNode.CurveTo(238.57962f, 73.89746f, 238.57962f, 70.10254f, 236.24f, 67.76f),
                    PathNode.LineTo(212.24f, 43.76f),
                    PathNode.CurveTo(209.87592f, 41.55713f, 206.19193f, 41.622128f, 203.90703f, 43.907024f),
                    PathNode.CurveTo(201.62213f, 46.19192f, 201.55713f, 49.875923f, 203.76f, 52.24f),
                    PathNode.LineTo(217.52f, 66.0f),
                    PathNode.LineTo(168.0f, 66.0f),
                    PathNode.CurveTo(166.06361f, 66.00018f, 164.24634f, 66.93488f, 163.12f, 68.51f),
                    PathNode.LineTo(142.78f, 97.0f),
                    PathNode.CurveTo(140.8596f, 99.69339f, 141.48137f, 103.432945f, 144.17f, 105.36f),
                    PathNode.Close,
                    PathNode.MoveTo(111.83f, 150.64f),
                    PathNode.CurveTo(110.53448f, 149.71553f, 108.924736f, 149.34367f, 107.355f, 149.60622f),
                    PathNode.CurveTo(105.78526f, 149.86879f, 104.38416f, 150.74426f, 103.46f, 152.04f),
                    PathNode.LineTo(84.91f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(28.68629f, 178.0f, 26.0f, 180.6863f, 26.0f, 184.0f),
                    PathNode.CurveTo(26.0f, 187.3137f, 28.68629f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(88.0f, 190.0f),
                    PathNode.CurveTo(89.93639f, 189.99982f, 91.75366f, 189.06511f, 92.88f, 187.49f),
                    PathNode.LineTo(113.22f, 159.0f),
                    PathNode.CurveTo(115.1404f, 156.30661f, 114.51862f, 152.56706f, 111.83f, 150.64f),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
