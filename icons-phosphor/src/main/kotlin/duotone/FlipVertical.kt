package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorDuotoneIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.11f, 159.37f),
                    PathNode.LineTo(59.11f, 223.37f),
                    PathNode.CurveTo(56.639835f, 224.41226f, 53.811806f, 224.14786f, 51.57764f, 222.66579f),
                    PathNode.CurveTo(49.34348f, 221.18373f, 48.00025f, 218.68105f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 147.58173f, 51.581722f, 144.0f, 56.0f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(224.71f, 144.0f, 227.14f, 156.0f, 219.11f, 159.37f),
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
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(47.163445f, 136.0f, 40.0f, 143.16344f, 40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(39.996933f, 221.35054f, 42.668568f, 226.34848f, 47.119247f, 229.31827f),
                    PathNode.CurveTo(51.569927f, 232.28807f, 57.210506f, 232.83661f, 62.15f, 230.78f),
                    PathNode.LineTo(222.08f, 166.78f),
                    PathNode.LineTo(222.22f, 166.72f),
                    PathNode.CurveTo(229.20618f, 163.744f, 233.13821f, 156.26736f, 231.63129f, 148.82477f),
                    PathNode.CurveTo(230.12433f, 141.38217f, 223.59358f, 136.02397f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.15f, 215.93f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
