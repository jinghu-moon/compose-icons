package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorLightIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 96.0f),
                    PathNode.CurveTo(190.0f, 124.0f, 165.38f, 147.11f, 134.0f, 149.75f),
                    PathNode.LineTo(134.0f, 160.0f),
                    PathNode.CurveTo(134.0f, 163.3137f, 131.3137f, 166.0f, 128.0f, 166.0f),
                    PathNode.CurveTo(124.686295f, 166.0f, 122.0f, 163.3137f, 122.0f, 160.0f),
                    PathNode.LineTo(122.0f, 144.0f),
                    PathNode.CurveTo(122.0f, 140.6863f, 124.686295f, 138.0f, 128.0f, 138.0f),
                    PathNode.CurveTo(155.57f, 138.0f, 178.0f, 119.16f, 178.0f, 96.0f),
                    PathNode.CurveTo(178.0f, 72.84f, 155.57f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(100.43f, 54.0f, 78.0f, 72.84f, 78.0f, 96.0f),
                    PathNode.CurveTo(78.0f, 99.313705f, 75.313705f, 102.0f, 72.0f, 102.0f),
                    PathNode.CurveTo(68.686295f, 102.0f, 66.0f, 99.313705f, 66.0f, 96.0f),
                    PathNode.CurveTo(66.0f, 66.22f, 93.81f, 42.0f, 128.0f, 42.0f),
                    PathNode.CurveTo(162.19f, 42.0f, 190.0f, 66.22f, 190.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 194.0f),
                    PathNode.CurveTo(120.26801f, 194.0f, 114.0f, 200.26802f, 114.0f, 208.0f),
                    PathNode.CurveTo(114.0f, 215.73198f, 120.26801f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(135.73198f, 222.0f, 142.0f, 215.73198f, 142.0f, 208.0f),
                    PathNode.CurveTo(142.0f, 200.26802f, 135.73198f, 194.0f, 128.0f, 194.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
