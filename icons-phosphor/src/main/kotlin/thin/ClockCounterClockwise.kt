package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorThinIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 125.74f),
                    PathNode.LineTo(170.06f, 148.57f),
                    PathNode.CurveTo(171.95433f, 149.7077f, 172.5677f, 152.16566f, 171.43f, 154.06f),
                    PathNode.CurveTo(170.2923f, 155.95433f, 167.83434f, 156.5677f, 165.94f, 155.43f),
                    PathNode.LineTo(125.94f, 131.43f),
                    PathNode.CurveTo(124.73595f, 130.7066f, 123.999565f, 129.40465f, 124.0f, 128.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 77.79086f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 77.79086f, 132.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(103.573975f, 35.945724f, 80.14202f, 45.668526f, 62.93f, 63.0f),
                    PathNode.CurveTo(53.05f, 73.0f, 44.66f, 82.47f, 36.0f, 92.86f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 34.20914f, 60.0f, 32.0f, 60.0f),
                    PathNode.CurveTo(29.790861f, 60.0f, 28.0f, 61.79086f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 106.20914f, 29.790861f, 108.0f, 32.0f, 108.0f),
                    PathNode.LineTo(72.0f, 108.0f),
                    PathNode.CurveTo(74.20914f, 108.0f, 76.0f, 106.20914f, 76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 101.79086f, 74.20914f, 100.0f, 72.0f, 100.0f),
                    PathNode.LineTo(40.47f, 100.0f),
                    PathNode.CurveTo(49.61f, 89.0f, 58.3f, 79.0f, 68.6f, 68.6f),
                    PathNode.CurveTo(101.179115f, 36.018723f, 153.92293f, 35.762222f, 186.8174f, 68.025085f),
                    PathNode.CurveTo(219.71185f, 100.28796f, 220.47783f, 153.02686f, 188.53423f, 186.23141f),
                    PathNode.CurveTo(156.5906f, 219.43599f, 103.861595f, 220.71138f, 70.35f, 189.09f),
                    PathNode.CurveTo(68.74285f, 187.57121f, 66.208786f, 187.64285f, 64.69f, 189.25f),
                    PathNode.CurveTo(63.171215f, 190.85715f, 63.24285f, 193.39122f, 64.85f, 194.91f),
                    PathNode.CurveTo(94.89334f, 223.26196f, 140.15067f, 228.11308f, 175.52052f, 206.77275f),
                    PathNode.CurveTo(210.89037f, 185.4324f, 227.69975f, 143.13342f, 216.62555f, 103.336464f),
                    PathNode.CurveTo(205.55135f, 63.5395f, 169.30904f, 36.003094f, 128.0f, 36.0f),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
