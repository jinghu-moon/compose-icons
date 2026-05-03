package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HourglassSimpleLow: ImageVector
    get() {
        if (_hourglassSimpleLow != null) return _hourglassSimpleLow!!
        _hourglassSimpleLow = phosphorRegularIcon(
            name = "HourglassSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.18f, 196.56f),
                    PathNode.LineTo(139.57f, 128.0f),
                    PathNode.LineTo(211.18f, 59.44f),
                    PathNode.CurveTo(211.2208f, 59.394196f, 211.26419f, 59.35079f, 211.31f, 59.31f),
                    PathNode.CurveTo(215.88284f, 54.73416f, 217.25029f, 47.854897f, 214.77507f, 41.878067f),
                    PathNode.CurveTo(212.29987f, 35.901237f, 206.46909f, 32.003f, 200.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(49.532726f, 32.007034f, 43.70565f, 35.906754f, 41.233006f, 41.88268f),
                    PathNode.CurveTo(38.76036f, 47.858604f, 40.12844f, 54.73545f, 44.7f, 59.31f),
                    PathNode.LineTo(44.82f, 59.44f),
                    PathNode.LineTo(116.43f, 128.0f),
                    PathNode.LineTo(44.82f, 196.56f),
                    PathNode.LineTo(44.7f, 196.69f),
                    PathNode.CurveTo(40.12844f, 201.26456f, 38.76036f, 208.14139f, 41.233006f, 214.11732f),
                    PathNode.CurveTo(43.70565f, 220.09325f, 49.532726f, 223.99297f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(206.47092f, 224.00104f, 212.30539f, 220.1043f, 214.78316f, 214.12656f),
                    PathNode.CurveTo(217.26093f, 208.14882f, 215.89412f, 201.26712f, 211.32f, 196.69f),
                    PathNode.CurveTo(211.27077f, 196.6495f, 211.22401f, 196.6061f, 211.18f, 196.56f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.21f, 168.0f),
                    PathNode.LineTo(97.79f, 168.0f),
                    PathNode.LineTo(128.0f, 139.08f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(128.0f, 116.92f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 208.0f),
                    PathNode.LineTo(81.06f, 184.0f),
                    PathNode.LineTo(174.9f, 184.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hourglassSimpleLow!!
    }

private var _hourglassSimpleLow: ImageVector? = null
