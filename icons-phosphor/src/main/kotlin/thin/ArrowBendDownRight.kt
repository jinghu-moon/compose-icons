package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorThinIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 154.83f),
                    PathNode.LineTo(178.83f, 202.83f),
                    PathNode.CurveTo(177.26703f, 204.39296f, 174.73297f, 204.39296f, 173.17f, 202.83f),
                    PathNode.CurveTo(171.60704f, 201.26703f, 171.60704f, 198.73297f, 173.17f, 197.17f),
                    PathNode.LineTo(214.34f, 156.0f),
                    PathNode.LineTo(128.0f, 156.0f),
                    PathNode.CurveTo(72.79665f, 155.93938f, 28.060623f, 111.20335f, 28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 53.79086f, 29.790861f, 52.0f, 32.0f, 52.0f),
                    PathNode.CurveTo(34.20914f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.CurveTo(36.055115f, 106.78735f, 77.21265f, 147.94489f, 128.0f, 148.0f),
                    PathNode.LineTo(214.34f, 148.0f),
                    PathNode.LineTo(173.17f, 106.83f),
                    PathNode.CurveTo(171.60704f, 105.26704f, 171.60704f, 102.73296f, 173.17f, 101.17f),
                    PathNode.CurveTo(174.73297f, 99.60703f, 177.26703f, 99.60703f, 178.83f, 101.17f),
                    PathNode.LineTo(226.83f, 149.17f),
                    PathNode.CurveTo(227.58112f, 149.92027f, 228.00314f, 150.93837f, 228.00314f, 152.0f),
                    PathNode.CurveTo(228.00314f, 153.06163f, 227.58112f, 154.07973f, 226.83f, 154.83f),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
