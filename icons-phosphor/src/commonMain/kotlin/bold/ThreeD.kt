package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorBoldIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 148.0f),
                    PathNode.CurveTo(88.0f, 139.16344f, 80.836555f, 132.0f, 72.0f, 132.0f),
                    PathNode.CurveTo(67.52617f, 131.9993f, 63.424194f, 129.50993f, 61.358128f, 125.54173f),
                    PathNode.CurveTo(59.29206f, 121.57355f, 59.605003f, 116.78551f, 62.17f, 113.12f),
                    PathNode.LineTo(77.0f, 92.0f),
                    PathNode.LineTo(52.0f, 92.0f),
                    PathNode.CurveTo(45.37258f, 92.0f, 40.0f, 86.62742f, 40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 73.37258f, 45.37258f, 68.0f, 52.0f, 68.0f),
                    PathNode.LineTo(100.0f, 68.0f),
                    PathNode.CurveTo(104.47383f, 68.000694f, 108.575806f, 70.490074f, 110.64187f, 74.45827f),
                    PathNode.CurveTo(112.70794f, 78.42645f, 112.395f, 83.21449f, 109.83f, 86.88f),
                    PathNode.LineTo(91.49f, 113.08f),
                    PathNode.CurveTo(105.17612f, 120.70958f, 113.14719f, 135.62767f, 111.88278f, 151.24565f),
                    PathNode.CurveTo(110.61838f, 166.86365f, 100.35135f, 180.30519f, 85.61616f, 185.63383f),
                    PathNode.CurveTo(70.88097f, 190.96248f, 54.391357f, 187.19682f, 43.43f, 176.0f),
                    PathNode.CurveTo(38.79081f, 171.26692f, 38.86692f, 163.66919f, 43.6f, 159.03f),
                    PathNode.CurveTo(48.33308f, 154.39082f, 55.93081f, 154.46692f, 60.57f, 159.2f),
                    PathNode.CurveTo(65.11999f, 163.845f, 72.02852f, 165.2745f, 78.04824f, 162.81659f),
                    PathNode.CurveTo(84.06796f, 160.35866f, 88.00154f, 154.50218f, 88.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 68.0f),
                    PathNode.CurveTo(197.13708f, 68.0f, 224.0f, 94.862915f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 161.13708f, 197.13708f, 188.0f, 164.0f, 188.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.CurveTo(133.37259f, 188.0f, 128.0f, 182.62741f, 128.0f, 176.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.CurveTo(128.0f, 73.37258f, 133.37259f, 68.0f, 140.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 92.0f),
                    PathNode.LineTo(152.0f, 92.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.CurveTo(183.88223f, 164.0f, 200.0f, 147.88223f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 108.11775f, 183.88223f, 92.0f, 164.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(230.62741f, 56.0f, 236.0f, 50.62742f, 236.0f, 44.0f),
                    PathNode.CurveTo(236.0f, 37.37258f, 230.62741f, 32.0f, 224.0f, 32.0f),
                    PathNode.LineTo(32.0f, 32.0f),
                    PathNode.CurveTo(25.372583f, 32.0f, 20.0f, 37.37258f, 20.0f, 44.0f),
                    PathNode.CurveTo(20.0f, 50.62742f, 25.372583f, 56.0f, 32.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(25.372583f, 200.0f, 20.0f, 205.37259f, 20.0f, 212.0f),
                    PathNode.CurveTo(20.0f, 218.62741f, 25.372583f, 224.0f, 32.0f, 224.0f),
                    PathNode.LineTo(224.0f, 224.0f),
                    PathNode.CurveTo(230.62741f, 224.0f, 236.0f, 218.62741f, 236.0f, 212.0f),
                    PathNode.CurveTo(236.0f, 205.37259f, 230.62741f, 200.0f, 224.0f, 200.0f),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
