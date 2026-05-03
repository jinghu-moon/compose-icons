package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MonitorArrowUp: ImageVector
    get() {
        if (_monitorArrowUp != null) return _monitorArrowUp!!
        _monitorArrowUp = phosphorLightIcon(
            name = "MonitorArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(35.849735f, 42.0f, 26.0f, 51.849735f, 26.0f, 64.0f),
                    PathNode.LineTo(26.0f, 176.0f),
                    PathNode.CurveTo(26.0f, 188.15027f, 35.849735f, 198.0f, 48.0f, 198.0f),
                    PathNode.LineTo(208.0f, 198.0f),
                    PathNode.CurveTo(220.15027f, 198.0f, 230.0f, 188.15027f, 230.0f, 176.0f),
                    PathNode.LineTo(230.0f, 64.0f),
                    PathNode.CurveTo(230.0f, 51.849735f, 220.15027f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 176.0f),
                    PathNode.CurveTo(218.0f, 181.52284f, 213.52284f, 186.0f, 208.0f, 186.0f),
                    PathNode.LineTo(48.0f, 186.0f),
                    PathNode.CurveTo(42.477154f, 186.0f, 38.0f, 181.52284f, 38.0f, 176.0f),
                    PathNode.LineTo(38.0f, 64.0f),
                    PathNode.CurveTo(38.0f, 58.477154f, 42.477154f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(213.52284f, 54.0f, 218.0f, 58.477154f, 218.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 224.0f),
                    PathNode.CurveTo(166.0f, 227.3137f, 163.3137f, 230.0f, 160.0f, 230.0f),
                    PathNode.LineTo(96.0f, 230.0f),
                    PathNode.CurveTo(92.686295f, 230.0f, 90.0f, 227.3137f, 90.0f, 224.0f),
                    PathNode.CurveTo(90.0f, 220.6863f, 92.686295f, 218.0f, 96.0f, 218.0f),
                    PathNode.LineTo(160.0f, 218.0f),
                    PathNode.CurveTo(163.3137f, 218.0f, 166.0f, 220.6863f, 166.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.24f, 107.76f),
                    PathNode.CurveTo(157.84523f, 109.25577f, 158.506f, 111.508446f, 157.96309f, 113.6343f),
                    PathNode.CurveTo(157.42018f, 115.76018f, 155.76018f, 117.42017f, 153.63431f, 117.96308f),
                    PathNode.CurveTo(151.50844f, 118.506f, 149.25575f, 117.84522f, 147.76f, 116.24f),
                    PathNode.LineTo(134.0f, 102.49f),
                    PathNode.LineTo(134.0f, 152.0f),
                    PathNode.CurveTo(134.0f, 155.3137f, 131.3137f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(124.686295f, 158.0f, 122.0f, 155.3137f, 122.0f, 152.0f),
                    PathNode.LineTo(122.0f, 102.49f),
                    PathNode.LineTo(108.24f, 116.24f),
                    PathNode.CurveTo(105.87592f, 118.44287f, 102.191925f, 118.37787f, 99.90703f, 116.09297f),
                    PathNode.CurveTo(97.62213f, 113.808075f, 97.55713f, 110.12408f, 99.76f, 107.76f),
                    PathNode.LineTo(123.76f, 83.76f),
                    PathNode.CurveTo(126.10254f, 81.42038f, 129.89746f, 81.42038f, 132.24f, 83.76f),
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
        return _monitorArrowUp!!
    }

private var _monitorArrowUp: ImageVector? = null
