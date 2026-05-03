package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorFillIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.61f, 51.06f),
                    PathNode.CurveTo(87.369934f, 48.070965f, 88.05276f, 44.62924f, 90.34f, 42.34f),
                    PathNode.LineTo(122.34f, 10.34f),
                    PathNode.CurveTo(123.840546f, 8.837784f, 125.876724f, 7.993707f, 128.0f, 7.993707f),
                    PathNode.CurveTo(130.12328f, 7.993707f, 132.15945f, 8.837784f, 133.66f, 10.34f),
                    PathNode.LineTo(165.66f, 42.34f),
                    PathNode.CurveTo(167.95064f, 44.628094f, 168.63632f, 48.071262f, 167.39697f, 51.06232f),
                    PathNode.CurveTo(166.15764f, 54.05338f, 163.23764f, 56.00255f, 160.0f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 100.41828f, 132.41827f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(123.58172f, 104.0f, 120.0f, 100.41828f, 120.0f, 96.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(92.76432f, 55.999336f, 89.84765f, 54.04962f, 88.61f, 51.06f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 123.58172f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 132.41827f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 123.58172f, 220.41827f, 120.0f, 216.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 155.58173f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 155.58173f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.CurveTo(92.762344f, 199.99745f, 89.84236f, 201.94662f, 88.60302f, 204.93768f),
                    PathNode.CurveTo(87.36368f, 207.92874f, 88.04936f, 211.3719f, 90.34f, 213.66f),
                    PathNode.LineTo(122.34f, 245.66f),
                    PathNode.CurveTo(123.840546f, 247.16223f, 125.876724f, 248.00629f, 128.0f, 248.00629f),
                    PathNode.CurveTo(130.12328f, 248.00629f, 132.15945f, 247.16223f, 133.66f, 245.66f),
                    PathNode.LineTo(165.66f, 213.66f),
                    PathNode.CurveTo(167.95064f, 211.3719f, 168.63632f, 207.92874f, 167.39697f, 204.93768f),
                    PathNode.CurveTo(166.15764f, 201.94662f, 163.23764f, 199.99745f, 160.0f, 200.0f),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
