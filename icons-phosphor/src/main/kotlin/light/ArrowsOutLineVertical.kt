package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorLightIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.0f, 131.3137f, 219.3137f, 134.0f, 216.0f, 134.0f),
                    PathNode.LineTo(40.0f, 134.0f),
                    PathNode.CurveTo(36.68629f, 134.0f, 34.0f, 131.3137f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 124.686295f, 36.68629f, 122.0f, 40.0f, 122.0f),
                    PathNode.LineTo(216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.24f, 52.24f),
                    PathNode.LineTo(122.0f, 30.49f),
                    PathNode.LineTo(122.0f, 96.0f),
                    PathNode.CurveTo(122.0f, 99.313705f, 124.686295f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(131.3137f, 102.0f, 134.0f, 99.313705f, 134.0f, 96.0f),
                    PathNode.LineTo(134.0f, 30.49f),
                    PathNode.LineTo(155.76f, 52.24f),
                    PathNode.CurveTo(158.12408f, 54.44287f, 161.80807f, 54.377872f, 164.09297f, 52.092976f),
                    PathNode.CurveTo(166.37787f, 49.80808f, 166.44287f, 46.124077f, 164.24f, 43.76f),
                    PathNode.LineTo(132.24f, 11.76f),
                    PathNode.CurveTo(129.89746f, 9.420373f, 126.10254f, 9.420373f, 123.76f, 11.76f),
                    PathNode.LineTo(91.76f, 43.76f),
                    PathNode.CurveTo(89.55713f, 46.124077f, 89.62213f, 49.80808f, 91.90703f, 52.092976f),
                    PathNode.CurveTo(94.191925f, 54.377872f, 97.87592f, 54.44287f, 100.24f, 52.24f),
                    PathNode.Close,
                    PathNode.MoveTo(155.76f, 203.76f),
                    PathNode.LineTo(134.0f, 225.51f),
                    PathNode.LineTo(134.0f, 160.0f),
                    PathNode.CurveTo(134.0f, 156.6863f, 131.3137f, 154.0f, 128.0f, 154.0f),
                    PathNode.CurveTo(124.686295f, 154.0f, 122.0f, 156.6863f, 122.0f, 160.0f),
                    PathNode.LineTo(122.0f, 225.51f),
                    PathNode.LineTo(100.24f, 203.76f),
                    PathNode.CurveTo(97.87592f, 201.55713f, 94.191925f, 201.62213f, 91.90703f, 203.90703f),
                    PathNode.CurveTo(89.62213f, 206.19193f, 89.55713f, 209.87592f, 91.76f, 212.24f),
                    PathNode.LineTo(123.76f, 244.24f),
                    PathNode.CurveTo(126.10254f, 246.57962f, 129.89746f, 246.57962f, 132.24f, 244.24f),
                    PathNode.LineTo(164.24f, 212.24f),
                    PathNode.CurveTo(166.44287f, 209.87592f, 166.37787f, 206.19193f, 164.09297f, 203.90703f),
                    PathNode.CurveTo(161.80807f, 201.62213f, 158.12408f, 201.55713f, 155.76f, 203.76f),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
