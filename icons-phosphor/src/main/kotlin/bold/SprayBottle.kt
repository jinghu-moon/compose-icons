package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorBoldIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 84.0f),
                    PathNode.CurveTo(206.62741f, 84.0f, 212.0f, 78.62742f, 212.0f, 72.0f),
                    PathNode.CurveTo(211.96143f, 38.878906f, 185.1211f, 12.038574f, 152.0f, 12.0f),
                    PathNode.LineTo(80.0f, 12.0f),
                    PathNode.CurveTo(68.95431f, 12.0f, 60.0f, 20.954306f, 60.0f, 32.0f),
                    PathNode.LineTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.0f, 91.04569f, 51.045696f, 100.0f, 40.0f, 100.0f),
                    PathNode.CurveTo(33.37258f, 100.0f, 28.0f, 105.37258f, 28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 118.62742f, 33.37258f, 124.0f, 40.0f, 124.0f),
                    PathNode.CurveTo(62.740486f, 123.97288f, 81.72455f, 106.64376f, 83.82f, 84.0f),
                    PathNode.LineTo(108.0f, 84.0f),
                    PathNode.LineTo(108.0f, 104.62f),
                    PathNode.CurveTo(108.0116f, 110.69992f, 105.2459f, 116.45226f, 100.49f, 120.24f),
                    PathNode.LineTo(84.51f, 133.0f),
                    PathNode.CurveTo(74.04426f, 141.33664f, 67.96315f, 153.99979f, 68.0f, 167.38f),
                    PathNode.LineTo(68.0f, 224.0f),
                    PathNode.CurveTo(68.0f, 235.0457f, 76.95431f, 244.0f, 88.0f, 244.0f),
                    PathNode.LineTo(192.0f, 244.0f),
                    PathNode.CurveTo(203.0457f, 244.0f, 212.0f, 235.0457f, 212.0f, 224.0f),
                    PathNode.LineTo(212.0f, 211.47f),
                    PathNode.CurveTo(212.01138f, 167.07368f, 201.26476f, 123.33575f, 180.68f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(167.25575f, 36.000477f, 180.85474f, 45.61672f, 185.94f, 60.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 211.47f),
                    PathNode.LineTo(188.0f, 220.0f),
                    PathNode.LineTo(92.0f, 220.0f),
                    PathNode.LineTo(92.0f, 167.38f),
                    PathNode.CurveTo(91.9884f, 161.30008f, 94.7541f, 155.54774f, 99.51f, 151.76f),
                    PathNode.LineTo(115.51f, 138.98f),
                    PathNode.CurveTo(125.96274f, 130.64372f, 132.03558f, 117.989815f, 132.0f, 104.62f),
                    PathNode.LineTo(132.0f, 84.0f),
                    PathNode.LineTo(153.24f, 84.0f),
                    PathNode.CurveTo(176.0058f, 122.62188f, 188.00856f, 166.63774f, 188.0f, 211.47f),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
