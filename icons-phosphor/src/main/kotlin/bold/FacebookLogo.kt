package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorBoldIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 211.13f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(166.62741f, 156.0f, 172.0f, 150.62741f, 172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 137.37259f, 166.62741f, 132.0f, 160.0f, 132.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.CurveTo(140.0f, 105.37258f, 145.37259f, 100.0f, 152.0f, 100.0f),
                    PathNode.LineTo(168.0f, 100.0f),
                    PathNode.CurveTo(174.62741f, 100.0f, 180.0f, 94.62742f, 180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 81.37258f, 174.62741f, 76.0f, 168.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(132.11775f, 76.0f, 116.0f, 92.11775f, 116.0f, 112.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(96.0f, 132.0f),
                    PathNode.CurveTo(89.37258f, 132.0f, 84.0f, 137.37259f, 84.0f, 144.0f),
                    PathNode.CurveTo(84.0f, 150.62741f, 89.37258f, 156.0f, 96.0f, 156.0f),
                    PathNode.LineTo(116.0f, 156.0f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(72.39408f, 204.83603f, 41.06058f, 165.9208f, 44.215668f, 121.97612f),
                    PathNode.CurveTo(47.370754f, 78.03143f, 83.9422f, 43.99156f, 128.0f, 43.99156f),
                    PathNode.CurveTo(172.05782f, 43.99156f, 208.62924f, 78.03143f, 211.78433f, 121.97612f),
                    PathNode.CurveTo(214.93942f, 165.9208f, 183.60591f, 204.83603f, 140.0f, 211.13f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
