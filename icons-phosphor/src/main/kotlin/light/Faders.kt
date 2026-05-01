package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorLightIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 120.0f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 120.0f),
                    PathNode.CurveTo(122.0f, 116.686295f, 124.686295f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(131.3137f, 114.0f, 134.0f, 116.686295f, 134.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 194.0f),
                    PathNode.CurveTo(196.6863f, 194.0f, 194.0f, 196.6863f, 194.0f, 200.0f),
                    PathNode.LineTo(194.0f, 216.0f),
                    PathNode.CurveTo(194.0f, 219.3137f, 196.6863f, 222.0f, 200.0f, 222.0f),
                    PathNode.CurveTo(203.3137f, 222.0f, 206.0f, 219.3137f, 206.0f, 216.0f),
                    PathNode.LineTo(206.0f, 200.0f),
                    PathNode.CurveTo(206.0f, 196.6863f, 203.3137f, 194.0f, 200.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 162.0f),
                    PathNode.LineTo(206.0f, 162.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 36.68629f, 203.3137f, 34.0f, 200.0f, 34.0f),
                    PathNode.CurveTo(196.6863f, 34.0f, 194.0f, 36.68629f, 194.0f, 40.0f),
                    PathNode.LineTo(194.0f, 162.0f),
                    PathNode.LineTo(176.0f, 162.0f),
                    PathNode.CurveTo(172.6863f, 162.0f, 170.0f, 164.6863f, 170.0f, 168.0f),
                    PathNode.CurveTo(170.0f, 171.3137f, 172.6863f, 174.0f, 176.0f, 174.0f),
                    PathNode.LineTo(224.0f, 174.0f),
                    PathNode.CurveTo(227.3137f, 174.0f, 230.0f, 171.3137f, 230.0f, 168.0f),
                    PathNode.CurveTo(230.0f, 164.6863f, 227.3137f, 162.0f, 224.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 162.0f),
                    PathNode.CurveTo(52.68629f, 162.0f, 50.0f, 164.6863f, 50.0f, 168.0f),
                    PathNode.LineTo(50.0f, 216.0f),
                    PathNode.CurveTo(50.0f, 219.3137f, 52.68629f, 222.0f, 56.0f, 222.0f),
                    PathNode.CurveTo(59.31371f, 222.0f, 62.0f, 219.3137f, 62.0f, 216.0f),
                    PathNode.LineTo(62.0f, 168.0f),
                    PathNode.CurveTo(62.0f, 164.6863f, 59.31371f, 162.0f, 56.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 130.0f),
                    PathNode.LineTo(62.0f, 130.0f),
                    PathNode.LineTo(62.0f, 40.0f),
                    PathNode.CurveTo(62.0f, 36.68629f, 59.31371f, 34.0f, 56.0f, 34.0f),
                    PathNode.CurveTo(52.68629f, 34.0f, 50.0f, 36.68629f, 50.0f, 40.0f),
                    PathNode.LineTo(50.0f, 130.0f),
                    PathNode.LineTo(32.0f, 130.0f),
                    PathNode.CurveTo(28.68629f, 130.0f, 26.0f, 132.6863f, 26.0f, 136.0f),
                    PathNode.CurveTo(26.0f, 139.3137f, 28.68629f, 142.0f, 32.0f, 142.0f),
                    PathNode.LineTo(80.0f, 142.0f),
                    PathNode.CurveTo(83.313705f, 142.0f, 86.0f, 139.3137f, 86.0f, 136.0f),
                    PathNode.CurveTo(86.0f, 132.6863f, 83.313705f, 130.0f, 80.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 82.0f),
                    PathNode.LineTo(134.0f, 82.0f),
                    PathNode.LineTo(134.0f, 40.0f),
                    PathNode.CurveTo(134.0f, 36.68629f, 131.3137f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(124.686295f, 34.0f, 122.0f, 36.68629f, 122.0f, 40.0f),
                    PathNode.LineTo(122.0f, 82.0f),
                    PathNode.LineTo(104.0f, 82.0f),
                    PathNode.CurveTo(100.686295f, 82.0f, 98.0f, 84.686295f, 98.0f, 88.0f),
                    PathNode.CurveTo(98.0f, 91.313705f, 100.686295f, 94.0f, 104.0f, 94.0f),
                    PathNode.LineTo(152.0f, 94.0f),
                    PathNode.CurveTo(155.3137f, 94.0f, 158.0f, 91.313705f, 158.0f, 88.0f),
                    PathNode.CurveTo(158.0f, 84.686295f, 155.3137f, 82.0f, 152.0f, 82.0f),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
