package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorBoldIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 20.41f),
                    PathNode.CurveTo(94.664604f, 18.446142f, 85.2539f, 23.40777f, 81.6f, 32.22f),
                    PathNode.CurveTo(81.53f, 32.37f, 81.47f, 32.53f, 81.41f, 32.68f),
                    PathNode.LineTo(21.47f, 192.49f),
                    PathNode.CurveTo(18.972542f, 198.65433f, 19.702852f, 205.65686f, 23.418507f, 211.17319f),
                    PathNode.CurveTo(27.134163f, 216.68953f, 33.348984f, 219.99785f, 40.0f, 220.0f),
                    PathNode.LineTo(100.0f, 220.0f),
                    PathNode.CurveTo(111.04569f, 220.0f, 120.0f, 211.0457f, 120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.064026f, 30.474678f, 113.34622f, 22.249563f, 104.0f, 20.41f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 196.0f),
                    PathNode.LineTo(45.79f, 196.0f),
                    PathNode.LineTo(96.0f, 62.09f),
                    PathNode.Close,
                    PathNode.MoveTo(234.53f, 192.49f),
                    PathNode.LineTo(174.61f, 32.68f),
                    PathNode.CurveTo(174.55f, 32.53f, 174.49f, 32.37f, 174.42f, 32.22f),
                    PathNode.CurveTo(170.71474f, 23.46005f, 161.35272f, 18.521387f, 152.0306f, 20.409107f),
                    PathNode.CurveTo(142.70845f, 22.296825f, 136.00534f, 30.488659f, 136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.CurveTo(136.0f, 211.0457f, 144.9543f, 220.0f, 156.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(222.65279f, 220.00117f, 228.87068f, 216.69421f, 232.5887f, 211.17734f),
                    PathNode.CurveTo(236.30672f, 205.66046f, 237.03812f, 198.65598f, 234.54f, 192.49f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 196.0f),
                    PathNode.LineTo(160.0f, 62.09f),
                    PathNode.LineTo(210.21f, 196.0f),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
