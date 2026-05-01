package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorBoldIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 138.66f),
                    PathNode.LineTo(170.0f, 174.66f),
                    PathNode.CurveTo(167.7767f, 178.01175f, 164.0221f, 180.02675f, 160.0f, 180.02675f),
                    PathNode.CurveTo(155.9779f, 180.02675f, 152.2233f, 178.01175f, 150.0f, 174.66f),
                    PathNode.LineTo(128.0f, 141.66f),
                    PathNode.LineTo(106.0f, 174.66f),
                    PathNode.CurveTo(103.7767f, 178.01175f, 100.02209f, 180.02675f, 96.0f, 180.02675f),
                    PathNode.CurveTo(91.97791f, 180.02675f, 88.2233f, 178.01175f, 86.0f, 174.66f),
                    PathNode.LineTo(62.0f, 138.66f),
                    PathNode.CurveTo(59.541615f, 134.97531f, 59.312984f, 130.23598f, 61.405277f, 126.33176f),
                    PathNode.CurveTo(63.497574f, 122.427536f, 67.57049f, 119.99343f, 72.0f, 120.0f),
                    PathNode.LineTo(113.58f, 120.0f),
                    PathNode.LineTo(94.0f, 90.66f),
                    PathNode.CurveTo(91.54161f, 86.97531f, 91.31299f, 82.23598f, 93.40528f, 78.33176f),
                    PathNode.CurveTo(95.497574f, 74.427536f, 99.57049f, 71.99343f, 104.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(156.42952f, 71.99343f, 160.50243f, 74.427536f, 162.59473f, 78.33176f),
                    PathNode.CurveTo(164.68701f, 82.23598f, 164.45839f, 86.97531f, 162.0f, 90.66f),
                    PathNode.LineTo(142.42f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(188.42952f, 119.99343f, 192.50243f, 122.427536f, 194.59473f, 126.33176f),
                    PathNode.CurveTo(196.68701f, 130.23598f, 196.45839f, 134.97531f, 194.0f, 138.66f),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
