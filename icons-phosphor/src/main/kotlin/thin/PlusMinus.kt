package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorThinIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 58.83f),
                    PathNode.LineTo(58.83f, 202.83f),
                    PathNode.CurveTo(57.267033f, 204.39296f, 54.732967f, 204.39296f, 53.17f, 202.83f),
                    PathNode.CurveTo(51.607033f, 201.26703f, 51.607033f, 198.73297f, 53.17f, 197.17f),
                    PathNode.LineTo(197.17f, 53.17f),
                    PathNode.CurveTo(198.73297f, 51.607033f, 201.26703f, 51.607033f, 202.83f, 53.17f),
                    PathNode.CurveTo(204.39296f, 54.732967f, 204.39296f, 57.267033f, 202.83f, 58.83f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 112.0f),
                    PathNode.CurveTo(68.0f, 114.20914f, 69.79086f, 116.0f, 72.0f, 116.0f),
                    PathNode.CurveTo(74.20914f, 116.0f, 76.0f, 114.20914f, 76.0f, 112.0f),
                    PathNode.LineTo(76.0f, 76.0f),
                    PathNode.LineTo(112.0f, 76.0f),
                    PathNode.CurveTo(114.20914f, 76.0f, 116.0f, 74.20914f, 116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 69.79086f, 114.20914f, 68.0f, 112.0f, 68.0f),
                    PathNode.LineTo(76.0f, 68.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 29.790861f, 74.20914f, 28.0f, 72.0f, 28.0f),
                    PathNode.CurveTo(69.79086f, 28.0f, 68.0f, 29.790861f, 68.0f, 32.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(29.790861f, 68.0f, 28.0f, 69.79086f, 28.0f, 72.0f),
                    PathNode.CurveTo(28.0f, 74.20914f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 180.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.CurveTo(141.79086f, 180.0f, 140.0f, 181.79086f, 140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 186.20914f, 141.79086f, 188.0f, 144.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(226.20914f, 188.0f, 228.0f, 186.20914f, 228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 181.79086f, 226.20914f, 180.0f, 224.0f, 180.0f),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
