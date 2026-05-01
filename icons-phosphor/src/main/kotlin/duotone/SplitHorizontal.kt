package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorDuotoneIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 96.0f),
                    PathNode.LineTo(24.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 40.0f),
                    PathNode.CurveTo(99.58172f, 40.0f, 96.0f, 43.581722f, 96.0f, 48.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(64.00255f, 92.762344f, 62.05338f, 89.84236f, 59.06232f, 88.60302f),
                    PathNode.CurveTo(56.071262f, 87.36368f, 52.628094f, 88.04936f, 50.34f, 90.34f),
                    PathNode.LineTo(18.34f, 122.34f),
                    PathNode.CurveTo(16.837784f, 123.840546f, 15.993707f, 125.876724f, 15.993707f, 128.0f),
                    PathNode.CurveTo(15.993707f, 130.12328f, 16.837784f, 132.15945f, 18.34f, 133.66f),
                    PathNode.LineTo(50.34f, 165.66f),
                    PathNode.CurveTo(52.628094f, 167.95064f, 56.071262f, 168.63632f, 59.06232f, 167.39697f),
                    PathNode.CurveTo(62.05338f, 166.15764f, 64.00255f, 163.23764f, 64.0f, 160.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(96.0f, 212.41827f, 99.58172f, 216.0f, 104.0f, 216.0f),
                    PathNode.CurveTo(108.41828f, 216.0f, 112.0f, 212.41827f, 112.0f, 208.0f),
                    PathNode.LineTo(112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 43.581722f, 108.41828f, 40.0f, 104.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 140.69f),
                    PathNode.LineTo(35.31f, 128.0f),
                    PathNode.LineTo(48.0f, 115.31f),
                    PathNode.Close,
                    PathNode.MoveTo(237.66f, 122.34f),
                    PathNode.LineTo(205.66f, 90.34f),
                    PathNode.CurveTo(203.3719f, 88.04936f, 199.92874f, 87.36368f, 196.93768f, 88.60302f),
                    PathNode.CurveTo(193.94662f, 89.84236f, 191.99745f, 92.762344f, 192.0f, 96.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 43.581722f, 156.41827f, 40.0f, 152.0f, 40.0f),
                    PathNode.CurveTo(147.58173f, 40.0f, 144.0f, 43.581722f, 144.0f, 48.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 212.41827f, 147.58173f, 216.0f, 152.0f, 216.0f),
                    PathNode.CurveTo(156.41827f, 216.0f, 160.0f, 212.41827f, 160.0f, 208.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.CurveTo(191.99745f, 163.23764f, 193.94662f, 166.15764f, 196.93768f, 167.39697f),
                    PathNode.CurveTo(199.92874f, 168.63632f, 203.3719f, 167.95064f, 205.66f, 165.66f),
                    PathNode.LineTo(237.66f, 133.66f),
                    PathNode.CurveTo(239.16223f, 132.15945f, 240.00629f, 130.12328f, 240.00629f, 128.0f),
                    PathNode.CurveTo(240.00629f, 125.876724f, 239.16223f, 123.840546f, 237.66f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 140.69f),
                    PathNode.LineTo(208.0f, 115.31f),
                    PathNode.LineTo(220.69f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
