package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorLightIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(36.68629f, 66.0f, 34.0f, 68.686295f, 34.0f, 72.0f),
                    PathNode.LineTo(34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(184.0f, 222.0f),
                    PathNode.CurveTo(187.3137f, 222.0f, 190.0f, 219.3137f, 190.0f, 216.0f),
                    PathNode.LineTo(190.0f, 72.0f),
                    PathNode.CurveTo(190.0f, 68.686295f, 187.3137f, 66.0f, 184.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(46.0f, 78.0f),
                    PathNode.LineTo(178.0f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 40.0f),
                    PathNode.LineTo(222.0f, 184.0f),
                    PathNode.CurveTo(222.0f, 187.3137f, 219.3137f, 190.0f, 216.0f, 190.0f),
                    PathNode.CurveTo(212.6863f, 190.0f, 210.0f, 187.3137f, 210.0f, 184.0f),
                    PathNode.LineTo(210.0f, 46.0f),
                    PathNode.LineTo(72.0f, 46.0f),
                    PathNode.CurveTo(68.686295f, 46.0f, 66.0f, 43.31371f, 66.0f, 40.0f),
                    PathNode.CurveTo(66.0f, 36.68629f, 68.686295f, 34.0f, 72.0f, 34.0f),
                    PathNode.LineTo(216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
