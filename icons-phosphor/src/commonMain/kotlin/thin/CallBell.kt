package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorThinIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 180.0f),
                    PathNode.LineTo(232.0f, 180.0f),
                    PathNode.CurveTo(234.20914f, 180.0f, 236.0f, 178.20914f, 236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 173.79086f, 234.20914f, 172.0f, 232.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.LineTo(220.0f, 152.0f),
                    PathNode.CurveTo(219.94214f, 102.76922f, 181.18178f, 62.286674f, 132.0f, 60.09f),
                    PathNode.LineTo(132.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(154.20914f, 36.0f, 156.0f, 34.20914f, 156.0f, 32.0f),
                    PathNode.CurveTo(156.0f, 29.790861f, 154.20914f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(101.79086f, 28.0f, 100.0f, 29.790861f, 100.0f, 32.0f),
                    PathNode.CurveTo(100.0f, 34.20914f, 101.79086f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(124.0f, 36.0f),
                    PathNode.LineTo(124.0f, 60.09f),
                    PathNode.CurveTo(74.818214f, 62.286674f, 36.057865f, 102.76922f, 36.0f, 152.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(24.0f, 172.0f),
                    PathNode.CurveTo(21.790861f, 172.0f, 20.0f, 173.79086f, 20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 178.20914f, 21.790861f, 180.0f, 24.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 105.60808f, 81.60808f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(174.39192f, 68.0f, 212.0f, 105.60808f, 212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 208.0f),
                    PathNode.CurveTo(236.0f, 210.20914f, 234.20914f, 212.0f, 232.0f, 212.0f),
                    PathNode.LineTo(24.0f, 212.0f),
                    PathNode.CurveTo(21.790861f, 212.0f, 20.0f, 210.20914f, 20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 205.79086f, 21.790861f, 204.0f, 24.0f, 204.0f),
                    PathNode.LineTo(232.0f, 204.0f),
                    PathNode.CurveTo(234.20914f, 204.0f, 236.0f, 205.79086f, 236.0f, 208.0f),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
