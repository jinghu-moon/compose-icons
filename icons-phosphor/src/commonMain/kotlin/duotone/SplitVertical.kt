package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorDuotoneIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 56.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 232.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.LineTo(48.0f, 144.0f),
                    PathNode.CurveTo(43.581722f, 144.0f, 40.0f, 147.58173f, 40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 156.41827f, 43.581722f, 160.0f, 48.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(92.762344f, 191.99745f, 89.84236f, 193.94662f, 88.60302f, 196.93768f),
                    PathNode.CurveTo(87.36368f, 199.92874f, 88.04936f, 203.3719f, 90.34f, 205.66f),
                    PathNode.LineTo(122.34f, 237.66f),
                    PathNode.CurveTo(123.840546f, 239.16223f, 125.876724f, 240.00629f, 128.0f, 240.00629f),
                    PathNode.CurveTo(130.12328f, 240.00629f, 132.15945f, 239.16223f, 133.66f, 237.66f),
                    PathNode.LineTo(165.66f, 205.66f),
                    PathNode.CurveTo(167.95064f, 203.3719f, 168.63632f, 199.92874f, 167.39697f, 196.93768f),
                    PathNode.CurveTo(166.15764f, 193.94662f, 163.23764f, 191.99745f, 160.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.CurveTo(212.41827f, 160.0f, 216.0f, 156.41827f, 216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 147.58173f, 212.41827f, 144.0f, 208.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.69f),
                    PathNode.LineTo(115.31f, 208.0f),
                    PathNode.LineTo(140.69f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 112.0f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(212.41827f, 112.0f, 216.0f, 108.41828f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 99.58172f, 212.41827f, 96.0f, 208.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(163.23764f, 64.00255f, 166.15764f, 62.05338f, 167.39697f, 59.06232f),
                    PathNode.CurveTo(168.63632f, 56.071262f, 167.95064f, 52.628094f, 165.66f, 50.34f),
                    PathNode.LineTo(133.66f, 18.34f),
                    PathNode.CurveTo(132.15945f, 16.837784f, 130.12328f, 15.993707f, 128.0f, 15.993707f),
                    PathNode.CurveTo(125.876724f, 15.993707f, 123.840546f, 16.837784f, 122.34f, 18.34f),
                    PathNode.LineTo(90.34f, 50.34f),
                    PathNode.CurveTo(88.04936f, 52.628094f, 87.36368f, 56.071262f, 88.60302f, 59.06232f),
                    PathNode.CurveTo(89.84236f, 62.05338f, 92.762344f, 64.00255f, 96.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(43.581722f, 96.0f, 40.0f, 99.58172f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 108.41828f, 43.581722f, 112.0f, 48.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 35.31f),
                    PathNode.LineTo(140.69f, 48.0f),
                    PathNode.LineTo(115.31f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
