package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = tablerFilledIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.001f),
                    PathNode.CurveTo(12.72f, 1.001f, 13.385f, 1.388f, 13.749f, 2.031f),
                    PathNode.LineTo(21.879f, 17.021f),
                    PathNode.CurveTo(21.958435f, 17.167439f, 22.00003f, 17.331404f, 22.0f, 17.498f),
                    PathNode.LineTo(22.0f, 17.996f),
                    PathNode.CurveTo(22.0f, 20.456f, 17.694f, 21.941f, 12.323f, 21.998f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.CurveTo(6.48f, 22.0f, 2.0f, 20.505f, 2.0f, 17.997f),
                    PathNode.LineTo(2.0f, 17.497f),
                    PathNode.CurveTo(1.99997f, 17.330402f, 2.041563f, 17.16644f, 2.121f, 17.02f),
                    PathNode.LineTo(10.26f, 2.015f),
                    PathNode.CurveTo(10.614839f, 1.387954f, 11.279516f, 1.000225f, 12.0f, 1.0f)
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
        return _cone!!
    }

private var _cone: ImageVector? = null
