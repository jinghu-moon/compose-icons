package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorLightIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 40.0f),
                    PathNode.LineTo(222.0f, 80.0f),
                    PathNode.CurveTo(222.0f, 83.313705f, 219.3137f, 86.0f, 216.0f, 86.0f),
                    PathNode.CurveTo(212.6863f, 86.0f, 210.0f, 83.313705f, 210.0f, 80.0f),
                    PathNode.LineTo(210.0f, 46.0f),
                    PathNode.LineTo(176.0f, 46.0f),
                    PathNode.CurveTo(172.6863f, 46.0f, 170.0f, 43.31371f, 170.0f, 40.0f),
                    PathNode.CurveTo(170.0f, 36.68629f, 172.6863f, 34.0f, 176.0f, 34.0f),
                    PathNode.LineTo(216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(46.0f, 176.0f),
                    PathNode.CurveTo(46.0f, 172.6863f, 43.31371f, 170.0f, 40.0f, 170.0f),
                    PathNode.CurveTo(36.68629f, 170.0f, 34.0f, 172.6863f, 34.0f, 176.0f),
                    PathNode.LineTo(34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(80.0f, 222.0f),
                    PathNode.CurveTo(83.313705f, 222.0f, 86.0f, 219.3137f, 86.0f, 216.0f),
                    PathNode.CurveTo(86.0f, 212.6863f, 83.313705f, 210.0f, 80.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 170.0f),
                    PathNode.CurveTo(212.6863f, 170.0f, 210.0f, 172.6863f, 210.0f, 176.0f),
                    PathNode.LineTo(210.0f, 210.0f),
                    PathNode.LineTo(176.0f, 210.0f),
                    PathNode.CurveTo(172.6863f, 210.0f, 170.0f, 212.6863f, 170.0f, 216.0f),
                    PathNode.CurveTo(170.0f, 219.3137f, 172.6863f, 222.0f, 176.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 176.0f),
                    PathNode.CurveTo(222.0f, 172.6863f, 219.3137f, 170.0f, 216.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 86.0f),
                    PathNode.CurveTo(43.31371f, 86.0f, 46.0f, 83.313705f, 46.0f, 80.0f),
                    PathNode.LineTo(46.0f, 46.0f),
                    PathNode.LineTo(80.0f, 46.0f),
                    PathNode.CurveTo(83.313705f, 46.0f, 86.0f, 43.31371f, 86.0f, 40.0f),
                    PathNode.CurveTo(86.0f, 36.68629f, 83.313705f, 34.0f, 80.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 80.0f),
                    PathNode.CurveTo(34.0f, 83.313705f, 36.68629f, 86.0f, 40.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 74.0f),
                    PathNode.LineTo(176.0f, 74.0f),
                    PathNode.CurveTo(179.3137f, 74.0f, 182.0f, 76.686295f, 182.0f, 80.0f),
                    PathNode.LineTo(182.0f, 176.0f),
                    PathNode.CurveTo(182.0f, 179.3137f, 179.3137f, 182.0f, 176.0f, 182.0f),
                    PathNode.LineTo(80.0f, 182.0f),
                    PathNode.CurveTo(76.686295f, 182.0f, 74.0f, 179.3137f, 74.0f, 176.0f),
                    PathNode.LineTo(74.0f, 80.0f),
                    PathNode.CurveTo(74.0f, 76.686295f, 76.686295f, 74.0f, 80.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 170.0f),
                    PathNode.LineTo(170.0f, 170.0f),
                    PathNode.LineTo(170.0f, 86.0f),
                    PathNode.LineTo(86.0f, 86.0f),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
