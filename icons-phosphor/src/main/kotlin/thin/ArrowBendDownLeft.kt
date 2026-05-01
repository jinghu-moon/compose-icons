package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorThinIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.CurveTo(227.93938f, 111.20335f, 183.20334f, 155.93938f, 128.0f, 156.0f),
                    PathNode.LineTo(41.66f, 156.0f),
                    PathNode.LineTo(82.83f, 197.17f),
                    PathNode.CurveTo(84.39297f, 198.73297f, 84.39297f, 201.26703f, 82.83f, 202.83f),
                    PathNode.CurveTo(81.26704f, 204.39296f, 78.73296f, 204.39296f, 77.17f, 202.83f),
                    PathNode.LineTo(29.17f, 154.83f),
                    PathNode.CurveTo(28.418892f, 154.07973f, 27.996853f, 153.06163f, 27.996853f, 152.0f),
                    PathNode.CurveTo(27.996853f, 150.93837f, 28.418892f, 149.92027f, 29.17f, 149.17f),
                    PathNode.LineTo(77.17f, 101.17f),
                    PathNode.CurveTo(78.73296f, 99.60703f, 81.26704f, 99.60703f, 82.83f, 101.17f),
                    PathNode.CurveTo(84.39297f, 102.73296f, 84.39297f, 105.26704f, 82.83f, 106.83f),
                    PathNode.LineTo(41.66f, 148.0f),
                    PathNode.LineTo(128.0f, 148.0f),
                    PathNode.CurveTo(178.78735f, 147.94489f, 219.94489f, 106.78735f, 220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 221.79086f, 52.0f, 224.0f, 52.0f),
                    PathNode.CurveTo(226.20914f, 52.0f, 228.0f, 53.79086f, 228.0f, 56.0f),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
