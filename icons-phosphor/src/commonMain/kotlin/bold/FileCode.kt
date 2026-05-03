package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorBoldIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.49f, 143.51f),
                    PathNode.CurveTo(182.74945f, 145.76163f, 184.01947f, 148.82018f, 184.01947f, 152.01f),
                    PathNode.CurveTo(184.01947f, 155.19981f, 182.74945f, 158.25838f, 180.49f, 160.51f),
                    PathNode.LineTo(156.49f, 184.51f),
                    PathNode.CurveTo(151.79558f, 189.20442f, 144.18442f, 189.20442f, 139.49f, 184.51f),
                    PathNode.CurveTo(134.79558f, 179.81558f, 134.79558f, 172.20442f, 139.49f, 167.51f),
                    PathNode.LineTo(155.0f, 152.0f),
                    PathNode.LineTo(139.48f, 136.49f),
                    PathNode.CurveTo(134.78558f, 131.79558f, 134.78558f, 124.18442f, 139.48f, 119.49f),
                    PathNode.CurveTo(144.17442f, 114.79558f, 151.78558f, 114.79558f, 156.48f, 119.49f),
                    PathNode.Close,
                    PathNode.MoveTo(116.49f, 119.51f),
                    PathNode.CurveTo(114.23838f, 117.25055f, 111.17982f, 115.98054f, 107.99f, 115.98054f),
                    PathNode.CurveTo(104.80018f, 115.98054f, 101.74162f, 117.25055f, 99.49f, 119.51f),
                    PathNode.LineTo(75.49f, 143.51f),
                    PathNode.CurveTo(73.230545f, 145.76163f, 71.96054f, 148.82018f, 71.96054f, 152.01f),
                    PathNode.CurveTo(71.96054f, 155.19981f, 73.230545f, 158.25838f, 75.49f, 160.51f),
                    PathNode.LineTo(99.49f, 184.51f),
                    PathNode.CurveTo(104.18442f, 189.20442f, 111.79558f, 189.20442f, 116.49f, 184.51f),
                    PathNode.CurveTo(121.18442f, 179.81558f, 121.18442f, 172.20442f, 116.49f, 167.51f),
                    PathNode.LineTo(101.0f, 152.0f),
                    PathNode.LineTo(116.52f, 136.49f),
                    PathNode.CurveTo(118.769356f, 134.2352f, 120.030075f, 131.1787f, 120.024445f, 127.99378f),
                    PathNode.CurveTo(120.01882f, 124.80887f, 118.74731f, 121.75683f, 116.49f, 119.51f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 88.0f),
                    PathNode.LineTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 227.0457f, 211.0457f, 236.0f, 200.0f, 236.0f),
                    PathNode.LineTo(56.0f, 236.0f),
                    PathNode.CurveTo(44.954304f, 236.0f, 36.0f, 227.0457f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 28.954306f, 44.954304f, 20.0f, 56.0f, 20.0f),
                    PathNode.LineTo(152.0f, 20.0f),
                    PathNode.CurveTo(155.185f, 20.000149f, 158.23927f, 21.26647f, 160.49f, 23.52f),
                    PathNode.LineTo(216.49f, 79.52f),
                    PathNode.CurveTo(218.73741f, 81.76991f, 219.99985f, 84.819916f, 220.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 57.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(183.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.LineTo(148.0f, 104.0f),
                    PathNode.CurveTo(141.37259f, 104.0f, 136.0f, 98.62742f, 136.0f, 92.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.LineTo(60.0f, 212.0f),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
