package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorLightIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 35.56f),
                    PathNode.CurveTo(210.82278f, 34.48779f, 209.26765f, 33.927498f, 207.6771f, 34.00252f),
                    PathNode.CurveTo(206.08655f, 34.077545f, 204.59106f, 34.78174f, 203.52f, 35.96f),
                    PathNode.LineTo(198.03f, 41.96f),
                    PathNode.LineTo(128.0f, 41.96f),
                    PathNode.CurveTo(93.54292f, 41.9151f, 62.391148f, 62.4574f, 48.86044f, 94.14671f),
                    PathNode.CurveTo(35.32973f, 125.83602f, 42.03703f, 162.5434f, 65.9f, 187.4f),
                    PathNode.LineTo(43.56f, 212.0f),
                    PathNode.CurveTo(41.69497f, 214.48413f, 42.03432f, 217.98099f, 44.342197f, 220.06017f),
                    PathNode.CurveTo(46.65007f, 222.13933f, 50.163273f, 222.11322f, 52.44f, 220.0f),
                    PathNode.LineTo(74.77f, 195.43f),
                    PathNode.CurveTo(89.90439f, 207.45853f, 108.66776f, 214.00438f, 128.0f, 214.0f),
                    PathNode.LineTo(200.0f, 214.0f),
                    PathNode.CurveTo(203.3137f, 214.0f, 206.0f, 211.3137f, 206.0f, 208.0f),
                    PathNode.CurveTo(206.0f, 204.6863f, 203.3137f, 202.0f, 200.0f, 202.0f),
                    PathNode.LineTo(128.0f, 202.0f),
                    PathNode.CurveTo(111.65936f, 202.0099f, 95.77942f, 196.58525f, 82.86f, 186.58f),
                    PathNode.LineTo(130.65f, 134.0f),
                    PathNode.LineTo(200.0f, 134.0f),
                    PathNode.CurveTo(203.3137f, 134.0f, 206.0f, 131.3137f, 206.0f, 128.0f),
                    PathNode.CurveTo(206.0f, 124.686295f, 203.3137f, 122.0f, 200.0f, 122.0f),
                    PathNode.LineTo(141.56f, 122.0f),
                    PathNode.LineTo(212.44f, 44.0f),
                    PathNode.CurveTo(214.63576f, 41.54313f, 214.43933f, 37.775234f, 212.0f, 35.56f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 178.5f),
                    PathNode.CurveTo(62.572197f, 166.329f, 55.61275f, 150.64026f, 54.26f, 134.0f),
                    PathNode.LineTo(114.44f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.26f, 122.0f),
                    PathNode.CurveTo(57.426163f, 83.61087f, 89.48056f, 54.05162f, 128.0f, 54.0f),
                    PathNode.LineTo(187.16f, 54.0f),
                    PathNode.LineTo(125.35f, 122.0f),
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
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
