package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Equals: ImageVector
    get() {
        if (_equals != null) return _equals!!
        _equals = phosphorLightIcon(
            name = "Equals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 160.0f),
                    PathNode.CurveTo(222.0f, 163.3137f, 219.3137f, 166.0f, 216.0f, 166.0f),
                    PathNode.LineTo(40.0f, 166.0f),
                    PathNode.CurveTo(36.68629f, 166.0f, 34.0f, 163.3137f, 34.0f, 160.0f),
                    PathNode.CurveTo(34.0f, 156.6863f, 36.68629f, 154.0f, 40.0f, 154.0f),
                    PathNode.LineTo(216.0f, 154.0f),
                    PathNode.CurveTo(219.3137f, 154.0f, 222.0f, 156.6863f, 222.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 102.0f),
                    PathNode.LineTo(216.0f, 102.0f),
                    PathNode.CurveTo(219.3137f, 102.0f, 222.0f, 99.313705f, 222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 92.686295f, 219.3137f, 90.0f, 216.0f, 90.0f),
                    PathNode.LineTo(40.0f, 90.0f),
                    PathNode.CurveTo(36.68629f, 90.0f, 34.0f, 92.686295f, 34.0f, 96.0f),
                    PathNode.CurveTo(34.0f, 99.313705f, 36.68629f, 102.0f, 40.0f, 102.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _equals!!
    }

private var _equals: ImageVector? = null
