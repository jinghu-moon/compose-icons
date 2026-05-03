package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorLightIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 40.0f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 40.0f),
                    PathNode.CurveTo(122.0f, 36.68629f, 124.686295f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(131.3137f, 34.0f, 134.0f, 36.68629f, 134.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 122.0f),
                    PathNode.LineTo(30.49f, 122.0f),
                    PathNode.LineTo(52.24f, 100.24f),
                    PathNode.CurveTo(54.44287f, 97.87592f, 54.377872f, 94.191925f, 52.092976f, 91.90703f),
                    PathNode.CurveTo(49.80808f, 89.62213f, 46.124077f, 89.55713f, 43.76f, 91.76f),
                    PathNode.LineTo(11.76f, 123.76f),
                    PathNode.CurveTo(9.420373f, 126.10254f, 9.420373f, 129.89746f, 11.76f, 132.24f),
                    PathNode.LineTo(43.76f, 164.24f),
                    PathNode.CurveTo(46.124077f, 166.44287f, 49.80808f, 166.37787f, 52.092976f, 164.09297f),
                    PathNode.CurveTo(54.377872f, 161.80807f, 54.44287f, 158.12408f, 52.24f, 155.76f),
                    PathNode.LineTo(30.49f, 134.0f),
                    PathNode.LineTo(96.0f, 134.0f),
                    PathNode.CurveTo(99.313705f, 134.0f, 102.0f, 131.3137f, 102.0f, 128.0f),
                    PathNode.CurveTo(102.0f, 124.686295f, 99.313705f, 122.0f, 96.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.24f, 123.76f),
                    PathNode.LineTo(212.24f, 91.76f),
                    PathNode.CurveTo(209.87592f, 89.55713f, 206.19193f, 89.62213f, 203.90703f, 91.90703f),
                    PathNode.CurveTo(201.62213f, 94.191925f, 201.55713f, 97.87592f, 203.76f, 100.24f),
                    PathNode.LineTo(225.51f, 122.0f),
                    PathNode.LineTo(160.0f, 122.0f),
                    PathNode.CurveTo(156.6863f, 122.0f, 154.0f, 124.686295f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 131.3137f, 156.6863f, 134.0f, 160.0f, 134.0f),
                    PathNode.LineTo(225.51f, 134.0f),
                    PathNode.LineTo(203.76f, 155.76f),
                    PathNode.CurveTo(202.15477f, 157.25575f, 201.494f, 159.50844f, 202.03691f, 161.63431f),
                    PathNode.CurveTo(202.57982f, 163.76018f, 204.23982f, 165.42018f, 206.36569f, 165.96309f),
                    PathNode.CurveTo(208.49156f, 166.506f, 210.74425f, 165.84523f, 212.24f, 164.24f),
                    PathNode.LineTo(244.24f, 132.24f),
                    PathNode.CurveTo(246.57962f, 129.89746f, 246.57962f, 126.10254f, 244.24f, 123.76f),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
