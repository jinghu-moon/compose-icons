package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorThinIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.37f, 213.84f),
                    PathNode.LineTo(132.75f, 53.5f),
                    PathNode.LineTo(155.37f, 18.16f),
                    PathNode.CurveTo(156.56294f, 16.2988f, 156.0212f, 13.822935f, 154.16f, 12.63f),
                    PathNode.CurveTo(152.2988f, 11.437065f, 149.82294f, 11.978801f, 148.63f, 13.84f),
                    PathNode.LineTo(128.0f, 46.08f),
                    PathNode.LineTo(107.37f, 13.84f),
                    PathNode.CurveTo(106.17706f, 11.978801f, 103.7012f, 11.437065f, 101.84f, 12.63f),
                    PathNode.CurveTo(99.9788f, 13.822935f, 99.437065f, 16.2988f, 100.63f, 18.16f),
                    PathNode.LineTo(123.25f, 53.5f),
                    PathNode.LineTo(20.63f, 213.84f),
                    PathNode.CurveTo(19.839882f, 215.0715f, 19.785221f, 216.63615f, 20.487474f, 217.91978f),
                    PathNode.CurveTo(21.189728f, 219.20345f, 22.53682f, 220.00122f, 24.0f, 220.0f),
                    PathNode.LineTo(232.0f, 220.0f),
                    PathNode.CurveTo(233.46318f, 220.00122f, 234.81027f, 219.20345f, 235.51253f, 217.91978f),
                    PathNode.CurveTo(236.21478f, 216.63615f, 236.16013f, 215.0715f, 235.37f, 213.84f),
                    PathNode.Close,
                    PathNode.MoveTo(79.0f, 212.0f),
                    PathNode.LineTo(128.0f, 135.42f),
                    PathNode.LineTo(177.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.52f, 212.0f),
                    PathNode.LineTo(131.38f, 125.84f),
                    PathNode.CurveTo(130.64493f, 124.690384f, 129.37453f, 123.99479f, 128.01f, 123.99479f),
                    PathNode.CurveTo(126.64547f, 123.99479f, 125.37507f, 124.690384f, 124.64f, 125.84f),
                    PathNode.LineTo(69.49f, 212.0f),
                    PathNode.LineTo(31.31f, 212.0f),
                    PathNode.LineTo(128.0f, 60.92f),
                    PathNode.LineTo(224.69f, 212.0f),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
