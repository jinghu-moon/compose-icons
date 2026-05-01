package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorFillIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 140.0f),
                    PathNode.CurveTo(152.0f, 159.88223f, 135.88223f, 176.0f, 116.0f, 176.0f),
                    PathNode.CurveTo(96.11775f, 176.0f, 80.0f, 159.88223f, 80.0f, 140.0f),
                    PathNode.CurveTo(80.0f, 120.11775f, 96.11775f, 104.0f, 116.0f, 104.0f),
                    PathNode.CurveTo(135.88223f, 104.0f, 152.0f, 120.11775f, 152.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.CurveTo(192.0f, 67.58172f, 188.41827f, 64.0f, 184.0f, 64.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.CurveTo(147.58173f, 64.0f, 144.0f, 67.58172f, 144.0f, 72.0f),
                    PathNode.CurveTo(144.0f, 76.41828f, 147.58173f, 80.0f, 152.0f, 80.0f),
                    PathNode.LineTo(164.69f, 80.0f),
                    PathNode.LineTo(146.69f, 98.0f),
                    PathNode.CurveTo(124.75153f, 81.9128f, 94.127266f, 85.42129f, 76.39555f, 106.05332f),
                    PathNode.CurveTo(58.663845f, 126.68535f, 59.799347f, 157.48901f, 79.00197f, 176.75955f),
                    PathNode.CurveTo(98.20459f, 196.03009f, 129.00406f, 197.27434f, 149.69856f, 179.61557f),
                    PathNode.CurveTo(170.39307f, 161.95682f, 174.00964f, 131.34512f, 158.0f, 109.35f),
                    PathNode.LineTo(176.0f, 91.35f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 179.58173f, 112.0f, 184.0f, 112.0f),
                    PathNode.CurveTo(188.41827f, 112.0f, 192.0f, 108.41828f, 192.0f, 104.0f),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
