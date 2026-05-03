package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = lucideOutlineIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.536f, 21.686f),
                    PathNode.CurveTo(14.613805f, 21.879908f, 14.803975f, 22.004992f, 15.012841f, 21.999641f),
                    PathNode.CurveTo(15.221706f, 21.994291f, 15.405224f, 21.859636f, 15.473f, 21.662f),
                    PathNode.LineTo(21.973f, 2.662f),
                    PathNode.CurveTo(22.038334f, 2.481117f, 21.993214f, 2.278769f, 21.857222f, 2.142778f),
                    PathNode.CurveTo(21.721231f, 2.006786f, 21.518883f, 1.961666f, 21.338f, 2.027f),
                    PathNode.LineTo(2.338f, 8.527f),
                    PathNode.CurveTo(2.140365f, 8.594776f, 2.005709f, 8.778294f, 2.000359f, 8.987159f),
                    PathNode.CurveTo(1.995009f, 9.196025f, 2.120093f, 9.386195f, 2.314f, 9.464f),
                    PathNode.LineTo(10.244f, 12.644f),
                    PathNode.CurveTo(10.750567f, 12.846815f, 11.152274f, 13.247799f, 11.356f, 13.754f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.854f, 2.147f),
                    PathNode.LineTo(10.914f, 13.086f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _send!!
    }

private var _send: ImageVector? = null
