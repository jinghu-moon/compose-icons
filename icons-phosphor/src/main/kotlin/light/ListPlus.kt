package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListPlus: ImageVector
    get() {
        if (_listPlus != null) return _listPlus!!
        _listPlus = phosphorLightIcon(
            name = "ListPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 60.68629f, 36.68629f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(36.68629f, 70.0f, 34.0f, 67.313705f, 34.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 134.0f),
                    PathNode.LineTo(216.0f, 134.0f),
                    PathNode.CurveTo(219.3137f, 134.0f, 222.0f, 131.3137f, 222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 124.686295f, 219.3137f, 122.0f, 216.0f, 122.0f),
                    PathNode.LineTo(40.0f, 122.0f),
                    PathNode.CurveTo(36.68629f, 122.0f, 34.0f, 124.686295f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 131.3137f, 36.68629f, 134.0f, 40.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(144.0f, 198.0f),
                    PathNode.CurveTo(147.3137f, 198.0f, 150.0f, 195.3137f, 150.0f, 192.0f),
                    PathNode.CurveTo(150.0f, 188.6863f, 147.3137f, 186.0f, 144.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 186.0f),
                    PathNode.LineTo(214.0f, 186.0f),
                    PathNode.LineTo(214.0f, 168.0f),
                    PathNode.CurveTo(214.0f, 164.6863f, 211.3137f, 162.0f, 208.0f, 162.0f),
                    PathNode.CurveTo(204.6863f, 162.0f, 202.0f, 164.6863f, 202.0f, 168.0f),
                    PathNode.LineTo(202.0f, 186.0f),
                    PathNode.LineTo(184.0f, 186.0f),
                    PathNode.CurveTo(180.6863f, 186.0f, 178.0f, 188.6863f, 178.0f, 192.0f),
                    PathNode.CurveTo(178.0f, 195.3137f, 180.6863f, 198.0f, 184.0f, 198.0f),
                    PathNode.LineTo(202.0f, 198.0f),
                    PathNode.LineTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 219.3137f, 204.6863f, 222.0f, 208.0f, 222.0f),
                    PathNode.CurveTo(211.3137f, 222.0f, 214.0f, 219.3137f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 198.0f),
                    PathNode.LineTo(232.0f, 198.0f),
                    PathNode.CurveTo(235.3137f, 198.0f, 238.0f, 195.3137f, 238.0f, 192.0f),
                    PathNode.CurveTo(238.0f, 188.6863f, 235.3137f, 186.0f, 232.0f, 186.0f),
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
        return _listPlus!!
    }

private var _listPlus: ImageVector? = null
