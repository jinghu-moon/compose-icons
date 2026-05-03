package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) return _trayArrowUp!!
        _trayArrowUp = phosphorLightIcon(
            name = "TrayArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 154.0f),
                    PathNode.LineTo(179.31f, 154.0f),
                    PathNode.CurveTo(175.59813f, 153.99133f, 172.03699f, 155.46764f, 169.42f, 158.1f),
                    PathNode.LineTo(150.1f, 177.41f),
                    PathNode.CurveTo(149.72665f, 177.78558f, 149.21957f, 177.99777f, 148.69f, 178.0f),
                    PathNode.LineTo(107.31f, 178.0f),
                    PathNode.CurveTo(106.780426f, 177.99777f, 106.27335f, 177.78558f, 105.9f, 177.41f),
                    PathNode.LineTo(86.59f, 158.1f),
                    PathNode.CurveTo(83.96804f, 155.46893f, 80.40445f, 153.9931f, 76.69f, 154.0f),
                    PathNode.LineTo(46.0f, 154.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 166.0f),
                    PathNode.LineTo(76.69f, 166.0f),
                    PathNode.CurveTo(77.219574f, 166.00223f, 77.72665f, 166.21442f, 78.1f, 166.59f),
                    PathNode.LineTo(97.41f, 185.9f),
                    PathNode.CurveTo(100.03196f, 188.53107f, 103.59555f, 190.0069f, 107.31f, 190.0f),
                    PathNode.LineTo(148.69f, 190.0f),
                    PathNode.CurveTo(152.40187f, 190.00867f, 155.96301f, 188.53236f, 158.58f, 185.9f),
                    PathNode.LineTo(177.9f, 166.59f),
                    PathNode.CurveTo(178.27335f, 166.21442f, 178.78043f, 166.00223f, 179.31f, 166.0f),
                    PathNode.LineTo(210.0f, 166.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.76f, 108.24f),
                    PathNode.CurveTo(89.42038f, 105.89746f, 89.42038f, 102.10254f, 91.76f, 99.76f),
                    PathNode.LineTo(123.76f, 67.76f),
                    PathNode.CurveTo(126.10254f, 65.42037f, 129.89746f, 65.42037f, 132.24f, 67.76f),
                    PathNode.LineTo(164.24f, 99.76f),
                    PathNode.CurveTo(165.84523f, 101.25577f, 166.506f, 103.508446f, 165.96309f, 105.6343f),
                    PathNode.CurveTo(165.42018f, 107.76018f, 163.76018f, 109.42017f, 161.63431f, 109.96308f),
                    PathNode.CurveTo(159.50844f, 110.506f, 157.25575f, 109.84522f, 155.76f, 108.24f),
                    PathNode.LineTo(134.0f, 86.49f),
                    PathNode.LineTo(134.0f, 152.0f),
                    PathNode.CurveTo(134.0f, 155.3137f, 131.3137f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(124.686295f, 158.0f, 122.0f, 155.3137f, 122.0f, 152.0f),
                    PathNode.LineTo(122.0f, 86.49f),
                    PathNode.LineTo(100.24f, 108.24f),
                    PathNode.CurveTo(97.89746f, 110.57962f, 94.10254f, 110.57962f, 91.76f, 108.24f),
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
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
