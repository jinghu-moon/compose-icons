package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorLightIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 128.0f),
                    PathNode.CurveTo(218.02614f, 144.42583f, 213.52838f, 160.54164f, 205.0f, 174.58f),
                    PathNode.LineTo(134.0f, 124.88f),
                    PathNode.LineTo(134.0f, 38.2f),
                    PathNode.CurveTo(181.24413f, 41.41571f, 217.94118f, 80.64659f, 218.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 38.2f),
                    PathNode.LineTo(122.0f, 124.88f),
                    PathNode.LineTo(51.0f, 174.58f),
                    PathNode.CurveTo(34.743813f, 147.70505f, 33.67435f, 114.29927f, 48.178246f, 86.43954f),
                    PathNode.CurveTo(62.68214f, 58.5798f, 90.66102f, 40.296734f, 122.0f, 38.2f),
                    PathNode.Close,
                    PathNode.MoveTo(57.92f, 184.4f),
                    PathNode.LineTo(122.0f, 139.53f),
                    PathNode.LineTo(122.0f, 217.8f),
                    PathNode.CurveTo(96.909706f, 216.11555f, 73.670784f, 204.00288f, 57.92f, 184.4f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 217.8f),
                    PathNode.LineTo(134.0f, 139.53f),
                    PathNode.LineTo(198.08f, 184.4f),
                    PathNode.CurveTo(182.32921f, 204.00288f, 159.09029f, 216.11555f, 134.0f, 217.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _peace!!
    }

private var _peace: ImageVector? = null
