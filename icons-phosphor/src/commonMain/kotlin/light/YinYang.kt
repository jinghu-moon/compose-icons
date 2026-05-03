package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = phosphorLightIcon(
            name = "YinYang",
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
                    PathNode.MoveTo(38.0f, 128.0f),
                    PathNode.CurveTo(38.05511f, 78.317215f, 78.317215f, 38.05511f, 128.0f, 38.0f),
                    PathNode.CurveTo(151.19595f, 38.0f, 170.0f, 56.80404f, 170.0f, 80.0f),
                    PathNode.CurveTo(170.0f, 103.19596f, 151.19595f, 122.0f, 128.0f, 122.0f),
                    PathNode.CurveTo(108.07866f, 122.00734f, 89.77945f, 132.98222f, 80.39168f, 150.55292f),
                    PathNode.CurveTo(71.0039f, 168.12363f, 72.05258f, 189.4358f, 83.12f, 206.0f),
                    PathNode.CurveTo(55.218918f, 189.93419f, 38.0165f, 160.19597f, 38.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(104.80404f, 218.0f, 86.0f, 199.19595f, 86.0f, 176.0f),
                    PathNode.CurveTo(86.0f, 152.80405f, 104.80404f, 134.0f, 128.0f, 134.0f),
                    PathNode.CurveTo(147.92134f, 133.99266f, 166.22055f, 123.017784f, 175.60832f, 105.447075f),
                    PathNode.CurveTo(184.9961f, 87.87637f, 183.94742f, 66.564186f, 172.88f, 50.0f),
                    PathNode.CurveTo(208.19865f, 70.33082f, 225.44879f, 111.856674f, 214.93094f, 151.2283f),
                    PathNode.CurveTo(204.4131f, 190.59991f, 168.75229f, 217.991f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 176.0f),
                    PathNode.CurveTo(138.0f, 181.52284f, 133.52284f, 186.0f, 128.0f, 186.0f),
                    PathNode.CurveTo(122.47715f, 186.0f, 118.0f, 181.52284f, 118.0f, 176.0f),
                    PathNode.CurveTo(118.0f, 170.47716f, 122.47715f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(133.52284f, 166.0f, 138.0f, 170.47716f, 138.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 80.0f),
                    PathNode.CurveTo(118.0f, 74.47715f, 122.47715f, 70.0f, 128.0f, 70.0f),
                    PathNode.CurveTo(133.52284f, 70.0f, 138.0f, 74.47715f, 138.0f, 80.0f),
                    PathNode.CurveTo(138.0f, 85.52285f, 133.52284f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(122.47715f, 90.0f, 118.0f, 85.52285f, 118.0f, 80.0f),
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
