package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorThinIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 64.0f),
                    PathNode.LineTo(196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 33.37258f, 190.62741f, 28.0f, 184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(65.37258f, 28.0f, 60.0f, 33.37258f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 70.62742f, 65.37258f, 76.0f, 72.0f, 76.0f),
                    PathNode.LineTo(83.32f, 76.0f),
                    PathNode.LineTo(60.05f, 223.38f),
                    PathNode.CurveTo(59.87143f, 224.43526f, 60.12319f, 225.51805f, 60.748993f, 226.38628f),
                    PathNode.CurveTo(61.37479f, 227.2545f, 62.322426f, 227.83574f, 63.38f, 228.0f),
                    PathNode.CurveTo(63.58642f, 228.01439f, 63.793583f, 228.01439f, 64.0f, 228.0f),
                    PathNode.CurveTo(65.98805f, 228.024f, 67.69197f, 226.5842f, 68.0f, 224.62f),
                    PathNode.LineTo(76.26f, 172.0f),
                    PathNode.LineTo(179.74f, 172.0f),
                    PathNode.LineTo(188.05f, 224.62f),
                    PathNode.CurveTo(188.35521f, 226.56534f, 190.03085f, 227.99919f, 192.0f, 228.0f),
                    PathNode.CurveTo(192.21092f, 227.99825f, 192.42143f, 227.98154f, 192.63f, 227.95f),
                    PathNode.CurveTo(194.81102f, 227.60675f, 196.30147f, 225.5613f, 195.96f, 223.38f),
                    PathNode.LineTo(172.68f, 76.0f),
                    PathNode.LineTo(184.0f, 76.0f),
                    PathNode.CurveTo(190.62741f, 76.0f, 196.0f, 70.62742f, 196.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 64.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(186.20914f, 36.0f, 188.0f, 37.79086f, 188.0f, 40.0f),
                    PathNode.LineTo(188.0f, 64.0f),
                    PathNode.CurveTo(188.0f, 66.20914f, 186.20914f, 68.0f, 184.0f, 68.0f),
                    PathNode.LineTo(72.0f, 68.0f),
                    PathNode.CurveTo(69.79086f, 68.0f, 68.0f, 66.20914f, 68.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.48f, 164.0f),
                    PathNode.LineTo(77.48f, 164.0f),
                    PathNode.LineTo(91.38f, 76.0f),
                    PathNode.LineTo(164.54f, 76.0f),
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
        return _stool!!
    }

private var _stool: ImageVector? = null
