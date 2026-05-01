package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorLightIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 100.24f),
                    PathNode.LineTo(140.24f, 196.24f),
                    PathNode.CurveTo(137.89746f, 198.57962f, 134.10254f, 198.57962f, 131.76f, 196.24f),
                    PathNode.LineTo(30.0f, 94.48f),
                    PathNode.LineTo(30.0f, 152.0f),
                    PathNode.CurveTo(30.0f, 155.3137f, 27.31371f, 158.0f, 24.0f, 158.0f),
                    PathNode.CurveTo(20.68629f, 158.0f, 18.0f, 155.3137f, 18.0f, 152.0f),
                    PathNode.LineTo(18.0f, 80.0f),
                    PathNode.CurveTo(18.0f, 76.686295f, 20.68629f, 74.0f, 24.0f, 74.0f),
                    PathNode.LineTo(96.0f, 74.0f),
                    PathNode.CurveTo(99.313705f, 74.0f, 102.0f, 76.686295f, 102.0f, 80.0f),
                    PathNode.CurveTo(102.0f, 83.313705f, 99.313705f, 86.0f, 96.0f, 86.0f),
                    PathNode.LineTo(38.48f, 86.0f),
                    PathNode.LineTo(136.0f, 183.51f),
                    PathNode.LineTo(227.76f, 91.76f),
                    PathNode.CurveTo(230.12408f, 89.55713f, 233.80807f, 89.62213f, 236.09297f, 91.90703f),
                    PathNode.CurveTo(238.37787f, 94.191925f, 238.44287f, 97.87592f, 236.24f, 100.24f),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
