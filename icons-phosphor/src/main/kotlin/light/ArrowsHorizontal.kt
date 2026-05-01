package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorLightIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 132.24f),
                    PathNode.LineTo(204.24f, 164.24f),
                    PathNode.CurveTo(201.87592f, 166.44287f, 198.19193f, 166.37787f, 195.90703f, 164.09297f),
                    PathNode.CurveTo(193.62213f, 161.80807f, 193.55713f, 158.12408f, 195.76f, 155.76f),
                    PathNode.LineTo(217.51f, 134.0f),
                    PathNode.LineTo(38.51f, 134.0f),
                    PathNode.LineTo(60.26f, 155.76f),
                    PathNode.CurveTo(61.865227f, 157.25575f, 62.525993f, 159.50844f, 61.983086f, 161.63431f),
                    PathNode.CurveTo(61.440174f, 163.76018f, 59.78018f, 165.42018f, 57.654312f, 165.96309f),
                    PathNode.CurveTo(55.528446f, 166.506f, 53.275764f, 165.84523f, 51.78f, 164.24f),
                    PathNode.LineTo(19.78f, 132.24f),
                    PathNode.CurveTo(17.440372f, 129.89746f, 17.440372f, 126.10254f, 19.78f, 123.76f),
                    PathNode.LineTo(51.78f, 91.76f),
                    PathNode.CurveTo(54.144077f, 89.55713f, 57.82808f, 89.62213f, 60.112976f, 91.90703f),
                    PathNode.CurveTo(62.39787f, 94.191925f, 62.46287f, 97.87592f, 60.26f, 100.24f),
                    PathNode.LineTo(38.49f, 122.0f),
                    PathNode.LineTo(217.49f, 122.0f),
                    PathNode.LineTo(195.74f, 100.24f),
                    PathNode.CurveTo(193.53712f, 97.87592f, 193.60213f, 94.191925f, 195.88702f, 91.90703f),
                    PathNode.CurveTo(198.17192f, 89.62213f, 201.85593f, 89.55713f, 204.22f, 91.76f),
                    PathNode.LineTo(236.22f, 123.76f),
                    PathNode.CurveTo(238.56516f, 126.097015f, 238.57411f, 129.89195f, 236.24f, 132.24f),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
