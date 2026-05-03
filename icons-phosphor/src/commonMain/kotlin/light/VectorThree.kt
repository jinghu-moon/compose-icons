package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorLightIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 140.24f),
                    PathNode.LineTo(204.24f, 172.24f),
                    PathNode.CurveTo(201.87592f, 174.44287f, 198.19193f, 174.37787f, 195.90703f, 172.09297f),
                    PathNode.CurveTo(193.62213f, 169.80807f, 193.55713f, 166.12408f, 195.76f, 163.76f),
                    PathNode.LineTo(217.51f, 142.0f),
                    PathNode.LineTo(122.51f, 142.0f),
                    PathNode.LineTo(62.51f, 202.0f),
                    PathNode.LineTo(96.0f, 202.0f),
                    PathNode.CurveTo(99.313705f, 202.0f, 102.0f, 204.6863f, 102.0f, 208.0f),
                    PathNode.CurveTo(102.0f, 211.3137f, 99.313705f, 214.0f, 96.0f, 214.0f),
                    PathNode.LineTo(48.0f, 214.0f),
                    PathNode.CurveTo(44.68629f, 214.0f, 42.0f, 211.3137f, 42.0f, 208.0f),
                    PathNode.LineTo(42.0f, 160.0f),
                    PathNode.CurveTo(42.0f, 156.6863f, 44.68629f, 154.0f, 48.0f, 154.0f),
                    PathNode.CurveTo(51.31371f, 154.0f, 54.0f, 156.6863f, 54.0f, 160.0f),
                    PathNode.LineTo(54.0f, 193.51f),
                    PathNode.LineTo(114.0f, 133.51f),
                    PathNode.LineTo(114.0f, 38.51f),
                    PathNode.LineTo(92.24f, 60.24f),
                    PathNode.CurveTo(89.87592f, 62.44287f, 86.191925f, 62.377872f, 83.90703f, 60.092976f),
                    PathNode.CurveTo(81.62213f, 57.80808f, 81.55713f, 54.124077f, 83.76f, 51.76f),
                    PathNode.LineTo(115.76f, 19.76f),
                    PathNode.CurveTo(118.10254f, 17.420374f, 121.89746f, 17.420374f, 124.24f, 19.76f),
                    PathNode.LineTo(156.24f, 51.76f),
                    PathNode.CurveTo(157.84523f, 53.255764f, 158.506f, 55.508446f, 157.96309f, 57.63431f),
                    PathNode.CurveTo(157.42018f, 59.760178f, 155.76018f, 61.420174f, 153.63431f, 61.963085f),
                    PathNode.CurveTo(151.50844f, 62.505993f, 149.25575f, 61.845226f, 147.76f, 60.24f),
                    PathNode.LineTo(126.0f, 38.49f),
                    PathNode.LineTo(126.0f, 130.0f),
                    PathNode.LineTo(217.51f, 130.0f),
                    PathNode.LineTo(195.76f, 108.24f),
                    PathNode.CurveTo(193.55713f, 105.87592f, 193.62213f, 102.191925f, 195.90703f, 99.90703f),
                    PathNode.CurveTo(198.19193f, 97.62213f, 201.87592f, 97.55713f, 204.24f, 99.76f),
                    PathNode.LineTo(236.24f, 131.76f),
                    PathNode.CurveTo(238.57962f, 134.10254f, 238.57962f, 137.89746f, 236.24f, 140.24f),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
