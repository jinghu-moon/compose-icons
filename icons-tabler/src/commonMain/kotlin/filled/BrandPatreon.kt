package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) return _brandPatreon!!
        _brandPatreon = tablerFilledIcon(
            name = "BrandPatreon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.462f, 3.1f),
                    PathNode.CurveTo(10.077f, 1.832f, 13.688f, 1.654f, 16.525f, 2.597f),
                    PathNode.CurveTo(19.093f, 3.45f, 20.996f, 5.772f, 21.0f, 8.407f),
                    PathNode.CurveTo(21.004f, 11.468f, 19.058f, 13.899f, 16.104f, 14.65f),
                    PathNode.CurveTo(14.411f, 15.08f, 13.766f, 15.4f, 13.162f, 16.232f),
                    PathNode.CurveTo(12.924f, 16.56f, 12.712f, 16.977f, 12.366f, 17.765f),
                    PathNode.LineTo(12.146f, 18.265f),
                    PathNode.CurveTo(11.0f, 20.866f, 9.99f, 22.027f, 7.91f, 22.0f),
                    PathNode.CurveTo(5.678f, 21.97f, 4.307f, 20.258f, 3.597f, 17.52f),
                    PathNode.CurveTo(3.139f, 15.752f, 2.98f, 13.712f, 3.003f, 11.644f),
                    PathNode.CurveTo(3.047f, 7.651f, 4.423f, 4.572f, 7.463f, 3.099f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
