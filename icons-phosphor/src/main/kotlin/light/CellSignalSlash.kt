package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorLightIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(86.0f, 152.0f),
                    PathNode.LineTo(86.0f, 200.0f),
                    PathNode.CurveTo(86.0f, 203.3137f, 83.313705f, 206.0f, 80.0f, 206.0f),
                    PathNode.CurveTo(76.686295f, 206.0f, 74.0f, 203.3137f, 74.0f, 200.0f),
                    PathNode.LineTo(74.0f, 152.0f),
                    PathNode.CurveTo(74.0f, 148.6863f, 76.686295f, 146.0f, 80.0f, 146.0f),
                    PathNode.CurveTo(83.313705f, 146.0f, 86.0f, 148.6863f, 86.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 203.3137f, 36.68629f, 206.0f, 40.0f, 206.0f),
                    PathNode.CurveTo(43.31371f, 206.0f, 46.0f, 203.3137f, 46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 192.0f),
                    PathNode.CurveTo(46.0f, 188.6863f, 43.31371f, 186.0f, 40.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.44f, 212.0f),
                    PathNode.LineTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(114.0f, 121.52f),
                    PathNode.LineTo(114.0f, 200.0f),
                    PathNode.CurveTo(114.0f, 203.3137f, 116.686295f, 206.0f, 120.0f, 206.0f),
                    PathNode.CurveTo(123.313705f, 206.0f, 126.0f, 203.3137f, 126.0f, 200.0f),
                    PathNode.LineTo(126.0f, 134.72f),
                    PathNode.LineTo(154.0f, 165.52f),
                    PathNode.LineTo(154.0f, 200.0f),
                    PathNode.CurveTo(154.0f, 203.3137f, 156.6863f, 206.0f, 160.0f, 206.0f),
                    PathNode.CurveTo(163.3137f, 206.0f, 166.0f, 203.3137f, 166.0f, 200.0f),
                    PathNode.LineTo(166.0f, 178.72f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 121.63f),
                    PathNode.CurveTo(163.3137f, 121.63f, 166.0f, 118.94371f, 166.0f, 115.63f),
                    PathNode.LineTo(166.0f, 72.0f),
                    PathNode.CurveTo(166.0f, 68.686295f, 163.3137f, 66.0f, 160.0f, 66.0f),
                    PathNode.CurveTo(156.6863f, 66.0f, 154.0f, 68.686295f, 154.0f, 72.0f),
                    PathNode.LineTo(154.0f, 115.63f),
                    PathNode.CurveTo(154.0f, 118.94371f, 156.6863f, 121.63f, 160.0f, 121.63f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 165.63f),
                    PathNode.CurveTo(203.3137f, 165.63f, 206.0f, 162.94371f, 206.0f, 159.63f),
                    PathNode.LineTo(206.0f, 32.0f),
                    PathNode.CurveTo(206.0f, 28.68629f, 203.3137f, 26.0f, 200.0f, 26.0f),
                    PathNode.CurveTo(196.6863f, 26.0f, 194.0f, 28.68629f, 194.0f, 32.0f),
                    PathNode.LineTo(194.0f, 159.63f),
                    PathNode.CurveTo(194.0f, 162.94371f, 196.6863f, 165.63f, 200.0f, 165.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
