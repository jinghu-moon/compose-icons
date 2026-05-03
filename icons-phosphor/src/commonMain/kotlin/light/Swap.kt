package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorLightIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 152.0f),
                    PathNode.CurveTo(222.0f, 159.73198f, 215.73198f, 166.0f, 208.0f, 166.0f),
                    PathNode.LineTo(94.49f, 166.0f),
                    PathNode.LineTo(108.24f, 179.76f),
                    PathNode.CurveTo(109.84522f, 181.25575f, 110.506f, 183.50844f, 109.96308f, 185.63431f),
                    PathNode.CurveTo(109.42017f, 187.76018f, 107.76018f, 189.42018f, 105.6343f, 189.96309f),
                    PathNode.CurveTo(103.508446f, 190.506f, 101.25577f, 189.84523f, 99.76f, 188.24f),
                    PathNode.LineTo(75.76f, 164.24f),
                    PathNode.CurveTo(73.42038f, 161.89746f, 73.42038f, 158.10254f, 75.76f, 155.76f),
                    PathNode.LineTo(99.76f, 131.76f),
                    PathNode.CurveTo(102.12408f, 129.55713f, 105.808075f, 129.62213f, 108.09297f, 131.90703f),
                    PathNode.CurveTo(110.37787f, 134.19193f, 110.44287f, 137.87592f, 108.24f, 140.24f),
                    PathNode.LineTo(94.49f, 154.0f),
                    PathNode.LineTo(208.0f, 154.0f),
                    PathNode.CurveTo(209.10457f, 154.0f, 210.0f, 153.10457f, 210.0f, 152.0f),
                    PathNode.LineTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(96.0f, 46.0f),
                    PathNode.CurveTo(94.89543f, 46.0f, 94.0f, 46.89543f, 94.0f, 48.0f),
                    PathNode.LineTo(94.0f, 56.0f),
                    PathNode.CurveTo(94.0f, 59.31371f, 91.313705f, 62.0f, 88.0f, 62.0f),
                    PathNode.CurveTo(84.686295f, 62.0f, 82.0f, 59.31371f, 82.0f, 56.0f),
                    PathNode.LineTo(82.0f, 48.0f),
                    PathNode.CurveTo(82.0f, 40.268013f, 88.26801f, 34.0f, 96.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 194.0f),
                    PathNode.CurveTo(164.6863f, 194.0f, 162.0f, 196.6863f, 162.0f, 200.0f),
                    PathNode.LineTo(162.0f, 208.0f),
                    PathNode.CurveTo(162.0f, 209.10457f, 161.10457f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 104.0f),
                    PathNode.CurveTo(46.0f, 102.89543f, 46.89543f, 102.0f, 48.0f, 102.0f),
                    PathNode.LineTo(161.51f, 102.0f),
                    PathNode.LineTo(147.76f, 115.76f),
                    PathNode.CurveTo(146.15477f, 117.25577f, 145.494f, 119.508446f, 146.03691f, 121.6343f),
                    PathNode.CurveTo(146.57982f, 123.76018f, 148.23982f, 125.42017f, 150.36569f, 125.96308f),
                    PathNode.CurveTo(152.49156f, 126.506f, 154.74425f, 125.84522f, 156.24f, 124.24f),
                    PathNode.LineTo(180.24f, 100.24f),
                    PathNode.CurveTo(182.57962f, 97.89746f, 182.57962f, 94.10254f, 180.24f, 91.76f),
                    PathNode.LineTo(156.24f, 67.76f),
                    PathNode.CurveTo(153.87592f, 65.55713f, 150.19193f, 65.62213f, 147.90703f, 67.90703f),
                    PathNode.CurveTo(145.62213f, 70.191925f, 145.55713f, 73.87592f, 147.76f, 76.24f),
                    PathNode.LineTo(161.51f, 90.0f),
                    PathNode.LineTo(48.0f, 90.0f),
                    PathNode.CurveTo(40.268013f, 90.0f, 34.0f, 96.26801f, 34.0f, 104.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(167.73198f, 222.0f, 174.0f, 215.73198f, 174.0f, 208.0f),
                    PathNode.LineTo(174.0f, 200.0f),
                    PathNode.CurveTo(174.0f, 196.6863f, 171.3137f, 194.0f, 168.0f, 194.0f),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
