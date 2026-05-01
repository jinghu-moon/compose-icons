package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorThinIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 101.17f),
                    PathNode.CurveTo(164.39296f, 102.73296f, 164.39296f, 105.26704f, 162.83f, 106.83f),
                    PathNode.CurveTo(161.26703f, 108.39297f, 158.73297f, 108.39297f, 157.17f, 106.83f),
                    PathNode.LineTo(128.0f, 77.66f),
                    PathNode.LineTo(98.83f, 106.83f),
                    PathNode.CurveTo(97.26704f, 108.39297f, 94.73296f, 108.39297f, 93.17f, 106.83f),
                    PathNode.CurveTo(91.60703f, 105.26704f, 91.60703f, 102.73296f, 93.17f, 101.17f),
                    PathNode.LineTo(125.17f, 69.17f),
                    PathNode.CurveTo(125.92027f, 68.418884f, 126.93836f, 67.99686f, 128.0f, 67.99686f),
                    PathNode.CurveTo(129.06163f, 67.99686f, 130.07973f, 68.418884f, 130.83f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(162.83f, 149.17f),
                    PathNode.CurveTo(163.58112f, 149.92027f, 164.00314f, 150.93837f, 164.00314f, 152.0f),
                    PathNode.CurveTo(164.00314f, 153.06163f, 163.58112f, 154.07973f, 162.83f, 154.83f),
                    PathNode.LineTo(130.83f, 186.83f),
                    PathNode.CurveTo(130.07973f, 187.58112f, 129.06163f, 188.00314f, 128.0f, 188.00314f),
                    PathNode.CurveTo(126.93836f, 188.00314f, 125.92027f, 187.58112f, 125.17f, 186.83f),
                    PathNode.LineTo(93.17f, 154.83f),
                    PathNode.CurveTo(91.60703f, 153.26703f, 91.60703f, 150.73297f, 93.17f, 149.17f),
                    PathNode.CurveTo(94.73296f, 147.60704f, 97.26704f, 147.60704f, 98.83f, 149.17f),
                    PathNode.LineTo(128.0f, 178.34f),
                    PathNode.LineTo(157.17f, 149.17f),
                    PathNode.CurveTo(157.92027f, 148.41888f, 158.93837f, 147.99686f, 160.0f, 147.99686f),
                    PathNode.CurveTo(161.06163f, 147.99686f, 162.07973f, 148.41888f, 162.83f, 149.17f),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
