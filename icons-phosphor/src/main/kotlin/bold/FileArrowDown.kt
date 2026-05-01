package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArrowDown: ImageVector
    get() {
        if (_fileArrowDown != null) return _fileArrowDown!!
        _fileArrowDown = phosphorBoldIcon(
            name = "FileArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 79.52f),
                    PathNode.LineTo(160.49f, 23.52f),
                    PathNode.CurveTo(158.23927f, 21.26647f, 155.185f, 20.000149f, 152.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 88.0f),
                    PathNode.CurveTo(219.99985f, 84.819916f, 218.73741f, 81.76991f, 216.49f, 79.52f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 57.0f),
                    PathNode.LineTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.49f, 151.51f),
                    PathNode.CurveTo(162.74945f, 153.76163f, 164.01947f, 156.82018f, 164.01947f, 160.01f),
                    PathNode.CurveTo(164.01947f, 163.19981f, 162.74945f, 166.25838f, 160.49f, 168.51f),
                    PathNode.LineTo(136.49f, 192.51f),
                    PathNode.CurveTo(134.23837f, 194.76945f, 131.17982f, 196.03946f, 127.99f, 196.03946f),
                    PathNode.CurveTo(124.80018f, 196.03946f, 121.74162f, 194.76945f, 119.49f, 192.51f),
                    PathNode.LineTo(95.49f, 168.51f),
                    PathNode.CurveTo(90.79558f, 163.81558f, 90.79558f, 156.20442f, 95.49f, 151.51f),
                    PathNode.CurveTo(100.18442f, 146.81558f, 107.79558f, 146.81558f, 112.49f, 151.51f),
                    PathNode.LineTo(116.0f, 155.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.CurveTo(116.0f, 117.37258f, 121.37258f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(134.62741f, 112.0f, 140.0f, 117.37258f, 140.0f, 124.0f),
                    PathNode.LineTo(140.0f, 155.0f),
                    PathNode.LineTo(143.51f, 151.48f),
                    PathNode.CurveTo(145.7648f, 149.23065f, 148.82132f, 147.96992f, 152.00623f, 147.97556f),
                    PathNode.CurveTo(155.19113f, 147.98119f, 158.24316f, 149.2527f, 160.49f, 151.51f),
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
        return _fileArrowDown!!
    }

private var _fileArrowDown: ImageVector? = null
