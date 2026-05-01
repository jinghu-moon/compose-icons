package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorFillIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(192.00166f, 106.12237f, 191.15993f, 108.158424f, 189.66f, 109.66f),
                    PathNode.LineTo(136.0f, 163.31f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(163.23764f, 191.99745f, 166.15764f, 193.94662f, 167.39697f, 196.93768f),
                    PathNode.CurveTo(168.63632f, 199.92874f, 167.95064f, 203.3719f, 165.66f, 205.66f),
                    PathNode.LineTo(133.66f, 237.66f),
                    PathNode.CurveTo(132.15945f, 239.16223f, 130.12328f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(125.876724f, 240.00629f, 123.840546f, 239.16223f, 122.34f, 237.66f),
                    PathNode.LineTo(90.34f, 205.66f),
                    PathNode.CurveTo(88.04936f, 203.3719f, 87.36368f, 199.92874f, 88.60302f, 196.93768f),
                    PathNode.CurveTo(89.84236f, 193.94662f, 92.762344f, 191.99745f, 96.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 163.31f),
                    PathNode.LineTo(66.34f, 109.66f),
                    PathNode.CurveTo(64.84009f, 108.158424f, 63.998333f, 106.12237f, 64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 67.58172f, 32.0f, 72.0f, 32.0f),
                    PathNode.CurveTo(76.41828f, 32.0f, 80.0f, 35.581722f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 100.69f),
                    PathNode.LineTo(128.0f, 148.69f),
                    PathNode.LineTo(176.0f, 100.69f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 35.581722f, 179.58173f, 32.0f, 184.0f, 32.0f),
                    PathNode.CurveTo(188.41827f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
