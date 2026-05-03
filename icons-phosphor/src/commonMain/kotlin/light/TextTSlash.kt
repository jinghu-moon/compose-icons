package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorLightIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 220.44f),
                    PathNode.CurveTo(210.82278f, 221.5122f, 209.26765f, 222.07251f, 207.6771f, 221.99748f),
                    PathNode.CurveTo(206.08655f, 221.92245f, 204.59106f, 221.21826f, 203.52f, 220.04f),
                    PathNode.LineTo(134.0f, 143.52f),
                    PathNode.LineTo(134.0f, 194.0f),
                    PathNode.LineTo(160.0f, 194.0f),
                    PathNode.CurveTo(163.3137f, 194.0f, 166.0f, 196.6863f, 166.0f, 200.0f),
                    PathNode.CurveTo(166.0f, 203.3137f, 163.3137f, 206.0f, 160.0f, 206.0f),
                    PathNode.LineTo(96.0f, 206.0f),
                    PathNode.CurveTo(92.686295f, 206.0f, 90.0f, 203.3137f, 90.0f, 200.0f),
                    PathNode.CurveTo(90.0f, 196.6863f, 92.686295f, 194.0f, 96.0f, 194.0f),
                    PathNode.LineTo(122.0f, 194.0f),
                    PathNode.LineTo(122.0f, 130.32f),
                    PathNode.LineTo(62.0f, 64.32f),
                    PathNode.LineTo(62.0f, 88.0f),
                    PathNode.CurveTo(62.0f, 91.313705f, 59.31371f, 94.0f, 56.0f, 94.0f),
                    PathNode.CurveTo(52.68629f, 94.0f, 50.0f, 91.313705f, 50.0f, 88.0f),
                    PathNode.LineTo(50.0f, 56.0f),
                    PathNode.CurveTo(50.003574f, 54.71318f, 50.420765f, 53.4616f, 51.19f, 52.43f),
                    PathNode.LineTo(43.56f, 44.0f),
                    PathNode.CurveTo(41.69497f, 41.515873f, 42.03432f, 38.019005f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(46.65007f, 33.860672f, 50.163273f, 33.886772f, 52.44f, 36.0f),
                    PathNode.LineTo(212.44f, 212.0f),
                    PathNode.CurveTo(214.63576f, 214.45688f, 214.43933f, 218.22476f, 212.0f, 220.44f),
                    PathNode.Close,
                    PathNode.MoveTo(105.79f, 62.0f),
                    PathNode.LineTo(122.0f, 62.0f),
                    PathNode.LineTo(122.0f, 80.43f),
                    PathNode.CurveTo(122.0f, 83.743706f, 124.686295f, 86.43f, 128.0f, 86.43f),
                    PathNode.CurveTo(131.3137f, 86.43f, 134.0f, 83.743706f, 134.0f, 80.43f),
                    PathNode.LineTo(134.0f, 62.0f),
                    PathNode.LineTo(194.0f, 62.0f),
                    PathNode.LineTo(194.0f, 88.0f),
                    PathNode.CurveTo(194.0f, 91.313705f, 196.6863f, 94.0f, 200.0f, 94.0f),
                    PathNode.CurveTo(203.3137f, 94.0f, 206.0f, 91.313705f, 206.0f, 88.0f),
                    PathNode.LineTo(206.0f, 56.0f),
                    PathNode.CurveTo(206.0f, 52.68629f, 203.3137f, 50.0f, 200.0f, 50.0f),
                    PathNode.LineTo(105.79f, 50.0f),
                    PathNode.CurveTo(102.47629f, 50.0f, 99.79f, 52.68629f, 99.79f, 56.0f),
                    PathNode.CurveTo(99.79f, 59.31371f, 102.47629f, 62.0f, 105.79f, 62.0f),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
