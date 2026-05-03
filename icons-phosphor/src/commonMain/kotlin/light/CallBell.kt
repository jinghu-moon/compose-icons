package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorLightIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 182.0f),
                    PathNode.LineTo(232.0f, 182.0f),
                    PathNode.CurveTo(235.3137f, 182.0f, 238.0f, 179.3137f, 238.0f, 176.0f),
                    PathNode.CurveTo(238.0f, 172.6863f, 235.3137f, 170.0f, 232.0f, 170.0f),
                    PathNode.LineTo(222.0f, 170.0f),
                    PathNode.LineTo(222.0f, 152.0f),
                    PathNode.CurveTo(221.94623f, 102.43752f, 183.45827f, 61.41284f, 134.0f, 58.2f),
                    PathNode.LineTo(134.0f, 38.0f),
                    PathNode.LineTo(152.0f, 38.0f),
                    PathNode.CurveTo(155.3137f, 38.0f, 158.0f, 35.31371f, 158.0f, 32.0f),
                    PathNode.CurveTo(158.0f, 28.68629f, 155.3137f, 26.0f, 152.0f, 26.0f),
                    PathNode.LineTo(104.0f, 26.0f),
                    PathNode.CurveTo(100.686295f, 26.0f, 98.0f, 28.68629f, 98.0f, 32.0f),
                    PathNode.CurveTo(98.0f, 35.31371f, 100.686295f, 38.0f, 104.0f, 38.0f),
                    PathNode.LineTo(122.0f, 38.0f),
                    PathNode.LineTo(122.0f, 58.2f),
                    PathNode.CurveTo(72.54174f, 61.41284f, 34.053764f, 102.43752f, 34.0f, 152.0f),
                    PathNode.LineTo(34.0f, 170.0f),
                    PathNode.LineTo(24.0f, 170.0f),
                    PathNode.CurveTo(20.68629f, 170.0f, 18.0f, 172.6863f, 18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 179.3137f, 20.68629f, 182.0f, 24.0f, 182.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 152.0f),
                    PathNode.CurveTo(46.0f, 106.712654f, 82.712654f, 70.0f, 128.0f, 70.0f),
                    PathNode.CurveTo(173.28735f, 70.0f, 210.0f, 106.712654f, 210.0f, 152.0f),
                    PathNode.LineTo(210.0f, 170.0f),
                    PathNode.LineTo(46.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 208.0f),
                    PathNode.CurveTo(238.0f, 211.3137f, 235.3137f, 214.0f, 232.0f, 214.0f),
                    PathNode.LineTo(24.0f, 214.0f),
                    PathNode.CurveTo(20.68629f, 214.0f, 18.0f, 211.3137f, 18.0f, 208.0f),
                    PathNode.CurveTo(18.0f, 204.6863f, 20.68629f, 202.0f, 24.0f, 202.0f),
                    PathNode.LineTo(232.0f, 202.0f),
                    PathNode.CurveTo(235.3137f, 202.0f, 238.0f, 204.6863f, 238.0f, 208.0f),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
