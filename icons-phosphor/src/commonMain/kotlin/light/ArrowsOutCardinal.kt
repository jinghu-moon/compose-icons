package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorLightIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(91.76f, 60.24f),
                    PathNode.CurveTo(89.42038f, 57.89746f, 89.42038f, 54.10254f, 91.76f, 51.76f),
                    PathNode.LineTo(123.76f, 19.76f),
                    PathNode.CurveTo(126.10254f, 17.420374f, 129.89746f, 17.420374f, 132.24f, 19.76f),
                    PathNode.LineTo(164.24f, 51.76f),
                    PathNode.CurveTo(165.84523f, 53.255764f, 166.506f, 55.508446f, 165.96309f, 57.63431f),
                    PathNode.CurveTo(165.42018f, 59.760178f, 163.76018f, 61.420174f, 161.63431f, 61.963085f),
                    PathNode.CurveTo(159.50844f, 62.505993f, 157.25575f, 61.845226f, 155.76f, 60.24f),
                    PathNode.LineTo(134.0f, 38.49f),
                    PathNode.LineTo(134.0f, 96.0f),
                    PathNode.CurveTo(134.0f, 99.313705f, 131.3137f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(124.686295f, 102.0f, 122.0f, 99.313705f, 122.0f, 96.0f),
                    PathNode.LineTo(122.0f, 38.49f),
                    PathNode.LineTo(100.24f, 60.24f),
                    PathNode.CurveTo(97.89746f, 62.579628f, 94.10254f, 62.579628f, 91.76f, 60.24f),
                    PathNode.Close,
                    PathNode.MoveTo(155.76f, 195.76f),
                    PathNode.LineTo(134.0f, 217.51f),
                    PathNode.LineTo(134.0f, 160.0f),
                    PathNode.CurveTo(134.0f, 156.6863f, 131.3137f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(124.686295f, 154.0f, 122.0f, 156.6863f, 122.0f, 160.0f),
                    PathNode.LineTo(122.0f, 217.51f),
                    PathNode.LineTo(100.24f, 195.76f),
                    PathNode.CurveTo(97.87592f, 193.55713f, 94.191925f, 193.62213f, 91.90703f, 195.90703f),
                    PathNode.CurveTo(89.62213f, 198.19193f, 89.55713f, 201.87592f, 91.76f, 204.24f),
                    PathNode.LineTo(123.76f, 236.24f),
                    PathNode.CurveTo(126.10254f, 238.57962f, 129.89746f, 238.57962f, 132.24f, 236.24f),
                    PathNode.LineTo(164.24f, 204.24f),
                    PathNode.CurveTo(166.44287f, 201.87592f, 166.37787f, 198.19193f, 164.09297f, 195.90703f),
                    PathNode.CurveTo(161.80807f, 193.62213f, 158.12408f, 193.55713f, 155.76f, 195.76f),
                    PathNode.Close,
                    PathNode.MoveTo(236.24f, 123.76f),
                    PathNode.LineTo(204.24f, 91.76f),
                    PathNode.CurveTo(201.87592f, 89.55713f, 198.19193f, 89.62213f, 195.90703f, 91.90703f),
                    PathNode.CurveTo(193.62213f, 94.191925f, 193.55713f, 97.87592f, 195.76f, 100.24f),
                    PathNode.LineTo(217.51f, 122.0f),
                    PathNode.LineTo(160.0f, 122.0f),
                    PathNode.CurveTo(156.6863f, 122.0f, 154.0f, 124.686295f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 131.3137f, 156.6863f, 134.0f, 160.0f, 134.0f),
                    PathNode.LineTo(217.51f, 134.0f),
                    PathNode.LineTo(195.76f, 155.76f),
                    PathNode.CurveTo(194.15477f, 157.25575f, 193.494f, 159.50844f, 194.03691f, 161.63431f),
                    PathNode.CurveTo(194.57982f, 163.76018f, 196.23982f, 165.42018f, 198.36569f, 165.96309f),
                    PathNode.CurveTo(200.49156f, 166.506f, 202.74425f, 165.84523f, 204.24f, 164.24f),
                    PathNode.LineTo(236.24f, 132.24f),
                    PathNode.CurveTo(238.57962f, 129.89746f, 238.57962f, 126.10254f, 236.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(38.49f, 134.0f),
                    PathNode.LineTo(96.0f, 134.0f),
                    PathNode.CurveTo(99.313705f, 134.0f, 102.0f, 131.3137f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 124.686295f, 99.313705f, 122.0f, 96.0f, 122.0f),
                    PathNode.LineTo(38.49f, 122.0f),
                    PathNode.LineTo(60.24f, 100.24f),
                    PathNode.CurveTo(62.44287f, 97.87592f, 62.377872f, 94.191925f, 60.092976f, 91.90703f),
                    PathNode.CurveTo(57.80808f, 89.62213f, 54.124077f, 89.55713f, 51.76f, 91.76f),
                    PathNode.LineTo(19.76f, 123.76f),
                    PathNode.CurveTo(17.420374f, 126.10254f, 17.420374f, 129.89746f, 19.76f, 132.24f),
                    PathNode.LineTo(51.76f, 164.24f),
                    PathNode.CurveTo(54.124077f, 166.44287f, 57.80808f, 166.37787f, 60.092976f, 164.09297f),
                    PathNode.CurveTo(62.377872f, 161.80807f, 62.44287f, 158.12408f, 60.24f, 155.76f),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
