package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorBoldIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(133.33f, 36.0f),
                    PathNode.CurveTo(129.86404f, 33.411274f, 125.656006f, 32.0086f, 121.33f, 32.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(64.95431f, 32.0f, 56.0f, 40.954304f, 56.0f, 52.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(24.954306f, 72.0f, 16.0f, 80.95431f, 16.0f, 92.0f),
                    PathNode.LineTo(16.0f, 204.0f),
                    PathNode.CurveTo(16.0f, 215.0457f, 24.954306f, 224.0f, 36.0f, 224.0f),
                    PathNode.LineTo(188.89f, 224.0f),
                    PathNode.CurveTo(199.43959f, 223.98898f, 207.98898f, 215.43959f, 208.0f, 204.89f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(228.89f, 184.0f),
                    PathNode.CurveTo(239.43959f, 183.98898f, 247.98898f, 175.43959f, 248.0f, 164.89f),
                    PathNode.LineTo(248.0f, 76.0f),
                    PathNode.CurveTo(248.0f, 64.95431f, 239.0457f, 56.0f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.LineTo(108.8f, 117.6f),
                    PathNode.CurveTo(110.87715f, 119.15787f, 113.40356f, 120.0f, 116.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 160.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(208.0f, 104.95431f, 199.0457f, 96.0f, 188.0f, 96.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(93.33f, 76.0f),
                    PathNode.CurveTo(89.86404f, 73.41128f, 85.656006f, 72.0086f, 81.33f, 72.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(148.8f, 77.6f),
                    PathNode.CurveTo(150.87715f, 79.15787f, 153.40356f, 80.0f, 156.0f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folders!!
    }

private var _folders: ImageVector? = null
