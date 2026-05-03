package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorBoldIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.75f, 30.52f),
                    PathNode.CurveTo(195.39023f, 26.992783f, 187.61705f, 27.195726f, 181.45f, 31.05f),
                    PathNode.LineTo(68.0f, 102.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 33.37258f, 62.62742f, 28.0f, 56.0f, 28.0f),
                    PathNode.CurveTo(49.37258f, 28.0f, 44.0f, 33.37258f, 44.0f, 40.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.CurveTo(62.62742f, 228.0f, 68.0f, 222.62741f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 154.0f),
                    PathNode.LineTo(181.45f, 225.0f),
                    PathNode.CurveTo(187.60086f, 228.8193f, 195.3356f, 229.01613f, 201.67278f, 225.51462f),
                    PathNode.CurveTo(208.00992f, 222.0131f, 211.95985f, 215.36006f, 212.0f, 208.12f),
                    PathNode.LineTo(212.0f, 47.88f),
                    PathNode.CurveTo(211.99269f, 40.66042f, 208.06808f, 34.013466f, 201.75f, 30.52f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 200.73f),
                    PathNode.LineTo(71.7f, 128.0f),
                    PathNode.LineTo(188.0f, 55.27f),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
