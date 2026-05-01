package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorLightIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(170.0f, 56.0f),
                    PathNode.CurveTo(170.0f, 52.68629f, 172.6863f, 50.0f, 176.0f, 50.0f),
                    PathNode.LineTo(224.0f, 50.0f),
                    PathNode.CurveTo(227.3137f, 50.0f, 230.0f, 52.68629f, 230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 59.31371f, 227.3137f, 62.0f, 224.0f, 62.0f),
                    PathNode.LineTo(176.0f, 62.0f),
                    PathNode.CurveTo(172.6863f, 62.0f, 170.0f, 59.31371f, 170.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.19f, 94.0f),
                    PathNode.CurveTo(239.47626f, 137.335f, 223.86708f, 185.5397f, 186.08104f, 211.68936f),
                    PathNode.CurveTo(148.29498f, 237.83904f, 97.68179f, 235.4632f, 62.51149f, 205.88887f),
                    PathNode.CurveTo(27.341175f, 176.31453f, 16.316284f, 126.8596f, 35.594765f, 85.14712f),
                    PathNode.CurveTo(54.873245f, 43.434624f, 99.68482f, 19.785927f, 145.0f, 27.41f),
                    PathNode.CurveTo(147.1466f, 27.73144f, 148.95224f, 29.187164f, 149.72174f, 31.216722f),
                    PathNode.CurveTo(150.49124f, 33.24628f, 150.1046f, 35.53319f, 148.7107f, 37.197002f),
                    PathNode.CurveTo(147.31679f, 38.860813f, 145.13298f, 39.64207f, 143.0f, 39.24f),
                    PathNode.CurveTo(138.04245f, 38.416157f, 133.02554f, 38.001423f, 128.0f, 38.0f),
                    PathNode.CurveTo(92.09505f, 37.981056f, 59.61795f, 59.31653f, 45.378605f, 92.277214f),
                    PathNode.CurveTo(31.139256f, 125.23791f, 37.86546f, 163.5096f, 62.49f, 189.64f),
                    PathNode.CurveTo(71.917305f, 174.98141f, 86.00863f, 163.92677f, 102.49f, 158.26f),
                    PathNode.CurveTo(85.616005f, 147.021f, 78.08988f, 126.059746f, 83.960945f, 106.65414f),
                    PathNode.CurveTo(89.83201f, 87.24853f, 107.715706f, 73.97489f, 127.99f, 73.97489f),
                    PathNode.CurveTo(148.2643f, 73.97489f, 166.148f, 87.24853f, 172.01906f, 106.65414f),
                    PathNode.CurveTo(177.89012f, 126.059746f, 170.364f, 147.021f, 153.49f, 158.26f),
                    PathNode.CurveTo(169.97137f, 163.92677f, 184.0627f, 174.98141f, 193.49f, 189.64f),
                    PathNode.CurveTo(216.59247f, 165.12843f, 224.07426f, 129.76837f, 212.88f, 98.0f),
                    PathNode.CurveTo(212.10439f, 95.964645f, 212.49274f, 93.66881f, 213.8946f, 92.00178f),
                    PathNode.CurveTo(215.29648f, 90.33475f, 217.49168f, 89.55837f, 219.62991f, 89.97337f),
                    PathNode.CurveTo(221.76814f, 90.38838f, 223.51352f, 91.92958f, 224.19f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.CurveTo(146.77768f, 154.0f, 162.0f, 138.77768f, 162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 101.22232f, 146.77768f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(109.22232f, 86.0f, 94.0f, 101.22232f, 94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 138.77768f, 109.22232f, 154.0f, 128.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(148.59166f, 218.03218f, 168.56572f, 210.96922f, 184.56f, 198.0f),
                    PathNode.CurveTo(172.62439f, 178.15306f, 151.15944f, 166.0142f, 128.0f, 166.0142f),
                    PathNode.CurveTo(104.84055f, 166.0142f, 83.37561f, 178.15306f, 71.44f, 198.0f),
                    PathNode.CurveTo(87.43427f, 210.96922f, 107.40834f, 218.03218f, 128.0f, 218.0f),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
