package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorLightIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(217.8f, 122.0f),
                    PathNode.LineTo(189.7f, 122.0f),
                    PathNode.CurveTo(186.80222f, 92.52127f, 163.47873f, 69.197784f, 134.0f, 66.3f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(178.949f, 41.268856f, 214.73114f, 77.050995f, 217.8f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 122.0f),
                    PathNode.LineTo(78.37f, 122.0f),
                    PathNode.CurveTo(81.16674f, 99.1622f, 99.1622f, 81.16674f, 122.0f, 78.37f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 134.0f),
                    PathNode.LineTo(122.0f, 177.63f),
                    PathNode.CurveTo(99.1622f, 174.83327f, 81.16674f, 156.8378f, 78.37f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 134.0f),
                    PathNode.LineTo(177.63f, 134.0f),
                    PathNode.CurveTo(174.83327f, 156.8378f, 156.8378f, 174.83327f, 134.0f, 177.63f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 122.0f),
                    PathNode.LineTo(134.0f, 78.37f),
                    PathNode.CurveTo(156.8378f, 81.16674f, 174.83327f, 99.1622f, 177.63f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 38.2f),
                    PathNode.LineTo(122.0f, 66.3f),
                    PathNode.CurveTo(92.52127f, 69.197784f, 69.197784f, 92.52127f, 66.3f, 122.0f),
                    PathNode.LineTo(38.2f, 122.0f),
                    PathNode.CurveTo(41.268856f, 77.050995f, 77.050995f, 41.268856f, 122.0f, 38.2f),
                    PathNode.Close,
                    PathNode.MoveTo(38.2f, 134.0f),
                    PathNode.LineTo(66.3f, 134.0f),
                    PathNode.CurveTo(69.197784f, 163.47873f, 92.52127f, 186.80222f, 122.0f, 189.7f),
                    PathNode.LineTo(122.0f, 217.8f),
                    PathNode.CurveTo(77.050995f, 214.73114f, 41.268856f, 178.949f, 38.2f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 217.8f),
                    PathNode.LineTo(134.0f, 189.7f),
                    PathNode.CurveTo(163.47873f, 186.80222f, 186.80222f, 163.47873f, 189.7f, 134.0f),
                    PathNode.LineTo(217.8f, 134.0f),
                    PathNode.CurveTo(214.73114f, 178.949f, 178.949f, 214.73114f, 134.0f, 217.8f),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
