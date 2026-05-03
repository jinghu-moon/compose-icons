package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorBoldIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 40.0f),
                    PathNode.LineTo(228.0f, 76.0f),
                    PathNode.CurveTo(228.0f, 82.62742f, 222.62741f, 88.0f, 216.0f, 88.0f),
                    PathNode.CurveTo(209.37259f, 88.0f, 204.0f, 82.62742f, 204.0f, 76.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.CurveTo(173.37259f, 52.0f, 168.0f, 46.62742f, 168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 33.37258f, 173.37259f, 28.0f, 180.0f, 28.0f),
                    PathNode.LineTo(216.0f, 28.0f),
                    PathNode.CurveTo(222.62741f, 28.0f, 228.0f, 33.37258f, 228.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.CurveTo(209.37259f, 168.0f, 204.0f, 173.37259f, 204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(180.0f, 204.0f),
                    PathNode.CurveTo(173.37259f, 204.0f, 168.0f, 209.37259f, 168.0f, 216.0f),
                    PathNode.CurveTo(168.0f, 222.62741f, 173.37259f, 228.0f, 180.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 180.0f),
                    PathNode.CurveTo(228.0f, 173.37259f, 222.62741f, 168.0f, 216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 180.0f),
                    PathNode.CurveTo(52.0f, 173.37259f, 46.62742f, 168.0f, 40.0f, 168.0f),
                    PathNode.CurveTo(33.37258f, 168.0f, 28.0f, 173.37259f, 28.0f, 180.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(76.0f, 228.0f),
                    PathNode.CurveTo(82.62742f, 228.0f, 88.0f, 222.62741f, 88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 209.37259f, 82.62742f, 204.0f, 76.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.CurveTo(46.62742f, 88.0f, 52.0f, 82.62742f, 52.0f, 76.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.CurveTo(82.62742f, 52.0f, 88.0f, 46.62742f, 88.0f, 40.0f),
                    PathNode.CurveTo(88.0f, 33.37258f, 82.62742f, 28.0f, 76.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 76.0f),
                    PathNode.CurveTo(28.0f, 82.62742f, 33.37258f, 88.0f, 40.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 180.0f),
                    PathNode.CurveTo(172.22467f, 180.00237f, 168.66835f, 178.2279f, 166.4f, 175.21f),
                    PathNode.CurveTo(157.33566f, 163.11548f, 143.10422f, 155.99666f, 127.99f, 155.99666f),
                    PathNode.CurveTo(112.875786f, 155.99666f, 98.64433f, 163.11548f, 89.58f, 175.21f),
                    PathNode.CurveTo(85.55396f, 180.36667f, 78.13936f, 181.34825f, 72.91019f, 177.41684f),
                    PathNode.CurveTo(67.681015f, 173.48543f, 66.56451f, 166.08994f, 70.4f, 160.79f),
                    PathNode.CurveTo(76.76476f, 152.27702f, 84.93306f, 145.27661f, 94.32f, 140.29f),
                    PathNode.CurveTo(79.30676f, 122.444016f, 80.8254f, 95.98403f, 97.78182f, 79.9729f),
                    PathNode.CurveTo(114.738235f, 63.96177f, 141.24176f, 63.96177f, 158.19818f, 79.9729f),
                    PathNode.CurveTo(175.1546f, 95.98403f, 176.67323f, 122.444016f, 161.66f, 140.29f),
                    PathNode.CurveTo(171.04695f, 145.27661f, 179.21524f, 152.27702f, 185.58f, 160.79f),
                    PathNode.CurveTo(188.31096f, 164.42337f, 188.7547f, 169.28786f, 186.72623f, 173.3554f),
                    PathNode.CurveTo(184.69775f, 177.42291f, 180.54527f, 179.99527f, 176.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 132.0f),
                    PathNode.CurveTo(139.0457f, 132.0f, 148.0f, 123.04569f, 148.0f, 112.0f),
                    PathNode.CurveTo(148.0f, 100.95431f, 139.0457f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(116.95431f, 92.0f, 108.0f, 100.95431f, 108.0f, 112.0f),
                    PathNode.CurveTo(108.0f, 123.04569f, 116.95431f, 132.0f, 128.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
