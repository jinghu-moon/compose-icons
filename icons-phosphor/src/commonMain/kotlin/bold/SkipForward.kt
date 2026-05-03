package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorBoldIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.CurveTo(193.37259f, 28.0f, 188.0f, 33.37258f, 188.0f, 40.0f),
                    PathNode.LineTo(188.0f, 102.0f),
                    PathNode.LineTo(74.55f, 31.0f),
                    PathNode.CurveTo(68.39914f, 27.180696f, 60.6644f, 26.983864f, 54.32724f, 30.485376f),
                    PathNode.CurveTo(47.990086f, 33.98689f, 44.04015f, 40.639935f, 44.0f, 47.88f),
                    PathNode.LineTo(44.0f, 208.12f),
                    PathNode.CurveTo(44.04015f, 215.36006f, 47.990086f, 222.0131f, 54.32724f, 225.51462f),
                    PathNode.CurveTo(60.6644f, 229.01613f, 68.39914f, 228.8193f, 74.55f, 225.0f),
                    PathNode.LineTo(188.0f, 154.0f),
                    PathNode.LineTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 222.62741f, 193.37259f, 228.0f, 200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 200.73f),
                    PathNode.LineTo(68.0f, 55.27f),
                    PathNode.LineTo(184.3f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
