package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorLightIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(146.0f, 104.0f),
                    PathNode.LineTo(146.0f, 64.0f),
                    PathNode.CurveTo(146.0f, 60.68629f, 148.6863f, 58.0f, 152.0f, 58.0f),
                    PathNode.CurveTo(155.3137f, 58.0f, 158.0f, 60.68629f, 158.0f, 64.0f),
                    PathNode.LineTo(158.0f, 89.51f),
                    PathNode.LineTo(203.76f, 43.76f),
                    PathNode.CurveTo(206.12408f, 41.55713f, 209.80807f, 41.622128f, 212.09297f, 43.907024f),
                    PathNode.CurveTo(214.37787f, 46.19192f, 214.44287f, 49.875923f, 212.24f, 52.24f),
                    PathNode.LineTo(166.48f, 98.0f),
                    PathNode.LineTo(192.0f, 98.0f),
                    PathNode.CurveTo(195.3137f, 98.0f, 198.0f, 100.686295f, 198.0f, 104.0f),
                    PathNode.CurveTo(198.0f, 107.313705f, 195.3137f, 110.0f, 192.0f, 110.0f),
                    PathNode.LineTo(152.0f, 110.0f),
                    PathNode.CurveTo(148.6863f, 110.0f, 146.0f, 107.313705f, 146.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 146.0f),
                    PathNode.LineTo(64.0f, 146.0f),
                    PathNode.CurveTo(60.68629f, 146.0f, 58.0f, 148.6863f, 58.0f, 152.0f),
                    PathNode.CurveTo(58.0f, 155.3137f, 60.68629f, 158.0f, 64.0f, 158.0f),
                    PathNode.LineTo(89.52f, 158.0f),
                    PathNode.LineTo(43.76f, 203.76f),
                    PathNode.CurveTo(42.154774f, 205.25575f, 41.494007f, 207.50844f, 42.036915f, 209.63431f),
                    PathNode.CurveTo(42.579826f, 211.76018f, 44.239822f, 213.42018f, 46.36569f, 213.96309f),
                    PathNode.CurveTo(48.491554f, 214.506f, 50.744236f, 213.84523f, 52.24f, 212.24f),
                    PathNode.LineTo(98.0f, 166.48f),
                    PathNode.LineTo(98.0f, 192.0f),
                    PathNode.CurveTo(98.0f, 195.3137f, 100.686295f, 198.0f, 104.0f, 198.0f),
                    PathNode.CurveTo(107.313705f, 198.0f, 110.0f, 195.3137f, 110.0f, 192.0f),
                    PathNode.LineTo(110.0f, 152.0f),
                    PathNode.CurveTo(110.0f, 148.6863f, 107.313705f, 146.0f, 104.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.48f, 158.0f),
                    PathNode.LineTo(192.0f, 158.0f),
                    PathNode.CurveTo(195.3137f, 158.0f, 198.0f, 155.3137f, 198.0f, 152.0f),
                    PathNode.CurveTo(198.0f, 148.6863f, 195.3137f, 146.0f, 192.0f, 146.0f),
                    PathNode.LineTo(152.0f, 146.0f),
                    PathNode.CurveTo(148.6863f, 146.0f, 146.0f, 148.6863f, 146.0f, 152.0f),
                    PathNode.LineTo(146.0f, 192.0f),
                    PathNode.CurveTo(146.0f, 195.3137f, 148.6863f, 198.0f, 152.0f, 198.0f),
                    PathNode.CurveTo(155.3137f, 198.0f, 158.0f, 195.3137f, 158.0f, 192.0f),
                    PathNode.LineTo(158.0f, 166.48f),
                    PathNode.LineTo(203.76f, 212.24f),
                    PathNode.CurveTo(206.12408f, 214.44287f, 209.80807f, 214.37787f, 212.09297f, 212.09297f),
                    PathNode.CurveTo(214.37787f, 209.80807f, 214.44287f, 206.12408f, 212.24f, 203.76f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 58.0f),
                    PathNode.CurveTo(100.686295f, 58.0f, 98.0f, 60.68629f, 98.0f, 64.0f),
                    PathNode.LineTo(98.0f, 89.51f),
                    PathNode.LineTo(52.24f, 43.76f),
                    PathNode.CurveTo(49.875923f, 41.55713f, 46.19192f, 41.622128f, 43.907024f, 43.907024f),
                    PathNode.CurveTo(41.622128f, 46.19192f, 41.55713f, 49.875923f, 43.76f, 52.24f),
                    PathNode.LineTo(89.52f, 98.0f),
                    PathNode.LineTo(64.0f, 98.0f),
                    PathNode.CurveTo(60.68629f, 98.0f, 58.0f, 100.686295f, 58.0f, 104.0f),
                    PathNode.CurveTo(58.0f, 107.313705f, 60.68629f, 110.0f, 64.0f, 110.0f),
                    PathNode.LineTo(104.0f, 110.0f),
                    PathNode.CurveTo(107.313705f, 110.0f, 110.0f, 107.313705f, 110.0f, 104.0f),
                    PathNode.LineTo(110.0f, 64.0f),
                    PathNode.CurveTo(110.0f, 60.68629f, 107.313705f, 58.0f, 104.0f, 58.0f),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
