package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorDuotoneIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 208.83656f, 208.83656f, 216.0f, 200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(47.163445f, 216.0f, 40.0f, 208.83656f, 40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.CurveTo(40.0f, 47.163445f, 47.163445f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(208.83656f, 40.0f, 216.0f, 47.163445f, 216.0f, 56.0f),
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
                    PathNode.MoveTo(205.67f, 189.66f),
                    PathNode.CurveTo(202.92448f, 192.40065f, 201.38165f, 196.1207f, 201.38165f, 200.0f),
                    PathNode.CurveTo(201.38165f, 203.8793f, 202.92448f, 207.59935f, 205.67f, 210.34f),
                    PathNode.CurveTo(208.79593f, 213.46593f, 208.79593f, 218.53407f, 205.67f, 221.66f),
                    PathNode.CurveTo(202.54407f, 224.78593f, 197.47594f, 224.78593f, 194.35f, 221.66f),
                    PathNode.CurveTo(182.392f, 209.69565f, 182.392f, 190.30435f, 194.35f, 178.34f),
                    PathNode.LineTo(203.73f, 168.97f),
                    PathNode.CurveTo(209.44339f, 163.24557f, 209.43443f, 153.97339f, 203.71f, 148.26f),
                    PathNode.CurveTo(197.98557f, 142.54662f, 188.71338f, 142.55557f, 183.0f, 148.28f),
                    PathNode.LineTo(116.28f, 215.0f),
                    PathNode.CurveTo(104.19591f, 226.11972f, 85.49261f, 225.73125f, 73.88068f, 214.11932f),
                    PathNode.CurveTo(62.268753f, 202.50739f, 61.880264f, 183.8041f, 73.0f, 171.72f),
                    PathNode.LineTo(171.72f, 73.0f),
                    PathNode.CurveTo(177.44167f, 67.27833f, 177.44167f, 58.00167f, 171.72f, 52.28f),
                    PathNode.CurveTo(165.99834f, 46.55833f, 156.72166f, 46.55833f, 151.0f, 52.28f),
                    PathNode.LineTo(84.28f, 119.0f),
                    PathNode.CurveTo(72.19591f, 130.11974f, 53.492607f, 129.73125f, 41.88068f, 118.11932f),
                    PathNode.CurveTo(30.268753f, 106.50739f, 29.880264f, 87.80409f, 41.0f, 75.72f),
                    PathNode.LineTo(82.34f, 34.34f),
                    PathNode.CurveTo(85.465935f, 31.21683f, 90.53183f, 31.219069f, 93.655f, 34.345f),
                    PathNode.CurveTo(96.77817f, 37.470932f, 96.77593f, 42.53683f, 93.65f, 45.66f),
                    PathNode.LineTo(52.27f, 87.0f),
                    PathNode.CurveTo(46.54833f, 92.724434f, 46.550568f, 102.00333f, 52.275f, 107.725f),
                    PathNode.CurveTo(57.99943f, 113.44667f, 67.27833f, 113.444435f, 73.0f, 107.72f),
                    PathNode.LineTo(139.72f, 41.0f),
                    PathNode.CurveTo(151.8041f, 29.880264f, 170.50739f, 30.268753f, 182.11932f, 41.88068f),
                    PathNode.CurveTo(193.73125f, 53.492607f, 194.11972f, 72.19591f, 183.0f, 84.28f),
                    PathNode.LineTo(84.28f, 183.0f),
                    PathNode.CurveTo(78.55833f, 188.72166f, 78.55833f, 197.99834f, 84.28f, 203.72f),
                    PathNode.CurveTo(90.00167f, 209.44167f, 99.27833f, 209.44167f, 105.0f, 203.72f),
                    PathNode.LineTo(171.72f, 137.0f),
                    PathNode.CurveTo(183.8041f, 125.880264f, 202.50739f, 126.26875f, 214.11932f, 137.88068f),
                    PathNode.CurveTo(225.73125f, 149.49261f, 226.11972f, 168.1959f, 215.0f, 180.28f),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
