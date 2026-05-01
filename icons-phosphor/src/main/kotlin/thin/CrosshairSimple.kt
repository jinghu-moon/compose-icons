package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorThinIcon(
            name = "CrosshairSimple",
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
                    PathNode.MoveTo(132.0f, 219.91f),
                    PathNode.LineTo(132.0f, 184.0f),
                    PathNode.CurveTo(132.0f, 181.79086f, 130.20914f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(125.79086f, 180.0f, 124.0f, 181.79086f, 124.0f, 184.0f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(76.36161f, 217.77362f, 38.226383f, 179.63838f, 36.09f, 132.0f),
                    PathNode.LineTo(72.0f, 132.0f),
                    PathNode.CurveTo(74.20914f, 132.0f, 76.0f, 130.20914f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 125.79086f, 74.20914f, 124.0f, 72.0f, 124.0f),
                    PathNode.LineTo(36.09f, 124.0f),
                    PathNode.CurveTo(38.226383f, 76.36161f, 76.36161f, 38.226383f, 124.0f, 36.09f),
                    PathNode.LineTo(124.0f, 72.0f),
                    PathNode.CurveTo(124.0f, 74.20914f, 125.79086f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(130.20914f, 76.0f, 132.0f, 74.20914f, 132.0f, 72.0f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(179.63838f, 38.226383f, 217.77362f, 76.36161f, 219.91f, 124.0f),
                    PathNode.LineTo(184.0f, 124.0f),
                    PathNode.CurveTo(181.79086f, 124.0f, 180.0f, 125.79086f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 130.20914f, 181.79086f, 132.0f, 184.0f, 132.0f),
                    PathNode.LineTo(219.91f, 132.0f),
                    PathNode.CurveTo(217.77362f, 179.63838f, 179.63838f, 217.77362f, 132.0f, 219.91f),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
