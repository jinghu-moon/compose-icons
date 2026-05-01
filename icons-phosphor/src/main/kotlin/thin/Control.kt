package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorThinIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 122.83f),
                    PathNode.CurveTo(202.07973f, 123.581116f, 201.06163f, 124.00314f, 200.0f, 124.00314f),
                    PathNode.CurveTo(198.93837f, 124.00314f, 197.92027f, 123.581116f, 197.17f, 122.83f),
                    PathNode.LineTo(128.0f, 53.66f),
                    PathNode.LineTo(58.83f, 122.83f),
                    PathNode.CurveTo(57.267033f, 124.39297f, 54.732967f, 124.39297f, 53.17f, 122.83f),
                    PathNode.CurveTo(51.607033f, 121.26704f, 51.607033f, 118.73296f, 53.17f, 117.17f),
                    PathNode.LineTo(125.17f, 45.17f),
                    PathNode.CurveTo(125.92027f, 44.41889f, 126.93836f, 43.996853f, 128.0f, 43.996853f),
                    PathNode.CurveTo(129.06163f, 43.996853f, 130.07973f, 44.41889f, 130.83f, 45.17f),
                    PathNode.LineTo(202.83f, 117.17f),
                    PathNode.CurveTo(203.58112f, 117.92027f, 204.00314f, 118.93836f, 204.00314f, 120.0f),
                    PathNode.CurveTo(204.00314f, 121.06164f, 203.58112f, 122.07973f, 202.83f, 122.83f),
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
        return _control!!
    }

private var _control: ImageVector? = null
