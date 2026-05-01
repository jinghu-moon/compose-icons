package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorLightIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.67f, 74.0f),
                    PathNode.LineTo(198.0f, 74.0f),
                    PathNode.LineTo(198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 36.68629f, 195.3137f, 34.0f, 192.0f, 34.0f),
                    PathNode.LineTo(64.0f, 34.0f),
                    PathNode.CurveTo(60.68629f, 34.0f, 58.0f, 36.68629f, 58.0f, 40.0f),
                    PathNode.LineTo(58.0f, 74.0f),
                    PathNode.LineTo(41.33f, 74.0f),
                    PathNode.CurveTo(28.47f, 74.0f, 18.0f, 83.87f, 18.0f, 96.0f),
                    PathNode.LineTo(18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 179.3137f, 20.68629f, 182.0f, 24.0f, 182.0f),
                    PathNode.LineTo(58.0f, 182.0f),
                    PathNode.LineTo(58.0f, 216.0f),
                    PathNode.CurveTo(58.0f, 219.3137f, 60.68629f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(192.0f, 222.0f),
                    PathNode.CurveTo(195.3137f, 222.0f, 198.0f, 219.3137f, 198.0f, 216.0f),
                    PathNode.LineTo(198.0f, 182.0f),
                    PathNode.LineTo(232.0f, 182.0f),
                    PathNode.CurveTo(235.3137f, 182.0f, 238.0f, 179.3137f, 238.0f, 176.0f),
                    PathNode.LineTo(238.0f, 96.0f),
                    PathNode.CurveTo(238.0f, 83.87f, 227.53f, 74.0f, 214.67f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 46.0f),
                    PathNode.LineTo(186.0f, 46.0f),
                    PathNode.LineTo(186.0f, 74.0f),
                    PathNode.LineTo(70.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 210.0f),
                    PathNode.LineTo(70.0f, 210.0f),
                    PathNode.LineTo(70.0f, 158.0f),
                    PathNode.LineTo(186.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 170.0f),
                    PathNode.LineTo(198.0f, 170.0f),
                    PathNode.LineTo(198.0f, 152.0f),
                    PathNode.CurveTo(198.0f, 148.6863f, 195.3137f, 146.0f, 192.0f, 146.0f),
                    PathNode.LineTo(64.0f, 146.0f),
                    PathNode.CurveTo(60.68629f, 146.0f, 58.0f, 148.6863f, 58.0f, 152.0f),
                    PathNode.LineTo(58.0f, 170.0f),
                    PathNode.LineTo(30.0f, 170.0f),
                    PathNode.LineTo(30.0f, 96.0f),
                    PathNode.CurveTo(30.0f, 90.49f, 35.08f, 86.0f, 41.33f, 86.0f),
                    PathNode.LineTo(214.67f, 86.0f),
                    PathNode.CurveTo(220.92f, 86.0f, 226.0f, 90.49f, 226.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 116.0f),
                    PathNode.CurveTo(198.0f, 121.52285f, 193.52284f, 126.0f, 188.0f, 126.0f),
                    PathNode.CurveTo(182.47716f, 126.0f, 178.0f, 121.52285f, 178.0f, 116.0f),
                    PathNode.CurveTo(178.0f, 110.47715f, 182.47716f, 106.0f, 188.0f, 106.0f),
                    PathNode.CurveTo(193.52284f, 106.0f, 198.0f, 110.47715f, 198.0f, 116.0f),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
