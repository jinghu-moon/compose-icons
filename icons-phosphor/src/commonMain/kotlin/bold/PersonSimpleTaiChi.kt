package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorBoldIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(147.88223f, 84.0f, 164.0f, 67.88225f, 164.0f, 48.0f),
                    PathNode.CurveTo(164.0f, 28.117748f, 147.88223f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(108.11775f, 12.0f, 92.0f, 28.117748f, 92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 67.88225f, 108.11775f, 84.0f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(134.62741f, 36.0f, 140.0f, 41.37258f, 140.0f, 48.0f),
                    PathNode.CurveTo(140.0f, 54.62742f, 134.62741f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(121.37258f, 60.0f, 116.0f, 54.62742f, 116.0f, 48.0f),
                    PathNode.CurveTo(116.0f, 41.37258f, 121.37258f, 36.0f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 108.0f),
                    PathNode.CurveTo(228.0f, 114.62742f, 222.62741f, 120.0f, 216.0f, 120.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 136.09f),
                    PathNode.LineTo(188.73f, 157.0f),
                    PathNode.CurveTo(193.13113f, 158.88759f, 195.98865f, 163.21118f, 196.0f, 168.0f),
                    PathNode.LineTo(196.0f, 216.0f),
                    PathNode.CurveTo(196.0f, 222.62741f, 190.62741f, 228.0f, 184.0f, 228.0f),
                    PathNode.CurveTo(177.37259f, 228.0f, 172.0f, 222.62741f, 172.0f, 216.0f),
                    PathNode.LineTo(172.0f, 175.91f),
                    PathNode.LineTo(130.33f, 158.05f),
                    PathNode.LineTo(56.0f, 224.92f),
                    PathNode.CurveTo(51.030357f, 228.90742f, 43.810875f, 228.31577f, 39.55675f, 223.57242f),
                    PathNode.CurveTo(35.302628f, 218.82907f, 35.49724f, 211.588f, 40.0f, 207.08f),
                    PathNode.LineTo(116.0f, 138.66f),
                    PathNode.LineTo(116.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(33.37258f, 120.0f, 28.0f, 114.62742f, 28.0f, 108.0f),
                    PathNode.CurveTo(28.0f, 101.37258f, 33.37258f, 96.0f, 40.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(222.62741f, 96.0f, 228.0f, 101.37258f, 228.0f, 108.0f),
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
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
