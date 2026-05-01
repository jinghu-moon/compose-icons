package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorThinIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 186.20914f, 226.20914f, 188.0f, 224.0f, 188.0f),
                    PathNode.CurveTo(221.79086f, 188.0f, 220.0f, 186.20914f, 220.0f, 184.0f),
                    PathNode.CurveTo(219.95654f, 146.8229f, 197.542f, 113.32577f, 163.19237f, 99.10459f),
                    PathNode.CurveTo(128.84274f, 84.88341f, 89.309906f, 92.73353f, 63.0f, 119.0f),
                    PathNode.LineTo(33.7f, 148.0f),
                    PathNode.LineTo(88.0f, 148.0f),
                    PathNode.CurveTo(90.20914f, 148.0f, 92.0f, 149.79086f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 154.20914f, 90.20914f, 156.0f, 88.0f, 156.0f),
                    PathNode.LineTo(24.0f, 156.0f),
                    PathNode.CurveTo(21.790861f, 156.0f, 20.0f, 154.20914f, 20.0f, 152.0f),
                    PathNode.LineTo(20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 85.79086f, 21.790861f, 84.0f, 24.0f, 84.0f),
                    PathNode.CurveTo(26.209139f, 84.0f, 28.0f, 85.79086f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 142.39f),
                    PathNode.LineTo(57.3f, 113.28f),
                    PathNode.CurveTo(85.902f, 84.68664f, 128.91109f, 76.13651f, 166.27469f, 91.61602f),
                    PathNode.CurveTo(203.6383f, 107.09555f, 227.99945f, 143.55676f, 228.0f, 184.0f),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
