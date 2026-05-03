package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorThinIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.LineTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.9f, 124.0f),
                    PathNode.LineTo(171.9f, 124.0f),
                    PathNode.CurveTo(170.75f, 78.45f, 150.16f, 49.48f, 138.42f, 36.6f),
                    PathNode.CurveTo(183.35358f, 41.782547f, 217.88103f, 78.81407f, 219.91f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.61f),
                    PathNode.CurveTo(119.68f, 210.61f, 93.43f, 181.48f, 92.07f, 132.0f),
                    PathNode.LineTo(163.93f, 132.0f),
                    PathNode.CurveTo(162.57f, 181.48f, 136.32f, 210.61f, 128.0f, 218.61f),
                    PathNode.Close,
                    PathNode.MoveTo(92.07f, 124.0f),
                    PathNode.CurveTo(93.43f, 74.52f, 119.68f, 45.39f, 128.0f, 37.39f),
                    PathNode.CurveTo(136.32f, 45.39f, 162.57f, 74.52f, 163.93f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.54f, 36.6f),
                    PathNode.CurveTo(105.8f, 49.48f, 85.21f, 78.45f, 84.06f, 124.0f),
                    PathNode.LineTo(36.06f, 124.0f),
                    PathNode.CurveTo(38.088257f, 78.81743f, 72.61036f, 41.787094f, 117.54f, 36.6f),
                    PathNode.Close,
                    PathNode.MoveTo(36.09f, 132.0f),
                    PathNode.LineTo(84.09f, 132.0f),
                    PathNode.CurveTo(85.24f, 177.55f, 105.83f, 206.52f, 117.57f, 219.4f),
                    PathNode.CurveTo(72.64036f, 214.2129f, 38.118256f, 177.18257f, 36.09f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.46f, 219.4f),
                    PathNode.CurveTo(150.2f, 206.52f, 170.79f, 177.55f, 171.94f, 132.0f),
                    PathNode.LineTo(219.94f, 132.0f),
                    PathNode.CurveTo(217.91174f, 177.18257f, 183.38963f, 214.2129f, 138.46f, 219.4f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
