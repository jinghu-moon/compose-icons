package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorThinIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 178.83f),
                    PathNode.LineTo(154.83f, 226.83f),
                    PathNode.CurveTo(154.07973f, 227.58112f, 153.06163f, 228.00314f, 152.0f, 228.00314f),
                    PathNode.CurveTo(150.93837f, 228.00314f, 149.92027f, 227.58112f, 149.17f, 226.83f),
                    PathNode.LineTo(101.17f, 178.83f),
                    PathNode.CurveTo(99.60703f, 177.26703f, 99.60703f, 174.73297f, 101.17f, 173.17f),
                    PathNode.CurveTo(102.73296f, 171.60704f, 105.26704f, 171.60704f, 106.83f, 173.17f),
                    PathNode.LineTo(148.0f, 214.34f),
                    PathNode.LineTo(148.0f, 128.0f),
                    PathNode.CurveTo(147.94489f, 77.21265f, 106.78735f, 36.055115f, 56.0f, 36.0f),
                    PathNode.CurveTo(53.79086f, 36.0f, 52.0f, 34.20914f, 52.0f, 32.0f),
                    PathNode.CurveTo(52.0f, 29.790861f, 53.79086f, 28.0f, 56.0f, 28.0f),
                    PathNode.CurveTo(111.20335f, 28.060623f, 155.93938f, 72.79665f, 156.0f, 128.0f),
                    PathNode.LineTo(156.0f, 214.34f),
                    PathNode.LineTo(197.17f, 173.17f),
                    PathNode.CurveTo(198.73297f, 171.60704f, 201.26703f, 171.60704f, 202.83f, 173.17f),
                    PathNode.CurveTo(204.39296f, 174.73297f, 204.39296f, 177.26703f, 202.83f, 178.83f),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
