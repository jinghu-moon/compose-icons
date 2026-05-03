package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorFillIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.73f, 120.0f),
                    PathNode.LineTo(107.27f, 120.0f),
                    PathNode.LineTo(128.0f, 75.09f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(216.0f, 228.41827f, 212.41827f, 232.0f, 208.0f, 232.0f),
                    PathNode.LineTo(48.0f, 232.0f),
                    PathNode.CurveTo(43.581722f, 232.0f, 40.0f, 228.41827f, 40.0f, 224.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(40.0f, 27.581722f, 43.581722f, 24.0f, 48.0f, 24.0f),
                    PathNode.LineTo(208.0f, 24.0f),
                    PathNode.CurveTo(212.41827f, 24.0f, 216.0f, 27.581722f, 216.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.65f, 167.26f),
                    PathNode.CurveTo(80.65969f, 169.10753f, 85.40807f, 167.35767f, 87.26f, 163.35f),
                    PathNode.LineTo(99.89f, 136.0f),
                    PathNode.LineTo(156.11f, 136.0f),
                    PathNode.LineTo(168.74f, 163.35f),
                    PathNode.CurveTo(170.67654f, 167.20644f, 175.32272f, 168.83195f, 179.24106f, 167.02391f),
                    PathNode.CurveTo(183.1594f, 165.21587f, 184.93756f, 160.62595f, 183.26f, 156.65f),
                    PathNode.LineTo(135.26f, 52.65f),
                    PathNode.CurveTo(133.95059f, 49.821102f, 131.11723f, 48.010414f, 128.0f, 48.010414f),
                    PathNode.CurveTo(124.88276f, 48.010414f, 122.0494f, 49.821102f, 120.74f, 52.65f),
                    PathNode.LineTo(72.74f, 156.65f),
                    PathNode.CurveTo(70.892456f, 160.65968f, 72.64233f, 165.40808f, 76.65f, 167.26f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 187.58173f, 196.41827f, 184.0f, 192.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(59.581722f, 184.0f, 56.0f, 187.58173f, 56.0f, 192.0f),
                    PathNode.CurveTo(56.0f, 196.41827f, 59.581722f, 200.0f, 64.0f, 200.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(196.41827f, 200.0f, 200.0f, 196.41827f, 200.0f, 192.0f),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
