package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileArrowUp: ImageVector
    get() {
        if (_fileArrowUp != null) return _fileArrowUp!!
        _fileArrowUp = phosphorBoldIcon(
            name = "FileArrowUp",
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
                    PathNode.MoveTo(183.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(160.0f, 57.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 98.62742f, 141.37259f, 104.0f, 148.0f, 104.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(196.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.49f, 139.51f),
                    PathNode.CurveTo(165.18442f, 144.20442f, 165.18442f, 151.81558f, 160.49f, 156.51f),
                    PathNode.CurveTo(155.79558f, 161.20442f, 148.18442f, 161.20442f, 143.49f, 156.51f),
                    PathNode.LineTo(140.0f, 153.0f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 190.62741f, 134.62741f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(121.37258f, 196.0f, 116.0f, 190.62741f, 116.0f, 184.0f),
                    PathNode.LineTo(116.0f, 153.0f),
                    PathNode.LineTo(112.49f, 156.52f),
                    PathNode.CurveTo(107.79558f, 161.21442f, 100.18442f, 161.21442f, 95.49f, 156.52f),
                    PathNode.CurveTo(90.79558f, 151.82558f, 90.79558f, 144.21442f, 95.49f, 139.52f),
                    PathNode.LineTo(119.49f, 115.52f),
                    PathNode.CurveTo(121.74162f, 113.260544f, 124.80018f, 111.99054f, 127.99f, 111.99054f),
                    PathNode.CurveTo(131.17982f, 111.99054f, 134.23837f, 113.260544f, 136.49f, 115.52f),
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
        return _fileArrowUp!!
    }

private var _fileArrowUp: ImageVector? = null
