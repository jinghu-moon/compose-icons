package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorBoldIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 96.0f),
                    PathNode.CurveTo(188.0f, 62.862915f, 161.13708f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(94.862915f, 36.0f, 68.0f, 62.862915f, 68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 129.13708f, 94.862915f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(130.61217f, 155.9958f, 133.2212f, 155.81876f, 135.81f, 155.47f),
                    PathNode.LineTo(109.54f, 202.11f),
                    PathNode.CurveTo(106.28704f, 207.8869f, 108.3331f, 215.20705f, 114.11f, 218.46f),
                    PathNode.CurveTo(119.8869f, 221.71294f, 127.20705f, 219.6669f, 130.46f, 213.89f),
                    PathNode.LineTo(180.0f, 125.89f),
                    PathNode.CurveTo(185.25288f, 116.805244f, 188.01265f, 106.494064f, 188.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.CurveTo(92.0f, 76.11775f, 108.11775f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(147.88223f, 60.0f, 164.0f, 76.11775f, 164.0f, 96.0f),
                    PathNode.CurveTo(164.0f, 115.88225f, 147.88223f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(108.11775f, 132.0f, 92.0f, 115.88225f, 92.0f, 96.0f),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
