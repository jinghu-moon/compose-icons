package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Scale: ImageVector
    get() {
        if (_scale != null) return _scale!!
        _scale = tablerFilledIcon(
            name = "Scale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.552285f, 2.0f, 13.0f, 2.447715f, 13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 4.152f),
                    PathNode.LineTo(18.159f, 5.012f),
                    PathNode.CurveTo(18.412558f, 5.050564f, 18.640892f, 5.186991f, 18.795f, 5.392f),
                    PathNode.LineTo(18.836f, 5.451f),
                    PathNode.LineTo(18.894f, 5.553f),
                    PathNode.LineTo(21.918f, 11.603f),
                    PathNode.LineTo(21.953f, 11.697f),
                    PathNode.LineTo(21.978f, 11.793f),
                    PathNode.LineTo(21.994f, 11.893f),
                    PathNode.LineTo(21.999f, 12.013f),
                    PathNode.LineTo(21.996f, 12.074f),
                    PathNode.CurveTo(21.957813f, 14.253545f, 20.17988f, 16.000334f, 18.0f, 16.0f),
                    PathNode.CurveTo(15.790861f, 16.0f, 14.0f, 14.209139f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.000166f, 11.844793f, 14.036457f, 11.691755f, 14.106f, 11.553f),
                    PathNode.LineTo(16.499f, 6.763f),
                    PathNode.LineTo(13.0f, 6.18f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(17.552284f, 19.0f, 18.0f, 19.447716f, 18.0f, 20.0f),
                    PathNode.CurveTo(18.0f, 20.552284f, 17.552284f, 21.0f, 17.0f, 21.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.CurveTo(6.447716f, 21.0f, 6.0f, 20.552284f, 6.0f, 20.0f),
                    PathNode.CurveTo(6.0f, 19.447716f, 6.447716f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.LineTo(11.0f, 6.18f),
                    PathNode.LineTo(7.5f, 6.763f),
                    PathNode.LineTo(9.918f, 11.603f),
                    PathNode.LineTo(9.953f, 11.697f),
                    PathNode.LineTo(9.978f, 11.793f),
                    PathNode.LineTo(9.994f, 11.893f),
                    PathNode.LineTo(9.999f, 12.013f),
                    PathNode.LineTo(9.996f, 12.074f),
                    PathNode.CurveTo(9.957814f, 14.253545f, 8.17988f, 16.000334f, 6.0f, 16.0f),
                    PathNode.CurveTo(3.790861f, 16.0f, 2.0f, 14.209139f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.000166f, 11.844793f, 2.036457f, 11.691755f, 2.106f, 11.553f),
                    PathNode.LineTo(5.14f, 5.488f),
                    PathNode.LineTo(5.179f, 5.427f),
                    PathNode.LineTo(5.204f, 5.393f),
                    PathNode.CurveTo(5.358108f, 5.187991f, 5.586444f, 5.051564f, 5.84f, 5.013f),
                    PathNode.LineTo(11.0f, 4.151f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.0f, 2.447715f, 11.447715f, 2.0f, 12.0f, 2.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _scale!!
    }

private var _scale: ImageVector? = null
