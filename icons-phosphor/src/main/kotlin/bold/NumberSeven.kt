package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorBoldIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.49f, 51.45f),
                    PathNode.LineTo(131.49f, 211.45f),
                    PathNode.CurveTo(129.96701f, 216.5237f, 125.297356f, 219.9985f, 120.0f, 220.0f),
                    PathNode.CurveTo(118.831116f, 220.00153f, 117.66846f, 219.82965f, 116.55f, 219.49f),
                    PathNode.CurveTo(110.22157f, 217.56592f, 106.643425f, 210.88373f, 108.55f, 204.55f),
                    PathNode.LineTo(151.87f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(81.37258f, 60.0f, 76.0f, 54.62742f, 76.0f, 48.0f),
                    PathNode.CurveTo(76.0f, 41.37258f, 81.37258f, 36.0f, 88.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(171.79301f, 36.001064f, 175.36223f, 37.795345f, 177.62572f, 40.838947f),
                    PathNode.CurveTo(179.88922f, 43.882553f, 180.58049f, 47.817123f, 179.49f, 51.45f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
