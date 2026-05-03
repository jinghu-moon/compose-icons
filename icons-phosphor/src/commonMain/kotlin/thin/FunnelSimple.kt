package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorThinIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 136.0f),
                    PathNode.CurveTo(196.0f, 138.20914f, 194.20914f, 140.0f, 192.0f, 140.0f),
                    PathNode.LineTo(64.0f, 140.0f),
                    PathNode.CurveTo(61.79086f, 140.0f, 60.0f, 138.20914f, 60.0f, 136.0f),
                    PathNode.CurveTo(60.0f, 133.79086f, 61.79086f, 132.0f, 64.0f, 132.0f),
                    PathNode.LineTo(192.0f, 132.0f),
                    PathNode.CurveTo(194.20914f, 132.0f, 196.0f, 133.79086f, 196.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 84.0f),
                    PathNode.LineTo(24.0f, 84.0f),
                    PathNode.CurveTo(21.790861f, 84.0f, 20.0f, 85.79086f, 20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 90.20914f, 21.790861f, 92.0f, 24.0f, 92.0f),
                    PathNode.LineTo(232.0f, 92.0f),
                    PathNode.CurveTo(234.20914f, 92.0f, 236.0f, 90.20914f, 236.0f, 88.0f),
                    PathNode.CurveTo(236.0f, 85.79086f, 234.20914f, 84.0f, 232.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(101.79086f, 180.0f, 100.0f, 181.79086f, 100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 186.20914f, 101.79086f, 188.0f, 104.0f, 188.0f),
                    PathNode.LineTo(152.0f, 188.0f),
                    PathNode.CurveTo(154.20914f, 188.0f, 156.0f, 186.20914f, 156.0f, 184.0f),
                    PathNode.CurveTo(156.0f, 181.79086f, 154.20914f, 180.0f, 152.0f, 180.0f),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
