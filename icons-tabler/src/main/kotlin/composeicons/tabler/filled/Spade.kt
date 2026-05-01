package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = tablerFilledIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.327f, 2.26f),
                    PathNode.CurveTo(9.682412f, 3.757407f, 8.041408f, 5.258744f, 6.404f, 6.764f),
                    PathNode.CurveTo(5.778f, 7.364f, 5.192f, 7.974f, 4.63f, 8.607f),
                    PathNode.CurveTo(2.581571f, 10.932412f, 2.450368f, 14.377526f, 4.316f, 16.852f),
                    PathNode.LineTo(4.456f, 17.029f),
                    PathNode.CurveTo(5.468f, 18.234f, 7.017f, 18.784f, 8.511f, 18.603f),
                    PathNode.LineTo(8.757f, 18.566f),
                    PathNode.LineTo(8.051f, 20.684f),
                    PathNode.CurveTo(7.949424f, 20.988972f, 8.000644f, 21.324183f, 8.188658f, 21.584906f),
                    PathNode.CurveTo(8.376672f, 21.845629f, 8.678556f, 22.000078f, 9.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(15.118f, 21.993f),
                    PathNode.CurveTo(15.416618f, 21.95739f, 15.683353f, 21.789278f, 15.844308f, 21.53524f),
                    PathNode.CurveTo(16.005262f, 21.281204f, 16.043343f, 20.96822f, 15.948f, 20.683f),
                    PathNode.LineTo(15.26f, 18.618f),
                    PathNode.LineTo(15.364f, 18.638f),
                    PathNode.CurveTo(16.953f, 18.888f, 18.626f, 18.251f, 19.684f, 16.853f),
                    PathNode.CurveTo(21.549768f, 14.379738f, 21.419825f, 10.935644f, 19.373f, 8.61f),
                    PathNode.CurveTo(18.81094f, 7.976804f, 18.223804f, 7.366318f, 17.613f, 6.78f),
                    PathNode.LineTo(12.675f, 2.262f),
                    PathNode.CurveTo(12.293444f, 1.913359f, 11.709073f, 1.912925f, 11.327f, 2.261f),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
