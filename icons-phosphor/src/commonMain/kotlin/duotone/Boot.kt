package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorDuotoneIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 168.0f),
                    PathNode.CurveTo(41.22f, 135.94f, 44.0f, 79.35f, 32.0f, 48.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.CurveTo(148.41827f, 48.0f, 152.0f, 51.581722f, 152.0f, 56.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(218.50967f, 120.0f, 240.0f, 141.49033f, 240.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 112.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.CurveTo(160.0f, 47.163445f, 152.83656f, 40.0f, 144.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(29.36675f, 40.00043f, 26.902353f, 41.296665f, 25.410032f, 43.466225f),
                    PathNode.CurveTo(23.917713f, 45.63578f, 23.588614f, 48.400776f, 24.53f, 50.86f),
                    PathNode.CurveTo(35.59f, 79.7f, 33.29f, 134.57f, 24.31f, 165.79f),
                    PathNode.CurveTo(24.10705f, 166.50923f, 24.002762f, 167.25269f, 24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(66.11f, 216.0f),
                    PathNode.CurveTo(68.595535f, 216.00046f, 71.047f, 215.42183f, 73.27f, 214.31f),
                    PathNode.LineTo(85.89f, 208.0f),
                    PathNode.LineTo(102.11f, 208.0f),
                    PathNode.LineTo(114.73f, 214.31f),
                    PathNode.CurveTo(116.953f, 215.42183f, 119.404465f, 216.00046f, 121.89f, 216.0f),
                    PathNode.LineTo(150.11f, 216.0f),
                    PathNode.CurveTo(152.59554f, 216.00046f, 155.047f, 215.42183f, 157.27f, 214.31f),
                    PathNode.LineTo(169.89f, 208.0f),
                    PathNode.LineTo(186.11f, 208.0f),
                    PathNode.LineTo(198.73f, 214.31f),
                    PathNode.CurveTo(200.953f, 215.42183f, 203.40446f, 216.00046f, 205.89f, 216.0f),
                    PathNode.LineTo(232.0f, 216.0f),
                    PathNode.CurveTo(240.83656f, 216.0f, 248.0f, 208.83656f, 248.0f, 200.0f),
                    PathNode.LineTo(248.0f, 168.0f),
                    PathNode.CurveTo(247.96693f, 137.08577f, 222.91423f, 112.033066f, 192.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 56.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(107.58172f, 80.0f, 104.0f, 83.58172f, 104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 92.41828f, 107.58172f, 96.0f, 112.0f, 96.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.CurveTo(107.58172f, 112.0f, 104.0f, 115.58172f, 104.0f, 120.0f),
                    PathNode.CurveTo(104.0f, 124.41828f, 107.58172f, 128.0f, 112.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(211.00108f, 128.02321f, 227.37325f, 141.38824f, 231.2f, 160.0f),
                    PathNode.LineTo(42.25f, 160.0f),
                    PathNode.CurveTo(48.99f, 129.16f, 50.41f, 85.83f, 42.86f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.89f, 200.0f),
                    PathNode.LineTo(193.27f, 193.69f),
                    PathNode.CurveTo(191.047f, 192.57817f, 188.59554f, 191.99954f, 186.11f, 192.0f),
                    PathNode.LineTo(169.89f, 192.0f),
                    PathNode.CurveTo(167.40446f, 191.99954f, 164.953f, 192.57817f, 162.73f, 193.69f),
                    PathNode.LineTo(150.11f, 200.0f),
                    PathNode.LineTo(121.89f, 200.0f),
                    PathNode.LineTo(109.27f, 193.69f),
                    PathNode.CurveTo(107.047f, 192.57817f, 104.595535f, 191.99954f, 102.11f, 192.0f),
                    PathNode.LineTo(85.89f, 192.0f),
                    PathNode.CurveTo(83.404465f, 191.99954f, 80.953f, 192.57817f, 78.73f, 193.69f),
                    PathNode.LineTo(66.11f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _boot!!
    }

private var _boot: ImageVector? = null
