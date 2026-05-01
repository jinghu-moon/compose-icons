package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorThinIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(203.0f, 29.35f),
                    PathNode.CurveTo(202.2399f, 28.490576f, 201.14734f, 27.998924f, 200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(54.85048f, 27.99169f, 53.75295f, 28.47834f, 52.98733f, 29.335833f),
                    PathNode.CurveTo(52.221718f, 30.193327f, 51.862022f, 31.33876f, 52.0f, 32.48f),
                    PathNode.LineTo(75.15f, 225.48f),
                    PathNode.CurveTo(75.89872f, 231.50465f, 81.02904f, 236.02106f, 87.1f, 236.0f),
                    PathNode.LineTo(168.9f, 236.0f),
                    PathNode.CurveTo(174.97641f, 236.0028f, 180.0959f, 231.46312f, 180.82f, 225.43f),
                    PathNode.LineTo(204.0f, 32.48f),
                    PathNode.CurveTo(204.13037f, 31.341595f, 203.76627f, 30.201944f, 203.0f, 29.35f),
                    PathNode.Close,
                    PathNode.MoveTo(195.49f, 36.0f),
                    PathNode.LineTo(191.65f, 68.0f),
                    PathNode.LineTo(64.35f, 68.0f),
                    PathNode.LineTo(60.51f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.87f, 224.48f),
                    PathNode.CurveTo(172.6259f, 226.49986f, 170.9045f, 228.0147f, 168.87f, 228.0f),
                    PathNode.LineTo(87.1f, 228.0f),
                    PathNode.CurveTo(85.0655f, 228.0147f, 83.34409f, 226.49986f, 83.1f, 224.48f),
                    PathNode.LineTo(65.31f, 76.0f),
                    PathNode.LineTo(190.69f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
