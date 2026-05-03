package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) return _zeppelin!!
        _zeppelin = tablerFilledIcon(
            name = "Zeppelin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 3.0f),
                    PathNode.CurveTo(18.687f, 3.0f, 23.0f, 6.044f, 23.0f, 10.0f),
                    PathNode.CurveTo(23.0f, 13.017f, 20.492f, 15.503f, 17.0f, 16.514f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.CurveTo(17.0f, 20.552284f, 16.552284f, 21.0f, 16.0f, 21.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.CurveTo(9.447715f, 21.0f, 9.0f, 20.552284f, 9.0f, 20.0f),
                    PathNode.LineTo(9.0f, 15.954f),
                    PathNode.CurveTo(8.080714f, 15.547921f, 7.191762f, 15.076376f, 6.34f, 14.543f),
                    PathNode.LineTo(6.21f, 14.461f),
                    PathNode.LineTo(4.64f, 15.769f),
                    PathNode.CurveTo(4.357474f, 16.004515f, 3.968464f, 16.06592f, 3.627129f, 15.928885f),
                    PathNode.CurveTo(3.285795f, 15.79185f, 3.04724f, 15.478496f, 3.006f, 15.113f),
                    PathNode.LineTo(3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 12.149f),
                    PathNode.LineTo(2.69f, 11.899f),
                    PathNode.CurveTo(2.460884f, 11.711818f, 2.233541f, 11.522475f, 2.008f, 11.331f),
                    PathNode.LineTo(1.338f, 10.749f),
                    PathNode.CurveTo(1.123431f, 10.559191f, 1.00057f, 10.286474f, 1.00057f, 10.0f),
                    PathNode.CurveTo(1.00057f, 9.713526f, 1.123431f, 9.440809f, 1.338f, 9.251f),
                    PathNode.CurveTo(1.781049f, 8.858864f, 2.231462f, 8.475129f, 2.689f, 8.100001f),
                    PathNode.LineTo(3.0f, 7.85f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.CurveTo(2.999693f, 4.632066f, 3.201456f, 4.293684f, 3.525291f, 4.119022f),
                    PathNode.CurveTo(3.849125f, 3.94436f, 4.242715f, 3.961636f, 4.55f, 4.164f),
                    PathNode.LineTo(4.64f, 4.232f),
                    PathNode.LineTo(6.21f, 5.539f),
                    PathNode.LineTo(6.338f, 5.459f),
                    PathNode.CurveTo(8.842f, 3.906f, 11.122f, 3.081f, 13.191f, 3.006f),
                    PathNode.Close,
                    PathNode.MoveTo(11.001f, 16.657f),
                    PathNode.LineTo(11.0f, 19.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(15.001f, 16.914f),
                    PathNode.QuadTo(14.266f, 17.0f, 13.5f, 17.0f),
                    PathNode.CurveTo(12.782816f, 16.995829f, 12.068357f, 16.9113f, 11.37f, 16.748f),
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
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
