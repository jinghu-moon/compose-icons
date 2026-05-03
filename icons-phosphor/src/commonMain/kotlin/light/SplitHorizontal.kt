package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorLightIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(110.0f, 48.0f),
                    PathNode.LineTo(110.0f, 208.0f),
                    PathNode.CurveTo(110.0f, 211.3137f, 107.313705f, 214.0f, 104.0f, 214.0f),
                    PathNode.CurveTo(100.686295f, 214.0f, 98.0f, 211.3137f, 98.0f, 208.0f),
                    PathNode.LineTo(98.0f, 134.0f),
                    PathNode.LineTo(38.49f, 134.0f),
                    PathNode.LineTo(60.24f, 155.76f),
                    PathNode.CurveTo(61.845226f, 157.25575f, 62.505993f, 159.50844f, 61.963085f, 161.63431f),
                    PathNode.CurveTo(61.420174f, 163.76018f, 59.760178f, 165.42018f, 57.63431f, 165.96309f),
                    PathNode.CurveTo(55.508446f, 166.506f, 53.255764f, 165.84523f, 51.76f, 164.24f),
                    PathNode.LineTo(19.76f, 132.24f),
                    PathNode.CurveTo(17.420374f, 129.89746f, 17.420374f, 126.10254f, 19.76f, 123.76f),
                    PathNode.LineTo(51.76f, 91.76f),
                    PathNode.CurveTo(54.124077f, 89.55713f, 57.80808f, 89.62213f, 60.092976f, 91.90703f),
                    PathNode.CurveTo(62.377872f, 94.191925f, 62.44287f, 97.87592f, 60.24f, 100.24f),
                    PathNode.LineTo(38.49f, 122.0f),
                    PathNode.LineTo(98.0f, 122.0f),
                    PathNode.LineTo(98.0f, 48.0f),
                    PathNode.CurveTo(98.0f, 44.68629f, 100.686295f, 42.0f, 104.0f, 42.0f),
                    PathNode.CurveTo(107.313705f, 42.0f, 110.0f, 44.68629f, 110.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.24f, 123.76f),
                    PathNode.LineTo(204.24f, 91.76f),
                    PathNode.CurveTo(201.87592f, 89.55713f, 198.19193f, 89.62213f, 195.90703f, 91.90703f),
                    PathNode.CurveTo(193.62213f, 94.191925f, 193.55713f, 97.87592f, 195.76f, 100.24f),
                    PathNode.LineTo(217.51f, 122.0f),
                    PathNode.LineTo(158.0f, 122.0f),
                    PathNode.LineTo(158.0f, 48.0f),
                    PathNode.CurveTo(158.0f, 44.68629f, 155.3137f, 42.0f, 152.0f, 42.0f),
                    PathNode.CurveTo(148.6863f, 42.0f, 146.0f, 44.68629f, 146.0f, 48.0f),
                    PathNode.LineTo(146.0f, 208.0f),
                    PathNode.CurveTo(146.0f, 211.3137f, 148.6863f, 214.0f, 152.0f, 214.0f),
                    PathNode.CurveTo(155.3137f, 214.0f, 158.0f, 211.3137f, 158.0f, 208.0f),
                    PathNode.LineTo(158.0f, 134.0f),
                    PathNode.LineTo(217.51f, 134.0f),
                    PathNode.LineTo(195.76f, 155.76f),
                    PathNode.CurveTo(194.15477f, 157.25575f, 193.494f, 159.50844f, 194.03691f, 161.63431f),
                    PathNode.CurveTo(194.57982f, 163.76018f, 196.23982f, 165.42018f, 198.36569f, 165.96309f),
                    PathNode.CurveTo(200.49156f, 166.506f, 202.74425f, 165.84523f, 204.24f, 164.24f),
                    PathNode.LineTo(236.24f, 132.24f),
                    PathNode.CurveTo(238.57962f, 129.89746f, 238.57962f, 126.10254f, 236.24f, 123.76f),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
