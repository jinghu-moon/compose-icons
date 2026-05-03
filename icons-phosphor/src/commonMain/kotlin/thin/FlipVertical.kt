package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorThinIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(221.72963f, 116.00771f, 226.66542f, 111.96378f, 227.78488f, 106.34458f),
                    PathNode.CurveTo(228.90434f, 100.72537f, 225.89514f, 95.09865f, 220.6f, 92.91f),
                    PathNode.LineTo(60.6f, 28.91f),
                    PathNode.CurveTo(56.89589f, 27.372652f, 52.668636f, 27.787342f, 49.33389f, 30.015194f),
                    PathNode.CurveTo(45.99914f, 32.243046f, 43.99777f, 35.98953f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 110.62742f, 49.37258f, 116.0f, 56.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 37.79086f, 53.79086f, 36.0f, 56.0f, 36.0f),
                    PathNode.CurveTo(56.53956f, 35.999687f, 57.073605f, 36.108536f, 57.57f, 36.32f),
                    PathNode.LineTo(57.64f, 36.32f),
                    PathNode.LineTo(217.55f, 100.32f),
                    PathNode.CurveTo(219.2957f, 101.063614f, 220.27875f, 102.9314f, 219.90337f, 104.791374f),
                    PathNode.CurveTo(219.52797f, 106.65136f, 217.89746f, 107.99166f, 216.0f, 108.0f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.CurveTo(53.79086f, 108.0f, 52.0f, 106.20914f, 52.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.74f, 149.61f),
                    PathNode.CurveTo(226.69624f, 143.9709f, 221.73416f, 139.9091f, 216.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(49.37258f, 140.0f, 44.0f, 145.37259f, 44.0f, 152.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.CurveTo(57.576767f, 227.99979f, 59.1375f, 227.68355f, 60.59f, 227.07f),
                    PathNode.LineTo(220.59f, 163.07f),
                    PathNode.LineTo(220.67f, 163.07f),
                    PathNode.CurveTo(226.00299f, 160.91801f, 228.99475f, 155.22226f, 227.74f, 149.61f),
                    PathNode.Close,
                    PathNode.MoveTo(217.57f, 155.67f),
                    PathNode.LineTo(57.57f, 219.67f),
                    PathNode.CurveTo(56.3358f, 220.19669f, 54.919735f, 220.06944f, 53.799213f, 219.33115f),
                    PathNode.CurveTo(52.678688f, 218.59285f, 52.00302f, 217.34187f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 149.79086f, 53.79086f, 148.0f, 56.0f, 148.0f),
                    PathNode.LineTo(216.0f, 148.0f),
                    PathNode.CurveTo(217.89583f, 148.00044f, 219.53096f, 149.3317f, 219.91579f, 151.18806f),
                    PathNode.CurveTo(220.30061f, 153.04442f, 219.32942f, 154.91595f, 217.59f, 155.67f),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
