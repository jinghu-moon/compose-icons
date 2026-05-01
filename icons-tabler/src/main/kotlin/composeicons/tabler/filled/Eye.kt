package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = tablerFilledIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(16.29f, 4.0f, 19.863f, 6.429f, 22.665f, 11.154f),
                    PathNode.LineTo(22.885f, 11.533f),
                    PathNode.LineTo(22.93f, 11.633f),
                    PathNode.LineTo(22.96f, 11.716f),
                    PathNode.LineTo(22.974f, 11.771f),
                    PathNode.LineTo(22.988f, 11.853f),
                    PathNode.LineTo(22.999f, 11.953f),
                    PathNode.LineTo(22.999f, 12.063f),
                    PathNode.LineTo(22.985f, 12.174f),
                    PathNode.CurveTo(22.978432f, 12.211131f, 22.96975f, 12.247857f, 22.959f, 12.284f),
                    PathNode.LineTo(22.92f, 12.392f),
                    PathNode.LineTo(22.884f, 12.467f),
                    PathNode.LineTo(22.868f, 12.497f),
                    PathNode.CurveTo(20.104f, 17.333f, 16.568f, 19.877f, 12.313f, 19.996f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.CurveTo(7.604f, 20.0f, 3.963f, 17.451f, 1.132f, 12.496f),
                    PathNode.CurveTo(0.95643f, 12.188639f, 0.95643f, 11.811361f, 1.132f, 11.504f),
                    PathNode.CurveTo(3.963f, 6.549f, 7.604f, 4.0f, 12.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f)
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
        return _eye!!
    }

private var _eye: ImageVector? = null
