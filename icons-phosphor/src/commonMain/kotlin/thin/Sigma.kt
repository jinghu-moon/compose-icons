package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorThinIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 72.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(72.32f, 52.0f),
                    PathNode.LineTo(131.12f, 125.5f),
                    PathNode.CurveTo(132.29001f, 126.961334f, 132.29001f, 129.03867f, 131.12f, 130.5f),
                    PathNode.LineTo(72.32f, 204.0f),
                    PathNode.LineTo(188.0f, 204.0f),
                    PathNode.LineTo(188.0f, 184.0f),
                    PathNode.CurveTo(188.0f, 181.79086f, 189.79086f, 180.0f, 192.0f, 180.0f),
                    PathNode.CurveTo(194.20914f, 180.0f, 196.0f, 181.79086f, 196.0f, 184.0f),
                    PathNode.LineTo(196.0f, 208.0f),
                    PathNode.CurveTo(196.0f, 210.20914f, 194.20914f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(62.462547f, 211.99904f, 61.06171f, 211.11697f, 60.396404f, 209.73093f),
                    PathNode.CurveTo(59.7311f, 208.34488f, 59.919098f, 206.70018f, 60.88f, 205.5f),
                    PathNode.LineTo(122.88f, 128.0f),
                    PathNode.LineTo(60.88f, 50.5f),
                    PathNode.CurveTo(59.919098f, 49.299828f, 59.7311f, 47.655125f, 60.396404f, 46.269073f),
                    PathNode.CurveTo(61.06171f, 44.883026f, 62.462547f, 44.00096f, 64.0f, 44.0f),
                    PathNode.LineTo(192.0f, 44.0f),
                    PathNode.CurveTo(194.20914f, 44.0f, 196.0f, 45.79086f, 196.0f, 48.0f),
                    PathNode.LineTo(196.0f, 72.0f),
                    PathNode.CurveTo(196.0f, 74.20914f, 194.20914f, 76.0f, 192.0f, 76.0f),
                    PathNode.CurveTo(189.79086f, 76.0f, 188.0f, 74.20914f, 188.0f, 72.0f),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
