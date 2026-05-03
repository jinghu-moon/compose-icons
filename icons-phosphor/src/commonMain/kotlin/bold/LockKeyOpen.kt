package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorBoldIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 76.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 40.53603f, 112.536026f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(141.51f, 28.0f, 153.65f, 37.62f, 156.24f, 50.39f),
                    PathNode.CurveTo(157.55997f, 56.88487f, 163.89513f, 61.07996f, 170.39f, 59.76f),
                    PathNode.CurveTo(176.88487f, 58.44004f, 181.07996f, 52.10487f, 179.76f, 45.61f),
                    PathNode.CurveTo(174.87f, 21.5f, 153.1f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(99.2949f, 4.033064f, 76.033066f, 27.294897f, 76.0f, 56.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(48.0f, 76.0f),
                    PathNode.CurveTo(36.954304f, 76.0f, 28.0f, 84.95431f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 84.95431f, 219.0457f, 76.0f, 208.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 173.66f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.CurveTo(116.0f, 186.62741f, 121.37258f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(134.62741f, 192.0f, 140.0f, 186.62741f, 140.0f, 180.0f),
                    PathNode.LineTo(140.0f, 173.66f),
                    PathNode.CurveTo(154.19862f, 167.91637f, 162.33647f, 152.91698f, 159.41077f, 137.88266f),
                    PathNode.CurveTo(156.48509f, 122.848335f, 143.31635f, 111.99521f, 128.0f, 111.99521f),
                    PathNode.CurveTo(112.683655f, 111.99521f, 99.514915f, 122.848335f, 96.589226f, 137.88266f),
                    PathNode.CurveTo(93.66354f, 152.91698f, 101.80137f, 167.91637f, 116.0f, 173.66f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(132.41827f, 136.0f, 136.0f, 139.58173f, 136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 139.58173f, 123.58172f, 136.0f, 128.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
