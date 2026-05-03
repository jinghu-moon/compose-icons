package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextAlignLeft: ImageVector
    get() {
        if (_textAlignLeft != null) return _textAlignLeft!!
        _textAlignLeft = phosphorLightIcon(
            name = "TextAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 60.68629f, 36.68629f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(36.68629f, 70.0f, 34.0f, 67.313705f, 34.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 110.0f),
                    PathNode.LineTo(168.0f, 110.0f),
                    PathNode.CurveTo(171.3137f, 110.0f, 174.0f, 107.313705f, 174.0f, 104.0f),
                    PathNode.CurveTo(174.0f, 100.686295f, 171.3137f, 98.0f, 168.0f, 98.0f),
                    PathNode.LineTo(40.0f, 98.0f),
                    PathNode.CurveTo(36.68629f, 98.0f, 34.0f, 100.686295f, 34.0f, 104.0f),
                    PathNode.CurveTo(34.0f, 107.313705f, 36.68629f, 110.0f, 40.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 138.0f),
                    PathNode.LineTo(40.0f, 138.0f),
                    PathNode.CurveTo(36.68629f, 138.0f, 34.0f, 140.6863f, 34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 147.3137f, 36.68629f, 150.0f, 40.0f, 150.0f),
                    PathNode.LineTo(216.0f, 150.0f),
                    PathNode.CurveTo(219.3137f, 150.0f, 222.0f, 147.3137f, 222.0f, 144.0f),
                    PathNode.CurveTo(222.0f, 140.6863f, 219.3137f, 138.0f, 216.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 178.0f),
                    PathNode.LineTo(40.0f, 178.0f),
                    PathNode.CurveTo(36.68629f, 178.0f, 34.0f, 180.6863f, 34.0f, 184.0f),
                    PathNode.CurveTo(34.0f, 187.3137f, 36.68629f, 190.0f, 40.0f, 190.0f),
                    PathNode.LineTo(168.0f, 190.0f),
                    PathNode.CurveTo(171.3137f, 190.0f, 174.0f, 187.3137f, 174.0f, 184.0f),
                    PathNode.CurveTo(174.0f, 180.6863f, 171.3137f, 178.0f, 168.0f, 178.0f),
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
        return _textAlignLeft!!
    }

private var _textAlignLeft: ImageVector? = null
