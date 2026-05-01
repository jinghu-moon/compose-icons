package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = tablerFilledIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.757f, 16.03f),
                    PathNode.CurveTo(20.270271f, 15.902592f, 20.794006f, 16.196852f, 20.952156f, 16.7015f),
                    PathNode.CurveTo(21.110306f, 17.20615f, 20.848185f, 17.746687f, 20.354f, 17.935f),
                    PathNode.LineTo(20.243f, 17.97f),
                    PathNode.LineTo(4.243f, 21.97f),
                    PathNode.CurveTo(3.729728f, 22.097408f, 3.205994f, 21.803148f, 3.047845f, 21.2985f),
                    PathNode.CurveTo(2.889695f, 20.79385f, 3.151815f, 20.253313f, 3.646f, 20.065f),
                    PathNode.LineTo(3.757f, 20.03f),
                    PathNode.LineTo(19.757f, 16.03f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.03f, 16.757f),
                    PathNode.CurveTo(3.153126f, 16.265032f, 3.625025f, 15.943127f, 4.128f, 16.008f),
                    PathNode.LineTo(4.243f, 16.03f),
                    PathNode.LineTo(20.243f, 20.03f),
                    PathNode.CurveTo(20.756792f, 20.158382f, 21.081404f, 20.665071f, 20.983261f, 21.185488f),
                    PathNode.CurveTo(20.88512f, 21.705906f, 20.398262f, 22.059566f, 19.873f, 21.992f),
                    PathNode.LineTo(19.757f, 21.97f),
                    PathNode.LineTo(3.757f, 17.97f),
                    PathNode.CurveTo(3.221293f, 17.835785f, 2.89581f, 17.292713f, 3.03f, 16.757f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.553f, 2.106f),
                    PathNode.CurveTo(9.379f, 4.192f, 7.0f, 7.464f, 7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 13.761424f, 9.238576f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(14.761424f, 16.0f, 17.0f, 13.761424f, 17.0f, 11.0f),
                    PathNode.CurveTo(17.0f, 9.953f, 16.812f, 9.192f, 16.394f, 8.295f),
                    PathNode.LineTo(16.225f, 7.95f),
                    PathNode.LineTo(15.895f, 7.303f),
                    PathNode.CurveTo(15.274f, 6.063f, 15.0f, 4.965f, 15.0f, 3.0f),
                    PathNode.CurveTo(14.999815f, 2.65356f, 14.820333f, 2.331896f, 14.525605f, 2.149806f),
                    PathNode.CurveTo(14.230879f, 1.967715f, 13.862903f, 1.951141f, 13.553f, 2.106f),
                    PathNode.Close
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
