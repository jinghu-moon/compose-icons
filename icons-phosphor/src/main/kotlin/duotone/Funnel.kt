package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorDuotoneIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.9f, 61.38f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.LineTo(152.0f, 194.65f),
                    PathNode.CurveTo(152.00174f, 197.32564f, 150.66574f, 199.82501f, 148.44f, 201.31f),
                    PathNode.LineTo(116.44f, 222.64f),
                    PathNode.CurveTo(113.98752f, 224.27628f, 110.83384f, 224.43105f, 108.232925f, 223.04277f),
                    PathNode.CurveTo(105.63201f, 221.65451f, 104.005455f, 218.94823f, 104.0f, 216.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(34.1f, 61.38f),
                    PathNode.CurveTo(31.973246f, 59.039494f, 31.424858f, 55.66581f, 32.700817f, 52.772198f),
                    PathNode.CurveTo(33.976772f, 49.878586f, 36.837566f, 48.008205f, 40.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(219.16243f, 48.008205f, 222.02321f, 49.878586f, 223.29918f, 52.772198f),
                    PathNode.CurveTo(224.57513f, 55.66581f, 224.02675f, 59.039494f, 221.9f, 61.38f),
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
                    PathNode.MoveTo(230.6f, 49.53f),
                    PathNode.CurveTo(228.083f, 43.71446f, 222.33676f, 39.96366f, 216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(33.67332f, 40.012466f, 27.948126f, 43.751766f, 25.393673f, 49.53984f),
                    PathNode.CurveTo(22.83922f, 55.327915f, 23.935287f, 62.077644f, 28.19f, 66.76f),
                    PathNode.LineTo(28.27f, 66.85f),
                    PathNode.LineTo(96.0f, 139.17f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(95.99863f, 221.90027f, 99.24462f, 227.32245f, 104.44588f, 230.10817f),
                    PathNode.CurveTo(109.647125f, 232.89388f, 115.9594f, 232.59096f, 120.87f, 229.32f),
                    PathNode.LineTo(152.87f, 207.98f),
                    PathNode.CurveTo(157.32529f, 205.01233f, 160.00125f, 200.01318f, 160.0f, 194.66f),
                    PathNode.LineTo(160.0f, 139.17f),
                    PathNode.LineTo(227.74f, 66.85f),
                    PathNode.LineTo(227.82f, 66.76f),
                    PathNode.CurveTo(232.12245f, 62.095966f, 233.21727f, 55.310505f, 230.6f, 49.53f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.18f, 130.58f),
                    PathNode.CurveTo(144.79607f, 132.04726f, 144.01744f, 133.98312f, 144.0f, 136.0f),
                    PathNode.LineTo(144.0f, 194.66f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(112.00062f, 133.96855f, 111.228386f, 132.01295f, 109.84f, 130.53f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
