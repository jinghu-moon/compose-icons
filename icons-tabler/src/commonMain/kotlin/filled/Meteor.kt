package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = tablerFilledIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.874f, 3.486f),
                    PathNode.LineTo(17.7f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.846f, 11.0f, 22.293f, 11.973f, 21.791f, 12.612f),
                    PathNode.LineTo(21.717f, 12.697f),
                    PathNode.LineTo(14.817f, 19.792f),
                    PathNode.CurveTo(12.878124f, 21.73902f, 10.029759f, 22.469908f, 7.392954f, 21.697004f),
                    PathNode.CurveTo(4.756149f, 20.924103f, 2.753094f, 18.771162f, 2.172145f, 16.08553f),
                    PathNode.CurveTo(1.591195f, 13.399898f, 2.52537f, 10.611583f, 4.607f, 8.818f),
                    PathNode.LineTo(12.353f, 2.238f),
                    PathNode.CurveTo(13.075f, 1.624f, 14.167f, 2.266f, 13.981f, 3.196f),
                    PathNode.LineTo(13.404f, 6.075f),
                    PathNode.LineTo(20.514f, 2.125f),
                    PathNode.CurveTo(21.394f, 1.637f, 22.363f, 2.606f, 21.874f, 3.485f),
                    PathNode.MoveTo(9.5f, 11.0f),
                    PathNode.CurveTo(7.641498f, 10.999857f, 6.106952f, 12.452296f, 6.005f, 14.308f),
                    PathNode.LineTo(6.0f, 14.5f),
                    PathNode.CurveTo(6.0f, 16.432997f, 7.567004f, 18.0f, 9.5f, 18.0f),
                    PathNode.CurveTo(11.432997f, 18.0f, 13.0f, 16.432997f, 13.0f, 14.5f),
                    PathNode.CurveTo(13.0f, 12.567003f, 11.432997f, 11.0f, 9.5f, 11.0f)
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
