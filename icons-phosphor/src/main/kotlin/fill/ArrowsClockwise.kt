package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorFillIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 100.41828f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(164.76236f, 104.00255f, 161.84236f, 102.05338f, 160.60303f, 99.062325f),
                    PathNode.CurveTo(159.36368f, 96.07126f, 160.04936f, 92.62809f, 162.34f, 90.34f),
                    PathNode.LineTo(180.65f, 72.0f),
                    PathNode.CurveTo(165.92062f, 57.88739f, 146.32892f, 49.978382f, 125.93f, 49.91f),
                    PathNode.LineTo(125.48f, 49.91f),
                    PathNode.CurveTo(104.57748f, 49.86902f, 84.49934f, 58.05978f, 69.59f, 72.71f),
                    PathNode.CurveTo(66.412415f, 75.676315f, 61.44764f, 75.56243f, 58.409405f, 72.45354f),
                    PathNode.CurveTo(55.371166f, 69.34464f, 55.371433f, 64.37857f, 58.41f, 61.27f),
                    PathNode.CurveTo(95.484245f, 25.047178f, 154.618f, 24.794868f, 192.0f, 60.7f),
                    PathNode.LineTo(210.36f, 42.34f),
                    PathNode.CurveTo(212.64995f, 40.06363f, 216.08385f, 39.38702f, 219.06616f, 40.62455f),
                    PathNode.CurveTo(222.04848f, 41.862083f, 223.99449f, 44.77112f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.41f, 183.29f),
                    PathNode.CurveTo(155.61154f, 213.37115f, 106.530556f, 213.68492f, 75.35f, 184.0f),
                    PathNode.LineTo(93.66f, 165.69f),
                    PathNode.CurveTo(95.97227f, 163.40482f, 96.67172f, 159.94762f, 95.42963f, 156.94333f),
                    PathNode.CurveTo(94.18753f, 153.93903f, 91.2509f, 151.98514f, 88.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(35.581722f, 152.0f, 32.0f, 155.58173f, 32.0f, 160.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(31.997452f, 211.23764f, 33.94662f, 214.15764f, 36.93768f, 215.39697f),
                    PathNode.CurveTo(39.928738f, 216.63632f, 43.371906f, 215.95064f, 45.66f, 213.66f),
                    PathNode.LineTo(64.0f, 195.3f),
                    PathNode.CurveTo(81.721985f, 212.40347f, 105.370895f, 221.99203f, 130.0f, 222.06f),
                    PathNode.LineTo(130.53f, 222.06f),
                    PathNode.CurveTo(155.61081f, 222.12462f, 179.70734f, 212.30565f, 197.6f, 194.73f),
                    PathNode.CurveTo(200.63857f, 191.62143f, 200.63882f, 186.65535f, 197.6006f, 183.54646f),
                    PathNode.CurveTo(194.56236f, 180.43759f, 189.5976f, 180.32368f, 186.42f, 183.29f),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
