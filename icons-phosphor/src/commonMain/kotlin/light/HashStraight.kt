package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorLightIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 154.0f),
                    PathNode.LineTo(166.0f, 154.0f),
                    PathNode.LineTo(166.0f, 102.0f),
                    PathNode.LineTo(216.0f, 102.0f),
                    PathNode.CurveTo(219.3137f, 102.0f, 222.0f, 99.313705f, 222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 92.686295f, 219.3137f, 90.0f, 216.0f, 90.0f),
                    PathNode.LineTo(166.0f, 90.0f),
                    PathNode.LineTo(166.0f, 40.0f),
                    PathNode.CurveTo(166.0f, 36.68629f, 163.3137f, 34.0f, 160.0f, 34.0f),
                    PathNode.CurveTo(156.6863f, 34.0f, 154.0f, 36.68629f, 154.0f, 40.0f),
                    PathNode.LineTo(154.0f, 90.0f),
                    PathNode.LineTo(102.0f, 90.0f),
                    PathNode.LineTo(102.0f, 40.0f),
                    PathNode.CurveTo(102.0f, 36.68629f, 99.313705f, 34.0f, 96.0f, 34.0f),
                    PathNode.CurveTo(92.686295f, 34.0f, 90.0f, 36.68629f, 90.0f, 40.0f),
                    PathNode.LineTo(90.0f, 90.0f),
                    PathNode.LineTo(40.0f, 90.0f),
                    PathNode.CurveTo(36.68629f, 90.0f, 34.0f, 92.686295f, 34.0f, 96.0f),
                    PathNode.CurveTo(34.0f, 99.313705f, 36.68629f, 102.0f, 40.0f, 102.0f),
                    PathNode.LineTo(90.0f, 102.0f),
                    PathNode.LineTo(90.0f, 154.0f),
                    PathNode.LineTo(40.0f, 154.0f),
                    PathNode.CurveTo(36.68629f, 154.0f, 34.0f, 156.6863f, 34.0f, 160.0f),
                    PathNode.CurveTo(34.0f, 163.3137f, 36.68629f, 166.0f, 40.0f, 166.0f),
                    PathNode.LineTo(90.0f, 166.0f),
                    PathNode.LineTo(90.0f, 216.0f),
                    PathNode.CurveTo(90.0f, 219.3137f, 92.686295f, 222.0f, 96.0f, 222.0f),
                    PathNode.CurveTo(99.313705f, 222.0f, 102.0f, 219.3137f, 102.0f, 216.0f),
                    PathNode.LineTo(102.0f, 166.0f),
                    PathNode.LineTo(154.0f, 166.0f),
                    PathNode.LineTo(154.0f, 216.0f),
                    PathNode.CurveTo(154.0f, 219.3137f, 156.6863f, 222.0f, 160.0f, 222.0f),
                    PathNode.CurveTo(163.3137f, 222.0f, 166.0f, 219.3137f, 166.0f, 216.0f),
                    PathNode.LineTo(166.0f, 166.0f),
                    PathNode.LineTo(216.0f, 166.0f),
                    PathNode.CurveTo(219.3137f, 166.0f, 222.0f, 163.3137f, 222.0f, 160.0f),
                    PathNode.CurveTo(222.0f, 156.6863f, 219.3137f, 154.0f, 216.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 154.0f),
                    PathNode.LineTo(102.0f, 102.0f),
                    PathNode.LineTo(154.0f, 102.0f),
                    PathNode.LineTo(154.0f, 154.0f),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
