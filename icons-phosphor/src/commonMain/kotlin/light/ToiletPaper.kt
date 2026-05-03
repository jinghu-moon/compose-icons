package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorLightIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(74.0f, 120.0f),
                    PathNode.CurveTo(74.0f, 125.52285f, 69.52285f, 130.0f, 64.0f, 130.0f),
                    PathNode.CurveTo(58.477154f, 130.0f, 54.0f, 125.52285f, 54.0f, 120.0f),
                    PathNode.CurveTo(54.0f, 114.47715f, 58.477154f, 110.0f, 64.0f, 110.0f),
                    PathNode.CurveTo(69.52285f, 110.0f, 74.0f, 114.47715f, 74.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(238.0f, 120.0f),
                    PathNode.LineTo(238.0f, 208.0f),
                    PathNode.CurveTo(238.0f, 215.73198f, 231.73198f, 222.0f, 224.0f, 222.0f),
                    PathNode.LineTo(112.0f, 222.0f),
                    PathNode.CurveTo(104.26801f, 222.0f, 98.0f, 215.73198f, 98.0f, 208.0f),
                    PathNode.LineTo(98.0f, 178.48f),
                    PathNode.CurveTo(89.65f, 195.49f, 77.6f, 206.0f, 64.0f, 206.0f),
                    PathNode.CurveTo(38.21f, 206.0f, 18.0f, 168.22f, 18.0f, 120.0f),
                    PathNode.CurveTo(18.0f, 71.78f, 38.21f, 34.0f, 64.0f, 34.0f),
                    PathNode.LineTo(192.0f, 34.0f),
                    PathNode.CurveTo(217.79f, 34.0f, 238.0f, 71.78f, 238.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 120.0f),
                    PathNode.CurveTo(98.0f, 75.74f, 80.42f, 46.0f, 64.0f, 46.0f),
                    PathNode.CurveTo(47.58f, 46.0f, 30.0f, 75.74f, 30.0f, 120.0f),
                    PathNode.CurveTo(30.0f, 164.26f, 47.58f, 194.0f, 64.0f, 194.0f),
                    PathNode.CurveTo(80.42f, 194.0f, 98.0f, 164.27f, 98.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 208.0f),
                    PathNode.LineTo(226.0f, 126.0f),
                    PathNode.LineTo(208.0f, 126.0f),
                    PathNode.CurveTo(204.6863f, 126.0f, 202.0f, 123.313705f, 202.0f, 120.0f),
                    PathNode.CurveTo(202.0f, 116.686295f, 204.6863f, 114.0f, 208.0f, 114.0f),
                    PathNode.LineTo(225.88f, 114.0f),
                    PathNode.CurveTo(224.37f, 73.08f, 207.67f, 46.0f, 192.0f, 46.0f),
                    PathNode.LineTo(87.76f, 46.0f),
                    PathNode.CurveTo(100.33f, 59.92f, 108.85f, 84.74f, 109.88f, 114.0f),
                    PathNode.LineTo(128.0f, 114.0f),
                    PathNode.CurveTo(131.3137f, 114.0f, 134.0f, 116.686295f, 134.0f, 120.0f),
                    PathNode.CurveTo(134.0f, 123.313705f, 131.3137f, 126.0f, 128.0f, 126.0f),
                    PathNode.LineTo(110.0f, 126.0f),
                    PathNode.LineTo(110.0f, 208.0f),
                    PathNode.CurveTo(110.0f, 209.10457f, 110.89543f, 210.0f, 112.0f, 210.0f),
                    PathNode.LineTo(224.0f, 210.0f),
                    PathNode.CurveTo(225.10457f, 210.0f, 226.0f, 209.10457f, 226.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 114.0f),
                    PathNode.LineTo(160.0f, 114.0f),
                    PathNode.CurveTo(156.6863f, 114.0f, 154.0f, 116.686295f, 154.0f, 120.0f),
                    PathNode.CurveTo(154.0f, 123.313705f, 156.6863f, 126.0f, 160.0f, 126.0f),
                    PathNode.LineTo(176.0f, 126.0f),
                    PathNode.CurveTo(179.3137f, 126.0f, 182.0f, 123.313705f, 182.0f, 120.0f),
                    PathNode.CurveTo(182.0f, 116.686295f, 179.3137f, 114.0f, 176.0f, 114.0f),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
