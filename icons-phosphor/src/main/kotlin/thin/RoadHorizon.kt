package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorThinIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.49f, 190.0f),
                    PathNode.CurveTo(236.01056f, 190.92545f, 236.14178f, 192.0199f, 235.85481f, 193.04218f),
                    PathNode.CurveTo(235.56783f, 194.06447f, 234.88615f, 194.9307f, 233.96f, 195.45f),
                    PathNode.CurveTo(233.34824f, 195.78902f, 232.65941f, 195.96468f, 231.96f, 195.96f),
                    PathNode.CurveTo(230.5217f, 195.9693f, 229.18913f, 195.20566f, 228.47f, 193.96f),
                    PathNode.LineTo(157.66f, 68.0f),
                    PathNode.LineTo(132.0f, 68.0f),
                    PathNode.LineTo(132.0f, 80.0f),
                    PathNode.CurveTo(132.0f, 82.20914f, 130.20914f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(125.79086f, 84.0f, 124.0f, 82.20914f, 124.0f, 80.0f),
                    PathNode.LineTo(124.0f, 68.0f),
                    PathNode.LineTo(98.34f, 68.0f),
                    PathNode.LineTo(27.49f, 194.0f),
                    PathNode.CurveTo(26.770863f, 195.24565f, 25.438307f, 196.0093f, 24.0f, 196.0f),
                    PathNode.CurveTo(23.300587f, 196.00467f, 22.61177f, 195.82903f, 22.0f, 195.49f),
                    PathNode.CurveTo(21.069815f, 194.96387f, 20.388836f, 194.0874f, 20.108921f, 193.05605f),
                    PathNode.CurveTo(19.82901f, 192.02469f, 19.973438f, 190.92421f, 20.51f, 190.0f),
                    PathNode.LineTo(89.16f, 68.0f),
                    PathNode.LineTo(24.0f, 68.0f),
                    PathNode.CurveTo(21.790861f, 68.0f, 20.0f, 66.20914f, 20.0f, 64.0f),
                    PathNode.CurveTo(20.0f, 61.79086f, 21.790861f, 60.0f, 24.0f, 60.0f),
                    PathNode.LineTo(232.0f, 60.0f),
                    PathNode.CurveTo(234.20914f, 60.0f, 236.0f, 61.79086f, 236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 66.20914f, 234.20914f, 68.0f, 232.0f, 68.0f),
                    PathNode.LineTo(166.84f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(125.79086f, 116.0f, 124.0f, 117.79086f, 124.0f, 120.0f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.CurveTo(124.0f, 138.20914f, 125.79086f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(130.20914f, 140.0f, 132.0f, 138.20914f, 132.0f, 136.0f),
                    PathNode.LineTo(132.0f, 120.0f),
                    PathNode.CurveTo(132.0f, 117.79086f, 130.20914f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(125.79086f, 172.0f, 124.0f, 173.79086f, 124.0f, 176.0f),
                    PathNode.LineTo(124.0f, 192.0f),
                    PathNode.CurveTo(124.0f, 194.20914f, 125.79086f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(130.20914f, 196.0f, 132.0f, 194.20914f, 132.0f, 192.0f),
                    PathNode.LineTo(132.0f, 176.0f),
                    PathNode.CurveTo(132.0f, 173.79086f, 130.20914f, 172.0f, 128.0f, 172.0f),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
