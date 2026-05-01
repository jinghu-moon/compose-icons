package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorThinIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.71f, 97.49f),
                    PathNode.LineTo(131.71f, 177.49f),
                    PathNode.CurveTo(131.09999f, 179.0035f, 129.63179f, 179.9947f, 128.0f, 179.9947f),
                    PathNode.CurveTo(126.3682f, 179.9947f, 124.9f, 179.0035f, 124.29f, 177.49f),
                    PathNode.LineTo(92.29f, 97.49f),
                    PathNode.CurveTo(91.46157f, 95.441025f, 92.45103f, 93.10843f, 94.5f, 92.28f),
                    PathNode.CurveTo(96.54897f, 91.45158f, 98.88158f, 92.441025f, 99.71f, 94.49f),
                    PathNode.LineTo(128.0f, 165.23f),
                    PathNode.LineTo(156.29f, 94.51f),
                    PathNode.CurveTo(157.11842f, 92.46102f, 159.45102f, 91.47157f, 161.5f, 92.3f),
                    PathNode.CurveTo(163.54898f, 93.128426f, 164.53842f, 95.46102f, 163.71f, 97.51f),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
