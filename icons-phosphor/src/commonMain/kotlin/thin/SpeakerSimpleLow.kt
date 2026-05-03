package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) return _speakerSimpleLow!!
        _speakerSimpleLow = phosphorThinIcon(
            name = "SpeakerSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(161.76f, 28.41f),
                    PathNode.CurveTo(160.3869f, 27.73426f, 158.74858f, 27.901197f, 157.54f, 28.84f),
                    PathNode.LineTo(86.63f, 84.0f),
                    PathNode.LineTo(40.0f, 84.0f),
                    PathNode.CurveTo(33.37258f, 84.0f, 28.0f, 89.37258f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 166.62741f, 33.37258f, 172.0f, 40.0f, 172.0f),
                    PathNode.LineTo(86.63f, 172.0f),
                    PathNode.LineTo(157.54f, 227.16f),
                    PathNode.CurveTo(158.24614f, 227.70137f, 159.11023f, 227.99643f, 160.0f, 228.0f),
                    PathNode.CurveTo(160.6106f, 228.00227f, 161.21329f, 227.86188f, 161.76f, 227.59f),
                    PathNode.CurveTo(163.13033f, 226.91856f, 163.99924f, 225.52597f, 164.0f, 224.0f),
                    PathNode.LineTo(164.0f, 32.0f),
                    PathNode.CurveTo(163.99924f, 30.474026f, 163.13033f, 29.081429f, 161.76f, 28.41f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 215.82f),
                    PathNode.LineTo(90.46f, 164.82f),
                    PathNode.CurveTo(89.75168f, 164.28511f, 88.88759f, 163.99709f, 88.0f, 164.0f),
                    PathNode.LineTo(40.0f, 164.0f),
                    PathNode.CurveTo(37.79086f, 164.0f, 36.0f, 162.20914f, 36.0f, 160.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 93.79086f, 37.79086f, 92.0f, 40.0f, 92.0f),
                    PathNode.LineTo(88.0f, 92.0f),
                    PathNode.CurveTo(88.8899f, 91.99717f, 89.75422f, 91.702034f, 90.46f, 91.16f),
                    PathNode.LineTo(156.0f, 40.16f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 104.0f),
                    PathNode.LineTo(204.0f, 152.0f),
                    PathNode.CurveTo(204.0f, 154.20914f, 202.20914f, 156.0f, 200.0f, 156.0f),
                    PathNode.CurveTo(197.79086f, 156.0f, 196.0f, 154.20914f, 196.0f, 152.0f),
                    PathNode.LineTo(196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 101.79086f, 197.79086f, 100.0f, 200.0f, 100.0f),
                    PathNode.CurveTo(202.20914f, 100.0f, 204.0f, 101.79086f, 204.0f, 104.0f),
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
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null
