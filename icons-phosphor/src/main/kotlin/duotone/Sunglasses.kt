package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorDuotoneIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 164.0f),
                    PathNode.CurveTo(104.0f, 183.88223f, 87.88225f, 200.0f, 68.0f, 200.0f),
                    PathNode.CurveTo(48.11775f, 200.0f, 32.0f, 183.88223f, 32.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 136.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(152.0f, 183.88223f, 168.11777f, 200.0f, 188.0f, 200.0f),
                    PathNode.CurveTo(207.88223f, 200.0f, 224.0f, 183.88223f, 224.0f, 164.0f),
                    PathNode.LineTo(224.0f, 136.0f),
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
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.CurveTo(195.58173f, 40.0f, 192.0f, 43.581722f, 192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 52.418278f, 195.58173f, 56.0f, 200.0f, 56.0f),
                    PathNode.CurveTo(208.83656f, 56.0f, 216.0f, 63.163445f, 216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 128.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(40.0f, 63.163445f, 47.163445f, 56.0f, 56.0f, 56.0f),
                    PathNode.CurveTo(60.418278f, 56.0f, 64.0f, 52.418278f, 64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 43.581722f, 60.418278f, 40.0f, 56.0f, 40.0f),
                    PathNode.CurveTo(38.32689f, 40.0f, 24.0f, 54.32689f, 24.0f, 72.0f),
                    PathNode.LineTo(24.0f, 164.0f),
                    PathNode.CurveTo(24.0f, 188.30052f, 43.69947f, 208.0f, 68.0f, 208.0f),
                    PathNode.CurveTo(92.30053f, 208.0f, 112.0f, 188.30052f, 112.0f, 164.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(144.0f, 164.0f),
                    PathNode.CurveTo(144.0f, 188.30052f, 163.69948f, 208.0f, 188.0f, 208.0f),
                    PathNode.CurveTo(212.30052f, 208.0f, 232.0f, 188.30052f, 232.0f, 164.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 54.32689f, 217.67311f, 40.0f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.63f, 177.31f),
                    PathNode.LineTo(179.31f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(216.0f, 164.0f),
                    PathNode.CurveTo(216.00717f, 168.64865f, 214.8485f, 173.22488f, 212.63f, 177.31f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 164.0f),
                    PathNode.LineTo(40.0f, 147.31f),
                    PathNode.LineTo(81.31f, 188.63f),
                    PathNode.CurveTo(72.633804f, 193.3178f, 62.13131f, 193.0958f, 53.660954f, 188.04558f),
                    PathNode.CurveTo(45.190598f, 182.99535f, 40.00148f, 173.86163f, 40.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 164.0f),
                    PathNode.CurveTo(96.00717f, 168.64865f, 94.848495f, 173.22488f, 92.63f, 177.31f),
                    PathNode.LineTo(59.31f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 164.0f),
                    PathNode.LineTo(160.0f, 147.31f),
                    PathNode.LineTo(201.31f, 188.63f),
                    PathNode.CurveTo(192.6338f, 193.3178f, 182.1313f, 193.0958f, 173.66095f, 188.04558f),
                    PathNode.CurveTo(165.1906f, 182.99535f, 160.0015f, 173.86163f, 160.0f, 164.0f),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
