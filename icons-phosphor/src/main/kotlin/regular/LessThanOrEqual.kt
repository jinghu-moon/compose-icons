package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorRegularIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(40.0f, 104.0f),
                    PathNode.CurveTo(40.00215f, 100.6519f, 42.089005f, 97.65928f, 45.23f, 96.5f),
                    PathNode.LineTo(197.23f, 40.5f),
                    PathNode.CurveTo(201.31416f, 39.179405f, 205.71268f, 41.317314f, 207.19743f, 45.3447f),
                    PathNode.CurveTo(208.6822f, 49.372086f, 206.72401f, 53.8535f, 202.76f, 55.5f),
                    PathNode.LineTo(71.14f, 104.0f),
                    PathNode.LineTo(202.76f, 152.49f),
                    PathNode.CurveTo(206.40123f, 153.82663f, 208.55904f, 157.58276f, 207.87947f, 161.40158f),
                    PathNode.CurveTo(207.19992f, 165.2204f, 203.87881f, 168.00156f, 200.0f, 168.0f),
                    PathNode.CurveTo(199.0552f, 167.99886f, 198.11784f, 167.83304f, 197.23f, 167.51f),
                    PathNode.LineTo(45.23f, 111.51f),
                    PathNode.CurveTo(42.085567f, 110.34945f, 39.997963f, 107.35176f, 40.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(43.581722f, 192.0f, 40.0f, 195.58173f, 40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 204.41827f, 43.581722f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.CurveTo(204.41827f, 208.0f, 208.0f, 204.41827f, 208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 195.58173f, 204.41827f, 192.0f, 200.0f, 192.0f),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
