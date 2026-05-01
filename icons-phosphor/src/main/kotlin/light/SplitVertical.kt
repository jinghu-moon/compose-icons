package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorLightIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 152.0f),
                    PathNode.CurveTo(214.0f, 155.3137f, 211.3137f, 158.0f, 208.0f, 158.0f),
                    PathNode.LineTo(134.0f, 158.0f),
                    PathNode.LineTo(134.0f, 217.51f),
                    PathNode.LineTo(155.76f, 195.76f),
                    PathNode.CurveTo(158.12408f, 193.55713f, 161.80807f, 193.62213f, 164.09297f, 195.90703f),
                    PathNode.CurveTo(166.37787f, 198.19193f, 166.44287f, 201.87592f, 164.24f, 204.24f),
                    PathNode.LineTo(132.24f, 236.24f),
                    PathNode.CurveTo(129.89746f, 238.57962f, 126.10254f, 238.57962f, 123.76f, 236.24f),
                    PathNode.LineTo(91.76f, 204.24f),
                    PathNode.CurveTo(89.55713f, 201.87592f, 89.62213f, 198.19193f, 91.90703f, 195.90703f),
                    PathNode.CurveTo(94.191925f, 193.62213f, 97.87592f, 193.55713f, 100.24f, 195.76f),
                    PathNode.LineTo(122.0f, 217.51f),
                    PathNode.LineTo(122.0f, 158.0f),
                    PathNode.LineTo(48.0f, 158.0f),
                    PathNode.CurveTo(44.68629f, 158.0f, 42.0f, 155.3137f, 42.0f, 152.0f),
                    PathNode.CurveTo(42.0f, 148.6863f, 44.68629f, 146.0f, 48.0f, 146.0f),
                    PathNode.LineTo(208.0f, 146.0f),
                    PathNode.CurveTo(211.3137f, 146.0f, 214.0f, 148.6863f, 214.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 110.0f),
                    PathNode.LineTo(208.0f, 110.0f),
                    PathNode.CurveTo(211.3137f, 110.0f, 214.0f, 107.313705f, 214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 100.686295f, 211.3137f, 98.0f, 208.0f, 98.0f),
                    PathNode.LineTo(134.0f, 98.0f),
                    PathNode.LineTo(134.0f, 38.49f),
                    PathNode.LineTo(155.76f, 60.24f),
                    PathNode.CurveTo(158.12408f, 62.44287f, 161.80807f, 62.377872f, 164.09297f, 60.092976f),
                    PathNode.CurveTo(166.37787f, 57.80808f, 166.44287f, 54.124077f, 164.24f, 51.76f),
                    PathNode.LineTo(132.24f, 19.76f),
                    PathNode.CurveTo(129.89746f, 17.420374f, 126.10254f, 17.420374f, 123.76f, 19.76f),
                    PathNode.LineTo(91.76f, 51.76f),
                    PathNode.CurveTo(89.55713f, 54.124077f, 89.62213f, 57.80808f, 91.90703f, 60.092976f),
                    PathNode.CurveTo(94.191925f, 62.377872f, 97.87592f, 62.44287f, 100.24f, 60.24f),
                    PathNode.LineTo(122.0f, 38.49f),
                    PathNode.LineTo(122.0f, 98.0f),
                    PathNode.LineTo(48.0f, 98.0f),
                    PathNode.CurveTo(44.68629f, 98.0f, 42.0f, 100.686295f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 107.313705f, 44.68629f, 110.0f, 48.0f, 110.0f),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
