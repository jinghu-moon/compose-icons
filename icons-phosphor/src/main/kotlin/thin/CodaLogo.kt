package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorThinIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 84.0f),
                    PathNode.CurveTo(184.37766f, 83.93256f, 192.59904f, 86.26815f, 199.69f, 90.73f),
                    PathNode.CurveTo(202.1511f, 92.30385f, 205.27437f, 92.41109f, 207.83762f, 91.009735f),
                    PathNode.CurveTo(210.40085f, 89.60838f, 211.99644f, 86.921295f, 212.0f, 84.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 41.37258f, 206.62741f, 36.0f, 200.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(49.37258f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 214.62741f, 49.37258f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(206.62741f, 220.0f, 212.0f, 214.62741f, 212.0f, 208.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.CurveTo(211.9968f, 169.08492f, 210.4082f, 166.40231f, 207.8536f, 164.99812f),
                    PathNode.CurveTo(205.299f, 163.59392f, 202.18282f, 163.69043f, 199.72f, 165.25f),
                    PathNode.CurveTo(191.72f, 170.39f, 184.9f, 172.34f, 176.16f, 171.99f),
                    PathNode.LineTo(176.0f, 171.99f),
                    PathNode.CurveTo(151.69948f, 171.99f, 132.0f, 152.29053f, 132.0f, 127.99f),
                    PathNode.CurveTo(132.0f, 103.68947f, 151.69948f, 83.99f, 176.0f, 83.99f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 128.0f),
                    PathNode.CurveTo(124.02746f, 156.67621f, 147.24387f, 179.92839f, 175.92f, 180.0f),
                    PathNode.CurveTo(186.27f, 180.4f, 194.68f, 178.0f, 204.0f, 172.0f),
                    PathNode.LineTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 210.20914f, 202.20914f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(53.79086f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 45.79086f, 53.79086f, 44.0f, 56.0f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(202.20914f, 44.0f, 204.0f, 45.79086f, 204.0f, 48.0f),
                    PathNode.LineTo(204.0f, 84.0f),
                    PathNode.CurveTo(187.93805f, 73.92418f, 167.67763f, 73.34239f, 151.06395f, 82.47991f),
                    PathNode.CurveTo(134.45029f, 91.617424f, 124.09197f, 109.03952f, 124.0f, 128.0f),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
