package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorThinIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.13f, 116.77f),
                    PathNode.LineTo(162.94f, 93.06f),
                    PathNode.LineTo(139.23f, 27.87f),
                    PathNode.CurveTo(137.5123f, 23.148249f, 133.02448f, 20.00529f, 128.0f, 20.00529f),
                    PathNode.CurveTo(122.97552f, 20.00529f, 118.48769f, 23.148249f, 116.77f, 27.87f),
                    PathNode.LineTo(93.06f, 93.06f),
                    PathNode.LineTo(27.87f, 116.77f),
                    PathNode.CurveTo(23.148249f, 118.48769f, 20.00529f, 122.97552f, 20.00529f, 128.0f),
                    PathNode.CurveTo(20.00529f, 133.02448f, 23.148249f, 137.5123f, 27.87f, 139.23f),
                    PathNode.LineTo(93.06f, 162.94f),
                    PathNode.LineTo(116.77f, 228.13f),
                    PathNode.CurveTo(118.48769f, 232.85175f, 122.97552f, 235.9947f, 128.0f, 235.9947f),
                    PathNode.CurveTo(133.02448f, 235.9947f, 137.5123f, 232.85175f, 139.23f, 228.13f),
                    PathNode.LineTo(162.94f, 162.94f),
                    PathNode.LineTo(228.13f, 139.23f),
                    PathNode.CurveTo(232.85175f, 137.5123f, 235.9947f, 133.02448f, 235.9947f, 128.0f),
                    PathNode.CurveTo(235.9947f, 122.97552f, 232.85175f, 118.48769f, 228.13f, 116.77f),
                    PathNode.Close,
                    PathNode.MoveTo(225.4f, 131.77f),
                    PathNode.LineTo(158.4f, 156.11f),
                    PathNode.CurveTo(157.28934f, 156.51442f, 156.41441f, 157.38934f, 156.01f, 158.5f),
                    PathNode.LineTo(131.67f, 225.5f),
                    PathNode.CurveTo(131.0666f, 227.02672f, 129.59163f, 228.02975f, 127.95f, 228.02975f),
                    PathNode.CurveTo(126.308365f, 228.02975f, 124.8334f, 227.02672f, 124.23f, 225.5f),
                    PathNode.LineTo(99.89f, 158.5f),
                    PathNode.CurveTo(99.485596f, 157.38934f, 98.61066f, 156.51442f, 97.5f, 156.11f),
                    PathNode.LineTo(30.6f, 131.72f),
                    PathNode.CurveTo(29.07328f, 131.11661f, 28.070238f, 129.64163f, 28.070238f, 128.0f),
                    PathNode.CurveTo(28.070238f, 126.35837f, 29.07328f, 124.8834f, 30.6f, 124.28f),
                    PathNode.LineTo(97.55f, 99.94f),
                    PathNode.CurveTo(98.66066f, 99.53558f, 99.53558f, 98.66066f, 99.94f, 97.55f),
                    PathNode.LineTo(124.28f, 30.6f),
                    PathNode.CurveTo(124.8834f, 29.07328f, 126.35837f, 28.070238f, 128.0f, 28.070238f),
                    PathNode.CurveTo(129.64163f, 28.070238f, 131.11661f, 29.07328f, 131.72f, 30.6f),
                    PathNode.LineTo(156.06f, 97.55f),
                    PathNode.CurveTo(156.46442f, 98.66066f, 157.33934f, 99.53558f, 158.45f, 99.94f),
                    PathNode.LineTo(225.45f, 124.28f),
                    PathNode.CurveTo(226.97672f, 124.8834f, 227.97977f, 126.35837f, 227.97977f, 128.0f),
                    PathNode.CurveTo(227.97977f, 129.64163f, 226.97672f, 131.11661f, 225.45f, 131.72f),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
