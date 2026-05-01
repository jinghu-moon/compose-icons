package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorThinIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 178.20914f, 212.0f, 176.0f, 212.0f),
                    PathNode.LineTo(160.0f, 212.0f),
                    PathNode.CurveTo(146.51562f, 211.99374f, 134.16536f, 204.45236f, 128.0f, 192.46f),
                    PathNode.CurveTo(121.83464f, 204.45236f, 109.48438f, 211.99374f, 96.0f, 212.0f),
                    PathNode.LineTo(80.0f, 212.0f),
                    PathNode.CurveTo(77.79086f, 212.0f, 76.0f, 210.20914f, 76.0f, 208.0f),
                    PathNode.CurveTo(76.0f, 205.79086f, 77.79086f, 204.0f, 80.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(111.463974f, 204.0f, 124.0f, 191.46397f, 124.0f, 176.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(104.0f, 132.0f),
                    PathNode.CurveTo(101.79086f, 132.0f, 100.0f, 130.20914f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 125.79086f, 101.79086f, 124.0f, 104.0f, 124.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.LineTo(124.0f, 80.0f),
                    PathNode.CurveTo(124.0f, 64.536026f, 111.463974f, 52.0f, 96.0f, 52.0f),
                    PathNode.LineTo(80.0f, 52.0f),
                    PathNode.CurveTo(77.79086f, 52.0f, 76.0f, 50.20914f, 76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 45.79086f, 77.79086f, 44.0f, 80.0f, 44.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(109.48438f, 44.006252f, 121.83464f, 51.54763f, 128.0f, 63.54f),
                    PathNode.CurveTo(134.16536f, 51.54763f, 146.51562f, 44.006252f, 160.0f, 44.0f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(178.20914f, 44.0f, 180.0f, 45.79086f, 180.0f, 48.0f),
                    PathNode.CurveTo(180.0f, 50.20914f, 178.20914f, 52.0f, 176.0f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(144.53603f, 52.0f, 132.0f, 64.536026f, 132.0f, 80.0f),
                    PathNode.LineTo(132.0f, 124.0f),
                    PathNode.LineTo(152.0f, 124.0f),
                    PathNode.CurveTo(154.20914f, 124.0f, 156.0f, 125.79086f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 130.20914f, 154.20914f, 132.0f, 152.0f, 132.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 191.46397f, 144.53603f, 204.0f, 160.0f, 204.0f),
                    PathNode.LineTo(176.0f, 204.0f),
                    PathNode.CurveTo(178.20914f, 204.0f, 180.0f, 205.79086f, 180.0f, 208.0f),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
