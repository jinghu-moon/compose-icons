package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Prohibit: ImageVector
    get() {
        if (_prohibit != null) return _prohibit!!
        _prohibit = phosphorThinIcon(
            name = "Prohibit",
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
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.01535f, 151.01482f, 211.37311f, 173.19339f, 195.79f, 190.13f),
                    PathNode.LineTo(65.87f, 60.21f),
                    PathNode.CurveTo(92.762856f, 35.58494f, 131.66136f, 29.16679f, 165.03952f, 43.847294f),
                    PathNode.CurveTo(198.4177f, 58.527798f, 219.97552f, 91.536064f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 128.0f),
                    PathNode.CurveTo(35.984646f, 104.98518f, 44.626896f, 82.80662f, 60.21f, 65.87f),
                    PathNode.LineTo(190.13f, 195.79f),
                    PathNode.CurveTo(163.23715f, 220.41505f, 124.338646f, 226.8332f, 90.96048f, 212.15271f),
                    PathNode.CurveTo(57.58231f, 197.4722f, 36.024475f, 164.46394f, 36.0f, 128.0f),
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
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
