package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorThinIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(54.62f, 156.25f),
                    PathNode.LineTo(196.43f, 104.0f),
                    PathNode.LineTo(54.62f, 51.75f),
                    PathNode.CurveTo(52.648846f, 50.920975f, 51.678345f, 48.688225f, 52.416855f, 46.681404f),
                    PathNode.CurveTo(53.155365f, 44.67458f, 55.341663f, 43.60353f, 57.38f, 44.25f),
                    PathNode.LineTo(209.38f, 100.25f),
                    PathNode.CurveTo(210.94777f, 100.83194f, 211.98805f, 102.32772f, 211.98805f, 104.0f),
                    PathNode.CurveTo(211.98805f, 105.67228f, 210.94777f, 107.16806f, 209.38f, 107.75f),
                    PathNode.LineTo(57.38f, 163.75f),
                    PathNode.CurveTo(56.938828f, 163.91582f, 56.47131f, 164.00052f, 56.0f, 164.0f),
                    PathNode.CurveTo(54.065865f, 163.99425f, 52.412907f, 162.60544f, 52.073837f, 160.70125f),
                    PathNode.CurveTo(51.734768f, 158.79706f, 52.806732f, 156.92303f, 54.62f, 156.25f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 196.0f),
                    PathNode.LineTo(56.0f, 196.0f),
                    PathNode.CurveTo(53.79086f, 196.0f, 52.0f, 197.79086f, 52.0f, 200.0f),
                    PathNode.CurveTo(52.0f, 202.20914f, 53.79086f, 204.0f, 56.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(210.20914f, 204.0f, 212.0f, 202.20914f, 212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 197.79086f, 210.20914f, 196.0f, 208.0f, 196.0f),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
