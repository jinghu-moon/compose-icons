package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DeviceTablet: ImageVector
    get() {
        if (_deviceTablet != null) return _deviceTablet!!
        _deviceTablet = phosphorThinIcon(
            name = "DeviceTablet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 28.0f),
                    PathNode.LineTo(64.0f, 28.0f),
                    PathNode.CurveTo(52.954304f, 28.0f, 44.0f, 36.954304f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 219.0457f, 52.954304f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(192.0f, 228.0f),
                    PathNode.CurveTo(203.0457f, 228.0f, 212.0f, 219.0457f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 36.954304f, 203.0457f, 28.0f, 192.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 68.0f),
                    PathNode.LineTo(204.0f, 68.0f),
                    PathNode.LineTo(204.0f, 188.0f),
                    PathNode.LineTo(52.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(198.62741f, 36.0f, 204.0f, 41.37258f, 204.0f, 48.0f),
                    PathNode.LineTo(204.0f, 60.0f),
                    PathNode.LineTo(52.0f, 60.0f),
                    PathNode.LineTo(52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 41.37258f, 57.37258f, 36.0f, 64.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(57.37258f, 220.0f, 52.0f, 214.62741f, 52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 214.62741f, 198.62741f, 220.0f, 192.0f, 220.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceTablet!!
    }

private var _deviceTablet: ImageVector? = null
