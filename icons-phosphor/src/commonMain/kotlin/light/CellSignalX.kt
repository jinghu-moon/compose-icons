package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorLightIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 195.76f),
                    PathNode.CurveTo(213.84523f, 197.25575f, 214.506f, 199.50844f, 213.96309f, 201.63431f),
                    PathNode.CurveTo(213.42018f, 203.76018f, 211.76018f, 205.42018f, 209.63431f, 205.96309f),
                    PathNode.CurveTo(207.50844f, 206.506f, 205.25575f, 205.84523f, 203.76f, 204.24f),
                    PathNode.LineTo(184.0f, 184.48f),
                    PathNode.LineTo(164.24f, 204.24f),
                    PathNode.CurveTo(161.87592f, 206.44287f, 158.19193f, 206.37787f, 155.90703f, 204.09297f),
                    PathNode.CurveTo(153.62213f, 201.80807f, 153.55713f, 198.12408f, 155.76f, 195.76f),
                    PathNode.LineTo(175.52f, 176.0f),
                    PathNode.LineTo(155.76f, 156.24f),
                    PathNode.CurveTo(153.55713f, 153.87592f, 153.62213f, 150.19193f, 155.90703f, 147.90703f),
                    PathNode.CurveTo(158.19193f, 145.62213f, 161.87592f, 145.55713f, 164.24f, 147.76f),
                    PathNode.LineTo(184.0f, 167.52f),
                    PathNode.LineTo(203.76f, 147.76f),
                    PathNode.CurveTo(206.12408f, 145.55713f, 209.80807f, 145.62213f, 212.09297f, 147.90703f),
                    PathNode.CurveTo(214.37787f, 150.19193f, 214.44287f, 153.87592f, 212.24f, 156.24f),
                    PathNode.LineTo(192.48f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 118.0f),
                    PathNode.CurveTo(163.3137f, 118.0f, 166.0f, 115.313705f, 166.0f, 112.0f),
                    PathNode.LineTo(166.0f, 72.0f),
                    PathNode.CurveTo(166.0f, 68.686295f, 163.3137f, 66.0f, 160.0f, 66.0f),
                    PathNode.CurveTo(156.6863f, 66.0f, 154.0f, 68.686295f, 154.0f, 72.0f),
                    PathNode.LineTo(154.0f, 112.0f),
                    PathNode.CurveTo(154.0f, 115.313705f, 156.6863f, 118.0f, 160.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 118.0f),
                    PathNode.CurveTo(203.3137f, 118.0f, 206.0f, 115.313705f, 206.0f, 112.0f),
                    PathNode.LineTo(206.0f, 32.0f),
                    PathNode.CurveTo(206.0f, 28.68629f, 203.3137f, 26.0f, 200.0f, 26.0f),
                    PathNode.CurveTo(196.6863f, 26.0f, 194.0f, 28.68629f, 194.0f, 32.0f),
                    PathNode.LineTo(194.0f, 112.0f),
                    PathNode.CurveTo(194.0f, 115.313705f, 196.6863f, 118.0f, 200.0f, 118.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
