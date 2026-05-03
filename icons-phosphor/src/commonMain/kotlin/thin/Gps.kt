package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gps: ImageVector
    get() {
        if (_gps != null) return _gps!!
        _gps = phosphorThinIcon(
            name = "Gps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.LineTo(211.9f, 124.0f),
                    PathNode.CurveTo(209.7857f, 80.77849f, 175.2215f, 46.214294f, 132.0f, 44.1f),
                    PathNode.LineTo(132.0f, 16.0f),
                    PathNode.CurveTo(132.0f, 13.790861f, 130.20914f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.LineTo(124.0f, 44.1f),
                    PathNode.CurveTo(80.77849f, 46.214294f, 46.214294f, 80.77849f, 44.1f, 124.0f),
                    PathNode.LineTo(16.0f, 124.0f),
                    PathNode.CurveTo(13.790861f, 124.0f, 12.0f, 125.79086f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 130.20914f, 13.790861f, 132.0f, 16.0f, 132.0f),
                    PathNode.LineTo(44.1f, 132.0f),
                    PathNode.CurveTo(46.214294f, 175.2215f, 80.77849f, 209.7857f, 124.0f, 211.9f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 211.9f),
                    PathNode.CurveTo(175.2215f, 209.7857f, 209.7857f, 175.2215f, 211.9f, 132.0f),
                    PathNode.LineTo(240.0f, 132.0f),
                    PathNode.CurveTo(242.20914f, 132.0f, 244.0f, 130.20914f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 125.79086f, 242.20914f, 124.0f, 240.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(86.02636f, 204.0f, 52.0f, 169.97365f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 86.02636f, 86.02636f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(169.97365f, 52.0f, 204.0f, 86.02636f, 204.0f, 128.0f),
                    PathNode.CurveTo(203.9559f, 169.95538f, 169.95538f, 203.9559f, 128.0f, 204.0f),
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
        return _gps!!
    }

private var _gps: ImageVector? = null
