package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyJpy: ImageVector
    get() {
        if (_currencyJpy != null) return _currencyJpy!!
        _currencyJpy = phosphorBoldIcon(
            name = "CurrencyJpy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.29f, 55.6f),
                    PathNode.LineTo(153.29f, 124.0f),
                    PathNode.LineTo(176.0f, 124.0f),
                    PathNode.CurveTo(182.62741f, 124.0f, 188.0f, 129.37259f, 188.0f, 136.0f),
                    PathNode.CurveTo(188.0f, 142.62741f, 182.62741f, 148.0f, 176.0f, 148.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.LineTo(176.0f, 164.0f),
                    PathNode.CurveTo(182.62741f, 164.0f, 188.0f, 169.37259f, 188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 182.62741f, 182.62741f, 188.0f, 176.0f, 188.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 134.62741f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(121.37258f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(80.0f, 188.0f),
                    PathNode.CurveTo(73.37258f, 188.0f, 68.0f, 182.62741f, 68.0f, 176.0f),
                    PathNode.CurveTo(68.0f, 169.37259f, 73.37258f, 164.0f, 80.0f, 164.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.CurveTo(73.37258f, 148.0f, 68.0f, 142.62741f, 68.0f, 136.0f),
                    PathNode.CurveTo(68.0f, 129.37259f, 73.37258f, 124.0f, 80.0f, 124.0f),
                    PathNode.LineTo(102.68f, 124.0f),
                    PathNode.LineTo(46.68f, 55.6f),
                    PathNode.CurveTo(42.482635f, 50.46099f, 43.24599f, 42.892365f, 48.385f, 38.695f),
                    PathNode.CurveTo(53.52401f, 34.497635f, 61.092636f, 35.26099f, 65.29f, 40.4f),
                    PathNode.LineTo(128.0f, 117.05f),
                    PathNode.LineTo(190.71f, 40.4f),
                    PathNode.CurveTo(194.90736f, 35.269276f, 202.46927f, 34.512634f, 207.6f, 38.71f),
                    PathNode.CurveTo(212.73074f, 42.907364f, 213.48737f, 50.469276f, 209.29f, 55.6f),
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
        return _currencyJpy!!
    }

private var _currencyJpy: ImageVector? = null
