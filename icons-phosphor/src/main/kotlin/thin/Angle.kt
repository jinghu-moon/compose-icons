package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorThinIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 72.0f),
                    PathNode.CurveTo(100.0f, 69.79086f, 101.79086f, 68.0f, 104.0f, 68.0f),
                    PathNode.CurveTo(159.20334f, 68.06062f, 203.93938f, 112.79665f, 204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 170.20914f, 202.20914f, 172.0f, 200.0f, 172.0f),
                    PathNode.CurveTo(197.79086f, 172.0f, 196.0f, 170.20914f, 196.0f, 168.0f),
                    PathNode.CurveTo(195.94489f, 117.21265f, 154.78735f, 76.055115f, 104.0f, 76.0f),
                    PathNode.CurveTo(101.79086f, 76.0f, 100.0f, 74.20914f, 100.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 29.790861f, 74.20914f, 28.0f, 72.0f, 28.0f),
                    PathNode.CurveTo(69.79086f, 28.0f, 68.0f, 29.790861f, 68.0f, 32.0f),
                    PathNode.LineTo(68.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(29.790861f, 68.0f, 28.0f, 69.79086f, 28.0f, 72.0f),
                    PathNode.CurveTo(28.0f, 74.20914f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.LineTo(68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 202.20914f, 69.79086f, 204.0f, 72.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 202.20914f, 244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 197.79086f, 242.20914f, 196.0f, 240.0f, 196.0f),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
