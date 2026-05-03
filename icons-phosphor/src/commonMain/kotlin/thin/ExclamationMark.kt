package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ExclamationMark: ImageVector
    get() {
        if (_exclamationMark != null) return _exclamationMark!!
        _exclamationMark = phosphorThinIcon(
            name = "ExclamationMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 200.0f),
                    PathNode.CurveTo(140.0f, 206.62741f, 134.62741f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(121.37258f, 212.0f, 116.0f, 206.62741f, 116.0f, 200.0f),
                    PathNode.CurveTo(116.0f, 193.37259f, 121.37258f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(134.62741f, 188.0f, 140.0f, 193.37259f, 140.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(130.20914f, 156.0f, 132.0f, 154.20914f, 132.0f, 152.0f),
                    PathNode.LineTo(132.0f, 48.0f),
                    PathNode.CurveTo(132.0f, 45.79086f, 130.20914f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(125.79086f, 44.0f, 124.0f, 45.79086f, 124.0f, 48.0f),
                    PathNode.LineTo(124.0f, 152.0f),
                    PathNode.CurveTo(124.0f, 154.20914f, 125.79086f, 156.0f, 128.0f, 156.0f),
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
        return _exclamationMark!!
    }

private var _exclamationMark: ImageVector? = null
