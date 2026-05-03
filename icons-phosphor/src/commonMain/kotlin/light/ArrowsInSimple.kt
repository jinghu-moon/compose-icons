package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorLightIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 52.24f),
                    PathNode.LineTo(158.48f, 106.0f),
                    PathNode.LineTo(192.0f, 106.0f),
                    PathNode.CurveTo(195.3137f, 106.0f, 198.0f, 108.686295f, 198.0f, 112.0f),
                    PathNode.CurveTo(198.0f, 115.313705f, 195.3137f, 118.0f, 192.0f, 118.0f),
                    PathNode.LineTo(144.0f, 118.0f),
                    PathNode.CurveTo(140.6863f, 118.0f, 138.0f, 115.313705f, 138.0f, 112.0f),
                    PathNode.LineTo(138.0f, 64.0f),
                    PathNode.CurveTo(138.0f, 60.68629f, 140.6863f, 58.0f, 144.0f, 58.0f),
                    PathNode.CurveTo(147.3137f, 58.0f, 150.0f, 60.68629f, 150.0f, 64.0f),
                    PathNode.LineTo(150.0f, 97.52f),
                    PathNode.LineTo(203.76f, 43.76f),
                    PathNode.CurveTo(206.12408f, 41.55713f, 209.80807f, 41.622128f, 212.09297f, 43.907024f),
                    PathNode.CurveTo(214.37787f, 46.19192f, 214.44287f, 49.875923f, 212.24f, 52.24f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 138.0f),
                    PathNode.LineTo(64.0f, 138.0f),
                    PathNode.CurveTo(60.68629f, 138.0f, 58.0f, 140.6863f, 58.0f, 144.0f),
                    PathNode.CurveTo(58.0f, 147.3137f, 60.68629f, 150.0f, 64.0f, 150.0f),
                    PathNode.LineTo(97.52f, 150.0f),
                    PathNode.LineTo(43.76f, 203.76f),
                    PathNode.CurveTo(42.154774f, 205.25575f, 41.494007f, 207.50844f, 42.036915f, 209.63431f),
                    PathNode.CurveTo(42.579826f, 211.76018f, 44.239822f, 213.42018f, 46.36569f, 213.96309f),
                    PathNode.CurveTo(48.491554f, 214.506f, 50.744236f, 213.84523f, 52.24f, 212.24f),
                    PathNode.LineTo(106.0f, 158.48f),
                    PathNode.LineTo(106.0f, 192.0f),
                    PathNode.CurveTo(106.0f, 195.3137f, 108.686295f, 198.0f, 112.0f, 198.0f),
                    PathNode.CurveTo(115.313705f, 198.0f, 118.0f, 195.3137f, 118.0f, 192.0f),
                    PathNode.LineTo(118.0f, 144.0f),
                    PathNode.CurveTo(118.0f, 140.6863f, 115.313705f, 138.0f, 112.0f, 138.0f),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
