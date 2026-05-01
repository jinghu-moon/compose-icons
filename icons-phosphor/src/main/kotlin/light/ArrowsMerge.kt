package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorLightIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 40.0f),
                    PathNode.LineTo(190.0f, 104.0f),
                    PathNode.CurveTo(189.9986f, 105.59076f, 189.36554f, 107.11585f, 188.24f, 108.24f),
                    PathNode.LineTo(134.0f, 162.49f),
                    PathNode.LineTo(134.0f, 217.49f),
                    PathNode.LineTo(155.76f, 195.74f),
                    PathNode.CurveTo(158.12408f, 193.53712f, 161.80807f, 193.60213f, 164.09297f, 195.88702f),
                    PathNode.CurveTo(166.37787f, 198.17192f, 166.44287f, 201.85593f, 164.24f, 204.22f),
                    PathNode.LineTo(132.24f, 236.22f),
                    PathNode.CurveTo(129.89746f, 238.55963f, 126.10254f, 238.55963f, 123.76f, 236.22f),
                    PathNode.LineTo(91.76f, 204.22f),
                    PathNode.CurveTo(89.55713f, 201.85593f, 89.62213f, 198.17192f, 91.90703f, 195.88702f),
                    PathNode.CurveTo(94.191925f, 193.60213f, 97.87592f, 193.53712f, 100.24f, 195.74f),
                    PathNode.LineTo(122.0f, 217.51f),
                    PathNode.LineTo(122.0f, 162.51f),
                    PathNode.LineTo(67.76f, 108.24f),
                    PathNode.CurveTo(66.63446f, 107.11585f, 66.0014f, 105.59076f, 66.0f, 104.0f),
                    PathNode.LineTo(66.0f, 40.0f),
                    PathNode.CurveTo(66.0f, 36.68629f, 68.686295f, 34.0f, 72.0f, 34.0f),
                    PathNode.CurveTo(75.313705f, 34.0f, 78.0f, 36.68629f, 78.0f, 40.0f),
                    PathNode.LineTo(78.0f, 101.51f),
                    PathNode.LineTo(128.0f, 151.51f),
                    PathNode.LineTo(178.0f, 101.51f),
                    PathNode.LineTo(178.0f, 40.0f),
                    PathNode.CurveTo(178.0f, 36.68629f, 180.6863f, 34.0f, 184.0f, 34.0f),
                    PathNode.CurveTo(187.3137f, 34.0f, 190.0f, 36.68629f, 190.0f, 40.0f),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
