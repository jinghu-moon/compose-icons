package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EarOff: ImageVector
    get() {
        if (_earOff != null) return _earOff!!
        _earOff = tablerOutlineIcon(
            name = "EarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.CurveTo(6.0f, 8.854f, 6.277f, 7.755f, 6.78f, 6.781f),
                    PathNode.MoveTo(8.572f, 4.573f),
                    PathNode.CurveTo(11.207358f, 2.420645f, 15.008756f, 2.475114f, 17.581364f, 4.702092f),
                    PathNode.CurveTo(20.15397f, 6.929071f, 20.752548f, 10.683441f, 19.0f, 13.6f),
                    PathNode.CurveTo(18.801718f, 13.864302f, 18.59046f, 14.118613f, 18.367f, 14.362f),
                    PathNode.MoveTo(16.322f, 16.322f),
                    PathNode.CurveTo(15.758505f, 17.00308f, 15.311786f, 17.772844f, 15.0f, 18.6f),
                    PathNode.CurveTo(14.371685f, 19.787363f, 13.245753f, 20.631926f, 11.929992f, 20.902819f),
                    PathNode.CurveTo(10.614231f, 21.17371f, 9.246248f, 20.8426f, 8.2f, 20.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.42f, 7.414f),
                    PathNode.CurveTo(12.603757f, 6.679919f, 14.137075f, 6.857178f, 15.12212f, 7.841984f),
                    PathNode.CurveTo(16.107164f, 8.82679f, 16.284796f, 10.360065f, 15.551f, 11.544f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _earOff!!
    }

private var _earOff: ImageVector? = null
