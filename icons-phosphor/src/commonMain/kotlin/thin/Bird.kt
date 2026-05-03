package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorThinIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 68.0f),
                    PathNode.CurveTo(172.0f, 72.41828f, 168.41827f, 76.0f, 164.0f, 76.0f),
                    PathNode.CurveTo(159.58173f, 76.0f, 156.0f, 72.41828f, 156.0f, 68.0f),
                    PathNode.CurveTo(156.0f, 63.581722f, 159.58173f, 60.0f, 164.0f, 60.0f),
                    PathNode.CurveTo(168.41827f, 60.0f, 172.0f, 63.581722f, 172.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.00087f, 81.33782f, 235.33287f, 82.58751f, 234.22f, 83.33f),
                    PathNode.LineTo(212.0f, 98.14f),
                    PathNode.LineTo(212.0f, 120.0f),
                    PathNode.CurveTo(211.93938f, 175.20334f, 167.20334f, 219.93938f, 112.0f, 220.0f),
                    PathNode.LineTo(24.0f, 220.0f),
                    PathNode.CurveTo(19.38584f, 220.00096f, 15.179809f, 217.35622f, 13.181385f, 213.19728f),
                    PathNode.CurveTo(11.182961f, 209.03835f, 11.74615f, 204.10193f, 14.63f, 200.5f),
                    PathNode.LineTo(100.0f, 98.08f),
                    PathNode.LineTo(100.0f, 76.89f),
                    PathNode.CurveTo(100.0f, 45.67f, 125.0f, 20.15f, 155.72f, 20.0f),
                    PathNode.LineTo(156.0f, 20.0f),
                    PathNode.CurveTo(180.92616f, 19.975624f, 202.86113f, 36.44622f, 209.79f, 60.39f),
                    PathNode.LineTo(234.22f, 76.67f),
                    PathNode.CurveTo(235.33287f, 77.41249f, 236.00087f, 78.66218f, 236.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.79f, 80.0f),
                    PathNode.LineTo(204.11f, 66.22f),
                    PathNode.CurveTo(203.29733f, 65.6674f, 202.71144f, 64.840034f, 202.46f, 63.89f),
                    PathNode.CurveTo(196.94734f, 42.746475f, 177.85036f, 27.9942f, 156.0f, 28.0f),
                    PathNode.LineTo(155.76f, 28.0f),
                    PathNode.CurveTo(129.43f, 28.13f, 108.0f, 50.06f, 108.0f, 76.89f),
                    PathNode.LineTo(108.0f, 99.52f),
                    PathNode.CurveTo(107.999016f, 100.45585f, 107.66993f, 101.36173f, 107.07f, 102.08f),
                    PathNode.LineTo(20.84f, 205.56f),
                    PathNode.CurveTo(19.911324f, 206.76636f, 19.747967f, 208.39531f, 20.418606f, 209.76205f),
                    PathNode.CurveTo(21.089243f, 211.1288f, 22.47759f, 211.99635f, 24.0f, 212.0f),
                    PathNode.LineTo(52.79f, 212.0f),
                    PathNode.LineTo(124.93f, 125.44f),
                    PathNode.CurveTo(126.36792f, 123.8388f, 128.81499f, 123.66229f, 130.46782f, 125.04055f),
                    PathNode.CurveTo(132.12065f, 126.41881f, 132.38675f, 128.85776f, 131.07f, 130.56f),
                    PathNode.LineTo(63.21f, 212.0f),
                    PathNode.LineTo(112.0f, 212.0f),
                    PathNode.CurveTo(162.78735f, 211.94489f, 203.94489f, 170.78735f, 204.0f, 120.0f),
                    PathNode.LineTo(204.0f, 96.0f),
                    PathNode.CurveTo(203.99913f, 94.66218f, 204.66713f, 93.41249f, 205.78f, 92.67f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bird!!
    }

private var _bird: ImageVector? = null
