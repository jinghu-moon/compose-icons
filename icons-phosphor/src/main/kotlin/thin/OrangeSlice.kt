package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorThinIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 84.0f),
                    PathNode.LineTo(8.0f, 84.0f),
                    PathNode.CurveTo(5.790861f, 84.0f, 4.0f, 85.79086f, 4.0f, 88.0f),
                    PathNode.CurveTo(4.0f, 156.4833f, 59.51669f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(196.4833f, 212.0f, 252.0f, 156.4833f, 252.0f, 88.0f),
                    PathNode.CurveTo(252.0f, 85.79086f, 250.20914f, 84.0f, 248.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.53f, 150.13f),
                    PathNode.LineTo(124.0f, 97.66f),
                    PathNode.LineTo(124.0f, 171.9f),
                    PathNode.CurveTo(104.50639f, 170.9844f, 85.946f, 163.28363f, 71.53f, 150.13f),
                    PathNode.Close,
                    PathNode.MoveTo(65.87f, 144.47f),
                    PathNode.CurveTo(52.716366f, 130.054f, 45.01559f, 111.49361f, 44.1f, 92.0f),
                    PathNode.LineTo(118.34f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 97.66f),
                    PathNode.LineTo(184.47f, 150.13f),
                    PathNode.CurveTo(170.054f, 163.28363f, 151.4936f, 170.9844f, 132.0f, 171.9f),
                    PathNode.Close,
                    PathNode.MoveTo(190.13f, 144.47f),
                    PathNode.LineTo(137.66f, 92.0f),
                    PathNode.LineTo(211.9f, 92.0f),
                    PathNode.CurveTo(210.9844f, 111.49361f, 203.28363f, 130.054f, 190.13f, 144.47f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(65.52166f, 203.92674f, 14.297101f, 154.43867f, 12.07f, 92.0f),
                    PathNode.LineTo(36.07f, 92.0f),
                    PathNode.CurveTo(38.246952f, 141.1799f, 78.751945f, 179.9316f, 127.98f, 179.9316f),
                    PathNode.CurveTo(177.20805f, 179.9316f, 217.71304f, 141.1799f, 219.89f, 92.0f),
                    PathNode.LineTo(243.89f, 92.0f),
                    PathNode.CurveTo(241.66348f, 154.4232f, 190.46283f, 203.90524f, 128.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
