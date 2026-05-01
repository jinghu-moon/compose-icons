package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorThinIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(112.536026f, 100.0f, 100.0f, 112.536026f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 143.46397f, 112.536026f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(143.46397f, 156.0f, 156.0f, 143.46397f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 112.536026f, 143.46397f, 100.0f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(143.46397f, 76.0f, 156.0f, 63.46397f, 156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 32.536026f, 143.46397f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(112.536026f, 20.0f, 100.0f, 32.536026f, 100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 63.46397f, 112.536026f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(139.0457f, 28.0f, 148.0f, 36.954304f, 148.0f, 48.0f),
                    PathNode.CurveTo(148.0f, 59.045696f, 139.0457f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(116.95431f, 68.0f, 108.0f, 59.045696f, 108.0f, 48.0f),
                    PathNode.CurveTo(108.0f, 36.954304f, 116.95431f, 28.0f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(112.536026f, 180.0f, 100.0f, 192.53603f, 100.0f, 208.0f),
                    PathNode.CurveTo(100.0f, 223.46397f, 112.536026f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(143.46397f, 236.0f, 156.0f, 223.46397f, 156.0f, 208.0f),
                    PathNode.CurveTo(156.0f, 192.53603f, 143.46397f, 180.0f, 128.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(116.95431f, 228.0f, 108.0f, 219.0457f, 108.0f, 208.0f),
                    PathNode.CurveTo(108.0f, 196.9543f, 116.95431f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(139.0457f, 188.0f, 148.0f, 196.9543f, 148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 219.0457f, 139.0457f, 228.0f, 128.0f, 228.0f),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
