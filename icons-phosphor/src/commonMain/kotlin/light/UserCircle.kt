package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorLightIcon(
            name = "UserCircle",
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
                    PathNode.MoveTo(71.44f, 198.0f),
                    PathNode.CurveTo(83.37561f, 178.15306f, 104.84055f, 166.0142f, 128.0f, 166.0142f),
                    PathNode.CurveTo(151.15944f, 166.0142f, 172.62439f, 178.15306f, 184.56f, 198.0f),
                    PathNode.CurveTo(151.59189f, 224.73387f, 104.40812f, 224.73387f, 71.44f, 198.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 101.22232f, 109.22232f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(146.77768f, 86.0f, 162.0f, 101.22232f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 138.77768f, 146.77768f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(109.22232f, 154.0f, 94.0f, 138.77768f, 94.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.51f, 189.64f),
                    PathNode.CurveTo(184.0827f, 174.98141f, 169.99138f, 163.92677f, 153.51f, 158.26f),
                    PathNode.CurveTo(170.38399f, 147.021f, 177.91011f, 126.059746f, 172.03905f, 106.65414f),
                    PathNode.CurveTo(166.168f, 87.24853f, 148.28429f, 73.97489f, 128.01f, 73.97489f),
                    PathNode.CurveTo(107.73571f, 73.97489f, 89.852005f, 87.24853f, 83.98094f, 106.65414f),
                    PathNode.CurveTo(78.109886f, 126.059746f, 85.63601f, 147.021f, 102.51f, 158.26f),
                    PathNode.CurveTo(86.028625f, 163.92677f, 71.9373f, 174.98141f, 62.51f, 189.64f),
                    PathNode.CurveTo(28.897175f, 153.97041f, 30.005447f, 97.962715f, 65.00306f, 63.65078f),
                    PathNode.CurveTo(100.00066f, 29.338844f, 156.01933f, 29.338844f, 191.01694f, 63.65078f),
                    PathNode.CurveTo(226.01456f, 97.962715f, 227.12283f, 153.97041f, 193.51f, 189.64f),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
