package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Webcam: ImageVector
    get() {
        if (_webcam != null) return _webcam!!
        _webcam = phosphorFillIcon(
            name = "Webcam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 121.67311f, 145.67311f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(110.32689f, 136.0f, 96.0f, 121.67311f, 96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 86.32689f, 110.32689f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(145.67311f, 72.0f, 160.0f, 86.32689f, 160.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 203.58173f, 27.581722f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(120.0f, 183.6f),
                    PathNode.CurveTo(77.58761f, 179.33739f, 45.966335f, 142.56859f, 48.100315f, 99.99598f),
                    PathNode.CurveTo(50.234295f, 57.423374f, 85.37394f, 24.001005f, 128.0f, 24.001005f),
                    PathNode.CurveTo(170.62605f, 24.001005f, 205.7657f, 57.423374f, 207.89969f, 99.99598f),
                    PathNode.CurveTo(210.03366f, 142.56859f, 178.4124f, 179.33739f, 136.0f, 183.6f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(154.50967f, 152.0f, 176.0f, 130.50967f, 176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 77.49033f, 154.50967f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(101.49033f, 56.0f, 80.0f, 77.49033f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.02756f, 130.49825f, 101.501755f, 151.97244f, 128.0f, 152.0f),
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
        return _webcam!!
    }

private var _webcam: ImageVector? = null
