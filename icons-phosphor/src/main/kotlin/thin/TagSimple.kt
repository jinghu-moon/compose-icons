package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TagSimple: ImageVector
    get() {
        if (_tagSimple != null) return _tagSimple!!
        _tagSimple = phosphorThinIcon(
            name = "TagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.33f, 125.78f),
                    PathNode.LineTo(197.7f, 57.34f),
                    PathNode.CurveTo(195.47057f, 53.998444f, 191.71701f, 51.994045f, 187.7f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(187.72f, 204.0f),
                    PathNode.CurveTo(191.73701f, 204.00595f, 195.49055f, 202.00156f, 197.72f, 198.66f),
                    PathNode.LineTo(243.35f, 130.22f),
                    PathNode.CurveTo(244.24075f, 128.87181f, 244.23286f, 127.1201f, 243.33f, 125.78f),
                    PathNode.Close,
                    PathNode.MoveTo(191.05f, 194.22f),
                    PathNode.CurveTo(190.30751f, 195.33287f, 189.05782f, 196.00087f, 187.72f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(37.79086f, 196.0f, 36.0f, 194.20914f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(187.72f, 60.0f),
                    PathNode.CurveTo(189.05782f, 59.99913f, 190.30751f, 60.66713f, 191.05f, 61.78f),
                    PathNode.LineTo(235.19f, 128.0f),
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
        return _tagSimple!!
    }

private var _tagSimple: ImageVector? = null
