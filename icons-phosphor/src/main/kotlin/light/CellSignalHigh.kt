package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalHigh: ImageVector
    get() {
        if (_cellSignalHigh != null) return _cellSignalHigh!!
        _cellSignalHigh = phosphorLightIcon(
            name = "CellSignalHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 72.0f),
                    PathNode.LineTo(166.0f, 200.0f),
                    PathNode.CurveTo(166.0f, 203.3137f, 163.3137f, 206.0f, 160.0f, 206.0f),
                    PathNode.CurveTo(156.6863f, 206.0f, 154.0f, 203.3137f, 154.0f, 200.0f),
                    PathNode.LineTo(154.0f, 72.0f),
                    PathNode.CurveTo(154.0f, 68.686295f, 156.6863f, 66.0f, 160.0f, 66.0f),
                    PathNode.CurveTo(163.3137f, 66.0f, 166.0f, 68.686295f, 166.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 106.0f),
                    PathNode.CurveTo(116.686295f, 106.0f, 114.0f, 108.686295f, 114.0f, 112.0f),
                    PathNode.LineTo(114.0f, 200.0f),
                    PathNode.CurveTo(114.0f, 203.3137f, 116.686295f, 206.0f, 120.0f, 206.0f),
                    PathNode.CurveTo(123.313705f, 206.0f, 126.0f, 203.3137f, 126.0f, 200.0f),
                    PathNode.LineTo(126.0f, 112.0f),
                    PathNode.CurveTo(126.0f, 108.686295f, 123.313705f, 106.0f, 120.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 146.0f),
                    PathNode.CurveTo(76.686295f, 146.0f, 74.0f, 148.6863f, 74.0f, 152.0f),
                    PathNode.LineTo(74.0f, 200.0f),
                    PathNode.CurveTo(74.0f, 203.3137f, 76.686295f, 206.0f, 80.0f, 206.0f),
                    PathNode.CurveTo(83.313705f, 206.0f, 86.0f, 203.3137f, 86.0f, 200.0f),
                    PathNode.LineTo(86.0f, 152.0f),
                    PathNode.CurveTo(86.0f, 148.6863f, 83.313705f, 146.0f, 80.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 203.3137f, 36.68629f, 206.0f, 40.0f, 206.0f),
                    PathNode.CurveTo(43.31371f, 206.0f, 46.0f, 203.3137f, 46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 192.0f),
                    PathNode.CurveTo(46.0f, 188.6863f, 43.31371f, 186.0f, 40.0f, 186.0f),
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
        return _cellSignalHigh!!
    }

private var _cellSignalHigh: ImageVector? = null
