package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LockLaminated: ImageVector
    get() {
        if (_lockLaminated != null) return _lockLaminated!!
        _lockLaminated = phosphorThinIcon(
            name = "LockLaminated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 84.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.LineTo(172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 31.69947f, 152.30052f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(103.69947f, 12.0f, 84.0f, 31.69947f, 84.0f, 56.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(41.37258f, 84.0f, 36.0f, 89.37258f, 36.0f, 96.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 89.37258f, 214.62741f, 84.0f, 208.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 124.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(212.0f, 148.0f),
                    PathNode.LineTo(44.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 156.0f),
                    PathNode.LineTo(212.0f, 156.0f),
                    PathNode.LineTo(212.0f, 180.0f),
                    PathNode.LineTo(44.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 36.11775f, 108.11775f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(147.88223f, 20.0f, 164.0f, 36.11775f, 164.0f, 56.0f),
                    PathNode.LineTo(164.0f, 84.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 92.0f),
                    PathNode.LineTo(208.0f, 92.0f),
                    PathNode.CurveTo(210.20914f, 92.0f, 212.0f, 93.79086f, 212.0f, 96.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 93.79086f, 45.79086f, 92.0f, 48.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
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
        return _lockLaminated!!
    }

private var _lockLaminated: ImageVector? = null
