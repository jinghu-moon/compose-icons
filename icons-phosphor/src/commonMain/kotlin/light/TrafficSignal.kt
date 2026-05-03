package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorLightIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 58.0f),
                    PathNode.CurveTo(111.43146f, 58.0f, 98.0f, 71.43146f, 98.0f, 88.0f),
                    PathNode.CurveTo(98.0f, 104.56854f, 111.43146f, 118.0f, 128.0f, 118.0f),
                    PathNode.CurveTo(144.56854f, 118.0f, 158.0f, 104.56854f, 158.0f, 88.0f),
                    PathNode.CurveTo(158.0f, 71.43146f, 144.56854f, 58.0f, 128.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 106.0f),
                    PathNode.CurveTo(118.05888f, 106.0f, 110.0f, 97.94112f, 110.0f, 88.0f),
                    PathNode.CurveTo(110.0f, 78.05888f, 118.05888f, 70.0f, 128.0f, 70.0f),
                    PathNode.CurveTo(137.94113f, 70.0f, 146.0f, 78.05888f, 146.0f, 88.0f),
                    PathNode.CurveTo(146.0f, 97.94112f, 137.94113f, 106.0f, 128.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.0f),
                    PathNode.CurveTo(111.43146f, 138.0f, 98.0f, 151.43146f, 98.0f, 168.0f),
                    PathNode.CurveTo(98.0f, 184.56854f, 111.43146f, 198.0f, 128.0f, 198.0f),
                    PathNode.CurveTo(144.56854f, 198.0f, 158.0f, 184.56854f, 158.0f, 168.0f),
                    PathNode.CurveTo(158.0f, 151.43146f, 144.56854f, 138.0f, 128.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 186.0f),
                    PathNode.CurveTo(118.05888f, 186.0f, 110.0f, 177.94113f, 110.0f, 168.0f),
                    PathNode.CurveTo(110.0f, 158.05887f, 118.05888f, 150.0f, 128.0f, 150.0f),
                    PathNode.CurveTo(137.94113f, 150.0f, 146.0f, 158.05887f, 146.0f, 168.0f),
                    PathNode.CurveTo(146.0f, 177.94113f, 137.94113f, 186.0f, 128.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 146.0f),
                    PathNode.LineTo(198.0f, 146.0f),
                    PathNode.LineTo(198.0f, 78.0f),
                    PathNode.LineTo(216.0f, 78.0f),
                    PathNode.CurveTo(219.3137f, 78.0f, 222.0f, 75.313705f, 222.0f, 72.0f),
                    PathNode.CurveTo(222.0f, 68.686295f, 219.3137f, 66.0f, 216.0f, 66.0f),
                    PathNode.LineTo(198.0f, 66.0f),
                    PathNode.LineTo(198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 32.268013f, 191.73198f, 26.0f, 184.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(64.26801f, 26.0f, 58.0f, 32.268013f, 58.0f, 40.0f),
                    PathNode.LineTo(58.0f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(36.68629f, 66.0f, 34.0f, 68.686295f, 34.0f, 72.0f),
                    PathNode.CurveTo(34.0f, 75.313705f, 36.68629f, 78.0f, 40.0f, 78.0f),
                    PathNode.LineTo(58.0f, 78.0f),
                    PathNode.LineTo(58.0f, 146.0f),
                    PathNode.LineTo(40.0f, 146.0f),
                    PathNode.CurveTo(36.68629f, 146.0f, 34.0f, 148.6863f, 34.0f, 152.0f),
                    PathNode.CurveTo(34.0f, 155.3137f, 36.68629f, 158.0f, 40.0f, 158.0f),
                    PathNode.LineTo(58.0f, 158.0f),
                    PathNode.LineTo(58.0f, 216.0f),
                    PathNode.CurveTo(58.0f, 223.73198f, 64.26801f, 230.0f, 72.0f, 230.0f),
                    PathNode.LineTo(184.0f, 230.0f),
                    PathNode.CurveTo(191.73198f, 230.0f, 198.0f, 223.73198f, 198.0f, 216.0f),
                    PathNode.LineTo(198.0f, 158.0f),
                    PathNode.LineTo(216.0f, 158.0f),
                    PathNode.CurveTo(219.3137f, 158.0f, 222.0f, 155.3137f, 222.0f, 152.0f),
                    PathNode.CurveTo(222.0f, 148.6863f, 219.3137f, 146.0f, 216.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 216.0f),
                    PathNode.CurveTo(186.0f, 217.10457f, 185.10457f, 218.0f, 184.0f, 218.0f),
                    PathNode.LineTo(72.0f, 218.0f),
                    PathNode.CurveTo(70.89543f, 218.0f, 70.0f, 217.10457f, 70.0f, 216.0f),
                    PathNode.LineTo(70.0f, 40.0f),
                    PathNode.CurveTo(70.0f, 38.89543f, 70.89543f, 38.0f, 72.0f, 38.0f),
                    PathNode.LineTo(184.0f, 38.0f),
                    PathNode.CurveTo(185.10457f, 38.0f, 186.0f, 38.89543f, 186.0f, 40.0f),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
