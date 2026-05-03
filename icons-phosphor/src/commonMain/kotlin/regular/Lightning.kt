package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorRegularIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(215.79f, 118.17f),
                    PathNode.CurveTo(215.17479f, 115.565865f, 213.29836f, 113.44175f, 210.79f, 112.51f),
                    PathNode.LineTo(153.18f, 90.9f),
                    PathNode.LineTo(167.84f, 17.57f),
                    PathNode.CurveTo(168.52197f, 14.069727f, 166.80486f, 10.540713f, 163.62973f, 8.917214f),
                    PathNode.CurveTo(160.45464f, 7.293716f, 156.58835f, 7.9678f, 154.15f, 10.57f),
                    PathNode.LineTo(42.15f, 130.57f),
                    PathNode.CurveTo(40.30234f, 132.51689f, 39.554127f, 135.26059f, 40.157665f, 137.87593f),
                    PathNode.CurveTo(40.761204f, 140.49126f, 42.63605f, 142.62964f, 45.15f, 143.57f),
                    PathNode.LineTo(102.78f, 165.18f),
                    PathNode.LineTo(88.16f, 238.43f),
                    PathNode.CurveTo(87.47802f, 241.93027f, 89.19517f, 245.45929f, 92.37027f, 247.08278f),
                    PathNode.CurveTo(95.545364f, 248.70628f, 99.41165f, 248.0322f, 101.85f, 245.43f),
                    PathNode.LineTo(213.85f, 125.43f),
                    PathNode.CurveTo(215.66376f, 123.4832f, 216.3909f, 120.76204f, 215.79f, 118.17f),
                    PathNode.Close,
                    PathNode.MoveTo(109.37f, 214.0f),
                    PathNode.LineTo(119.84f, 161.62f),
                    PathNode.CurveTo(120.61387f, 157.78352f, 118.49845f, 153.95038f, 114.84f, 152.56f),
                    PathNode.LineTo(62.0f, 132.71f),
                    PathNode.LineTo(146.62f, 42.05f),
                    PathNode.LineTo(136.16f, 94.43f),
                    PathNode.CurveTo(135.38612f, 98.26648f, 137.50156f, 102.09962f, 141.16f, 103.49f),
                    PathNode.LineTo(193.96f, 123.29f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lightning!!
    }

private var _lightning: ImageVector? = null
