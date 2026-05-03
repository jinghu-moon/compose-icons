package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LessThanOrEqual: ImageVector
    get() {
        if (_lessThanOrEqual != null) return _lessThanOrEqual!!
        _lessThanOrEqual = phosphorThinIcon(
            name = "LessThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.001846f, 102.32467f, 45.04753f, 100.82799f, 46.62f, 100.25f),
                    PathNode.LineTo(198.62f, 44.25f),
                    PathNode.CurveTo(199.97734f, 43.679134f, 201.53856f, 43.900173f, 202.68408f, 44.825397f),
                    PathNode.CurveTo(203.8296f, 45.75062f, 204.37416f, 47.230396f, 204.10164f, 48.677456f),
                    PathNode.CurveTo(203.82912f, 50.12452f, 202.7836f, 51.30484f, 201.38f, 51.75f),
                    PathNode.LineTo(59.57f, 104.0f),
                    PathNode.LineTo(201.38f, 156.25f),
                    PathNode.CurveTo(203.19327f, 156.92303f, 204.26523f, 158.79706f, 203.92616f, 160.70125f),
                    PathNode.CurveTo(203.5871f, 162.60544f, 201.93414f, 163.99425f, 200.0f, 164.0f),
                    PathNode.CurveTo(199.52869f, 164.00052f, 199.06117f, 163.91582f, 198.62f, 163.75f),
                    PathNode.LineTo(46.62f, 107.75f),
                    PathNode.CurveTo(45.04753f, 107.17201f, 44.001846f, 105.67533f, 44.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 197.79086f, 44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 202.20914f, 45.79086f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(200.0f, 204.0f),
                    PathNode.CurveTo(202.20914f, 204.0f, 204.0f, 202.20914f, 204.0f, 200.0f),
                    PathNode.CurveTo(204.0f, 197.79086f, 202.20914f, 196.0f, 200.0f, 196.0f),
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
        return _lessThanOrEqual!!
    }

private var _lessThanOrEqual: ImageVector? = null
