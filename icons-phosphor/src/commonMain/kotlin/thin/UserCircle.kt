package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorThinIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.87f, 198.42f),
                    PathNode.CurveTo(80.95247f, 177.14459f, 103.53311f, 164.0004f, 128.0f, 164.0004f),
                    PathNode.CurveTo(152.46689f, 164.0004f, 175.04753f, 177.14459f, 187.13f, 198.42f),
                    PathNode.CurveTo(152.96042f, 227.19301f, 103.03958f, 227.19301f, 68.87f, 198.42f),
                    PathNode.Close,
                    PathNode.MoveTo(193.17f, 192.87f),
                    PathNode.CurveTo(183.23293f, 176.25659f, 167.30212f, 164.08748f, 148.66f, 158.87f),
                    PathNode.CurveTo(166.49463f, 149.38524f, 175.58017f, 128.97533f, 170.69257f, 109.37569f),
                    PathNode.CurveTo(165.80496f, 89.77605f, 148.19986f, 76.02203f, 128.0f, 76.02203f),
                    PathNode.CurveTo(107.80013f, 76.02203f, 90.195045f, 89.77605f, 85.307434f, 109.37569f),
                    PathNode.CurveTo(80.41982f, 128.97533f, 89.50537f, 149.38524f, 107.34f, 158.87f),
                    PathNode.CurveTo(88.69788f, 164.08748f, 72.767075f, 176.25659f, 62.83f, 192.87f),
                    PathNode.CurveTo(26.996258f, 156.90793f, 27.065601f, 98.71656f, 62.984947f, 62.83999f),
                    PathNode.CurveTo(98.9043f, 26.963417f, 157.0957f, 26.963417f, 193.01505f, 62.83999f),
                    PathNode.CurveTo(228.9344f, 98.71656f, 229.00374f, 156.90793f, 193.17f, 192.87f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(108.11775f, 156.0f, 92.0f, 139.88223f, 92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 100.11775f, 108.11775f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(147.88223f, 84.0f, 164.0f, 100.11775f, 164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 139.88223f, 147.88223f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
