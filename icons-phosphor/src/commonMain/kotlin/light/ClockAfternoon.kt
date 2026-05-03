package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockAfternoon: ImageVector
    get() {
        if (_clockAfternoon != null) return _clockAfternoon!!
        _clockAfternoon = phosphorLightIcon(
            name = "ClockAfternoon",
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
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 128.0f),
                    PathNode.CurveTo(190.0f, 131.3137f, 187.3137f, 134.0f, 184.0f, 134.0f),
                    PathNode.LineTo(142.49f, 134.0f),
                    PathNode.LineTo(172.24f, 163.76f),
                    PathNode.CurveTo(173.84523f, 165.25575f, 174.506f, 167.50844f, 173.96309f, 169.63431f),
                    PathNode.CurveTo(173.42018f, 171.76018f, 171.76018f, 173.42018f, 169.63431f, 173.96309f),
                    PathNode.CurveTo(167.50844f, 174.506f, 165.25575f, 173.84523f, 163.76f, 172.24f),
                    PathNode.LineTo(123.76f, 132.24f),
                    PathNode.CurveTo(122.046234f, 130.52411f, 121.533936f, 127.94527f, 122.4617f, 125.70461f),
                    PathNode.CurveTo(123.38947f, 123.46396f, 125.57487f, 122.00214f, 128.0f, 122.0f),
                    PathNode.LineTo(184.0f, 122.0f),
                    PathNode.CurveTo(187.3137f, 122.0f, 190.0f, 124.686295f, 190.0f, 128.0f),
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
        return _clockAfternoon!!
    }

private var _clockAfternoon: ImageVector? = null
