package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorLightIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 200.0f),
                    PathNode.CurveTo(230.0f, 203.3137f, 227.3137f, 206.0f, 224.0f, 206.0f),
                    PathNode.LineTo(32.0f, 206.0f),
                    PathNode.CurveTo(28.68629f, 206.0f, 26.0f, 203.3137f, 26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 196.6863f, 28.68629f, 194.0f, 32.0f, 194.0f),
                    PathNode.LineTo(224.0f, 194.0f),
                    PathNode.CurveTo(227.3137f, 194.0f, 230.0f, 196.6863f, 230.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(27.39f, 150.0f),
                    PathNode.CurveTo(25.000942f, 145.08324f, 25.692139f, 139.22565f, 29.16f, 135.0f),
                    PathNode.LineTo(110.82f, 34.2f),
                    PathNode.CurveTo(115.01596f, 29.014553f, 121.32955f, 26.001713f, 128.0f, 26.001713f),
                    PathNode.CurveTo(134.67044f, 26.001713f, 140.98404f, 29.014553f, 145.18f, 34.2f),
                    PathNode.LineTo(226.84f, 135.0f),
                    PathNode.CurveTo(230.28262f, 139.21735f, 230.98767f, 145.0406f, 228.65099f, 149.95769f),
                    PathNode.CurveTo(226.31432f, 154.87474f, 221.35403f, 158.00575f, 215.91f, 158.0f),
                    PathNode.LineTo(40.09f, 158.0f),
                    PathNode.CurveTo(34.664078f, 158.0197f, 29.715374f, 154.9024f, 27.39f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.22f, 144.84f),
                    PathNode.CurveTo(38.55547f, 145.56566f, 39.290848f, 146.02184f, 40.09f, 146.0f),
                    PathNode.LineTo(215.91f, 146.0f),
                    PathNode.CurveTo(216.71387f, 146.01833f, 217.45055f, 145.55348f, 217.78f, 144.82f),
                    PathNode.CurveTo(218.15994f, 144.08899f, 218.05276f, 143.19978f, 217.51f, 142.58f),
                    PathNode.LineTo(135.86f, 41.76f),
                    PathNode.CurveTo(133.94258f, 39.383923f, 131.05322f, 38.002743f, 128.0f, 38.002743f),
                    PathNode.CurveTo(124.94677f, 38.002743f, 122.05741f, 39.383923f, 120.14f, 41.76f),
                    PathNode.LineTo(38.49f, 142.58f),
                    PathNode.CurveTo(37.94723f, 143.19978f, 37.84005f, 144.08899f, 38.22f, 144.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
