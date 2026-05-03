package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorThinIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 130.20914f, 218.20914f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(37.79086f, 132.0f, 36.0f, 130.20914f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 125.79086f, 37.79086f, 124.0f, 40.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 76.0f),
                    PathNode.CurveTo(134.62741f, 76.0f, 140.0f, 70.62742f, 140.0f, 64.0f),
                    PathNode.CurveTo(140.0f, 57.37258f, 134.62741f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(121.37258f, 52.0f, 116.0f, 57.37258f, 116.0f, 64.0f),
                    PathNode.CurveTo(116.0f, 70.62742f, 121.37258f, 76.0f, 128.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 185.37259f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 198.62741f, 121.37258f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(134.62741f, 204.0f, 140.0f, 198.62741f, 140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 185.37259f, 134.62741f, 180.0f, 128.0f, 180.0f),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
