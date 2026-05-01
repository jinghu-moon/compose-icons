package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChalkboardSimple: ImageVector
    get() {
        if (_chalkboardSimple != null) return _chalkboardSimple!!
        _chalkboardSimple = phosphorThinIcon(
            name = "ChalkboardSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.LineTo(228.0f, 196.0f),
                    PathNode.LineTo(228.0f, 168.0f),
                    PathNode.CurveTo(228.0f, 165.79086f, 226.20914f, 164.0f, 224.0f, 164.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(157.79086f, 164.0f, 156.0f, 165.79086f, 156.0f, 168.0f),
                    PathNode.LineTo(156.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
                    PathNode.LineTo(220.0f, 136.0f),
                    PathNode.CurveTo(220.0f, 138.20914f, 221.79086f, 140.0f, 224.0f, 140.0f),
                    PathNode.CurveTo(226.20914f, 140.0f, 228.0f, 138.20914f, 228.0f, 136.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 196.0f),
                    PathNode.LineTo(16.0f, 196.0f),
                    PathNode.CurveTo(13.790861f, 196.0f, 12.0f, 197.79086f, 12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 202.20914f, 13.790861f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 202.20914f, 244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 197.79086f, 242.20914f, 196.0f, 240.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(164.0f, 196.0f),
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
        return _chalkboardSimple!!
    }

private var _chalkboardSimple: ImageVector? = null
