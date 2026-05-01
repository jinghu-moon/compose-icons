package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorThinIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 82.83f),
                    PathNode.CurveTo(202.07973f, 83.581116f, 201.06163f, 84.00314f, 200.0f, 84.00314f),
                    PathNode.CurveTo(198.93837f, 84.00314f, 197.92027f, 83.581116f, 197.17f, 82.83f),
                    PathNode.LineTo(156.0f, 41.66f),
                    PathNode.LineTo(156.0f, 128.0f),
                    PathNode.CurveTo(155.93938f, 183.20334f, 111.20335f, 227.93938f, 56.0f, 228.0f),
                    PathNode.CurveTo(53.79086f, 228.0f, 52.0f, 226.20914f, 52.0f, 224.0f),
                    PathNode.CurveTo(52.0f, 221.79086f, 53.79086f, 220.0f, 56.0f, 220.0f),
                    PathNode.CurveTo(106.78735f, 219.94489f, 147.94489f, 178.78735f, 148.0f, 128.0f),
                    PathNode.LineTo(148.0f, 41.66f),
                    PathNode.LineTo(106.83f, 82.83f),
                    PathNode.CurveTo(105.26704f, 84.39297f, 102.73296f, 84.39297f, 101.17f, 82.83f),
                    PathNode.CurveTo(99.60703f, 81.26704f, 99.60703f, 78.73296f, 101.17f, 77.17f),
                    PathNode.LineTo(149.17f, 29.17f),
                    PathNode.CurveTo(149.92027f, 28.418892f, 150.93837f, 27.996853f, 152.0f, 27.996853f),
                    PathNode.CurveTo(153.06163f, 27.996853f, 154.07973f, 28.418892f, 154.83f, 29.17f),
                    PathNode.LineTo(202.83f, 77.17f),
                    PathNode.CurveTo(203.58112f, 77.92027f, 204.00314f, 78.93836f, 204.00314f, 80.0f),
                    PathNode.CurveTo(204.00314f, 81.06164f, 203.58112f, 82.07973f, 202.83f, 82.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
