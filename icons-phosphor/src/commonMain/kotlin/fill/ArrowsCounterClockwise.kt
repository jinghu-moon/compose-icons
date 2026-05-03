package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorFillIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 100.41828f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(31.997452f, 44.76235f, 33.94662f, 41.84236f, 36.93768f, 40.60302f),
                    PathNode.CurveTo(39.928738f, 39.363674f, 43.371906f, 40.04936f, 45.66f, 42.34f),
                    PathNode.LineTo(64.0f, 60.7f),
                    PathNode.CurveTo(81.721985f, 43.59653f, 105.370895f, 34.007973f, 130.0f, 33.94f),
                    PathNode.LineTo(130.53f, 33.94f),
                    PathNode.CurveTo(155.61081f, 33.875385f, 179.70734f, 43.69435f, 197.6f, 61.27f),
                    PathNode.CurveTo(200.63857f, 64.37857f, 200.63882f, 69.34464f, 197.6006f, 72.45354f),
                    PathNode.CurveTo(194.56236f, 75.56243f, 189.5976f, 75.676315f, 186.42f, 72.71f),
                    PathNode.CurveTo(171.50583f, 58.070763f, 151.42827f, 49.891014f, 130.53f, 49.94f),
                    PathNode.LineTo(130.08f, 49.94f),
                    PathNode.CurveTo(109.68178f, 49.99774f, 90.08659f, 57.895966f, 75.35f, 72.0f),
                    PathNode.LineTo(93.66f, 90.34f),
                    PathNode.CurveTo(95.95064f, 92.62809f, 96.63632f, 96.07126f, 95.39698f, 99.062325f),
                    PathNode.CurveTo(94.15764f, 102.05338f, 91.237656f, 104.00255f, 88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(164.76236f, 151.99745f, 161.84236f, 153.94662f, 160.60303f, 156.93768f),
                    PathNode.CurveTo(159.36368f, 159.92874f, 160.04936f, 163.3719f, 162.34f, 165.66f),
                    PathNode.LineTo(180.65f, 184.0f),
                    PathNode.CurveTo(165.92062f, 198.11261f, 146.32892f, 206.02162f, 125.93f, 206.09f),
                    PathNode.LineTo(125.48f, 206.09f),
                    PathNode.CurveTo(104.58173f, 206.13898f, 84.50417f, 197.95924f, 69.59f, 183.32f),
                    PathNode.CurveTo(67.56164f, 181.2449f, 64.56865f, 180.43086f, 61.76868f, 181.19273f),
                    PathNode.CurveTo(58.968716f, 181.95459f, 56.800823f, 184.17291f, 56.103516f, 186.98964f),
                    PathNode.CurveTo(55.40621f, 189.80638f, 56.288834f, 192.77988f, 58.41f, 194.76f),
                    PathNode.CurveTo(76.30267f, 212.33565f, 100.39919f, 222.15462f, 125.48f, 222.09f),
                    PathNode.LineTo(126.0f, 222.09f),
                    PathNode.CurveTo(150.6291f, 222.02203f, 174.27802f, 212.43347f, 192.0f, 195.33f),
                    PathNode.LineTo(210.36f, 213.69f),
                    PathNode.CurveTo(212.65382f, 215.97021f, 216.09499f, 216.64491f, 219.08002f, 215.39969f),
                    PathNode.CurveTo(222.06506f, 214.15446f, 224.0066f, 211.23434f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(224.0f, 155.58173f, 220.41827f, 152.0f, 216.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
