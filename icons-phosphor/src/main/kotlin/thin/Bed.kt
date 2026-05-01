package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorThinIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 76.0f),
                    PathNode.LineTo(28.0f, 76.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 45.79086f, 26.209139f, 44.0f, 24.0f, 44.0f),
                    PathNode.CurveTo(21.790861f, 44.0f, 20.0f, 45.79086f, 20.0f, 48.0f),
                    PathNode.LineTo(20.0f, 208.0f),
                    PathNode.CurveTo(20.0f, 210.20914f, 21.790861f, 212.0f, 24.0f, 212.0f),
                    PathNode.CurveTo(26.209139f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 172.0f),
                    PathNode.LineTo(244.0f, 172.0f),
                    PathNode.LineTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 210.20914f, 245.79086f, 212.0f, 248.0f, 212.0f),
                    PathNode.CurveTo(250.20914f, 212.0f, 252.0f, 210.20914f, 252.0f, 208.0f),
                    PathNode.LineTo(252.0f, 112.0f),
                    PathNode.CurveTo(252.0f, 92.11775f, 235.88223f, 76.0f, 216.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 84.0f),
                    PathNode.LineTo(108.0f, 84.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.LineTo(28.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(231.46397f, 84.0f, 244.0f, 96.536026f, 244.0f, 112.0f),
                    PathNode.LineTo(244.0f, 164.0f),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
