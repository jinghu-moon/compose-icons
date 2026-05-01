package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorBoldIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(225.51321f, 119.999405f, 233.70947f, 113.297806f, 235.5999f, 103.97431f),
                    PathNode.CurveTo(237.49031f, 94.65081f, 232.55168f, 85.285995f, 223.79f, 81.58f),
                    PathNode.LineTo(223.33f, 81.39f),
                    PathNode.LineTo(63.51f, 21.47f),
                    PathNode.CurveTo(57.345688f, 18.972542f, 50.34314f, 19.702852f, 44.826805f, 23.418507f),
                    PathNode.CurveTo(39.31047f, 27.134163f, 36.002144f, 33.348984f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.CurveTo(36.0f, 111.04569f, 44.954304f, 120.0f, 56.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 45.79f),
                    PathNode.LineTo(193.91f, 96.0f),
                    PathNode.LineTo(60.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(44.954304f, 136.0f, 36.0f, 144.9543f, 36.0f, 156.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(35.998817f, 222.65279f, 39.305786f, 228.87068f, 44.82266f, 232.5887f),
                    PathNode.CurveTo(50.339535f, 236.30672f, 57.344048f, 237.03812f, 63.51f, 234.54f),
                    PathNode.LineTo(223.32f, 174.62f),
                    PathNode.LineTo(223.78f, 174.43f),
                    PathNode.CurveTo(232.55325f, 170.7324f, 237.50388f, 161.3629f, 235.61478f, 152.03159f),
                    PathNode.CurveTo(233.7257f, 142.70026f, 225.52063f, 135.99408f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 210.22f),
                    PathNode.LineTo(60.0f, 160.0f),
                    PathNode.LineTo(193.91f, 160.0f),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
