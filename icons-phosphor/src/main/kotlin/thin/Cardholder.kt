package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorThinIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(36.954304f, 52.0f, 28.0f, 60.954304f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 195.0457f, 36.954304f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(219.0457f, 204.0f, 228.0f, 195.0457f, 228.0f, 184.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 60.954304f, 219.0457f, 52.0f, 208.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 92.0f),
                    PathNode.LineTo(220.0f, 92.0f),
                    PathNode.LineTo(220.0f, 116.0f),
                    PathNode.LineTo(160.0f, 116.0f),
                    PathNode.CurveTo(157.79086f, 116.0f, 156.0f, 117.79086f, 156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 135.46397f, 143.46397f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(112.536026f, 148.0f, 100.0f, 135.46397f, 100.0f, 120.0f),
                    PathNode.CurveTo(100.0f, 117.79086f, 98.20914f, 116.0f, 96.0f, 116.0f),
                    PathNode.LineTo(36.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(214.62741f, 60.0f, 220.0f, 65.37258f, 220.0f, 72.0f),
                    PathNode.LineTo(220.0f, 84.0f),
                    PathNode.LineTo(36.0f, 84.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 65.37258f, 41.37258f, 60.0f, 48.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(41.37258f, 196.0f, 36.0f, 190.62741f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 124.0f),
                    PathNode.LineTo(92.22f, 124.0f),
                    PathNode.CurveTo(94.24495f, 142.23232f, 109.65559f, 156.02614f, 128.0f, 156.02614f),
                    PathNode.CurveTo(146.34442f, 156.02614f, 161.75505f, 142.23232f, 163.78f, 124.0f),
                    PathNode.LineTo(220.0f, 124.0f),
                    PathNode.LineTo(220.0f, 184.0f),
                    PathNode.CurveTo(220.0f, 190.62741f, 214.62741f, 196.0f, 208.0f, 196.0f),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
