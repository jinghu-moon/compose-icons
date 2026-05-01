package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorLightIcon(
            name = "SteeringWheel",
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
                    PathNode.MoveTo(46.43f, 166.0f),
                    PathNode.LineTo(90.43f, 166.0f),
                    PathNode.CurveTo(91.26328f, 166.00146f, 92.008354f, 166.51942f, 92.3f, 167.3f),
                    PathNode.LineTo(110.63f, 216.3f),
                    PathNode.CurveTo(82.44588f, 210.70293f, 58.60808f, 192.02626f, 46.43f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(145.3f, 216.32f),
                    PathNode.LineTo(163.67f, 167.32f),
                    PathNode.CurveTo(163.96292f, 166.53598f, 164.71306f, 166.0173f, 165.55f, 166.02f),
                    PathNode.LineTo(209.55f, 166.02f),
                    PathNode.CurveTo(197.36316f, 192.05975f, 173.50354f, 210.73895f, 145.3f, 216.32f),
                    PathNode.Close,
                    PathNode.MoveTo(214.17f, 154.0f),
                    PathNode.LineTo(165.55f, 154.0f),
                    PathNode.CurveTo(159.71222f, 154.00032f, 154.4874f, 157.62303f, 152.44f, 163.09f),
                    PathNode.LineTo(131.89f, 217.91f),
                    PathNode.CurveTo(130.6f, 217.97f, 129.3f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(126.7f, 218.0f, 125.37f, 218.0f, 124.06f, 217.91f),
                    PathNode.LineTo(103.56f, 163.1f),
                    PathNode.CurveTo(101.50162f, 157.64018f, 96.284904f, 154.01913f, 90.45f, 154.0f),
                    PathNode.LineTo(41.83f, 154.0f),
                    PathNode.CurveTo(41.18f, 151.83f, 40.6f, 149.63f, 40.11f, 147.39f),
                    PathNode.CurveTo(63.10821f, 123.501076f, 94.8398f, 110.00293f, 128.0f, 110.00293f),
                    PathNode.CurveTo(161.1602f, 110.00293f, 192.89178f, 123.501076f, 215.89f, 147.39f),
                    PathNode.CurveTo(215.4f, 149.63f, 214.82f, 151.83f, 214.17f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 98.0f),
                    PathNode.CurveTo(94.78882f, 98.0433f, 62.77011f, 110.3834f, 38.12f, 132.64f),
                    PathNode.CurveTo(38.0f, 131.1f, 38.0f, 129.56f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 129.56f, 218.0f, 131.1f, 217.88f, 132.64f),
                    PathNode.CurveTo(193.22989f, 110.3834f, 161.21118f, 98.0433f, 128.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 140.0f),
                    PathNode.CurveTo(138.0f, 145.52284f, 133.52284f, 150.0f, 128.0f, 150.0f),
                    PathNode.CurveTo(122.47715f, 150.0f, 118.0f, 145.52284f, 118.0f, 140.0f),
                    PathNode.CurveTo(118.0f, 134.47716f, 122.47715f, 130.0f, 128.0f, 130.0f),
                    PathNode.CurveTo(133.52284f, 130.0f, 138.0f, 134.47716f, 138.0f, 140.0f),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
