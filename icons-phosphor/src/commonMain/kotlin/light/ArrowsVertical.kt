package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorLightIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.24f, 195.76f),
                    PathNode.CurveTo(166.57962f, 198.10254f, 166.57962f, 201.89746f, 164.24f, 204.24f),
                    PathNode.LineTo(132.24f, 236.24f),
                    PathNode.CurveTo(129.89746f, 238.57962f, 126.10254f, 238.57962f, 123.76f, 236.24f),
                    PathNode.LineTo(91.76f, 204.24f),
                    PathNode.CurveTo(89.55713f, 201.87592f, 89.62213f, 198.19193f, 91.90703f, 195.90703f),
                    PathNode.CurveTo(94.191925f, 193.62213f, 97.87592f, 193.55713f, 100.24f, 195.76f),
                    PathNode.LineTo(122.0f, 217.51f),
                    PathNode.LineTo(122.0f, 38.51f),
                    PathNode.LineTo(100.24f, 60.24f),
                    PathNode.CurveTo(97.87592f, 62.44287f, 94.191925f, 62.377872f, 91.90703f, 60.092976f),
                    PathNode.CurveTo(89.62213f, 57.80808f, 89.55713f, 54.124077f, 91.76f, 51.76f),
                    PathNode.LineTo(123.76f, 19.76f),
                    PathNode.CurveTo(126.10254f, 17.420374f, 129.89746f, 17.420374f, 132.24f, 19.76f),
                    PathNode.LineTo(164.24f, 51.76f),
                    PathNode.CurveTo(165.84523f, 53.255764f, 166.506f, 55.508446f, 165.96309f, 57.63431f),
                    PathNode.CurveTo(165.42018f, 59.760178f, 163.76018f, 61.420174f, 161.63431f, 61.963085f),
                    PathNode.CurveTo(159.50844f, 62.505993f, 157.25575f, 61.845226f, 155.76f, 60.24f),
                    PathNode.LineTo(134.0f, 38.49f),
                    PathNode.LineTo(134.0f, 217.49f),
                    PathNode.LineTo(155.76f, 195.74f),
                    PathNode.CurveTo(158.10805f, 193.40588f, 161.90298f, 193.41484f, 164.24f, 195.76f),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
