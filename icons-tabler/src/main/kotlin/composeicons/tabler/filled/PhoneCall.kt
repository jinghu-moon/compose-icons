package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = tablerFilledIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.928f, 3.629f),
                    PathNode.LineTo(11.928f, 8.629f),
                    PathNode.CurveTo(12.109778f, 9.084473f, 11.934441f, 9.604556f, 11.514f, 9.857f),
                    PathNode.LineTo(9.844f, 10.86f),
                    PathNode.CurveTo(10.664551f, 12.205703f, 11.794546f, 13.33604f, 13.14f, 14.157f),
                    PathNode.LineTo(14.143f, 12.486f),
                    PathNode.CurveTo(14.395444f, 12.065559f, 14.915527f, 11.890222f, 15.371f, 12.072f),
                    PathNode.LineTo(20.371f, 14.072f),
                    PathNode.CurveTo(20.75065f, 14.223675f, 20.99974f, 14.591173f, 21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.657f, 19.657f, 22.0f, 17.94f, 21.998f),
                    PathNode.CurveTo(9.361f, 21.477f, 2.522f, 14.638f, 2.0f, 6.0f),
                    PathNode.CurveTo(2.0f, 4.343146f, 3.343146f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.408827f, 3.000259f, 9.776325f, 3.24935f, 9.928f, 3.629f)
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
                    PathNode.MoveTo(18.0f, 9.0f),
                    PathNode.CurveTo(18.0f, 9.552285f, 17.552284f, 10.0f, 17.0f, 10.0f),
                    PathNode.CurveTo(16.447716f, 10.0f, 16.0f, 9.552285f, 16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 8.447715f, 15.552285f, 8.0f, 15.0f, 8.0f),
                    PathNode.CurveTo(14.447715f, 8.0f, 14.0f, 7.552285f, 14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 6.447716f, 14.447715f, 6.0f, 15.0f, 6.0f),
                    PathNode.CurveTo(16.656855f, 6.0f, 18.0f, 7.343146f, 18.0f, 9.0f)
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
                    PathNode.MoveTo(22.0f, 9.0f),
                    PathNode.CurveTo(22.0f, 9.552285f, 21.552284f, 10.0f, 21.0f, 10.0f),
                    PathNode.CurveTo(20.447716f, 10.0f, 20.0f, 9.552285f, 20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 6.238577f, 17.761423f, 4.0f, 15.0f, 4.0f),
                    PathNode.CurveTo(14.447715f, 4.0f, 14.0f, 3.552285f, 14.0f, 3.0f),
                    PathNode.CurveTo(14.0f, 2.447715f, 14.447715f, 2.0f, 15.0f, 2.0f),
                    PathNode.CurveTo(18.865993f, 2.0f, 22.0f, 5.134007f, 22.0f, 9.0f)
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
