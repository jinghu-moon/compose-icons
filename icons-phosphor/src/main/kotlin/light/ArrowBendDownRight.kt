package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorLightIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 156.24f),
                    PathNode.LineTo(180.24f, 204.24f),
                    PathNode.CurveTo(177.87592f, 206.44287f, 174.19193f, 206.37787f, 171.90703f, 204.09297f),
                    PathNode.CurveTo(169.62213f, 201.80807f, 169.55713f, 198.12408f, 171.76f, 195.76f),
                    PathNode.LineTo(209.51f, 158.0f),
                    PathNode.LineTo(128.0f, 158.0f),
                    PathNode.CurveTo(71.69437f, 157.93387f, 26.066126f, 112.30563f, 26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 52.68629f, 28.68629f, 50.0f, 32.0f, 50.0f),
                    PathNode.CurveTo(35.31371f, 50.0f, 38.0f, 52.68629f, 38.0f, 56.0f),
                    PathNode.CurveTo(38.05511f, 105.682785f, 78.317215f, 145.94489f, 128.0f, 146.0f),
                    PathNode.LineTo(209.51f, 146.0f),
                    PathNode.LineTo(171.76f, 108.24f),
                    PathNode.CurveTo(169.55713f, 105.87592f, 169.62213f, 102.191925f, 171.90703f, 99.90703f),
                    PathNode.CurveTo(174.19193f, 97.62213f, 177.87592f, 97.55713f, 180.24f, 99.76f),
                    PathNode.LineTo(228.24f, 147.76f),
                    PathNode.CurveTo(230.57962f, 150.10254f, 230.57962f, 153.89746f, 228.24f, 156.24f),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
