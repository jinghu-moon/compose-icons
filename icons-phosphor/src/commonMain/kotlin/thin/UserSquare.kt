package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorThinIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(63.0f, 212.0f),
                    PathNode.CurveTo(71.77171f, 183.45624f, 98.13883f, 163.97499f, 128.0f, 163.97499f),
                    PathNode.CurveTo(157.86118f, 163.97499f, 184.22829f, 183.45624f, 193.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(201.34f, 212.0f),
                    PathNode.CurveTo(194.30449f, 186.25682f, 174.28203f, 166.09012f, 148.59f, 158.87f),
                    PathNode.CurveTo(166.45474f, 149.41046f, 175.57565f, 128.99536f, 170.70213f, 109.37699f),
                    PathNode.CurveTo(165.82861f, 89.75861f, 148.21465f, 75.984886f, 128.0f, 75.984886f),
                    PathNode.CurveTo(107.78536f, 75.984886f, 90.17139f, 89.75861f, 85.29787f, 109.37699f),
                    PathNode.CurveTo(80.42435f, 128.99536f, 89.54526f, 149.41046f, 107.41f, 158.87f),
                    PathNode.CurveTo(81.71798f, 166.09012f, 61.69552f, 186.25682f, 54.66f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
