package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorThinIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.LineTo(220.0f, 124.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.00124f, 44.440388f, 218.42209f, 41.06394f, 215.68925f, 38.783043f),
                    PathNode.CurveTo(212.95644f, 36.502148f, 209.352f, 35.552235f, 205.85f, 36.19f),
                    PathNode.LineTo(45.85f, 65.29f),
                    PathNode.CurveTo(40.147842f, 66.32844f, 36.002815f, 71.29406f, 36.0f, 77.09f),
                    PathNode.LineTo(36.0f, 124.0f),
                    PathNode.LineTo(16.0f, 124.0f),
                    PathNode.CurveTo(13.790861f, 124.0f, 12.0f, 125.79086f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 130.20914f, 13.790861f, 132.0f, 16.0f, 132.0f),
                    PathNode.LineTo(36.0f, 132.0f),
                    PathNode.LineTo(36.0f, 178.91f),
                    PathNode.CurveTo(36.002815f, 184.70595f, 40.147842f, 189.67155f, 45.85f, 190.71f),
                    PathNode.LineTo(205.85f, 219.8f),
                    PathNode.CurveTo(206.5619f, 219.9359f, 207.28525f, 220.00288f, 208.01f, 220.0f),
                    PathNode.CurveTo(214.63742f, 220.0f, 220.01f, 214.62741f, 220.01f, 208.0f),
                    PathNode.LineTo(220.01f, 132.0f),
                    PathNode.LineTo(240.01f, 132.0f),
                    PathNode.CurveTo(242.21913f, 132.0f, 244.01f, 130.20914f, 244.01f, 128.0f),
                    PathNode.CurveTo(244.01f, 125.79086f, 242.21913f, 124.0f, 240.01f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 77.09f),
                    PathNode.CurveTo(44.00225f, 75.16033f, 45.38184f, 73.50734f, 47.28f, 73.16f),
                    PathNode.LineTo(207.28f, 44.07f),
                    PathNode.CurveTo(208.4467f, 43.856506f, 209.64798f, 44.17179f, 210.55946f, 44.930714f),
                    PathNode.CurveTo(211.47095f, 45.689636f, 211.99861f, 46.81393f, 212.0f, 48.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(211.99861f, 209.18607f, 211.47095f, 210.31036f, 210.55946f, 211.06929f),
                    PathNode.CurveTo(209.64798f, 211.82822f, 208.4467f, 212.1435f, 207.28f, 211.93f),
                    PathNode.LineTo(47.28f, 182.84f),
                    PathNode.CurveTo(45.38184f, 182.49266f, 44.00225f, 180.83968f, 44.0f, 178.91f),
                    PathNode.LineTo(44.0f, 132.0f),
                    PathNode.LineTo(212.0f, 132.0f),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
