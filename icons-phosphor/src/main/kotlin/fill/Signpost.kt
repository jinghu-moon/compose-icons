package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorFillIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 117.35f),
                    PathNode.LineTo(212.33f, 154.7f),
                    PathNode.CurveTo(209.29697f, 158.07199f, 204.97537f, 159.99835f, 200.44f, 160.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 132.41827f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(123.58172f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(31.163445f, 160.0f, 24.0f, 152.83656f, 24.0f, 144.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 71.163445f, 31.163445f, 64.0f, 40.0f, 64.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 27.581722f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(132.41827f, 24.0f, 136.0f, 27.581722f, 136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(200.44f, 64.0f),
                    PathNode.CurveTo(204.97537f, 64.00164f, 209.29697f, 65.92801f, 212.33f, 69.3f),
                    PathNode.LineTo(246.0f, 106.65f),
                    PathNode.CurveTo(248.73613f, 109.69192f, 248.73613f, 114.30808f, 246.0f, 117.35f),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
