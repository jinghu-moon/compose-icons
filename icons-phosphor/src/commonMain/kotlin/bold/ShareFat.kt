package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShareFat: ImageVector
    get() {
        if (_shareFat != null) return _shareFat!!
        _shareFat = phosphorBoldIcon(
            name = "ShareFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 103.52f),
                    PathNode.LineTo(160.49f, 23.52f),
                    PathNode.CurveTo(157.05914f, 20.08533f, 151.89682f, 19.056175f, 147.41115f, 20.912622f),
                    PathNode.CurveTo(142.92546f, 22.769068f, 140.00023f, 27.14534f, 140.0f, 32.0f),
                    PathNode.LineTo(140.0f, 68.74f),
                    PathNode.CurveTo(114.24f, 71.86f, 86.34f, 84.63f, 63.25f, 104.21f),
                    PathNode.CurveTo(34.09f, 128.95f, 15.93f, 160.9f, 12.11f, 194.21f),
                    PathNode.CurveTo(11.316271f, 201.06589f, 15.008153f, 207.65807f, 21.268534f, 210.56337f),
                    PathNode.CurveTo(27.528913f, 213.46869f, 34.9467f, 212.03226f, 39.67f, 207.0f),
                    PathNode.LineTo(39.67f, 207.0f),
                    PathNode.CurveTo(50.13f, 195.86f, 86.67f, 161.26f, 140.0f, 156.58f),
                    PathNode.LineTo(140.0f, 192.0f),
                    PathNode.CurveTo(140.00427f, 196.85027f, 142.92792f, 201.22105f, 147.40923f, 203.0766f),
                    PathNode.CurveTo(151.89053f, 204.93213f, 157.04822f, 203.90753f, 160.48f, 200.48f),
                    PathNode.LineTo(240.48f, 120.48f),
                    PathNode.CurveTo(245.16202f, 115.79768f, 245.16649f, 108.20784f, 240.49f, 103.52f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 163.0f),
                    PathNode.LineTo(164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 137.37259f, 158.62741f, 132.0f, 152.0f, 132.0f),
                    PathNode.CurveTo(103.0f, 132.0f, 65.43f, 153.56f, 42.21f, 172.11f),
                    PathNode.CurveTo(49.34f, 153.95f, 61.84f, 136.89f, 78.78f, 122.52f),
                    PathNode.CurveTo(101.3f, 103.41f, 128.67f, 92.0f, 152.0f, 92.0f),
                    PathNode.CurveTo(158.62741f, 92.0f, 164.0f, 86.62742f, 164.0f, 80.0f),
                    PathNode.LineTo(164.0f, 61.0f),
                    PathNode.LineTo(215.0f, 112.0f),
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
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
