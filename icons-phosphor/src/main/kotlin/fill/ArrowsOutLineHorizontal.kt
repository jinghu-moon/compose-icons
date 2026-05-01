package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorFillIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 132.41827f, 100.41828f, 136.0f, 96.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(56.00255f, 163.23764f, 54.05338f, 166.15764f, 51.06232f, 167.39697f),
                    PathNode.CurveTo(48.071262f, 168.63632f, 44.628094f, 167.95064f, 42.34f, 165.66f),
                    PathNode.LineTo(10.34f, 133.66f),
                    PathNode.CurveTo(8.837784f, 132.15945f, 7.993707f, 130.12328f, 7.993707f, 128.0f),
                    PathNode.CurveTo(7.993707f, 125.876724f, 8.837784f, 123.840546f, 10.34f, 122.34f),
                    PathNode.LineTo(42.34f, 90.34f),
                    PathNode.CurveTo(44.628094f, 88.04936f, 48.071262f, 87.36368f, 51.06232f, 88.60302f),
                    PathNode.CurveTo(54.05338f, 89.84236f, 56.00255f, 92.762344f, 56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.CurveTo(100.41828f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(245.66f, 122.34f),
                    PathNode.LineTo(213.66f, 90.34f),
                    PathNode.CurveTo(211.3719f, 88.04936f, 207.92874f, 87.36368f, 204.93768f, 88.60302f),
                    PathNode.CurveTo(201.94662f, 89.84236f, 199.99745f, 92.762344f, 200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(155.58173f, 120.0f, 152.0f, 123.58172f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 132.41827f, 155.58173f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.CurveTo(199.99745f, 163.23764f, 201.94662f, 166.15764f, 204.93768f, 167.39697f),
                    PathNode.CurveTo(207.92874f, 168.63632f, 211.3719f, 167.95064f, 213.66f, 165.66f),
                    PathNode.LineTo(245.66f, 133.66f),
                    PathNode.CurveTo(247.16223f, 132.15945f, 248.00629f, 130.12328f, 248.00629f, 128.0f),
                    PathNode.CurveTo(248.00629f, 125.876724f, 247.16223f, 123.840546f, 245.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(120.0f, 220.41827f, 123.58172f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(132.41827f, 224.0f, 136.0f, 220.41827f, 136.0f, 216.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
