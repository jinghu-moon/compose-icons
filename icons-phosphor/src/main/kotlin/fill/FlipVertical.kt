package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorFillIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(223.6139f, 120.003075f, 230.17532f, 114.640274f, 231.68767f, 107.17807f),
                    PathNode.CurveTo(233.20001f, 99.71587f, 229.24431f, 92.221596f, 222.23f, 89.26f),
                    PathNode.LineTo(222.09f, 89.2f),
                    PathNode.LineTo(62.16f, 25.2f),
                    PathNode.CurveTo(57.216175f, 23.13764f, 51.568287f, 23.686142f, 47.11368f, 26.66124f),
                    PathNode.CurveTo(42.659073f, 29.63634f, 39.988834f, 34.643265f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 112.836555f, 47.163445f, 120.0f, 56.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 40.0f),
                    PathNode.LineTo(56.15f, 40.06f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.67f, 148.82f),
                    PathNode.CurveTo(233.2467f, 156.28966f, 229.27458f, 163.82199f, 222.22f, 166.74f),
                    PathNode.LineTo(222.08f, 166.8f),
                    PathNode.LineTo(62.15f, 230.8f),
                    PathNode.CurveTo(57.207233f, 232.85799f, 51.56269f, 232.30728f, 47.110916f, 229.33273f),
                    PathNode.CurveTo(42.659138f, 226.35818f, 39.990234f, 221.35408f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 143.16344f, 47.163445f, 136.0f, 56.0f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(223.62769f, 135.94598f, 230.21199f, 141.33276f, 231.67f, 148.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
