package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) return _bellSimple!!
        _bellSimple = phosphorThinIcon(
            name = "BellSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 224.0f),
                    PathNode.CurveTo(164.0f, 226.20914f, 162.20914f, 228.0f, 160.0f, 228.0f),
                    PathNode.LineTo(96.0f, 228.0f),
                    PathNode.CurveTo(93.79086f, 228.0f, 92.0f, 226.20914f, 92.0f, 224.0f),
                    PathNode.CurveTo(92.0f, 221.79086f, 93.79086f, 220.0f, 96.0f, 220.0f),
                    PathNode.LineTo(160.0f, 220.0f),
                    PathNode.CurveTo(162.20914f, 220.0f, 164.0f, 221.79086f, 164.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.38f, 190.0f),
                    PathNode.CurveTo(216.26318f, 193.73347f, 212.29173f, 196.02911f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(43.72037f, 195.98492f, 39.77267f, 193.69179f, 37.639385f, 189.98174f),
                    PathNode.CurveTo(35.506104f, 186.27167f, 35.510147f, 181.70627f, 37.65f, 178.0f),
                    PathNode.CurveTo(43.42f, 168.0f, 52.0f, 140.13f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 62.02636f, 86.02636f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(169.97365f, 28.0f, 204.0f, 62.02636f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 140.13f, 212.59f, 168.0f, 218.36f, 177.95f),
                    PathNode.CurveTo(220.54588f, 181.66733f, 220.55351f, 186.27544f, 218.38f, 190.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.43f, 182.0f),
                    PathNode.CurveTo(204.0f, 169.17f, 196.0f, 139.31f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 66.44463f, 165.55536f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(90.44463f, 36.0f, 60.0f, 66.44463f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 139.32f, 52.0f, 169.17f, 44.56f, 182.0f),
                    PathNode.CurveTo(43.84547f, 183.23761f, 43.84547f, 184.76239f, 44.56f, 186.0f),
                    PathNode.CurveTo(45.256336f, 187.2439f, 46.57448f, 188.01028f, 48.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(209.42552f, 188.01028f, 210.74367f, 187.2439f, 211.44f, 186.0f),
                    PathNode.CurveTo(212.15144f, 184.7606f, 212.14763f, 183.23582f, 211.43f, 182.0f),
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
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
