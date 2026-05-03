package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorBoldIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.0045f, 51.16681f, 176.7997f, 14.232132f, 132.01782f, 12.087705f),
                    PathNode.CurveTo(87.23595f, 9.943278f, 48.663013f, 43.34503f, 44.38355f, 87.97351f),
                    PathNode.CurveTo(40.104088f, 132.60199f, 71.62665f, 172.72527f, 116.0f, 179.13f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.LineTo(88.0f, 196.0f),
                    PathNode.CurveTo(81.37258f, 196.0f, 76.0f, 201.37259f, 76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 214.62741f, 81.37258f, 220.0f, 88.0f, 220.0f),
                    PathNode.LineTo(116.0f, 220.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 220.0f),
                    PathNode.LineTo(168.0f, 220.0f),
                    PathNode.CurveTo(174.62741f, 220.0f, 180.0f, 214.62741f, 180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 201.37259f, 174.62741f, 196.0f, 168.0f, 196.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(140.0f, 179.13f),
                    PathNode.CurveTo(181.29852f, 173.117f, 211.94427f, 137.73393f, 212.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 62.862915f, 94.862915f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(161.13708f, 36.0f, 188.0f, 62.862915f, 188.0f, 96.0f),
                    PathNode.CurveTo(188.0f, 129.13708f, 161.13708f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(94.87891f, 155.96143f, 68.038574f, 129.1211f, 68.0f, 96.0f),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
