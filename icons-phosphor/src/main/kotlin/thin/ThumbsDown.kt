package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorThinIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.85f, 157.52f),
                    PathNode.LineTo(223.85f, 61.52f),
                    PathNode.CurveTo(222.59904f, 51.509468f, 214.0884f, 43.997803f, 204.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(25.372583f, 44.0f, 20.0f, 49.37258f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 144.0f),
                    PathNode.CurveTo(20.0f, 150.62741f, 25.372583f, 156.0f, 32.0f, 156.0f),
                    PathNode.LineTo(77.53f, 156.0f),
                    PathNode.LineTo(116.42f, 233.79f),
                    PathNode.CurveTo(117.09826f, 235.14543f, 118.484344f, 236.00108f, 120.0f, 236.0f),
                    PathNode.CurveTo(139.88223f, 236.0f, 156.0f, 219.88223f, 156.0f, 200.0f),
                    PathNode.LineTo(156.0f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(221.73726f, 180.00125f, 227.19879f, 177.53856f, 230.99625f, 173.23795f),
                    PathNode.CurveTo(234.79372f, 168.93733f, 236.56142f, 163.21298f, 235.85f, 157.52f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 148.0f),
                    PathNode.LineTo(32.0f, 148.0f),
                    PathNode.CurveTo(29.790861f, 148.0f, 28.0f, 146.20914f, 28.0f, 144.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 53.79086f, 29.790861f, 52.0f, 32.0f, 52.0f),
                    PathNode.LineTo(76.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.0f, 167.94f),
                    PathNode.CurveTo(222.7215f, 170.52199f, 219.44357f, 172.0007f, 216.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(149.79086f, 172.0f, 148.0f, 173.79086f, 148.0f, 176.0f),
                    PathNode.LineTo(148.0f, 200.0f),
                    PathNode.CurveTo(148.00246f, 214.52782f, 136.89343f, 226.64438f, 122.42f, 227.9f),
                    PathNode.LineTo(84.0f, 151.06f),
                    PathNode.LineTo(84.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.CurveTo(210.05237f, 51.998554f, 215.1585f, 56.504475f, 215.91f, 62.51f),
                    PathNode.LineTo(227.91f, 158.51f),
                    PathNode.CurveTo(228.33723f, 161.9252f, 227.27747f, 165.35944f, 225.0f, 167.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
