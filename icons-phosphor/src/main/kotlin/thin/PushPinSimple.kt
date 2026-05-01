package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorThinIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.LineTo(203.36f, 172.0f),
                    PathNode.LineTo(180.77f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(194.20914f, 44.0f, 196.0f, 42.20914f, 196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 37.79086f, 194.20914f, 36.0f, 192.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(61.79086f, 36.0f, 60.0f, 37.79086f, 60.0f, 40.0f),
                    PathNode.CurveTo(60.0f, 42.20914f, 61.79086f, 44.0f, 64.0f, 44.0f),
                    PathNode.LineTo(75.23f, 44.0f),
                    PathNode.LineTo(52.64f, 172.0f),
                    PathNode.LineTo(40.0f, 172.0f),
                    PathNode.CurveTo(37.79086f, 172.0f, 36.0f, 173.79086f, 36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 178.20914f, 37.79086f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(124.0f, 180.0f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 180.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(218.20914f, 180.0f, 220.0f, 178.20914f, 220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 173.79086f, 218.20914f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.36f, 44.0f),
                    PathNode.LineTo(172.64f, 44.0f),
                    PathNode.LineTo(195.23f, 172.0f),
                    PathNode.LineTo(60.77f, 172.0f),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
