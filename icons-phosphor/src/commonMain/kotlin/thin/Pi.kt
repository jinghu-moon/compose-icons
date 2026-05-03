package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorThinIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 172.0f),
                    PathNode.CurveTo(228.0f, 189.67311f, 213.67311f, 204.0f, 196.0f, 204.0f),
                    PathNode.CurveTo(178.32689f, 204.0f, 164.0f, 189.67311f, 164.0f, 172.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 202.20914f, 90.20914f, 204.0f, 88.0f, 204.0f),
                    PathNode.CurveTo(85.79086f, 204.0f, 84.0f, 202.20914f, 84.0f, 200.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(72.0f, 68.0f),
                    PathNode.CurveTo(47.71089f, 68.02756f, 28.027554f, 87.71089f, 28.0f, 112.0f),
                    PathNode.CurveTo(28.0f, 114.20914f, 26.209139f, 116.0f, 24.0f, 116.0f),
                    PathNode.CurveTo(21.790861f, 116.0f, 20.0f, 114.20914f, 20.0f, 112.0f),
                    PathNode.CurveTo(20.033064f, 83.2949f, 43.2949f, 60.033066f, 72.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 66.20914f, 226.20914f, 68.0f, 224.0f, 68.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.CurveTo(172.0f, 185.25484f, 182.74516f, 196.0f, 196.0f, 196.0f),
                    PathNode.CurveTo(209.25484f, 196.0f, 220.0f, 185.25484f, 220.0f, 172.0f),
                    PathNode.CurveTo(220.0f, 169.79086f, 221.79086f, 168.0f, 224.0f, 168.0f),
                    PathNode.CurveTo(226.20914f, 168.0f, 228.0f, 169.79086f, 228.0f, 172.0f),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
