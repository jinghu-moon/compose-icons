package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileMagnifyingGlass: ImageVector
    get() {
        if (_fileMagnifyingGlass != null) return _fileMagnifyingGlass!!
        _fileMagnifyingGlass = phosphorBoldIcon(
            name = "FileMagnifyingGlass",
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
                    PathNode.MoveTo(156.48f, 163.51f),
                    PathNode.CurveTo(164.02473f, 147.68762f, 159.07639f, 128.73102f, 144.7608f, 118.61496f),
                    PathNode.CurveTo(130.44522f, 108.4989f, 110.92434f, 110.16439f, 98.529366f, 122.559364f),
                    PathNode.CurveTo(86.13439f, 134.95433f, 84.468895f, 154.47522f, 94.58496f, 168.7908f),
                    PathNode.CurveTo(104.70102f, 183.10638f, 123.65762f, 188.05473f, 139.48f, 180.51f),
                    PathNode.LineTo(151.48f, 192.51f),
                    PathNode.CurveTo(156.17442f, 197.20442f, 163.78558f, 197.20442f, 168.48f, 192.51f),
                    PathNode.CurveTo(173.17442f, 187.81558f, 173.17442f, 180.20442f, 168.48f, 175.51f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 148.0f),
                    PathNode.CurveTo(112.0f, 141.37259f, 117.37258f, 136.0f, 124.0f, 136.0f),
                    PathNode.CurveTo(130.62741f, 136.0f, 136.0f, 141.37259f, 136.0f, 148.0f),
                    PathNode.CurveTo(136.0f, 154.62741f, 130.62741f, 160.0f, 124.0f, 160.0f),
                    PathNode.CurveTo(117.37258f, 160.0f, 112.0f, 154.62741f, 112.0f, 148.0f),
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
        return _fileMagnifyingGlass!!
    }

private var _fileMagnifyingGlass: ImageVector? = null
