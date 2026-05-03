package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorLightIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 48.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(214.0f, 91.313705f, 211.3137f, 94.0f, 208.0f, 94.0f),
                    PathNode.CurveTo(204.6863f, 94.0f, 202.0f, 91.313705f, 202.0f, 88.0f),
                    PathNode.LineTo(202.0f, 62.48f),
                    PathNode.LineTo(154.87f, 109.62f),
                    PathNode.CurveTo(152.52556f, 111.96445f, 148.72444f, 111.96445f, 146.38f, 109.62f),
                    PathNode.CurveTo(144.03555f, 107.27555f, 144.03555f, 103.47445f, 146.38f, 101.13f),
                    PathNode.LineTo(193.52f, 54.0f),
                    PathNode.LineTo(168.0f, 54.0f),
                    PathNode.CurveTo(164.6863f, 54.0f, 162.0f, 51.31371f, 162.0f, 48.0f),
                    PathNode.CurveTo(162.0f, 44.68629f, 164.6863f, 42.0f, 168.0f, 42.0f),
                    PathNode.LineTo(208.0f, 42.0f),
                    PathNode.CurveTo(211.3137f, 42.0f, 214.0f, 44.68629f, 214.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 162.0f),
                    PathNode.CurveTo(204.6863f, 162.0f, 202.0f, 164.6863f, 202.0f, 168.0f),
                    PathNode.LineTo(202.0f, 193.52f),
                    PathNode.LineTo(52.24f, 43.76f),
                    PathNode.CurveTo(49.875923f, 41.55713f, 46.19192f, 41.622128f, 43.907024f, 43.907024f),
                    PathNode.CurveTo(41.622128f, 46.19192f, 41.55713f, 49.875923f, 43.76f, 52.24f),
                    PathNode.LineTo(193.52f, 202.0f),
                    PathNode.LineTo(168.0f, 202.0f),
                    PathNode.CurveTo(164.6863f, 202.0f, 162.0f, 204.6863f, 162.0f, 208.0f),
                    PathNode.CurveTo(162.0f, 211.3137f, 164.6863f, 214.0f, 168.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(211.3137f, 214.0f, 214.0f, 211.3137f, 214.0f, 208.0f),
                    PathNode.LineTo(214.0f, 168.0f),
                    PathNode.CurveTo(214.0f, 164.6863f, 211.3137f, 162.0f, 208.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.13f, 146.38f),
                    PathNode.LineTo(43.76f, 203.76f),
                    PathNode.CurveTo(42.154774f, 205.25575f, 41.494007f, 207.50844f, 42.036915f, 209.63431f),
                    PathNode.CurveTo(42.579826f, 211.76018f, 44.239822f, 213.42018f, 46.36569f, 213.96309f),
                    PathNode.CurveTo(48.491554f, 214.506f, 50.744236f, 213.84523f, 52.24f, 212.24f),
                    PathNode.LineTo(109.62f, 154.87f),
                    PathNode.CurveTo(111.96445f, 152.52556f, 111.96445f, 148.72444f, 109.62f, 146.38f),
                    PathNode.CurveTo(107.27555f, 144.03555f, 103.47445f, 144.03555f, 101.13f, 146.38f),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
