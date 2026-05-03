package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorFillIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(167.39f, 196.94f),
                    PathNode.CurveTo(168.63007f, 199.92903f, 167.94725f, 203.37076f, 165.66f, 205.66f),
                    PathNode.LineTo(133.66f, 237.66f),
                    PathNode.CurveTo(132.15945f, 239.16223f, 130.12328f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(125.876724f, 240.00629f, 123.840546f, 239.16223f, 122.34f, 237.66f),
                    PathNode.LineTo(90.34f, 205.66f),
                    PathNode.CurveTo(88.04936f, 203.3719f, 87.36368f, 199.92874f, 88.60302f, 196.93768f),
                    PathNode.CurveTo(89.84236f, 193.94662f, 92.762344f, 191.99745f, 96.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(92.762344f, 64.00255f, 89.84236f, 62.05338f, 88.60302f, 59.06232f),
                    PathNode.CurveTo(87.36368f, 56.071262f, 88.04936f, 52.628094f, 90.34f, 50.34f),
                    PathNode.LineTo(122.34f, 18.34f),
                    PathNode.CurveTo(123.840546f, 16.837784f, 125.876724f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(130.12328f, 15.993707f, 132.15945f, 16.837784f, 133.66f, 18.34f),
                    PathNode.LineTo(165.66f, 50.34f),
                    PathNode.CurveTo(167.95064f, 52.628094f, 168.63632f, 56.071262f, 167.39697f, 59.06232f),
                    PathNode.CurveTo(166.15764f, 62.05338f, 163.23764f, 64.00255f, 160.0f, 64.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(163.23566f, 192.00067f, 166.15236f, 193.95038f, 167.39f, 196.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
