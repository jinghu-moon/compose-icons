package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorBoldIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.15f, 49.59f),
                    PathNode.CurveTo(239.95007f, 46.108376f, 236.11842f, 43.99813f, 232.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(35.14534f, 44.000225f, 30.769068f, 46.92546f, 28.912622f, 51.41114f),
                    PathNode.CurveTo(27.056175f, 55.89682f, 28.08533f, 61.059147f, 31.52f, 64.49f),
                    PathNode.LineTo(71.0f, 104.0f),
                    PathNode.LineTo(31.52f, 143.51f),
                    PathNode.CurveTo(28.08533f, 146.94086f, 27.056175f, 152.10318f, 28.912622f, 156.58885f),
                    PathNode.CurveTo(30.769068f, 161.07454f, 35.14534f, 163.99977f, 40.0f, 164.0f),
                    PathNode.LineTo(167.28f, 164.0f),
                    PathNode.LineTo(141.17f, 218.84f),
                    PathNode.CurveTo(139.20068f, 222.72644f, 139.49261f, 227.37497f, 141.93268f, 230.98451f),
                    PathNode.CurveTo(144.37276f, 234.59406f, 148.57756f, 236.59744f, 152.91795f, 236.21849f),
                    PathNode.CurveTo(157.25836f, 235.83954f, 161.05237f, 233.13779f, 162.83f, 229.16f),
                    PathNode.LineTo(242.83f, 61.16f),
                    PathNode.CurveTo(244.60426f, 57.442265f, 244.34753f, 53.074303f, 242.15f, 49.59f),
                    PathNode.Close,
                    PathNode.MoveTo(178.71f, 140.0f),
                    PathNode.LineTo(69.0f, 140.0f),
                    PathNode.LineTo(96.52f, 112.48f),
                    PathNode.CurveTo(98.77946f, 110.22838f, 100.04946f, 107.169815f, 100.04946f, 103.98f),
                    PathNode.CurveTo(100.04946f, 100.790184f, 98.77946f, 97.73162f, 96.52f, 95.48f),
                    PathNode.LineTo(69.0f, 68.0f),
                    PathNode.LineTo(213.0f, 68.0f),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
