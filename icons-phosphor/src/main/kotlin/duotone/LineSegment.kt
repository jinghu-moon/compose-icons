package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorDuotoneIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(81.0f, 175.0f),
                    PathNode.CurveTo(90.34864f, 184.38116f, 90.33107f, 199.56197f, 80.96074f, 208.92143f),
                    PathNode.CurveTo(71.59041f, 218.28094f, 56.40959f, 218.28094f, 47.03926f, 208.92143f),
                    PathNode.CurveTo(37.668934f, 199.56197f, 37.65136f, 184.38116f, 47.0f, 175.0f),
                    PathNode.CurveTo(51.503246f, 170.4811f, 57.620365f, 167.94107f, 64.0f, 167.94107f),
                    PathNode.CurveTo(70.37964f, 167.94107f, 76.49676f, 170.4811f, 81.0f, 175.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.0f, 47.0f),
                    PathNode.CurveTo(199.61884f, 37.65136f, 184.43803f, 37.668934f, 175.07857f, 47.03926f),
                    PathNode.CurveTo(165.71906f, 56.40959f, 165.71906f, 71.59041f, 175.07857f, 80.96074f),
                    PathNode.CurveTo(184.43803f, 90.33107f, 199.61884f, 90.34864f, 209.0f, 81.0f),
                    PathNode.CurveTo(213.5189f, 76.49676f, 216.05893f, 70.37964f, 216.05893f, 64.0f),
                    PathNode.CurveTo(216.05893f, 57.620365f, 213.5189f, 51.503246f, 209.0f, 47.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.64f, 41.36f),
                    PathNode.CurveTo(203.24896f, 29.936737f, 185.13602f, 28.778769f, 172.38307f, 38.658493f),
                    PathNode.CurveTo(159.63013f, 48.538216f, 156.22542f, 66.36594f, 164.44f, 80.25f),
                    PathNode.LineTo(80.25f, 164.44f),
                    PathNode.CurveTo(67.67274f, 157.0459f, 51.689186f, 159.0762f, 41.36f, 169.38f),
                    PathNode.LineTo(41.36f, 169.38f),
                    PathNode.CurveTo(29.605337f, 181.14119f, 28.817213f, 199.94547f, 39.546513f, 212.649f),
                    PathNode.CurveTo(50.27581f, 225.35255f, 68.94688f, 227.72177f, 82.509f, 218.10062f),
                    PathNode.CurveTo(96.07114f, 208.47948f, 100.00461f, 190.07433f, 91.56f, 175.75f),
                    PathNode.LineTo(175.75f, 91.56f),
                    PathNode.CurveTo(189.63406f, 99.77458f, 207.46179f, 96.36987f, 217.3415f, 83.61693f),
                    PathNode.CurveTo(227.22124f, 70.86398f, 226.06326f, 52.751034f, 214.64f, 41.36f),
                    PathNode.Close,
                    PathNode.MoveTo(75.31f, 203.36f),
                    PathNode.CurveTo(69.058136f, 209.61186f, 58.921864f, 209.61186f, 52.67f, 203.36f),
                    PathNode.CurveTo(46.418137f, 197.10814f, 46.418137f, 186.97186f, 52.67f, 180.72f),
                    PathNode.LineTo(52.67f, 180.72f),
                    PathNode.CurveTo(55.67069f, 177.71863f, 59.7409f, 176.03241f, 63.985f, 176.03241f),
                    PathNode.CurveTo(68.229095f, 176.03241f, 72.29932f, 177.71863f, 75.3f, 180.72f),
                    PathNode.LineTo(75.3f, 180.72f),
                    PathNode.CurveTo(81.53955f, 186.96364f, 81.54402f, 197.08087f, 75.31f, 203.33f),
                    PathNode.Close,
                    PathNode.MoveTo(203.31f, 75.36f),
                    PathNode.CurveTo(197.06123f, 81.60734f, 186.93126f, 81.60657f, 180.68344f, 75.35828f),
                    PathNode.CurveTo(174.43562f, 69.109985f, 174.43562f, 58.98001f, 180.68344f, 52.731724f),
                    PathNode.CurveTo(186.93126f, 46.483433f, 197.06123f, 46.482662f, 203.31f, 52.73f),
                    PathNode.CurveTo(209.52574f, 58.96626f, 209.53468f, 69.052734f, 203.33f, 75.3f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
