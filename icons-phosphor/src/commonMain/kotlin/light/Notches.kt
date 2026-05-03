package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorLightIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 132.24f),
                    PathNode.LineTo(132.24f, 212.24f),
                    PathNode.CurveTo(130.74423f, 213.84523f, 128.49156f, 214.506f, 126.3657f, 213.96309f),
                    PathNode.CurveTo(124.23982f, 213.42018f, 122.57983f, 211.76018f, 122.03692f, 209.63431f),
                    PathNode.CurveTo(121.494f, 207.50844f, 122.15478f, 205.25575f, 123.76f, 203.76f),
                    PathNode.LineTo(203.76f, 123.76f),
                    PathNode.CurveTo(205.25575f, 122.15478f, 207.50844f, 121.494f, 209.63431f, 122.03692f),
                    PathNode.CurveTo(211.76018f, 122.57983f, 213.42018f, 124.23982f, 213.96309f, 126.3657f),
                    PathNode.CurveTo(214.506f, 128.49156f, 213.84523f, 130.74423f, 212.24f, 132.24f),
                    PathNode.Close,
                    PathNode.MoveTo(196.24f, 35.76f),
                    PathNode.CurveTo(193.89746f, 33.420372f, 190.10254f, 33.420372f, 187.76f, 35.76f),
                    PathNode.LineTo(35.76f, 187.76f),
                    PathNode.CurveTo(34.154774f, 189.25575f, 33.494007f, 191.50844f, 34.036915f, 193.63431f),
                    PathNode.CurveTo(34.579826f, 195.76018f, 36.239822f, 197.42018f, 38.36569f, 197.96309f),
                    PathNode.CurveTo(40.491554f, 198.506f, 42.744236f, 197.84523f, 44.24f, 196.24f),
                    PathNode.LineTo(196.24f, 44.24f),
                    PathNode.CurveTo(198.57962f, 41.89746f, 198.57962f, 38.10254f, 196.24f, 35.76f),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
