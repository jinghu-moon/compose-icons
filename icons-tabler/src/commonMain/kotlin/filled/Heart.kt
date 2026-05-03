package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = tablerFilledIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.979f, 3.074f),
                    PathNode.CurveTo(8.771703f, 2.768549f, 10.6062f, 3.292639f, 11.967f, 4.499f),
                    PathNode.LineTo(12.004f, 4.532f),
                    PathNode.LineTo(12.038f, 4.502f),
                    PathNode.CurveTo(13.335147f, 3.363648f, 15.059657f, 2.838972f, 16.771f, 3.062f),
                    PathNode.LineTo(17.017f, 3.098f),
                    PathNode.CurveTo(19.189354f, 3.473081f, 20.981064f, 5.009227f, 21.683447f, 7.098835f),
                    PathNode.CurveTo(22.38583f, 9.188443f, 21.885746f, 11.494931f, 20.381f, 13.106f),
                    PathNode.LineTo(20.201f, 13.291f),
                    PathNode.LineTo(20.153f, 13.332f),
                    PathNode.LineTo(12.703f, 20.711f),
                    PathNode.CurveTo(12.347451f, 21.062899f, 11.786569f, 21.097927f, 11.39f, 20.793f),
                    PathNode.LineTo(11.296f, 20.711f),
                    PathNode.LineTo(3.803f, 13.289f),
                    PathNode.CurveTo(2.184419f, 11.714129f, 1.587232f, 9.36381f, 2.25772f, 7.207315f),
                    PathNode.CurveTo(2.928207f, 5.050821f, 4.752786f, 3.453466f, 6.979f, 3.074f),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
