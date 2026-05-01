package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorLightIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 108.24f),
                    PathNode.LineTo(180.24f, 156.24f),
                    PathNode.CurveTo(177.87592f, 158.44287f, 174.19193f, 158.37787f, 171.90703f, 156.09297f),
                    PathNode.CurveTo(169.62213f, 153.80807f, 169.55713f, 150.12408f, 171.76f, 147.76f),
                    PathNode.LineTo(215.51f, 104.0f),
                    PathNode.LineTo(171.76f, 60.24f),
                    PathNode.CurveTo(169.55713f, 57.875923f, 169.62213f, 54.19192f, 171.90703f, 51.907024f),
                    PathNode.CurveTo(174.19193f, 49.622128f, 177.87592f, 49.55713f, 180.24f, 51.76f),
                    PathNode.LineTo(228.24f, 99.76f),
                    PathNode.CurveTo(230.57962f, 102.10254f, 230.57962f, 105.89746f, 228.24f, 108.24f),
                    PathNode.Close,
                    PathNode.MoveTo(180.24f, 99.76f),
                    PathNode.LineTo(132.24f, 51.76f),
                    PathNode.CurveTo(130.74423f, 50.154774f, 128.49156f, 49.494007f, 126.3657f, 50.036915f),
                    PathNode.CurveTo(124.23982f, 50.579826f, 122.57983f, 52.239822f, 122.03692f, 54.36569f),
                    PathNode.CurveTo(121.494f, 56.491554f, 122.15478f, 58.744236f, 123.76f, 60.24f),
                    PathNode.LineTo(161.51f, 98.0f),
                    PathNode.LineTo(128.0f, 98.0f),
                    PathNode.CurveTo(71.69437f, 98.06612f, 26.066126f, 143.69437f, 26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 203.3137f, 28.68629f, 206.0f, 32.0f, 206.0f),
                    PathNode.CurveTo(35.31371f, 206.0f, 38.0f, 203.3137f, 38.0f, 200.0f),
                    PathNode.CurveTo(38.05511f, 150.31721f, 78.317215f, 110.055115f, 128.0f, 110.0f),
                    PathNode.LineTo(161.51f, 110.0f),
                    PathNode.LineTo(123.76f, 147.76f),
                    PathNode.CurveTo(122.15478f, 149.25575f, 121.494f, 151.50844f, 122.03692f, 153.63431f),
                    PathNode.CurveTo(122.57983f, 155.76018f, 124.23982f, 157.42018f, 126.3657f, 157.96309f),
                    PathNode.CurveTo(128.49156f, 158.506f, 130.74423f, 157.84523f, 132.24f, 156.24f),
                    PathNode.LineTo(180.24f, 108.24f),
                    PathNode.CurveTo(182.57962f, 105.89746f, 182.57962f, 102.10254f, 180.24f, 99.76f),
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
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
